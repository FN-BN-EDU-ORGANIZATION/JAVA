package 박영민;

import java.util.Scanner;

public class Home0705 {

	public static void main(String[] args) {
		// 의문점

		// 예제1 int형 변수 a의 숫자가 홀수,짝수인지 출력하시오.

		System.out.print("숫자를 입력하세요 : ");

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a % 2 == 0) // if문에 출력문이 한줄이면{}가 생략가능하다.

			// 입력받은 수 a를 2로 나누어서 나머지가 0일시 출력된다.
			System.out.println("입력하신 수 " + a + "은(는) 짝수입니다.");

		else if (a % 2 != 0)

			// 입력받은 수 a를 2로 나누어서 나머지가 1일시 출력된다.
			System.out.println("입력하신 수 " + a + "은(는) 홀수입니다.");

		// Bonus 또 다른 수는 어떤수의 배수인지 확인 해보자
		System.out.println("-------------------------");

		System.out.print("숫자를 입력하세요 : ");

		int b = sc.nextInt();

		if (b % 3 == 0 && b % 5 == 0) {
			System.out.println("입력하신 수 " + b + "은(는) 3의배수 이면서 5의배수 입니다.");
			// 여기는 간단했는데
		} else if (b % 3 == 0 && b % 5 != 0) {
			System.out.println("입력하신 수 " + b + "은(는) 3의배수 이면서 5의배수는 아닙니다.");
			// 여기 살짝 헷갈렸고
		} else if (b % 3 != 0 && b % 5 == 0) {
			System.out.println("입력하신 수 " + b + "은(는) 3의배수가 아니고 5의배수 입니다.");
			// else { System.out.println("입력하신 수 "+b+"은(는) 3의배수가 아니고 5의배수도 아닙니다.
			// 이게 되나싶었지만 생각해보니 50은 5의배수다...그럼 (수정전)
			// 근데 17을 넣으니 또 출력이안되어서 생각해보니 위 조건에 다맞지 않다..나머지를 추가하자(수정후)
		} else {
			System.out.println("입력하신 수 " + b + "은(는) 3의배수가 아니고 5의배수도 아닙니다.");
			// 아마??이제 모든수가 해결이 될것이다.....
		}
		System.out.println("-------------------------");
		/* 예제2 키보드로 성적을 입력 받아 아래의 기준대로 출력 하시오.
		90점이상:A학점 80~89점:B학점 70~79점:C학점 60~69점:D학점 그이하:F학점 */
		System.out.println("성적을 입력하세요.");
		
		int c = sc.nextInt();
		
		if(c>=90) System.out.println(c+"점은 A학점입니다. 축하드립니다.");
		else if(c>=80 && c<90) System.out.println(c+"점은 B학점입니다. 축하드립니다.");
		else if(c>=70 && c<80) System.out.println(c+"점은 C학점입니다. 분발하세요.");
		else if(c>=60 && c<70) System.out.println(c+"점은 D학점입니다. 위험합니다.");
		else System.out.println(c+"점은 F학점입니다. 우리 또 만나요."); // 또 만나는 건 ..안되지
	}
}
