package BackJoonForWhilePrac;

import java.util.Scanner;

public class SumSum {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++)
		{
			sum+=i;
			i++;
		}
		
		System.out.println(sum);

	}

}
