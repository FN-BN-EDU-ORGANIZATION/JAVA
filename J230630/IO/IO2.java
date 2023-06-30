package J230630.IO;

import java.io.*;


public class IO2 {
	public static void main(String[] args) throws IOException{
		
	
	
		//문자기반 스트림 : 16bit의 문자나 문자열을 읽고 쓰는 스트림
		//reader,writer = 문자기반 스트림
		//FileReader 		파일		FileWriter
		//PipedReader 		메모리	PipedWriter
		//CharArrayInput 	프로세스	CharArrayWriter
		//	활용 예시		
		//	FileReader fr = null; 			fr객체를 만들고
		//	fr = new FileReader("파일경로"); 어떤위치에 파일을 읽어올 것인지 경로전달
		
		//문자기반 보조스트림 (서포터)
		//문자기반 스트림의 성능을 향상시키는 역할
		//FilterReader		필터를 이용한 입출력	FilterWriter
		//BufferedReader	버퍼를 통한 입출력	BufferedWriter
		//	활용 예시		
		//	FileReader fr = null; 			fr객체를 만들고
		//	fr = new FileReader("파일경로"); 어떤위치에 파일을 읽어올 것인지 경로 전달
		//	BufferedReader br = new BufferedReader(fr); 버퍼를 사용한 상태로 fr을 입출력한다
		
			
		//파일복사프로그램
		FileReader fr; //문자 입력 스트림
		FileWriter fw; //문자 출력 스트림
		BufferedReader br;	//문자입력 보조 스트림
		BufferedWriter bw;	//문자출력 보조 스트림
		
		try {
			fr=new FileReader("c:\\IOtest\\test.txt"); //존재하는 파일
			fw=new FileWriter("c:\\IOtest\\test3.txt");//존재하지않으면 파일 생성, 존재하면 파일 덮어쓰기
			
			br=new BufferedReader(fr);
			//test 파일을 보조기반 fr를 사용해서 읽어 오겠다 
			bw=new BufferedWriter(fw);
			//test에서 읽어온 내용을 보조기반 fw를 사용 해서 test3 파일에 다시 쓰겠다
			String line;
			//문자열의 한줄 전체를 읽어 오겠다
			while((line=br.readLine())!=null) {
				//br.readLine 문자열값이 null값이 될 때 까지 한 줄씩 읽어 오겠다
				//null = 더이상 읽을 값이 없을 때 까지
				bw.write(line);
				//읽어온 파일을 쓰겠다
			}
			bw.close();
			br.close();
			//파일과의 연결을 닫는 작업
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}}




