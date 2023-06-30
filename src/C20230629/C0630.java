package study;

import java.util.Scanner;

public class C0630 {

	public static void main(String[] args) {
		
		예제1();		//백준 별찍기 10950번 -  정수 a,b를 입력 받은 다음 a+b를 출력
		예제2();		//백준 별찍기 10807번 - 총 n개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하세요.
		

	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();					//숫자를 입력하세요 출력 후 입력된 숫자를 변수 n에 저장
		
		for(int i=0;i<n;i++)			// int i를 n보다 작을 때까지 반복
		{
			int a = sc.nextInt();		// 입력된 숫자를 변수 a에 저장
			int b = sc.nextInt();		// 입력된 숫자를 변수 b에 저장
			System.out.println(a+b);	// a+b의 값 출력
		}
		
		
		
	}
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];		//n만큼 배열 크기 선언
		for(int i=0;i<n;i++)		//int i를 n보다 작을 때까지 반복
		{
			arr[i] = sc.nextInt();	//n만큼 정수 입력 배열arr에 저장
		}
		int v = sc.nextInt();
		int count = 0;
		for(int i=0;i<n;i++)		//int i를 n보다 작을 때까지 반복하고, v와 같은 값이 있으면 카운트를 한다.
		{
			if(v == arr[i])
				count++;
		}
		System.out.println(count);	//count 출력
	}
}
