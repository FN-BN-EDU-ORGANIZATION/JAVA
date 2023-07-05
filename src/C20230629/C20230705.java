package C20230629;

public class C20230705 {
	public class StringReversal {
	    public static String reverseString(String str) {
	        StringBuilder reversed = new StringBuilder(); 		//reversed라는 StringBuilder 객체 생성
	        for (int i = str.length() - 1; i >= 0; i--) { 		//입력된 문자열을 역순으로 순회
	            reversed.append(str.charAt(i)); 				//charAt 메서드를 사용하여 현재 인덱스의 문자를 가져와 reversed에 추가
	        }
	        return reversed.toString(); 						// reversed 객체를 문자열로 변환하여 반환합니다.
	    }

	    public static void main(String[] args) {
	        String input = "Hello, World!"; 					
	        String reversedString = reverseString(input); 		//reverseString 메서드를 호출하여 input 문자열을 뒤집은 결과를 reversedString 변수에 저장합니다.
	        System.out.println("뒤집힌 문자열: " + reversedString); //뒤집힌 문자열을 출력합니다.
	    }
	}
	// 주어진 숫자가 소수인지 판별하는 메서드를 작성하세요.

	public class PrimeChecker {
	    public static boolean isPrime(int number) { 		//숫자를 입력으로 받고 해당 숫자가 소수인지 여부를 반환
	        if (number <= 1) { 								//입력된 숫자가 1보다 작거나 같으면 소수가 아니므로 false를 반환
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(number); i++) {  //그렇지 않으면 2부터 해당 숫자의 제곱근까지의 숫자로 나누어 떨어지는지 확인합니다.
	            if (number % i == 0) {
	                return false;   						 //나누어 떨어진다면 해당 숫자는 소수가 아니므로 false를 반환합니다.
	            }
	        }
	        return true; 									// 나누어 떨어지지 않는다면 해당 숫자는 소수이므로 true를 반환합니다
	    }

	    public static void main(String[] args) {
	        int num = 17; 									
	        if (isPrime(num)) { 							//isPrime 메서드를 호출하여 num 숫자가 소수인지 아닌지를 확인하고 소수일 경우 아래코드 실행
	            System.out.println(num + "은(는) 소수입니다."); 
	        } else { 										//소수가 아닌 경우 아래코드 실행
	            System.out.println(num + "은(는) 소수가 아닙니다.");
	        }
	    }
	}
}
