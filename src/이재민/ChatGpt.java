package 이재민;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

public class ChatGpt {

	private String key;
	HttpURLConnection con = null;
	private JSONObject sendMsg = new JSONObject();
	private JSONArray chatHistory = new JSONArray();

	//끝말잇기의 단어 저장용(공유)
	public static List<String> endword = new ArrayList();	

	public ChatGpt(String key) {
		this.key = key;
		
		sendMsg.put("model", "gpt-3.5-turbo");
		sendMsg.put("messages", new JSONArray());
		
	
	}
	
	public void JASONObject()
	{
		JSONObject obj = new JSONObject();
		obj.put("role", "user");
        obj.put("content", "안녕");
        chatHistory.put(obj);
	}

	public HttpURLConnection connect() {
		
		try {
			URL url = new URL("https://api.openai.com/v1/chat/completions");

			// 객체화한 url을 통해 http통신을 위한 객체를 생성한다.메서드 방식은 POST 이다.
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			// http 통신시 데이터 형태는 json이라고 선언
			con.setRequestProperty("Content-Type", "application/json; utf-8");
			// 발급받은 키값을 넣어준다.
			con.setRequestProperty("Authorization", "Bearer " + key);
			// chatGPT의 대답이 느릴경우 기다려주는 타임을 설정
			con.setRequestProperty("Retry-After", "3600");
			// 데이터 전송을 위해 true로 설정해야 한다.
			con.setDoOutput(true);
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		return con;
	}

	public void send(OutputStream out, String msg) {
		String input = msg;

		try {
			// chatGPT로 보낼 메시지

			// json 형태로 되어있고 모델 정보와 메시지 정보가 들어가 있다.
			// chatGPT가 했던 대답은 role 이 assistant 이여야 한다.
			// 예제 ->
			// messages\":[{\"role\":\"user\",\"content\":\"안녕\"},{\"role\":\"assistant\",\"content\":\"chatGPT의
			// 대답\"}]
			String msg1 = "{\"model\": \"gpt-3.5-turbo\",\"messages\":[{\"role\":\"user\",\"content\":\"" + input
					+ "\"}]}";

			// 문자열을 보내기전에 utf-8 형태로 인코딩을 변환하고 바이트로 변경한다.
			byte[] inputBytes = msg1.getBytes("utf-8");
			// 스트림으로 바이트로된 메시지를 전달한다.
			out.write(inputBytes);
			out.close();
		
			JSONObject userMsg = new JSONObject();
	        userMsg.put("role", "user");
	        userMsg.put("content", input);
	        chatHistory.put(userMsg);
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}

	}
	
	public void send(String msg)
	{
		try
		{
			send(con.getOutputStream(),msg);
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
	}

	public String receive(InputStream in) {
		StringBuilder response = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in, "utf-8"));
			String responseLine;
			while ((responseLine = br.readLine()) != null) {
				response.append(responseLine.trim());
			}
			br.close();
			
			
			int responseCode = con.getResponseCode();
			if (responseCode != HttpURLConnection.HTTP_OK) {
	            System.out.println("에러코드" + responseCode);
	            return null;
	        }
			
		} catch (Exception ex) {
			System.out.println(ex.toString());
		}
		
		return parseJsonMsg(response.toString());
	}
	
	public String receive() throws IOException
	{
		return receive(con.getInputStream());
	}
	

	public String parseJsonMsg(String json)
	{
		
		try 
		{
		// chatGPT로 부터 받은 JSON 데이터를 파싱하여 대답 부분만 추출한다.
					JSONObject obj = new JSONObject(json.toString());
					String result = obj.getJSONArray("choices").getJSONObject(0).getJSONObject("message").get("content")
							.toString();
					
					JSONObject assistantMsg = new JSONObject();
			        assistantMsg.put("role", "assistant");
			        assistantMsg.put("content", result);
			        chatHistory.put(assistantMsg);
			        
			        
					return result;
		}
		catch(Exception ex)
		{
			System.out.println(ex.toString());
		}
		return null;
	
	}
}

// chatGPT로 부터 응답코드를 받아온다 200이면 정상이다.에러가 발생하면 예외가 발생된다.
//con.getResponseCode();
