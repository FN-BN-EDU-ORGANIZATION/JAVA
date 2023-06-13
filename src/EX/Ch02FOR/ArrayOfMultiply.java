package EX.Ch02FOR;

import java.util.Scanner;

public class ArrayOfMultiply {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] x = new int[9];
		System.out.print("양의 정수 10개를 입력하시오 >>");
		for(int i=0; i< x.length;i++)
		{			
			x[i] = scan.nextInt();
			if(x[i]%3==0)
			{
				System.out.print(x[i] + " ");
				
			}
		}
		System.out.print("는 3의 배수입니다");
	}

}
