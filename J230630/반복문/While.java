package J230630.반복문;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		//01 반복문 기본
		
//		int i=1;		// 1 탈출용 변수
//		while(i<=10) 	// 2 탈출 조건식 i가 10 이하에는 {} 코드를 반복한다
//		{
//			System.out.println("HELLO WORLD");
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("i : " + i);
			
		
//		int dan=1; //탈출용 변수
//		
//		while(dan<=9) //탈출 조건식 dan이 9이하인 경우 {} 코드 반복
//		{	System.out.println(dan);
//			dan++; // 탈출을 위한 연산 dan+1
//		} 
//		System.out.println();
//		
//		
//		
//		int i=1; //탈출용 변수
//
//		while(i<=9) { //탈출 조건식 i가 9이하인 경우 {} 코드 반복
//			System.out.println(i);
//			i++; //탈출을 위한 연산 i+1
//			}
		
		
				//2 - 9 단 출력
				
//				int dan=2; //탈출용 변수
//				int i=1; //탈출용 변수
//				
//				while(dan<=9) //dan이 9이하까지 반복하는 탈출 조건식
//				{
//					i=1; //진입시 변수 1
//					while(i<=9) { //i가 9이하 까지 반복하는 탈출 조건식
//						System.out.printf("%d x % d = %d\n", dan,i,dan*i);
//						i++; // 탈출을 위한 연산 i+1
//					}
//					System.out.println();
//					dan++; // 탈출을 위한 연산 dan+1
//				}

		//02 1 - 10까지의 합
		
//		int i=1;		// 탈출용 변수
//		int sum=0;		// 누적 합 저장 변수
//		while(i<=10) 	// 탈출 조건식 i가 10이하일 경우 {}코드 반복
//		{
//			System.out.println("i : " + i);
//			sum = sum + i; // 탈출을 위한 연산 while문 반복 중 sum 값 누적
//			i++;		// 탈출을 위한 연산 i+1
//		}
//		System.out.println("SUM : " + sum); // 반복문 최종 sum 값
		
		
		//1부터 입력한 정수(N)까지 합 구하기
//		Scanner sc = new Scanner(System.in); //Scanner 생성
//		int n=sc.nextInt(); //정수값을 입력받을 수 있는 스캐너 생성
//		
//		int i=1; //탈출용 변수
//		int sum=0; //누적 합 저장 변수
//		while(i<=n) // 탈출 조건식 1부터 사용자로부터 입력받은 n값에 도달할 떄 까지 반복 
//		{
//			sum+=i; //sum = sum+i; 
//			i++; //탈출 연산식
//		}
//		System.out.printf("1부터 %d까지의 합 : %d\n", n,sum);
//	
//N,M 을 입력받아서 N부터 M 까지의 합 구하기(N<M)
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); //정수값을 입력받을 수 있는 스캐너 생성
		int m=sc.nextInt(); //정수값을 입력받을 수 있는 스캐너 생성
		
		if(n>m) //n이 m 보다 크다면 두 수의 값을 교환하는 if문
		{
			int tmp=n;	
			n=m;
			m=tmp;
		}
		
		int i=n; //탈출용 변수
		int sum=0;	//누적 합 저장 변수
		while(i<=m) //탈출 조건식 사용자로부터 입력받은 n 값부터 m값이 도달 할 때 까지 반복
		{
			sum+=i; //탈출 연산식
			i++;	//탈출 연산식

		}
		System.out.printf("%d 부터 %d까지의 합 : %d\n",n,m,sum);
	
	}

}
