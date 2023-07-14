package 이찬진;

import java.util.Scanner;

public class C20230714 {

	public static void main(String[] args) {
		
		//예제1
		//방정식 2x+4y=10의 모든 해를 구하시오
		//단 x,y는 정수이고 각각의 범위는 0<=x,y<=10이다.
		
//		for(int x =0; x<=10; x++) {
//			for(int y=0;y<=10;y++) {
//				if(2*+4*y==10) {
//					System.out.println("x : "+x+" y :"+y);
//				}
//			}
//		}
//		System.out.println();
		
		//예제2
		//두개의 정수를 입력받아 시작해서 끝까지의 곱을 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 : ");
		int i = sc.nextInt();
		System.out.println("두 번째 숫자 : ");
		int j = sc.nextInt();
		
		int sum2 =1;
		if(i<j) {
			for(int num=i;num<j+1;num++) {
				sum2*=num;
			}
		}else if(j<i) {
			for(int num = j;num<j+1;num++) {
				sum2*= num;
			}
		}else {
			sum2=i;
		}
		System.out.println("곱하면 답은 "+sum2+"입니다");

	}

}
