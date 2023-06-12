package 윤광혁;

import java.util.Scanner;

//
//

public class ShapeSpawner {
	//메뉴
	static void consoleMenu() { 				//메뉴를 출력하는 메서드
		System.out.println("-----------------------------------");
		System.out.println("- 1 - 직삼각형v1 출력");
		System.out.println("- 2 - 직삼각형v2 출력");
		System.out.println("- 3 - 정삼각형 출력");
		System.out.println("- 4 - 평행사변형 출력");
		System.out.println("- 5 - 마름모 출력");
		System.out.println("- 6 - 종료");
		System.out.println("-----------------------------------");
	}
	static void lineSpawner() { 				//라인을 생성하는 메서드
		System.out.println("-----------------------------------");
	}
	
	 static void clearConsole() { 				//콘솔창을 정리하는 메서드
	        for (int i = 0; i < 50; i++) {		//자바 콘솔창 정리법을 못찾겠어서 50개의 라인을
	            System.out.println();			//밀어버리는걸로 대체함
	        }
	    }
    
	 //도형 생성기들
	 
	 //직삼각형v1
	static void makeShapeRectangleV1() {		
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//직삼각형v2
	static void makeShapeRectangleV2() {		
		for (int i = 0; i <= 4; i++) {

			for (int k = 0; k <= 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	//정삼각형
	static void makeShapeTriangle() {
		for (int i = 0; i <= 4; i++) {

			for (int k = 0; k <= 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	//평행사변형
	static void makeShapeQuadrilateral() {
		for (int i = 0; i <= 4; i++) {

			for (int k = 0; k <= 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= 4; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	//마름모
	static void makeShapeRhombus() {
		for (int i = 0; i <= 4; i++) {
			if (i <= 4 / 2) {
				for (int k = 0; k <= 4 - i; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= i * 2; j++) {
					System.out.print("*");
				}

			}
			else {
				for (int k = 0; k <= i; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j <= 8-(i*2); j++) {
					System.out.print("*");
				}
			}

			System.out.println();
		}
	}
	
	//메인
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean inmenu;		//루프탈출용 변수
		String mselecter;	//스위치 선택용 변수
		
		inmenu = true;
		
		consoleMenu();
		while(inmenu == true) {
			
			System.out.print("명령어 입력 : ");
			mselecter = sc.next();
			
			switch (mselecter) {
			//직삼각형v1 형성
			case "1": { 
				clearConsole();
				lineSpawner();
				makeShapeRectangleV1();
				lineSpawner();
				consoleMenu();
				break;
			}
			//직삼각형v2 형성
			case "2": {
				clearConsole();
				lineSpawner();
				makeShapeRectangleV2();
				lineSpawner();
				consoleMenu();
				break;
			}
			//정삼각형 형성
			case "3": {
				clearConsole();
				lineSpawner();
				makeShapeTriangle();
				lineSpawner();
				consoleMenu();
				break;
			}
			//평행사변형 형성
			case "4": {
				clearConsole();
				lineSpawner();
				makeShapeQuadrilateral();
				lineSpawner();
				consoleMenu();
				break;
			}
			//마름모 형성
			case "5": {
				clearConsole();
				lineSpawner();
				makeShapeRhombus();
				lineSpawner();
				consoleMenu();
				break;
			}
			//종료
			case "6": {
				clearConsole();
				inmenu = false;
				System.out.println("종료합니다.");
				break;
			}
			//그외의 명령어 오류처리
			default:
				System.err.println("잘못된 명령어 입니다.");
			}
		}
		
	}

}
