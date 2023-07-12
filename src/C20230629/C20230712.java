package C20230629;

import java.util.HashMap;
import java.util.Map;


	public class C20230712 {
	    public static char findFirstUniqueCharacter(String str) {
	        int[] count = new int[26]; // 알파벳 개수에 맞게 배열 크기 설정
	        for (char c : str.toCharArray()) {
	            count[c - 'a']++;
	        }
	        for (char c : str.toCharArray()) {
	            if (count[c - 'a'] == 1) {
	                return c;
	            }
	        }
	        return ' '; // 중복되지 않는 문자가 없을 경우 공백 반환
	    }

	    public static void main(String[] args) {
	        String input = "abacabad";
	        char firstUniqueChar = findFirstUniqueCharacter(input);
	        System.out.println("첫 번째로 등장하는 중복되지 않는 문자: " + firstUniqueChar);
	    }
	}
	public class Main {
	    public static int findGCD(int num1, int num2) { // 두 개의 정수를 입력으로 받아 최대공약수를 계산하는 메소드를 선언합니다.
	        while (num2 != 0) { // num2가 0이 아닌 동안 반복합니다.
	            int temp = num2; // temp 변수에 num2 값을 저장합니다.
	            num2 = num1 % num2; // num2에 num1을 num2로 나눈 나머지를 저장합니다.
	            num1 = temp; // num1에 이전에 저장해둔 temp 값을 저장합니다.
	        }
	        return num1; // 반복이 종료된 후 num1에 저장된 값, 즉 최대공약수를 반환합니다.
	    }

	    public static void main(String[] args) { // 프로그램의 시작점입니다.
	        int a = 24; // 변수 a에 24를 저장합니다.
	        int b = 36; // 변수 b에 36을 저장합니다.
	        int gcd = findGCD(a, b); // findGCD 메소드를 호출하여 a와 b의 최대공약수를 계산하고, 그 결과를 변수 gcd에 저장합니다.
	        System.out.println(a + "와(과) " + b + "의 최대공약수: " + gcd); // 최대공약수를 출력합니다.
	    }
	}
	

	public class Main1 {
	    public static int[] twoSum(int[] nums, int target) { // 정수 배열과 목표 합계를 입력으로 받아 두 수의 합이 목표 합계가 되는 요소의 인덱스를 반환하는 메소드를 선언합니다.
	        Map<Integer, Integer> map = new HashMap<>(); // 정수와 인덱스를 매핑하기 위한 HashMap을 생성합니다.

	        for (int i = 0; i < nums.length; i++) { // 주어진 정수 배열을 순회합니다.
	            int complement = target - nums[i]; // 현재 요소와 목표 합계와의 차이를 계산하여 complement 변수에 저장합니다.
	            if (map.containsKey(complement)) { // complement가 이미 맵에 존재하는지 확인합니다.
	                return new int[] { map.get(complement), i }; // complement에 해당하는 값의 인덱스와 현재 인덱스를 배열로 반환합니다.
	            }
	            map.put(nums[i], i); // 현재 요소와 인덱스를 맵에 저장합니다.
	        }

	        throw new IllegalArgumentException("해결책이 없습니다."); // 해결책이 없는 경우 예외를 발생시킵니다.
	    }

	    public static void main(String[] args) { // 프로그램의 시작점입니다.
	        int[] numbers = { 2, 7, 11, 15 }; // 정수 배열을 선언하고 초기화합니다.
	        int target = 9; // 목표 합계를 설정합니다.
	        int[] indices = twoSum(numbers, target); // twoSum 메소드를 호출하여 두 수의 합이 목표 합계가 되는 요소의 인덱스를 계산하고, 그 결과를 배열로 저장합니다.
	        System.out.println("두 수의 합이 " + target + "가 되는 요소의 인덱스: " + indices[0] + ", " + indices[1]); // 결과를 출력합니다.
	    }
	}

