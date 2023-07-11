package C20230711;

import java.util.Arrays;

public class Q3 {
	
	//배열에서 음수를 찾고, 제거한다. 그리고 완성된 result 배열의 모든 index를 출력
	
	public static void main(String[] args) {
		int[] numbers = {1,-15,2,3,-1,-2,-3};
		int[] result = Arrays.stream(numbers)
				.filter((a)-> a >= 0) // 배열 numbers에서 요소 a의 값이 0보다 크거나 같으면,
				.toArray()			  // 배열 result의 요소로 추가
				;
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
