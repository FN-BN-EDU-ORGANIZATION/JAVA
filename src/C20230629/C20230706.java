package C20230629;

import java.util.LinkedHashSet;

//public class C20230706 {
	
//	    public static void main(String[] args) {
//	        int number = 5;
//	        int factorial = calculateFactorial(number);   //calculateFactorial 함수를 호출하여 number의 팩토리얼 값을 계산하고 그 결과를 factorial 변수에 저장합니다.
//	        System.out.println(number + "! = " + factorial);
//	    }
//	    
//	    public static int calculateFactorial(int number) { //주어진 숫자의 팩토리얼을 계산하는 함수를 정의합니다.
//	        int factorial = 1;
//	        for (int i = 1; i <= number; i++) { //1부터 number까지 반복하면서 factorial에 i를 곱해 나갑니다.
//	            factorial *= i;
//	        }
//	        return factorial; //팩토리얼값 반환
//	    }
//	}
//	public class ArraySum {
//	    public static void main(String[] args) {
//	        int[] array = {3, 7, 2, 8, 1};
//	        int sum = calculateArraySum(array); //calculateArraySum 함수를 호출하여 배열의 합계를 계산하고 그 결과를 sum 변수에 저장합니다.
//	        System.out.println("합계 = " + sum); //합계를 출력
//	    }
//
//	    public static int calculateArraySum(int[] array) {
//	        int sum = 0;
//	        for (int num : array) { 			
//	            sum += num;						//배열의 각 요소를 가져와서 sum에 더합니다.
//	        }
//	        return sum;							//return sum;: 합을 반환합니다.
//	    }
//	}
//	public class RemoveDuplicates {
//	    public static void main(String[] args) {
//	        String input = "Programming";
//	        String result = removeDuplicates(input); //removeDuplicates 함수를 호출하여 중복 문자가 제거된 결과를 result 변수에 저장합니다.
//
//	        System.out.println(result);
//	    }
//
//	    public static String removeDuplicates(String input) {
//	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
//	        for (int i = 0; i < input.length(); i++) {           // 입력 문자열의 각 문자를 set에 추가합니다.
//	            set.add(input.charAt(i));
//	        }
//	        StringBuilder sb = new StringBuilder();   //문자열을 생성하기 위한StringBuilder 객체 sb를 생성합니다.
//	        for (char ch : set) {  						// set에 있는 각 문자를 순회하면서 sb에 추가합니다.
//	            sb.append(ch);
//	        }
//	        return sb.toString();						// StringBuilder 객체 sb를 문자열로 변환하여 반환합니다.
//	    }
//	}

