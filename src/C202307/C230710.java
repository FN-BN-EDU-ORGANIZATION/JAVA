package C202307;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class C230710 {

	public static void main(String[] args) throws IOException {
		//영문을 입력하고 엔터를 입력하면 입력한 영문을 대문자로 변경하여 출력하는 프로그램을 작성 
		//단, 사용자가 "END" 라는 문자열을 입력하기 전까지 반복해서 문장을 입력받을 수 있게 할것
		 while (true) {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("영어 문장을 입력하세요:");
	            String line = sc.nextLine();
	            if ("END".equals(line)) {  // 입력문장이 "END" 이면 종료
	                break;
	            }
	            System.out.println(line.toUpperCase());  // 대문자로 변경하여 출력
	        }
		//사용자의 입력을 파일(sample.txt)에 저장하는 프로그램을 작성 
		//단 프로그램을 다시 실행하더라도 기존에 작성한 내용을 유지하고 새로 입력한 내용을 추가해야 한다.
//		FileWriter fw = new FileWriter("sample.txt", true);
//        System.out.print("문장을 입력하세요:");
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        fw.write(String.format("%s\n", line));
//        fw.close();
	}

}
