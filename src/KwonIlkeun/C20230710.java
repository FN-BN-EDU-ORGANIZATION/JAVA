package KwonIlkeun;

import java.util.Scanner;

public class C20230710 {
	

	public static void main(String[] args) {
		
		// 문제1 0~99사이의 랜덤한 수를 생성해서 사용자가 맞힐때까지 반복하여 횟수를 출력하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		int answer = (int) (Math.random()*100);
//		int guess, cnt=0;
//		do {
//			System.out.print("정답을 추측하여 보시오: ");
//			guess = sc.nextInt();
//			if(guess<answer) {
//				System.out.print("LOW\n");
//				cnt++;
//			}
//			if(guess>answer){
//				System.out.print("HIGH\n");
//				cnt++;
//			}
//		}while(guess !=answer);
//		System.out.printf("축하합니다. 시도횟수=%d", cnt);
		
		//문제2 변수 n1과 n2에 값을 넣고 n1과 n2사이의 합을 계산하여 그 결과를 출력하는 프로그램을 작성.
		//단, 5와 2 처럼 큰 수를 먼저 입력받아도 같은 결과가 나와야 함
		int n1 = 0, n2 = 0;
		int result = 0;

		n1 = 2;
		n2 = 5;

		if(n1 > n2) {
		    int n3 = n1;
		    n1 = n2;
		    n2 = n3;
		}
		for(int i = n1; i <= n2; i++) {
		    result += i;
		}
		System.out.println("결과 :"+ result);
		
		
	}
}
