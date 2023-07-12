package mystudy02_over;

public class Myjava07_Recursive_Func {

		/*
		 * 자기 자신을 호출하는 함수
		 * 자기 자신을 무한대로 호출하면 안 되니
		 * 종료 조건을 두고 만듭니다
		 * 
		 * 1
		 */
	
	static int sum(int n ) {
		if(n<=0) 
				return 0;
			return n+sum(n-1);
	
	}
	//재귀나 반복없이 1부터 num까지의 합 구하는 코드
	static int newSum(int num) {
		return (num+1) * num/2;
	}
	static int basicSum(int n) {
		int sum= 0;
		for(int i =1; i<=n;i++) 
			sum+=i; // sum = sum+i
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("1부터 10까지의 합 "+sum(5));
		System.out.println("1부터 100까지의합 "+sum(100));
	}
}
