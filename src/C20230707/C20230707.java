package C20230707;

public class C20230707 {

}
package mystudy01_solve;

import java.util.Scanner;

public class T01 {

	public static void main(String[] args) {
		//조건문 반복문 문제
		//1)삼각형모양의 피라미드를 만드시오 
		
		//2)5개의 숫자를 입력받은뒤 가장 작은 수와 가장 큰 수를 출력하는 프로그램을 작성하시오
		
		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[5];  //0~4 인덱스 길이 5

		
		for(int i =0; i<Arr.length; i++) {
			System.out.println("아무 숫자나 입력하세요");
			Arr[i] = sc.nextInt(); //값을 다 인덱스에 입력받고 저장상태
		}
		int max = Arr[0];  //ex 60 
		int min = Arr[0];  //ex 10
		for(int i=1; i<5; i++)  // i를 반복시키면서 다시 호출
		{
			if(max < Arr[i]){
				max = Arr[i];
			}
			else if(min > Arr[i]) {
				min = Arr[i];
			}
		}
		System.out.println("최대값은 ="+max+"최소값은 ="+min);


	}

}
