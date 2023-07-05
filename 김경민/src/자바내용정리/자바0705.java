package 자바내용정리;

//1, 1부터 10까지 10개의 정수가 저장되어 있다. 각각의 값을 다른 배열의
//   해당 인덱스값에 제곱값을 대입하는 코드를 작성하시오,
//2. 주사위의 눈이 6이 나올때까지 계속 반복해서 굴리고 눈이 6이 되면
//   지금까지 주사위를 굴린 횟수까지 출력하는 코드를 작성하시오
//   (Math.random) 사용

public class 자바0705 {

	public static void 문제1() {
		int[] num1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num2 = new int[10];

		for (int i = 0; i < num1.length; i++) {
			num2[i] = num1[i] * num1[i];
		}

		// num2 출력
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
	}

	public static void 문제2() {
		int count = 0; // 6이 나오기까지 총 굴린 횟수
		while (true) {
			int dice = (int) (Math.random() * 6) + 1; // 1 ~ 6 랜덤 값 생성
			System.out.println("(" + dice + ")");
			count++; // 굴린횟수 증감 연산자
			if (dice == 6) { // 6이 될시 랜덤값 중단을 하고 총 굴린 횟수 출력
				System.out.println("6이 나오기 까지 주사위를 굴린 횟수 : " + count + "번");
				break;
			}

		}
	}

	public static void main(String[] args) {
		문제1();
		문제2();
	}

}
