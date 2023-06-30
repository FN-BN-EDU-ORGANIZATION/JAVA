package KwonIlkeun;

import java.util.Scanner;

public class C20230630 {

	public static void main(String[] args) {


		//의문점		: 이해안되는 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		
		//예제 1 두 정수 A,B를 입력받아 A+B를 출력
//		Scanner sc = new Scanner(System.in);
//		int A=sc.nextInt();
//		int B=sc.nextInt();
//		int total = A+B;
//		
//		System.out.println("두 정수의 합: "+total);	//입력받은 두 정수를 total에 저장
		
		
		
		//예제2 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
		
		Scanner sc = new Scanner(System.in);
		
		int score=sc.nextInt();
		
		if(score<=100 && score>=90)
			System.out.println("A");
		else if(score<=89 && score>=80)
			System.out.println("B");
		else if(score<=79 && score>=70)
			System.out.println("C");
		else if(score<=69 && score>=60)
			System.out.println("D");
		else
			System.out.println("F");	//60점 밑으로는 F출력
		
		
		
	}

}
