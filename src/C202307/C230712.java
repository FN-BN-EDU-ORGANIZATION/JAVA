package C202307;

import java.util.Arrays;

public class C230712 {

	public static void main(String[] args) {
		//홀수에만 2를 곱하여 리턴하기
		int[] numbers = {1, 2, 3, 4, 5};
        int[] result = Arrays.stream(numbers)  // IntStream 생성한다
                .filter((a) -> a % 2 == 1)  // 홀수만 취합한다
                .map((a) -> a * 2)  // 각 항목에 2를 곱한다
                .toArray()  // int[] 배열로 반환한다.
                ;
	    for (int num : result) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
        //음수 제거하기
        int[] numbers2 = {1, -2, 3, -5, 8, -3};
        int[] result2 = Arrays.stream(numbers2)  // IntStream을 생성한다
                .filter((a) -> a >= 0)  // 음수를 제거한다.
                .toArray()  // int[] 배열로 반환한다.
                ;
	    for (int num : result2) {
	        System.out.print(num + " ");
	    }
	}
}
