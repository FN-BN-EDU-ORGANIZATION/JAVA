package J230630.IO;

import java.io.*;


public class IO {
	public static void main(String[] args) throws IOException{
		//1) IO : Input(입력), Output(출력)
		//입력:프로그램에 데이터가 들어오는 것
		//출력:프로그램의 데이터가 나가는것
		
		//2)스트림 : 데이터의 흐름, 단방향, FIFO 구조(먼저들어온 데이터가 먼저 나가는 구조)
		//바이트기반과 문자단위로 분류
		//Input, Output = 바이트 기반 스트림 
		//InputStream 입력, 외부의 데이터가 프로그램에 들어온다
		//OutputStream 출력, 외부장치의 데이터를 쓰겠다 
		//FileInputStream 		파일		FileOutputStream
		//PipedInputStream 		메모리	PipedOutputStream
		//AudioInputStream 		오디오	AudioOutputStream 
		//ByteArrayInputStream 	프로세스	ByteArrayOutputStream
			
		//	활용 예시		
		//	FileInputStream fis = null; 파일에 있는 데이터를 읽어 오겠다 = 초기값
		//	fis = new FileInputStream("파일위치"); 어떤위치에 파일이 있는지 입력
		//	fis.read();	지정한 위치에 있는 파일에 있는 데이터를 읽어 오겠다.
		
		
		
		//바이트 보조 기반 스트림 (서포터) : 바이트 기반 스트림의 성능을 향상시키는 역할
		//FilterInputStream		필터를 이용한 입출력	FilterOutputStream
		//BufferedInputStream	버퍼를 통한 입출력	BufferedOutputStream
		//DataInputStream		기본 단위로 데이터처리 DataOutputStream	
		//	입력보조스트림 없읍		print,printf,println 사용		PrintStream
		//	활용 예시	
		//	FileInputStream fis = null; 파일에 있는 데이터를 읽어 오겠다 = 초기값
		//	fis = new FileInputStream("파일위치"); 어떤위치에 파일이 있는지 입력
		//	BufferedInputStream bis = new BufferedInputStream(fis);
		//	▲내가만든 파일의 성능을 향상시키기 위해서 보조스트림 bis를 만들어서 보조기반스트림에 값으로 입력
		//	Buffer 데이터를 하나씩 낱개로 보내는것보다 적절한 상자에 담아 한번에 전송해서 빠르게 전송
		
		FileInputStream fis = null;	//입력스트림
		FileOutputStream fos = null;//출력스트림
		fis = new FileInputStream("c:\\IOtest\\test.txt"); //존재하는 파일과 연결
		fos = new FileOutputStream("c:\\IOtest\\test2.txt");//존재하지않으면 파일 생성, 존재하면 파일 덮어쓰기
		
		BufferedInputStream bis=new BufferedInputStream(fis);
		//test 파일을 보조기반 bis를 사용해서 읽어 오겠다 
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		//test에서 읽어온 내용을 보조기반 bos를 사용 해서 test2 파일에 다시 쓰겠다
		
		int data;
		while((data=fis.read())!=-1) {
			//data에 읽어온 바이트를 저장하는데, data의 값이 -1이 아닐 때까지
			//-1: EOF(End Of File) File의 끝을 만나기 전까지 읽어 오겠다
			
			bos.write(data);
		}
		bos.close(); 
		bis.close();
		//파일과의 연결을 닫는 작업
	}}	
	