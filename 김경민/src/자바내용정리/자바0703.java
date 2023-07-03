package 자바내용정리;
//1. 정수형 변수 2개를 선언하여 각 20과 30으로 초기화 한 후
//   두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 출력

//2. 사각형의 넓이와 둘레를 구하자.
//   너비12.5 높이36.4 를 변수에 저장하고
//   각 면적과 둘레를 출력

public class 자바0703 {
	
	public static void 문제1() {
		int num1 = 20;
		int num2 = 30;
		
		System.out.println("더하기 결과 : "+(num1+num2));
		System.out.println("빼기 결과 : "+(num1-num2));
		System.out.println("곱하기 결과 : "+(num1*num2));
		System.out.println("나누기 결과 : "+(num1/num2));
		System.out.println("나머지 결과 : "+(num1%num2));
	}
	
	public static void 문제2() {
		double height = 36.4;
		double width = 12.5;
		
		System.out.println("면적 : "+(height*width));
		System.out.println("둘레 : "+2*(height+width));
	}
	
	public static void main(String[] args) {
		문제1();
		System.out.println("----------------------");
		문제2();
	}

}
