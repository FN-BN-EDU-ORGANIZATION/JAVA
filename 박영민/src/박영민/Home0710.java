package 박영민;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Home0710 {

	public static void 예제1() {
		// 랜덤숫자를 생성하여 가위바위보 게임을 만들자. feat.switch
		int computer = (int) (Math.random() * 3) + 1;
		// int형 컴퓨터변수에 랜덤숫자를만든다. (Math.random()):0~0.999... 사이의 소수를 랜덤하게 생성한다.
		// 3을 곱하면 0~2.999... 가나온다 거기에 1을 더하면 1~3.999... 가나오고 int로 형변환해서 1~3이 된다.

		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3) 선택하세요");
		int user = sc.nextInt();

		switch (computer) {
		case 1:
			System.out.println("컴퓨터는 가위입니다.");
			break;
		case 2:
			System.out.println("컴퓨터는 바위입니다.");
			break;
		case 3:
			System.out.println("컴퓨터는 보입니다.");
			break;
		}
		switch (user) {
		case 1:
			System.out.println("당신은 가위입니다."); // 1을 받았을때 출력한다.
			break; // 1을 받았을때 이 switch문을 멈춘다.
		case 2:
			System.out.println("당신은 바위입니다."); // 2를 받았을때 출력한다.
			break; // 2를 받았을때 이 switch문을 멈춘다.
		case 3:
			System.out.println("당신은 보입니다."); // 3을 받았을때 출력한다.
			break; // 3을 받았을때 이 switch문을 멈춘다.
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		// 사용자 컴퓨터
		if (user == computer) { // 같을시
			System.out.println("비겼습니다.");
		} else if (user == 1 && computer == 2) { // 가위, 바위
			System.out.println("당신은 졌습니다.");
		} else if (user == 1 && computer == 3) { // 가위, 보
			System.out.println("당신은 이겼습니다.");
		} else if (user == 2 && computer == 1) { // 바위, 가위
			System.out.println("당신은 이겼습니다.");
		} else if (user == 2 && computer == 3) { // 바위, 보
			System.out.println("당신은 졌습니다.");
		} else if (user == 3 && computer == 1) { // 보, 가위
			System.out.println("당신은 졌습니다.");
		} else if (user == 3 && computer == 2) { // 보, 바위
			System.out.println("당신은 이겼습니다.");
		}
	}

	public static void 예제2() {

		int computer = (int) (Math.random() * 3) + 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1) 바위(2) 보(3) 선택하세요");
		int user = sc.nextInt();

		switch (user) {
		case 1:
			System.out.println("당신은 가위입니다.");
			break;
		case 2:
			System.out.println("당신은 바위입니다.");
			break;
		case 3:
			System.out.println("당신은 보입니다.");
			break;
		}
		
		switch (computer) {
		case 1:
			System.out.println("컴퓨터는 가위입니다."); // 위와 같다.
			break;
		case 2:
			System.out.println("컴퓨터는 바위입니다.");
			break;
		case 3:
			System.out.println("컴퓨터는 보입니다.");
			break;
		}
		if (user == computer) {
			System.out.println("비겼습니다.");
		} else if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1) {
			System.out.println("당신은 졌습니다.");
		} else {
			System.out.println("당신은 이겼습니다.");
		}
	}

	public static void main(String[] args) {
		예제1(); // 이거 뭔가 줄일수있을거같긴한데....
		예제2(); // 줄인게 맞는지는 잘모르겠다.

	}
}