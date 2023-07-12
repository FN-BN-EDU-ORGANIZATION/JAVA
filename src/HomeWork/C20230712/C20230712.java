package HomeWork.C20230712;

import java.util.Scanner;

public class C20230712 {

	public static void main(String[] args) {
		
		//기존에 공부하던걸 가져왔는데 다시 봐도 잘 모르겠다. 개념정립이 제대로 되어있지 않아서 그런거 같다. 기초개념부터 다시 잡아 나가야겠다.

		// 5*5짜리 마방진 만드시오.
		// 마방진이란 정사각형에 1부터 차례로 숫자 적되, 숫자를 중복하거나 빠뜨리지 않고
		// 가로, 세로, 대각선에 있는 수들의 합이 모두 같도록 만든 숫자의 배열을 의미

		int[][] data = new int[5][5];

//		마방진의 첫 번째 숫자(1)가 채워지는 자리는 첫 줄 가운데 열 이다.
		int i = 0, j = 2;

//		Math.pow(x, y) : x의 y승을 계산한다.
		for (int k = 1; k <= Math.pow(5, 2); k++) {

			data[i][j] = k;
//			방금 배열에 채운 숫자(k)가 5의 배수면 다음 숫자가 채워질 위치는 행만 1 증가 시킨다.
//			5의 배수가 아니면 다음 숫자가 채워질 위치는 오른쪽, 위 방향(행은 -1, 열은 +1)으로 변경한다. 
			if (k % 5 == 0) {
				i++;
			} else {
				if (--i < 0) {
//					행이 배열의 범위를 벗어나면 마지막 행으로 변경한다.
					i = 4;
				}
				if (++j == 5) {
//					열이 배열의 범위를 벗어나면 첫 번째(0) 열로 변경한다.
					j = 0;
				}
			}

		}

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				System.out.printf("%2d ", data[i][j]);
			}
			System.out.println();
		}

		// ----------------------------------------------------------------------------------------------

		// 입력한 홀수만큼의 배열을 만들어서 마방진을 만들어보자.

		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.print("배열의 차수를 홀수로 입력하세요 : ");
			n = sc.nextInt();
			if (n % 2 == 1) {
				break;
			}
			System.out.println("홀수를 입력하라니까~~~~!!!");
		}

		// 입력받은 배열의 차수만큼 배열을 선언한다.
		data = new int[n][n];
		// 숫자가 채워질 첫 번째 위치(첫 줄 가운데)를 계산한다.

		i = 0;
		j = (n - 1) / 2;

		for (int k = 1; k <= Math.pow(n, 2); k++) {

			data[i][j] = k;

			if (k % n == 0) {
				i++;
			} else {
				if (--i < 0) {

					i = n - 1;
				}
				if (++j == n) {

					j = 0;
				}
			}

		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.printf("%3d ", data[i][j]);
			}
			System.out.println();
		}

	}
}