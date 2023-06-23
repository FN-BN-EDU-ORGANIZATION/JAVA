package 끝말잇기;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class ChatGpt {

	private String key;
	private JSONObject sendMsg = new JSONObject();
	private JSONArray chatHistory;
	private HttpURLConnection con;
	private List<String> endword;
	private boolean isPlaying = false; // 끝말잇기 진행 여부를 나타내는 변수
	private String lastWord = ""; // 이전 단어를 저장하는 변수
	
	public ChatGpt(String key)
	{
		this.key = key;
        this.sendMsg = new JSONObject();
        this.chatHistory = new JSONArray();
        this.endword = new ArrayList<>();
        this.endword.add(""); // 초기 시작 단어 설정 (빈 문자열)
        
        sendMsg.put("model", "gpt-3.5-turbo");
        sendMsg.put("messages", new JSONArray());
	}
	
	
	public HttpURLConnection connect()
	{
		return connect("https://api.openai.com/v1/chat/completions");
	}
	
	public HttpURLConnection connect(String url)
	{
		
		try
		{
			//객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
			con = (HttpURLConnection)new URL( url).openConnection();
			con.setRequestMethod("POST");
			//http 통신시 데이터 형태는 json이라고 선언
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			//발급받은 키값을 넣어준다.
			con.setRequestProperty("Authorization","Bearer "+key);
			//chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
			con.setRequestProperty("Retry-After","3600");
			//데이터 전송을 위해 true로 설정해야 한다.
			con.setDoOutput(true);
			
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
		return con;
		
	}
	
	public String makeJsonMsg(String role , String msg)
	{
		
		//json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
		//chatGPT가 했던 대답은 role 이 assistant 이여야 한다.
		//예제 -> messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의 대답\"}]
		//String json = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\""+msg+"\"}]}";

		JSONArray messages = (JSONArray)sendMsg.get("messages");
		
		JSONObject json = new JSONObject();
		
		json.put("role", role);
		json.put("content", msg);
		
		messages.put(json);
		
		
		return sendMsg.toString();
		
	}
	
	public void send(String msg)
	{
		
		try
		{
			 // connect 메서드를 호출하여 con 객체를 초기화합니다.
	        connect();
	    
			//chatGPT에게 전달한 JSON 형태로 변환한다.
			String json = makeJsonMsg("user",msg);
			
			send(con.getOutputStream(),json);
			
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
	}

	public void send(OutputStream out , String msg)
	{
		
		try
		{
			//문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = msg.getBytes("utf-8");
			//스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes);
			
			out.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}

	}
	
	public String receive()
	{
		try
		{
			//chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
//			con.getResponseCode();	
			String json = receive(con.getInputStream());
			String msg = parseJsonMsg(json);
			
			//json 형태의 메시지는 받았을때는 필요 없으니 반환값을 따로 저장해두진 않는다.
			makeJsonMsg("assistant",msg);

		
	        return msg;
	    } catch (Exception ex) {
	        System.out.println(ex.toString());
	    }

	    return null;
	}
	
	public String receive(InputStream in)
	{
		StringBuilder response = new StringBuilder();
		try
		{
			//chatGPT가 보내온 응답을 받기 위해 InputStream을 열고 버퍼를 통해 받아온다.
			//InputStreamReader 클래스는 바이트기반스트림을 문자기반스트림으로 변환해준다.
			BufferedReader br = new BufferedReader(new InputStreamReader(in,"utf-8"));
		
			//응답을 저장할 String 변수이다.
			String responseLine  = null;
			
			//버퍼로 부터 데이터를 가져온다.readLine()은 문자열에서 개행이 있는부분까지 한번에 가져온다.
			//더이상 가져올 문자가 없다면 null이 반환된다.
			while((responseLine = br.readLine()) != null)
			{
				//trim은 공백을 제거 하는 메서드 이다. 
				//chatGPT 테스트 결과 가끔 응답에 공백을 많이 넣어준다. 
				//대답이 길경우 성능향상을 위해 StringBuilder를 사용했다.
				response.append(responseLine.trim());
			}
			
			br.close();
		}catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		
		
		return response.toString();
	}
	
	

	
	
	
	public String parseJsonMsg(String json)
	{
		//chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
		JSONObject obj = new JSONObject(json); 
		String result =obj.getJSONArray("choices")
						  .getJSONObject(0)
						  .getJSONObject("message")
						  .get("content").toString();
		
		
		return result;
	}
			
			public String getNextWord(String input) {
		        String[] words = input.split(" ");
		        String lastWord = words[words.length - 1];

		        for (String word : endword) {
		            if (word.startsWith(lastWord.substring(lastWord.length() - 1))) {
		                return word;
		            }
		        }

		        return null;
		    }

			public void playWordChain() {
		        while (true) {
		            // 사용자 입력 받기
		            String userInput = getUserInput();

		            // 끝말잇기 진행 중인 경우
		            if (isPlaying) {
		                String response = playWordChain(userInput);
		                System.out.println("chatGPT: " + response);

		                // 끝말잇기가 종료된 경우
		                if (!isPlaying) {
		                    break;
		                }
		            }
		            // 끝말잇기 시작하기
		            else {
		                if (userInput.equals("끝말잇기 시작")) {
		                    isPlaying = true;
		                    lastWord = "끝말잇기";
		                    System.out.println("chatGPT: 끝말잇기를 시작합니다. 제가 먼저 단어를 말할게요. 제시어: " + lastWord);
		                } else {
		                    System.out.println("chatGPT: 끝말잇기를 시작하려면 '끝말잇기 시작'이라고 말해주세요.");
		                }
		            }

		            // chatGPT에게 메시지 전송 및 응답 받기
		            send(userInput);
		            String response = receive();
		            System.out.println("chatGPT: " + response);
		        }
		    }
			
			public String playWordChain(String userInput) {
		        if (lastWord.contains("끝말잇기")) {
		            if (userInput.equals("끝말잇기 시작")) {
		                return "이미 끝말잇기가 진행 중입니다. 계속 진행해주세요.";
		            } else {
		                String[] words = userInput.split(" ");
		                String currentWord = words[words.length - 1];
		                if (!lastWord.endsWith(currentWord.substring(0, 1))) {
		                    String result = "끝말잇기 규칙에 어긋납니다. 제가 이겼네요! 다시 시작하려면 '끝말잇기 시작'이라고 말해주세요.";
		                    isPlaying = false;
		                    lastWord = "";
		                    return result;
		                } else {
		                    lastWord = currentWord;
		                    endword.add(lastWord);
		                }
		            }
		        } else if (lastWord.contains("끝말잇기 시작")) {
		            isPlaying = true;
		            lastWord = "끝말잇기";
		            return "끝말잇기를 시작합니다. 제가 먼저 단어를 말할게요. 제시어: " + lastWord;
		        }

		        return "끝말잇기가 종료되었습니다. 다시 시작하려면 '끝말잇기 시작'이라고 말해주세요.";
		    }

			public boolean isPlaying() {
			    return isPlaying;
			}

			public String getUserInput() {
			    Scanner scanner = new Scanner(System.in);
			    System.out.print("나: ");
			    return scanner.nextLine();
			}
}

		
		


	
	

