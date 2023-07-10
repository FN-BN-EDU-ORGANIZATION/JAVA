package C20230710;

public class Q1 {
	//정수 n을 입력받고, n항 이하까지의 피보나치 수열을 출력
	
	static int fib(int n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		}else {
			return fib(n-2)+fib(n-1);
		}
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(fib(i));
		}
		
	}

}
