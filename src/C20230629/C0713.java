package study;

import java.util.Scanner;

public class C0713 {

	public static void main(String[] args) {
		예제1(); //백준10871번 x보다 작은 수


		예제2(); //백준 25304번 영수증
				// 첫째 줄에는 영수증에 적힌 총금액 x가 주어진다
				// 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 n이 주어진다.
				// 이후 n개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
				// 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
				// 일치하지 않는다면 No를 출력한다.
	}
	public static void 예제1() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();		//a를 입력받는다
		int x = sc.nextInt();		//x를 입력받는다
		
		int arr[] = new int[a];		//크기가 a인 배열 생성
		
		for(int i=0;i<a;i++)		//int i는 a보다 작을 때까지반복
		{
			arr[i] = sc.nextInt();	//arr[i]에는 입력 받는 수로 값을 채운다
			if(x > arr[i])			//x가 arr[i]보다 크다면
			{
				System.out.print(arr[i] + " ");		//arr[i]출력
			}
		}
		
	}
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();			//총금액
		int n = sc.nextInt();			//물건 갯수
		
		for(int i=0;i<n;i++)			//int i는 n보다 작을 때까지 반복
		{
			int price = sc.nextInt();	//물건값 입력
			int num = sc.nextInt();		//물건 개수 입력
			
			x -= price*num;				//총금액 - price*num
		}
		if(x == 0)
			System.out.println("YES");	//총금액이 0이라면 YES출력 (입력한 총금액에서 물건값을 전부 빼면 0이 되기 때문)
		else
			System.out.println("NO");	//그게 아니라면 NO출력
		
		
		
		
	}

}
