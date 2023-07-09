package 자바내용정리;

//문제 1.A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 
//공백으로 들여쓰기가 된 것들이 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
//A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.

//문제 2.입력 : 총건수(m), 한페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n >= 1)
//출력 : 총페이지수

public class 자바0707 {
	
	public static void 문제1() {

		String str = "int sum = 0;\r\n"
				+ "		for (int i = 1; i < 1000; i++) {\r\n"
				+ "			if (i%3 == 0 || i%5 == 0) {\r\n"
				+ "				sum += i;\r\n"
				+ "			}\r\n"
				+ "		}";
		
		System.out.println(str.replace("\t", "    "));
	}
	
	public static void 문제2() {
		int m = 74896; //총 게시물 건수
		int n = 13; //한 페이지 게시물 수
		
		int quotient = m/n;
		int remainder = m%n;
		
		int quotientPlusOne = quotient + 1;
		
		System.out.println("총 게시물 수는 " + m + "입니다.");
		System.out.println("한 페이지의 게시물 수는 " + n + "입니다.");
		if (remainder == 0) {
			System.out.println("총 페이지 수는 " + quotient + "입니다.");
		} else {
			System.out.println("총 페이지 수는 " + quotientPlusOne + "입니다.");
		}
	}
	
	public static void main(String[] args) {
		문제1();
		문제2();
	}

}
