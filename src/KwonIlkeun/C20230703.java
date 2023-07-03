package KwonIlkeun;

import java.util.Scanner;

public class C20230703 {

	public static void main(String[] args) {
		
		
		
		//예제1
		
		//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 
		//출력 형식에 맞춰서 출력하면 된다.
		//N 은 1보다 크거나 같고 9보다 작거나 같다.
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();	//사용자로부터 N을 입력받고 변수n에 저장
//		
//		for(int i=1;i<10;i++)//for문을 이용하여 1~9까지 곱해서 출력
//		{
//			System.out.println(n+"x"+i+" = "+n*i);
//		}
		//--------------------------------------------------------
		
		
		//예제2
		
		//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;					//합을 구하기 위한 변수선언
		for(int i=1;i<=n;i++)		//1부터 n까지 합을 구하기위해 반복문 사용
		{
			sum += i;					
		}
		System.out.println(sum);
		
		
		
	}

}
