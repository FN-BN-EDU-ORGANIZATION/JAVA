package 황다은;

import java.util.Scanner;

public class C20230706 {
	
	
	public static void main(String[] args) {
		//에제1
		//정리 : for문을 이용해서 원 출력해보기
		int N = 10; // 반지름의 길이
        for (int i = -N; i <= N; i++) {
            for (int j = -N; j <= N; j++) {
                if (i * i + j * j <= N * N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //예제2
        //삼항연산자 : 3개의 항목을 통해 연산하는 연산자 [표현법] 조건식 ? 조건식이 true일 경우의 값 : 조건식이 false일 경우의 값
        Scanner sc = new Scanner(System.in);
        System.out.println("정수값 입력하시오");
        int num = sc.nextInt();
        String result = num > 0 ? "양수이다" : "양수가 아니다";
        System.out.println(num+" 는"+result);
	}
}
