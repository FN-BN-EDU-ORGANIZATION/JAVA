package C20230629;

//public class C20230707 {
//	
//	    // ...
//	    public static void main(String[] args) {
//	        // ...
//	        int size = scanner.nextInt(); //입력받은 값 size 변수에 저장합니다.
//
//	        int[] array = new int[size]; //입력된 크기에 맞게 정수 배열 array를 생성합니다.
//	        // ...
//	        for (int i = 0; i < size; i++) { // 배열의 크기만큼 반복합니다.
//	            array[i] = scanner.nextInt(); //사용자로부터 정수 값을 입력받아 배열에 저장합니다.
//	        }
//	        // ...
//	        int maxValue = findMaxValue(array); //배열에서 최댓값을 찾는 기능을 수행하는 부분
//	        // ...
//	    }
//
//	    public static int findMaxValue(int[] array) {
//	        int max = array[0];						//배열의 첫 번째 요소를 max 변수에 초기화합니다
//	        for (int i = 1; i < array.length; i++) { //배열의 두 번째 요소부터 반복합니다.
//	            if (array[i] > max) {				//만약 현재 요소가 max보다 크다면,
//	                max = array[i]; 				//max 값을 현재 요소로 갱신합니다.
//	            }
//	        }
//	        return max;							//최댓값인 max를 반환합니다.
//	    }
//	}
//public class ReverseString {
//    // ...
//    public static void main(String[] args) {
//        // ...
//        String input = scanner.nextLine(); // //문자열을 입력받아 input 변수에 저장합니다.
//
//        String reversed = reverseString(input);//뒤집힌 문자열을 저장하기 위한 StringBuilder 객체인 reversed를 생성합니다.
//        // ...								
//    }
//
//    public static String reverseString(String input) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = input.length() - 1; i >= 0; i--) { 	//입력된 문자열의 끝부터 시작하여 처음까지 반복합니다.
//            reversed.append(input.charAt(i)); 				//input 문자열의 i 위치의 문자를 reversed에 추가합니다.
//        }
//        return reversed.toString();						//뒤집힌 문자열인 reversed를 문자열로 변환하여 반환합니다.
//    }
//}
//public class PrimeNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("숫자를 입력하세요: ");
//        int number = scanner.nextInt();
//
//        boolean isPrime = checkPrimeNumber(number); //checkPrimeNumber 메서드를 호출하여 입력된 숫자가 소수인지 판별한 결과를 isPrime 변수에 저장
//        if (isPrime) {
//            System.out.println(number + "은(는) 소수입니다.");
//        } else {
//            System.out.println(number + "은(는) 소수가 아닙니다.");
//        }
//    }
//
//    public static boolean checkPrimeNumber(int number) {
//        if (number <= 1) { //만약 입력된 숫자가 1보다 작거나 같다면,
//            return false; //false를 반환하고 소수가 아니라고 판단합니다.
//        }
//
//        for (int i = 2; i <= Math.sqrt(number); i++) { //2부터 숫자의 제곱근까지 반복합니다.
//            if (number % i == 0) { //만약 숫자가 i로 나누어 떨어진다면,
//                return false;    //false를 반환하고 소수가 아니라고 판단합니다.
//            }
//        }
//
//        return true;  //위의 조건에 해당하지 않는 경우에는 true를 반환하여 소수라고 판단합니다.
//    }
//}
//}
