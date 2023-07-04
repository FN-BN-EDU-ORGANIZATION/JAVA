package C20230629;

import java.util.Scanner;

public class C20230629 {
	public static void main(String[] args) {
		System.out.println("*");
		//기본적인 출력문으로 별을 출력함
		
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		    //for문을 활용한 별로 탑쌓기
		}
	}
}
