package 자바내용정리;

//1. 속이 빈 마음모 별찍기
//2. 속이 차있는 마음모 별찍기

public class 자바0704 {

	public static void 문제1() {
		int number = 5;
		for (int i = 1; i <= 2 * number - 1; i++) {
			String stars = "";

			// 공백 개수 저장 변수
			int spaceWidth = 0;

			// 별 개수 저장 변수
			int starWidth = 0;

			if (i == 1 || i == 2 * number - 1) {
				for (int j = 1; j <= 2 * number - 1; j++) {
					stars += "*";
				}

			} else if (i < number) {
				// 윗부분

				// 윗부분의 변환된 i의 값을 저장할 int 변수
				int upperI = i - 1;
				starWidth = number - upperI;

				// 공백 1, 3, 5...
				spaceWidth = 2 * upperI - 1;

			} else {
				// 아랫부분

				// 아랫부분의 변환된 i의 값을 저장할 int 변수
				int lowerI = i - number + 1;
				starWidth = lowerI;
				spaceWidth = 2 * number - 2 * lowerI - 1;
			}

			// 왼쪽 별 담당 j for문
			for (int j = 1; j <= starWidth; j++) {
				stars += "*";
			}

			// 공백 담당 j for문
			for (int j = 1; j <= spaceWidth; j++) {
				stars += " ";
			}

			// 오른쪽 별 담당 j for문
			for (int j = 1; j <= starWidth; j++) {
				stars += "*";
			}

			System.out.println(stars);
		}
	}

	public static void 문제2() {
		int number = 5;
		for (int i = 1; i <= 2 * number - 1; i++) {
			String stars = "";

			// i번째 줄의 공백 갯수를 저장할 int 변수
			int spaceWidth = 0;

			// i번째 줄의 별 갯수를 저장할 int 변수
			int starWidth = 0;

			// if - else 구조
			// spaceWidth와 starWidth의 값을 결정한다.
			if (i < number) {

				// 공백 개수 (number-1 ~ 1)
				spaceWidth = number - i;
				// 별 개수
				starWidth = 2 * i - 1;

			} else {

				int lowerI = 2 * number - i;
				// 공백 개수 (0 ~ number-1)
				spaceWidth = number - lowerI;
				// 별 개수 (2*number-1 ~ 1)
				starWidth = 2 * lowerI - 1;
			}

			// spaceWidth번 반복하면서 stars에 공백을 추가하는 j for문
			for (int j = 1; j <= spaceWidth; j++) {
				stars += " ";
			}

			// starWidth번 반복하면서 stars에 별을 추가하는 j for문
			for (int j = 1; j <= starWidth; j++) {
				stars += "*";
			}

			System.out.println(stars);
		}
	}

	public static void main(String[] args) {
		문제1();
		문제2();
	}

}
