package EX.Ch02FOR;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
	      String s;
	      char c;
	      
	      System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
	      s = sc.next(); //s 에 문자열 읽기
	      c = s.charAt(0); //s의 첫번쨰 문자를 c에 입력
	      
	      for(int i = 0; i<=c-'a'; i++) {
	         for(char j = 'a'; j<= c-i; j++) {
	            System.out.print(j);
	         }
	         System.out.println();
	      }
	      
	      sc.close();

	}

}
