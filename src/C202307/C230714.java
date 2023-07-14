package C202307;

import java.util.Arrays;

public class C230714 {
	
	static int fib(int n) {
        if (n == 0) {  // n이 0일 때는 0을 반환
            return 0;
        } else if (n == 1) {  // n이 1일 때는 1을 반환
            return 1;
        } else {  // n이 2 이상일 때는 그 이전의 두 값을 더하여 반환
            return fib(n - 2) + fib(n - 1);
        }
    }

	public static void main(String[] args) {
		// A학급 학생의 점수를 나타내는 정수 배열이다. 다음 배열에서 50점 이상 점수의 총합을 구하시오.
		int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total = 0;
        for (int a : A) {
            if (a >= 50) {
                total += a;
            }
        }
        System.out.println(total);  // 481  출력
        
        int[] A1 = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};
        int total1 = Arrays.stream(A).filter((a) -> a >= 50).sum();
        System.out.println(total);  // 481  출력
        
        //입력을 정수 n으로 받았을 때, n항 이하까지의 피보나치 수열을 출력하는 프로그램을 작성
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));  // 순서대로 0 1 1 2 3 5 8 13 21 34 출력
        }
	}

}
