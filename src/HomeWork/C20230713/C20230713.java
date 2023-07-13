package HomeWork.C20230713;

import java.util.Random;
import java.util.Scanner;

public class C20230713 {
	public static void main(String[] args) {
		
		
		// 전에 배운걸 다시 보고 있는데 코드를 깔끔하게 짜기 위해선 생각을 많이 해보아야할것같다.

		// card test

		String number[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
//		char symbol[] = {'♠', '◇', '♥', '♧'};
		String symbol[] = { "♠", "◇", "♥", "♧" };

		int card[] = new int[52];
		for (int i = 0; i < card.length; i++) {
			card[i] = i;
		}
		for (int i = 0; i < card.length; i++) {
//			System.out.printf("%2s ", number[card[i] % 13]);   // 숫자만 
//			System.out.printf("%s ", symbol[card[i] / 13]);   // 무늬만
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("==================섞기전=========================");

		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			int r = random.nextInt(51) + 1;
			int temp = card[0];
			card[0] = card[r];
			card[r] = temp;
		}
		for (int i = 0; i < card.length; i++) {
			System.out.printf("%s%2s ", symbol[card[i] / 13], number[card[i] % 13]);
			if ((i + 1) % 13 == 0) {
				System.out.println();
			}
		}
		System.out.println("==================섞은후=========================");

		// 주민번호 테스트

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 13자리를 '-'없이 입력하세요 : ");
		String juminNo = sc.nextLine();

//	i :             0   1   2   3   4   5   6   7   8   9   10  11  12
//	i % 8 :         0   1   2   3   4   5   6   7   0   1   2    3   
//	주민등록번호 :      8   3   0   4   2   2   1   1   8   5   6   0   0
//			        * 	 *   *   *   *   *   *   *   *   *   *   *   *   	
//	가중치 :          2   3   4   5   6   7   8   9   2   3   4   5 
//	                =   =   =   =   =   =   =   =   =   =   =   =
//	               16 + 9 + 0 + 20 +2 +14 + 8 + 9 + 16 +15 +24 +0  =  143
//	143 % 11 = 0   11 - 0 = 11  	11에서 나멎지를 뺀 결과가 2자리 숫자면 10자리는 버리고 1자리만 취한다.
//			   1        1 = 10				
//	           2        2 = 9
//	          10       10 = 1
		String check = "234567892345";
		int sum = 0;
		for (int i = 0; i < 12; i++) {
//		문자를 곱셈 연산하면 문자의 유니 코드 값으로 곱한다.
//		sum += (juminNo.charAt(i) -48) * (check.charAt(i) - '0') ;
//		sum += (juminNo.charAt(i) -48) * (i < 8 ? i + 2 : i - 6);
			sum += (juminNo.charAt(i) - 48) * (i % 8 + 2);
		}
//	System.out.println(sum);

		int result = (11 - sum % 11) % 10;

		if (result == juminNo.charAt(12) - 48) {
			System.out.println("정상");
		} else {
			System.out.println("오류");
		}

	}
}