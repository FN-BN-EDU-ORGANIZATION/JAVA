package HOMEWORK;

import java.util.Scanner;

public class C20230630 {
	public static void main(String[] args) {
	//의문점
		//
	
	//정리
		//예제2번을 너무 어렵게 생각해서 풀었음..
		//값을 저장해야해야한다는 생각으로 배열을 사용해서 풀었는데 답은 더 간단하게 풀 수 있었다..!
	
	//예제1 : for문으로 일주일동안 200쪽의 책을 읽는 프로그램 만들기.
	//		 날짜마다 읽은 책 페이지 입력받기, 다 읽었을 경우 탈출. 덜 읽었을 경우 남은 페이지수 출력
		Scanner sc = new Scanner(System.in);
		int day = 7;
		int read = 0;
		int read_page = 0;
		for(int i=1; i<=day; i++) {
			System.out.println(i+"일째 읽은 페이지 수");
			read = sc.nextInt();
			read_page+=read;
			if(read_page>=200) {
				System.out.println(i+"일만에 다 읽었습니다.");
				break;
			}
		}
		if(read_page<200) {
			System.out.println("책을 다 못 읽었습니다.");
			System.out.println("남은 페이지 수 : " + (200-read_page));
		}
		
		
	//예제2 : 이중 for문으로 세명의 사격선수의 점수 입력받아 1등한 선수의 번호와 점수 출력하는 프로그램 만들기
		//
		int[] arr = new int[3];
		int entry = 1;
		int num = 1;
		int score = 0;
		int addscore = 0;
		int best_entry = 0;
		int max_score = arr[0];

		for(entry=1; entry<=3; entry++) {
			System.out.println(entry+"번 선수 사격");
			for(num=1; num<=5; num++) {
				System.out.println(num+"번째 사격");
				score = sc.nextInt();
				addscore += score;
			}
			arr[entry-1] = addscore;
			System.out.println("총점수 : " + addscore);
			addscore=0;
			}
		
		for (int i = 0; i < arr.length; i++) {
			if (max_score < arr[i]) { // 최대값 비교
				max_score = arr[i]; // 최대값 할당
				best_entry = i+1;
			}
	}
		System.out.println("최고 점수 : " + max_score);
		System.out.println("최고 점수를 기록한 선수 : " + best_entry+"번째 선수");
	}		
}
