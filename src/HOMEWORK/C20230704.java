package HOMEWORK;

import java.util.Scanner;

public class C20230704 {
	// 의문점
	// 정리 클래스 내의 속성과 기능을 잘 나누어 두어야 한다,,
	// 예제1 : 명품자바 4장 클래스 문제 10번 다시 풀어보기
	static class Dictionary {
		//배열생성
		private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
		private static String[] eng = { "love", "baby", "money", "future", "hope" };
		
		public static String kor2Eng(String word) {
			//검색코드 작성
			for (int i = 0; i < kor.length; i++) { //배열이 끝날 때까지
				if (word.equals(kor[i])) { //kor배열 내의 단어와 작성한 단어가 일치할 떄
					System.out.print(word + "는");
					return eng[i]; //eng배열 출력
				}
			}
			return "false";
		}
	}

//	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		Dictionary dict = new Dictionary();

		System.out.println("한영 단어 검색 프로그램입니다.");
		while (true) {
			System.out.print("한글 단어?");
			String search = sc.next();
			if (search.equals("그만")) //그만이라는 단어를 입력할 경우 수식 멈춤
				break;
			String eng = Dictionary.kor2Eng(search);
			if (eng.equals("false")) //false일경우
				System.out.println(search + "는 저의 사전에 없습니다.");
			else
				System.out.println(eng);
		}
		sc.close();
	}

	// 예제2 : 명품자바 4장 클래스 문제 11번 다시 풀어보기
	
	class Add { //덧셈 클래스
		private int a;
		private int b;

		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int calculate() {
			return a + b;

		} 
	}

	class Sub { //뺄셈 클래스
		private int a;
		private int b;

		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int calculate() {
			return a - b;
		}
	}

	class Mul { //곱셈 클래스
		private int a;
		private int b;

		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int calculate() {
			return a * b;
		}
	}

	class Div { //나눗셈 클래스
		private int a;
		private int b;

		public void setValue(int a, int b) {
			this.a = a;
			this.b = b;
		}

		public int calculate() {
			return a / b;
		}

//	public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			int result = 0;
			System.out.print("두 정수와 연산자를 입력하시오 >> ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			String c = sc.next();
			switch (c) { //입력한 연산자에 따라 switch문 작성
			case "+":
				Add add = new Add();
				add.setValue(a, b);
				result = add.calculate();
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(a, b);
				result = sub.calculate();
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(a, b);
				result = mul.calculate();
				break;
			case "/":
				Div div = new Div();
				div.setValue(a, b);
				result = div.calculate();
				break;
			}
			System.out.println(result);
			sc.close();

		}
	}
}
