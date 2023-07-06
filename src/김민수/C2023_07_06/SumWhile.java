package 김민수.C2023_07_06;

import java.util.Scanner;

//문제: 1부터 n까지의 합
public class SumWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 n을 입력해주세요>>>");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num;i++) {
			sum+=i;
			
		}
		System.out.println("1부터 정수 n까지의 합 ="+sum);
		
		
	}
}
