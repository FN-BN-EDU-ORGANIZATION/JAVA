package HomeWork.C20230711;

import java.util.Scanner;

public class C20230711 {

	public static void main(String[] args) {

		// 년,월,일을 입력받아 그날이 무슨요일인지 계산하시오.

		Scanner sc = new Scanner(System.in);

		System.out.print("요일을 계산할 년, 월, 일 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		// 1년 1월 1일부터 입력한 년도의 전년도 12월 31일까지 지난 날짜를 계산한다.
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		// 전년도 12월 31일까지 지난 날짜수에 올해 전달 까지 지난 날짜를 더한다.
		int[] m = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		m[1] = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? 29 : 28;

		for (int i = 1; i < month; i++) {
			sum += m[i - 1];
		}

		// 1년 1월 1일 부터 입력한 날짜까지 지난 날짜의 합계를 7로 나눈 나머지에 따라 요일이 결정된다 (0-일, 1-월, 2-화, 3-수,
		// 4-목, 5-금, 6-토)
		// 배열을 선언할 때 new를 사용하지 않고 {}안에 초기치를 지정하면 초기치의 개수만큼 자동으로 배열을 만들고 초기치로 초기화 시켜준다.
		char[] week = { '일', '월', '화', '수', '목', '금', '토' };
		System.out.println(week[sum % 7] + "요일");

		// --------------------------------------------------------------------------------------------------------

		// 숫자가 지그재그로 배열되게 하시오.

		int[][] a = new int[4][5];
		int count = 0;

		for (int i = 0; i < 4; i++) { // 행

			// 짝수행은 숫자가 왼쪽에서 오른쪽으로 채워지고 홀수행은 숫자가 오른쪽에서 왼쪽으로 채워진다.
			if (i % 2 == 0) {
				for (int j = 0; j < 5; j++) { // 열(왼쪽 => 오른쪽)
					a[i][j] = ++count;
				}
			} else {
				for (int j = 4; j >= 0; j--) { // 열(오른쪽 => 왼쪽)
					a[i][j] = ++count;
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
	}
}
