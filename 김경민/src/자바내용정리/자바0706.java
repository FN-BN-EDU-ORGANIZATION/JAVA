package 자바내용정리;

import java.util.Scanner;

//1. 영문자 모음의 아스키 코드 값을 화면에 출력
//2. 알파벳을 입력 받아 대문자는 소문자로, 소문자는 대문자로 출력

public class 자바0706 {

	public static void 문제1() {
		String alpa = "AEIOU";
		for (int i = 0; i < alpa.length(); i++) { // alpa.length는 String alpa의 문자열 길이
			char askii = alpa.charAt((int) i); // alpa.chatAt(i)은 "AEIOU"의 문자열 중 i번째 문자를 선택하는 메소드
			System.out.println(askii + " = " + (int) askii);
		}
	}

	public static void 문제2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력(알파벳) : ");
		String inputStr = sc.nextLine();

		for (int i = 0; i < inputStr.length(); i++) { // 입력받은 알파벳을 한 글자씩 대문자 또는 소문자로 변경
			char alpa = inputStr.charAt(i); // 입력받은 문자열의 i번째 문자를 선택해 대/소문자 변경

			if (64 < (int) alpa && (int) alpa < 91) { // 대문자를 소문자로 변경
				int small = (int) alpa + 32;
				System.out.print((char) small);
			}
			if (96 < (int) alpa && (int) alpa < 123) { // 소문자를 대문자로 변경
				int cap = (int) alpa - 32;
				System.out.print((char) cap);
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		문제1();
		문제2();

	}

}
