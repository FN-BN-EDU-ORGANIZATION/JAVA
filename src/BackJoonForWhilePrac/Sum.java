package BackJoonForWhilePrac;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("개수를 입력하세요: ");
		int t = scan.nextInt();
		int cnt =0;
		
		do
		{
			System.out.println("a 의 값을 입력하세요 : ");
			int a = scan.nextInt();
			System.out.println("b 의 값을 입력하세요 : ");
			int b = scan.nextInt();
			System.out.println("a + b = " + (a+b));
		}
		while(cnt < t);

	}

}
