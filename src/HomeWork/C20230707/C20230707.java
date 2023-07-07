package HomeWork.C20230707;

import java.util.HashSet;

// 전반적인 코드의 사용이 익숙하지가 않다. 많이 풀어보고 많이 봐야할거같다.

public class C20230707 {
	
	public static void main(String[] args) {

		// 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		// 8이 포함되어 있는 숫자의 갯수를 카운팅하는것이 아니라 8이라는 숫자를 모두 카운팅 해야한다
		// 예를들면 8808은 3, 8888은 4로 카운팅해야함
		int cnt = 0;
		for (int i = 0; i < 10000; i++) {
			int num = i;
			while (num > 0) {
				if (num % 10 == 8) {
					cnt++;
				}
				num /= 10;
			}
		}
		System.out.println("숫자 8의 갯수는 " + cnt);

		// 0~9까지의 문자로 된 숫자를 입력 받았을 때, 이 입력 값이 0~9까지의 숫자가 각각 한번씩만 사용된것인지 확인하는 함수를 구하라
		// ex) 0123456789 01234 01234567890 6789012345 012322456789
		// ex) true false false true false
		
		String input1 = "0123456789";
		String input2 = "01234";
		String input3 = "01234567890";
		String input4 = "6789012345";
		String input5 = "012322456789";
		
		System.out.println(isUniqueNumbers(input1)); // true
		System.out.println(isUniqueNumbers(input2)); // false
		System.out.println(isUniqueNumbers(input3)); // false
		System.out.println(isUniqueNumbers(input4)); // true
		System.out.println(isUniqueNumbers(input5)); // false
	}
	public static boolean isUniqueNumbers(String str) {
        // 입력된 문자열의 길이가 10이 아니면 모든 숫자가 사용되지 않은 것으로 간주하고 false 반환
        if (str.length() != 10) {
            return false;
        }

        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            // 입력된 문자열을 문자 하나씩 확인하며 set에 추가
            set.add(ch);
        }

        // set의 크기가 10이면 모든 숫자가 사용된 것으로 판단하여 true 반환, 아니면 false 반환
        return set.size() == 10;
    }
}
