package C20230629;

import java.util.Scanner;

public class C20230629 {
	public static void main(String[] args) {

		//의문점	:자바 내용중 제일 처음 어렵기 시작 했던 배열 기초관련 공부 부터 차근차근 다시 시작
		//정리 : 코드에 대한 전반적인 정리/해석
		
		
		//예제 1
		
		// 인트 배열 num을 선언하고 다섯 개의 정수 값으로 초기화
		int num[] = {30,60,-100,3000,38}; // 정수형 변수 sum을 선언하고 0으로 초기화
		
		int sum =0; // 배열 num의 길이만큼 반복문을 실행
		for(int i = 0; i< num.length; i++)
			// 현재 인덱스 i의 값과 sum을 더하여 sum에 저장
			sum+= num[i];
		// 배열의 합(sum)을 출력
		System.out.println("배열의 합: "+ sum);
		
		//예제 2
		// 인트 배열 num2를 선언하고 다섯 개의 정수 값으로 초기화
		int num2[] = {30,60,-100,3000,38}; // 최대 값을 저장할 정수형 변수 max를 선언하고 배열 num2의 첫 번째 요소로 초기화 
		int max = num[0]; // 배열 num의 두 번째 요소부터 마지막 요소까지 반복문을 실행
		
		for(int i = 1; i<num.length; i++) {
			// 현재 인덱스 i의 값이 max보다 크면 max에 현재 값(num2[i]) 저장

			if(num[i]>max)
				max=num[i];
			// 최대값(max) 출력
		}
		System.out.println("최대값: "+max);
		
	
		
		
		
	}
}
