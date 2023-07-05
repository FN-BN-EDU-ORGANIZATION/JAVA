package CPractice;

import java.util.Scanner;

public class C20230705_1 {
	 public static void main(String[] args) {
		 //팩토리얼을 구하는 코드
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("정수를 입력하세요: ");
	        int n = scanner.nextInt();
	        
	        int result = factorial(n);
	        
	        System.out.println(n + "의 팩토리얼: " + result);
	    }
	    
	    public static int factorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        
	        return n * factorial(n - 1);
	    }
	}