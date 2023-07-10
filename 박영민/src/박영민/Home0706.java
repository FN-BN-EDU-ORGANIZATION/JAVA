package 박영민;

import java.util.Scanner;

public class Home0706 {

	public static void 예제1() {
		// 3개의 서로다른 정수를 입력받아 최대값을 출력하시오.
		Scanner sc = new Scanner(System.in); // scanner 생성
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt(); // 첫번째 입력받는 수 int형 변수를 num1에 담는다.
		int num2 = sc.nextInt(); // 두번째 입력받는 수 int형 변수를 num2에 담는다.
		int num3 = sc.nextInt(); // 세번째 입력받는 수 int형 변수를 num3에 담는다.

		int max; // 가장큰값을 넣을 변수를 선언한다.

		if (num1 > num2 && num1 > num3)
			max = num1; // 만약 num1이 num2보다크고 num3보다 크면 가장큰값은 num1이다.
		else if (num2 > num1 && num2 > num3)
			max = num2; // 아니면 num2가 num1보다크고 num3보다 크면 가장큰값은 num2이다.
		else
			max = num3; // 둘다아니면 num3이 제일크다. 예외를 찾아볼려고 했으나 없는거같다...?

		System.out.println("최대값은 " + max + "입니다.");

	}

	public static void 예제2() {
		// 정수 한개를 입력 받아 50이상인지 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		if (num >= 50)
			System.out.println("50이상입니다."); //입력한 num가 50보다 크거나 같으면 출력된다.
		else
			System.out.println("50미만입니다."); //그외에 출력된다.
	}

	public static void main(String[] args) {
		예제1();
		System.out.println("-----------------------");
		예제2();
	}

}
