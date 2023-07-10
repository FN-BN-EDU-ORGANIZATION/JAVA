package 자바내용정리;

//문제1. n의 길이에 따라 "수박수박수박수박"이렇게 반복되는 문자열을 출력합니다.

//문제2. 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드 
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면 
//13개의 바구니가 필요할 것이다
public class 자바0710 {

	public static void 문제1(int n) {
		// 길이(n)가 2로 나누어 떨어지면 "수박"모두 붙이고,
		// 그렇지 않으면 "수"만 따로 붙인다.
		String answer = "";
		// 길이만큼 "수박" 붙이기
		int i = n / 2;
		while (i > 0) {
			answer += "수박";
			i--;
		}
		// 그렇지 않은 경우 수만 나중에 따로 붙이기
		if (n % 2 != 0) {
			answer += "수";
		}
		System.out.println(answer);
	}

	public static void 문제2() {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples % sizeOfBucket == 0 ? numOfApples / sizeOfBucket : numOfApples / sizeOfBucket + 1;
		int numOfBucket2 = (numOfApples + 9) / 10;
		int numOfBucket3 = (numOfApples - 1) / 10 + 1;
//		int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);

		System.out.println("필요한 바구니의 수 :" + numOfBucket);
	}

	public static void main(String[] args) {
		문제1(9);
		문제2();
	}

}
