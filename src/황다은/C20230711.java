package 황다은;

import java.util.Scanner;

public class C20230711 {

	public static void main(String[] args) {
		//예제1
		//1000미만의 자연수에서 3,5의 배수의 총합구하기
		int sum = 0;
		for(int i = 1;i<1000;i++) {
			if(i%3==0||i%5==0) {
				sum += i;
			}
		}
		System.out.println("3과 5의 배수 합 : " + sum);
		
		//예제 2
		//한 게시판의 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주엏을 때 총 페이지수를 리턴
		int m = 74896; //총 게시물 건수
		int n = 15;	   //한 페이지 게시물 수
		int quotient = m/n;
		int remainder = m%n;
		
		int quotientPlusone = quotient + 1; //총 페이지
		
		System.out.println("총 게시물 수 : "+ m);
		System.out.println("한 페이지의 게시물 수 :" + n);
		if(remainder == 0) {
			System.out.println("총 페이지 수는 " +quotient);
		}else {
			System.out.println("총 페이지 수는 " + quotientPlusone);
		}
		
		
		//ㅇㅖ제 3
		//두 정수를 입력받아 합을 구하여 출력하는 프로그램만들기
		Scanner sc = new Scanner(System.in);// 사용자로부터 데이텨 입력받음
		System.out.println("두 정수를 입력하시오");
		
		int a = sc.nextInt(); //바구니에 입력받은 정수 하나를 넣음
		int b = sc.nextInt(); //바구네에 입력받은 두번째 정수 넣음
		
		int sum1 = a+b; //두 수를 더해서 sum에 입력
		System.out.println(a+"+"+b+"="+sum1);
		
		sc.close();//실행 마무리..
		
		
		
	}

}
