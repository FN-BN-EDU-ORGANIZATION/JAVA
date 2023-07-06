package C0706;

import java.util.Scanner;

public class C02Ex {
	public static void main(String[] args) {
//		별찍기 문제 해결
		문제2444();
	}
	public static void 문제2444() {
//		스캐너 sc 객체 생성
		Scanner sc = new Scanner(System.in);
		
//		스캐너로 받은 수를 정수형 a 변수에 저장
		int a = sc.nextInt();
		
		for (int i=1;i<=a;i++) {
			for(int j=0;j<=a-i-1;j++) {
//				공백을 우선으로 찍기
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)-1;k++) {
//				별찍기
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=a-1;i>0;i--) {
			for(int j=a-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=(2*i)-1;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
