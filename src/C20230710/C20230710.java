package C20230710;

import java.util.Scanner;

public class C20230710 {
	// 배열관련 문제 풀이

	//1 배열을 이용하여 7일간 저금한 금액의 총합을 계산하 출력하는 프로그램
	public static void main(String[] args) {
	    // 저금 금액을 저장할 배열을 선언합니다.
		int money[] = new int [7];
	    // 총 합계를 저장할 변수
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		
	    // 사용자에게 7일간의 저금 금액을 입력 받도록 안내합니다.
		System.out.println("7일간의 저금 금액 입력");
		
	    // 7일 동안 입력을 받아 배열에 저장하고, 총합을 계산합니다.
		for(int i = 0; i<7; i++) {
			money[i] = input.nextInt();
			sum += money[i];
		}
		
	    // 7일간의 저금 금액을 출력합니다.
		System.out.println("7일간의 저금 금액 : " + sum);
		//----------------------------------------------
		
		//2 7명의 IQ를 입력받아 최대 IQ와 최소 IQ를 출력하는 프로그램
		
	    // 최고 IQ 값을 저장할 변수를 선언합니다.
		int MAX_IQ = 0;
	    // 최소 IQ 값을 저장할 변수를 선언합니다.
		int MIN_IQ = 0;
		
	    // 7명의 IQ 값을 저장할 배열을 선언합니다.
		int IQ_ARR[] = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
	    // 사용자에게 7명의 IQ 값을 입력 받도록 안내합니다.
		System.out.println("7명의 IQ입력");
		for(int i=0; i<7; i++) {
			IQ_ARR[i] = sc.nextInt();
		}
		
	    // 배열의 첫 번째 값을 최대, 최소값으로 초기화 합니다.
		MAX_IQ=IQ_ARR[0];
		MIN_IQ=IQ_ARR[0];
		
	    // 7명의 IQ 중에서 최고 IQ와 최소 IQ 값을 찾습니다.
		for(int i = 1; i<7; i++) {
			if(IQ_ARR[i] > MAX_IQ) {
				MAX_IQ = IQ_ARR[i];
			}
			if(IQ_ARR[i] < MIN_IQ) {
				MIN_IQ = IQ_ARR[i];
			}
		}
		System.out.println("최고 IQ:"+MAX_IQ);
		System.out.println("최소 IQ:"+MIN_IQ);
		//---------------------------------------------
		
		// 3 배열 이용하여 피보나치 수열을 저장하여 출력하는 프로그램
		
	    // 출력할 피보나치 수열의 개수를 저장하는 변수입니다.
		int num =0;
	    // 피보나치 수열을 저장하는 배열을 선언합니다.
		int fibonacci[]=new int [100];
		
		Scanner sc1 = new Scanner(System.in);
		
	    // 사용자로부터 출력할 피보나치 수열 개수를 입력받습니다.
		System.out.println("몇개의 피보나치 수열을 출력할려구요?");
		num = sc1.nextInt();
		
	    // 피보나치 수열의 첫 번째와 두 번째 값을 초기화합니다.
		fibonacci[0]=0;
		fibonacci[1]=1;
		
	    // 피보나치 수열의 나머지 값을 계산하여 저장합니다.
		for(int i=2; i<num; i++) {
			fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
		}
		
	    // 계산된 피보나치 수열을 출력합니다.
		for(int i=0; i<num; i++) {
			System.out.println(fibonacci[i]+" ");
		}
		System.out.println();
		
		
	}
	
	
	

}
