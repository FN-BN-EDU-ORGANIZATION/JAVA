package 이찬진;

import java.util.Scanner;

public class C20230712 {
	public static void main(String[] args) {
		
		//예제1
		//별찍기
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		
		for(int i =1; i<=n;i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
