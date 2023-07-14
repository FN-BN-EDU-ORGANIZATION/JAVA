package HomeWork.C20230714;

import java.util.Random;
import java.util.Scanner;

public class C20230714 {
	public static void main(String[] args) {

		//다음주부터는 기본 이론부터 새로 정립하면서 공부해야될듯하다. 머리속에서 응용이 아예 안된다.
		
		// 숫자야구게임
		int[] ball = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			int r = random.nextInt(9) + 1;
			int temp = ball[0];
			ball[0] = ball[r];
			ball[r] = temp;
		}

		System.out.print("레벨을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();

		System.out.print("CPU : ");
		for (int i = 0; i < level; i++) {
			System.out.print(ball[i]);
		}
		System.out.println();

		sc.nextLine(); // 키보드 버퍼를 비운다.
//		맞출때까지 반복한다.
		int count = 0;
//		currentTimeMillis() : 1900년 1월 1일부터 이 메소드가 실행되는 순간까지 지난 시간을 1/1000초 단위로 얻어온다.
		long start = System.currentTimeMillis(); // 게임 시작 시간
		while (true) {
			System.out.print("USER : ");
			String user = sc.nextLine();
			count++;
//			스트라이크와 볼의 개수를 센다.
//			스트라이크와 볼의 개수는 반복마다 다시 계산해야 하므로 반복안에서 초기화 시켜야 한다.
			int S = 0, B = 0;
			for (int i = 0; i < level; i++) {
//				스트라이크의 개수
				if (ball[i] == user.charAt(i) - 48) {
					S++;
				}
//			indexOf() : 문자열에서 괄호 안의 문자나 문자열이 최초로 나타나는 위치를 얻어온다. 없으면 -1을 리턴한다.
//			문자열에 특정한 문자 또는 문자열이 포함되어 있는가를 알 수 있다.
//			System.out.println(user.indexOf(ball[i] + "")); 
//				볼의 개수
				if (user.indexOf(ball[i] + "") >= 0) {
					B++;
				}
			}
//			맞췄으면 반복을 탈출한다.
			if (S == level) {
				break;
			}
			System.out.println(S + "스트라이크 " + (B - S) + " 볼");

		}
		long end = System.currentTimeMillis(); // 게임 종료 시간
		System.out.println((end + start) / 1000. + "초 걸려서 " + count + "번 만에 맞췄다.");

		// 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고
		// 가정한다.)
		// 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다

		int[] points = { 1, 2, 4, 7, 9, 12 }; // 예시로 주어진 정렬된 점 배열
		int[] shortestPair = findShortestDistance(points);
		System.out.println("가장 거리가 짧은 점 쌍: (" + shortestPair[0] + ", " + shortestPair[1] + ")");
	}

	public static int[] findShortestDistance(int[] points) {
		int minDistance = Integer.MAX_VALUE;
		int[] shortestPair = new int[2];

		for (int i = 0; i < points.length - 1; i++) {
			int currentDistance = points[i + 1] - points[i];
			if (currentDistance < minDistance) {
				minDistance = currentDistance;
				shortestPair[0] = points[i];
				shortestPair[1] = points[i + 1];
			}
		}

		return shortestPair;
	}
}