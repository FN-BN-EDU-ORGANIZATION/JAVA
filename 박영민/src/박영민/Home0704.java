package 박영민;

import java.util.Scanner;

public class Home0704 {

	public static void main(String[] args) {
		// 의문점

		// 예제1 사람이65명있고 차 한대에 탈수있는 인원이 4명이라면 몇대가 필요한지 구하시오

		int people = 65;

		int carPassengers = 4;

		System.out.println("필요한 차의 대수 : " + people / carPassengers);

		// Bonus 사람을 입력받는다고 치면?

		System.out.println("----------------------");

		Scanner sc = new Scanner(System.in);

		System.out.print("사람수를 입력하세요 : ");

		int a = sc.nextInt();

		System.out.println(a + "명은 차량 " + a / carPassengers + "대가 필요합니다.");

		/*
		 * 어....사람이 남으면 차를 더 추가하지않는다... 나머지가 남아도 1대를 더 추가해야한다...그럼 나머지가 생길때 몫을 1더해야한다
		 */

		System.out.println("");

		int A = a / carPassengers; // A에 몫을 담고

		int B = a % carPassengers; // B에 나머지를 담고
		if (B > 0) { // 나머지가 0이상일때 몫을 1개 더올린다.
			A++;
		}

		System.out.println(a + "명의 차량 " + A + "대가 필요합니다.");

		// 사람이 남아도 차가 한대 더늘어서 표기된다!

		System.out.println("----------------------");

		// 예제2 int형 변수 num에 100이상의 숫자를 저장후 백의자리 이하는 버리고 출력하시오.

		int num = 4556;

		System.out.println(num / 100 * 100);

		// Bonus 이것도 입력받아 보자.

		System.out.print("\n100이 넘는 수를 입력하세요 : ");

		int q = sc.nextInt();

		System.out.println("");
		if (q < 100) {

			System.out.println("100이 넘지 않습니다. 재실행 하세요.");
			// 자..뭔가 너무간단하게 되는거같은데 100이하일때도 해보자.
		} else if (q >= 100) {
			System.out.println("저장된 100의 자리 이상 숫자 :" + q / 100 * 100);
			// 하다보니 if문을 쓰게되었다.
		}

	}

}
