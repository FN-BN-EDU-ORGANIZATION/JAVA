package 황다은;

import java.util.Scanner;

public class C20230629 {

//	public static void main(String[] args) {
//
//		//의문점		: 이해안된 부분 적기
//		//정리 : 코드에 대한 전반적인 정리/해석
//
//		//예제1
//		int[] scores = {42,56,48,39,51,60,43,23};
//		int count = solution(scores);
//		System.out.println(count);
//	}
//	private static int solution(int[] scores) {
//
//		int count = 0;
//		for(int i=0; i<scores.length; i++) {
//			if(scores[i]>=40 && scores[i]<60) {
//				count++;
//			}
//		}
//		return count;
//	}
	//정리 : 점수가 40점이상 60점미만인경우 수강대상자로 받아들이고 그 수를 카운트
	//      main메소드에서 주어진 예시 입력값을 이용하여 solution메소드 실행하고 그 결과 출력예제
	
	
	//예제2
	public static void main(String[] args) {
		System.out.println("10이하 정수를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int i;
		int a = sc.nextInt();
		
		if(a>0 && a<11) {
			for(i = 1; i<=a; i++) {
				System.out.println("자바공부하자");
			}
		}
		else {
			System.out.println("입력값 에러");
		}
	}
	
	//정리 : for문 예제) 10이하의 정수를 입력받아 정수만큼 "자바공부하자"이라고 출력하는 프로그램
}



