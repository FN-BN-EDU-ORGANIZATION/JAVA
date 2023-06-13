package EX.Ch01IF;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
	
//문제 1:
//변수 x에 정수 값을 할당하고, 다음 조건에 따라 출력하는 프로그램을 작성하세요.
//
//x가 0보다 작으면 "음수"를 출력합니다.
//x가 0보다 크면 "양수"를 출력합니다.
//x가 0이면 "0"을 출력합니다.
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int x = scan.nextInt();
		
		if(x<0)
		{
			System.out.println(x+"는 음수입니다");
		}
		else if(x > 0)
		{
			System.out.println(x+"는 양수입니다");
		}
		else
		{
				System.out.println(x+"는 0입니다");
		}	
	
//문제 2:
//변수 age에 정수 값을 할당하고, 다음 조건에 따라 출력하는 프로그램을 작성하세요.
//
//age가 0보다 작거나 같으면 "유효하지 않은 나이입니다."를 출력합니다.
//age가 0보다 크고 18보다 작으면 "미성년자입니다."를 출력합니다.
//age가 18보다 크고 65보다 작으면 "성인입니다."를 출력합니다.
//age가 65보다 크거나 같으면 "노인입니다."를 출력합니다.
		int age = scan.nextInt();
		if(age<=0)
		{
			System.out.println("유효하지 않는 나이입니다.");
		}
		else if(age>0 && age<=18)
		{
			System.out.println("미성년자입니다");
		}
		else if(age>18 && age < 65)
		{
			System.out.println("성인입니다");
		}
		else if(age>=65)
		{
			System.out.println("노인입니다.");
		}
		
//문제 3:
//변수 num에 정수 값을 할당하고, 다음 조건에 따라 출력하는 프로그램을 작성하세요.
//
//num이 3의 배수이면서 5의 배수이면 "3과 5의 배수입니다."를 출력합니다.
//num이 3의 배수이면 "3의 배수입니다."를 출력합니다.
//num이 5의 배수이면 "5의 배수입니다."를 출력합니다.
//위 조건에 해당하지 않으면 "해당하지 않습니다."를 출력합니다.
		int num = scan.nextInt();
		
		if(num%3==0 && num%5==0)
		{
			System.out.println(num+"은 3과 5의 배수입니다.");
		}
		else if(num%3 == 0)
		{
			System.out.println(num + "은 3의 배수입니다.");
		}
		else if(num%5 == 0)
		{
			System.out.println(num + "은 5의 배수입니다.");
		}
		else
		{
			System.out.println("해당하지 않습니다.");
		}
		
}

}
