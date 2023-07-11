package 자바내용정리;

import java.util.Scanner;

//문제1. 야구게임 만들기
//문제2. 앞서 만든 야구게임에 시간 기록 기능 추가하기

public class 자바0711 {

	public static void 문제() {
		int base[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// base 배열의 숫자를 뒤죽박죽 섞어준다.
		for (int i = 0; i < 100000; i++) {
			int r = (int) (Math.random() * 9 + 1);
			int tmp = base[0];
			base[0] = base[r];
			base[r] = tmp;
		}

		System.out.println("몇 자리의 숫자를 맞추실 건가요?(숫자만 입력) : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();

		// 키보드 버퍼를 지운다.
		sc.nextLine();

		// 몇 번민에 맞췄는지?
		int count = 0;
		// 게임 시작 시간을 start에 저장
		long start = System.currentTimeMillis();

		while (true) {
			System.out.println("숫자를 예측해보세요 : ");
			String user = sc.nextLine();

			count++;

			// 스트라이크의 갯수, 볼의 갯수 0을 초기화
			int s = 0, b = 0;

			for (int i = 0; i < level; i++) {

				// 스트라이크의 개수
				// 문자열 중에 i번째 위치에 있는 문자열을 얻어옴
				// '0'을 빼서 문자를 숫자로 변경(아스키코드)
				if (base[i] == user.charAt(i) - '0') {
					s++;
				}

				// 볼의 개수
				// indexOf( )의 경우엔 위치값이 리턴되고,
				// 위치가 없다면 -1이 리턴되기 떄문에
				// 0보다 크다면 그 숫자가 존재하는 것이고,
				// 0보다 작다면 그 숫자가 존재하지 않는다는 뜻

				if (user.indexOf(base[i] + "") >= 0) {
					b++;
				}
			}
			System.out.println(s + "스트라이크" + (b - s) + "볼");
			System.out.println();

			if (s == level) {
				break;
			}

		}
		// 게임이 끝나는 시간 기록
		long end = System.currentTimeMillis();

		System.out.println((end - start) / 1000. + "초 걸려서" + count + "번만에 맞췄습니다!");
	}

	public static void main(String[] args) {
		문제();
	}

}
