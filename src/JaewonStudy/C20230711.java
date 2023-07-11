package JaewonStudy;

import java.util.Random;

public class C20230711 {
	// 의문점
	//정리 

			
//		예제 1 - 배열
//		일반적으로 배열을 사용하지 않을경우
//		int score1 = 80;
//		int score2 = 90;
//		int score3 = 99;
//		.
//		.
//		.
//		int score30= 39;
//		이렇게 각각 하나하나 선언해야하는 번거로움이 있다.
//		하지만 배열로 표현할경우
//		score = new int[29];
//		이렇게 한줄로 30개의 변수를 생성할수있다.
		
			
//		예제 2 - 배열을 사용한 정수 예문이다.
		
		public static void main(String[] args) {
			Random rd = new Random();
			
			int[] score = new int[30];
			for(int i=0;i<30;i++) {
				score[i]= rd.nextInt(100);
			}
			int sum = 0;
			for(int i=0;i<30;i++) {
				sum +=score[i];
			}
			int avg=sum/30;
			System.out.println("전체 성적의 평균은 : " + avg);
			
		}
}
