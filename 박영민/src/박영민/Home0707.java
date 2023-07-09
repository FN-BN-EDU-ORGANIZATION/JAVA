package 박영민;

import java.util.Scanner;

public class Home0707 {

	public static void main(String[] args) {
		예제1();	// X자 별 찍기
		예제2();	// 숫자를 입력 받아 while을 이용해 각 자리의 합을 구하시오. ex) 12345 -> 1+2+3+4+5=15

	}
	public static void 예제1() {
		int max = 10;		//변수 max 10으로 초기화
		
		for(int i = 0 ;i<=max; i++)		//변수 i를 0부터 max까지 반복(행)
		{
			for(int j = 0 ;j<=max; j++)	//변수 j를 0부터 max까지 반복(열)
			{
				if(i==j || max-i==j)	//i와j가 같거나, 역순으로 일치할 경우
					System.out.print("*");	//별 출력
				else
					System.out.print(" ");  // 아니면 공백 출력
			}
			System.out.println(); 	//줄 바꿈
		}	
		
		
	}
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		

		int sum = 0;		//sum을 0으로 초기화
		while(a != 0)		//a가 0이 아닌 동안 반복
		{
			sum += a % 10;			//나머지연산을 하여 1의 자리의 숫자를 가져와 더한다
			
			System.out.println("현재 합계 : " + sum);
			
			a /= 10;				//10으로 나누어 1의 자리를 없앤다
		}
			
		System.out.println("각 자리의 합계:" + sum);
	}
}