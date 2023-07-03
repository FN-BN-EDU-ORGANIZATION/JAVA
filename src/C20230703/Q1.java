package C20230703;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2= sc.nextInt();
		int a3 = 180-(a1+a2);
		
		if(a1+a2>180) {
			System.out.println("ERROR");
		}else if(a1==60 && a2==60) {
			System.out.println("Equilateral");
		}else if(a1==a2||a1==a3||a2==a3) {
			System.out.println("Isosceles");
		}else {
			System.out.println("Scalene");
		}

	}
	
}
