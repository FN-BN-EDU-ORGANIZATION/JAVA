package HomeWork.C20230710;

import java.util.Scanner;
import java.util.stream.IntStream;

public class C20230710 {
	
	public static void main(String[] args) {
		
		// 쉬운거 같은데도 하나도 떠오르지가 않는다.. 이론정립부터 해야하나?
		
		// 10~1000까지 각 숫자 분해하여 곱하기의 전체 합 구하기
		// ex) 10~15 각 숫자의 분해하여 곱하기의 전체합은 다음과 같다
		// 10 = 1*0 = 0, 11 = 1*1 = 1, 12 = 1*2 = 2, 13 = 1*3 = 3, 14 = 1*4 = 4, 15 = 1*5 = 5
		// 0+1+2+3+4+5 = 15가 된다.
		int sum=0;
		for(int i=10;i<=1000;i++) {
			int result = 1;
			int n = i;
			while(n>0) {
				result *= n%10;
				n /= 10;
			}
			sum += result;
		}
		System.out.println("Sum의 값은 : " + sum);
		System.out.println("---------------------------------------------------");
		int result = IntStream.rangeClosed(10, 1000)	//IntStream.rangeClosed()메서드를 사용하여 10~1000까지의 정수 스트림 생성
		        .map(x -> String.valueOf(x)				//String.valueOf(x)를 사용하여 각 정수를 문자열로 변환
		                .chars()						//문자열에 chars() 메서드를 호출하여 해당 문자열 문자들의 unicode값을 가진 IntStream을 얻음  
		                .map(y -> y - '0')				//char 타입은 map() 메서드를 갖고 있지 않기 때문에 mapToObj()를 사용하여 IntStream을 Stream<Character>로 변환해야 한다
		                								//그런 다음 각 문자에서 '0'을 빼서 해당하는 숫자 값으로 변환할 수 있습니다.
		                .reduce(1, (acc, element) -> acc * element))	//reduce() 메서드를 사용하여 숫자 값의 스트림을 초기값 1부터 곱하여 축소합니다
		        .sum();									//sum() 메서드를 사용하여 결과 값들을 모두 더합니다.

		System.out.println("연산의 결과 : " + result);
	
		
		// 등차 수열을 만들어서 시작값(a) 등차(d) 몇번째인지 나타내는 정수(n)가 입력될때 n번째 수를 출력하는 프로그램을 만들어보자
		// 1 4 7 10 13 16 19 22 25 28 31 .... 3씩 증가하는 등차수열
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int d = sc.nextInt(); 
		int n = sc.nextInt(); 
		
		int result1 = a + (n - 1) * d;
		System.out.print(a + "로 시작하는 " + d + " 값의 등차수열의 " + n + "번째 수는 " + result1);
		
	}
	
	
	
	
	
}
