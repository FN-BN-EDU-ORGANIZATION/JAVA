package Test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int input = sc.nextInt();
		
		for(int i=1;i<=input;i++)
		{
			for(int j=input;j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<i*2-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
