package 윤광혁;
import java.util.Scanner;



//메인 부모 클레스 (부모 A)
class ConsoleMenu{
	Scanner sc = new Scanner(System.in);
	public void ConsoleMenu(){
		System.out.println("-----------------------------------");
		System.out.println("- 1 - 직삼각형v1 출력");
		System.out.println("- 2 - 직삼각형v2 출력");
		System.out.println("- 3 - 정삼각형 출력");
		System.out.println("- 4 - 평행사변형 출력");
		System.out.println("- 5 - 마름모 출력");
		System.out.println("- 6 - 종료");
		System.out.println("-----------------------------------");
	}
	public void lineSpawner() {
		System.out.println("-----------------------------------");
	}
	public void clearConsole() { 				//콘솔창을 정리하는 메서드
	        for (int i = 0; i < 50; i++) {		//자바 콘솔창 정리법을 못찾겠어서 50개의 라인을
	            System.out.println();			//밀어버리는걸로 대체함
	        }
	    }
	
}

class Shapes extends ConsoleMenu{ //도형 생성기를 모아둔 클레스 (자식 B)
	//직삼각형1
	static void RectangleV1(){
		for (int i = 0; i <= 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//직삼각형2
	static void RectangleV2(){for (int i = 0; i <= 4; i++) {

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
	static void Triangle(){
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
	//직사각형
	static void Quadrilateral(){
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
	static void Rhombus(){
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
		
	
	
}



interface makeShape {//각 도형생성기를 가동시킬 인터페이스
	void makeShape();
	}


class makeShapeRectangleV1 extends Shapes implements makeShape {

	@Override
	public void makeShape() {
		clearConsole();
		lineSpawner();
		RectangleV1();
		lineSpawner();
		ConsoleMenu();
	}
	
}
class makeShapeRectangleV2 extends Shapes implements makeShape {

	@Override
	public void makeShape() {
		clearConsole();
		lineSpawner();
		RectangleV2();
		lineSpawner();
		ConsoleMenu();
	}
	
}
class makeShapeTriangle extends Shapes implements makeShape {

	@Override
	public void makeShape() {
		clearConsole();
		lineSpawner();
		Triangle();
		lineSpawner();
		ConsoleMenu();
	}
	
}
class makeShapeQuadrilateral extends Shapes implements makeShape {

	@Override
	public void makeShape() {
		clearConsole();
		lineSpawner();
		Quadrilateral();
		lineSpawner();
		ConsoleMenu();
	}
	
}
class makeShapeRhombus extends Shapes implements makeShape {

	@Override
	public void makeShape() {
		clearConsole();
		lineSpawner();
		Rhombus();
		lineSpawner();
		ConsoleMenu();
	}
	
}
class MainRun extends Shapes {
	//-------------------------------------------------------
	makeShape ShapeRectangleV1 = new makeShapeRectangleV1();
	makeShape ShapeRectangleV2 = new makeShapeRectangleV2();
	makeShape ShapeTriangle = new makeShapeTriangle();
	makeShape ShapeQuadrilateral = new makeShapeQuadrilateral();
	makeShape ShapeRhombus = new makeShapeRhombus();
	//-------------------------------------------------------
	
	String mselecter;		//루프탈출용 변수
	boolean inmenu;			//스위치 선택용 변수
	public void MainRun(){
		ConsoleMenu();
		this.inmenu=true;
		while(inmenu == true) {
			System.out.print("명령어 입력 : ");
			this.mselecter=sc.next();
			
			switch (mselecter) {
			//직삼각형v1 형성
			case "1": { 
				ShapeRectangleV1.makeShape();
				break;
			}
			//직삼각형v2 형성
			case "2": {
				ShapeRectangleV2.makeShape();
				break;
			}
			//정삼각형 형성
			case "3": {
				ShapeTriangle.makeShape();
				break;
			}
			//평행사변형 형성
			case "4": {
				ShapeQuadrilateral.makeShape();
				break;
			}
			//마름모 형성
			case "5": {
				ShapeRhombus.makeShape();
				break;
			}
			//종료
			case "6": {
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





public class ShapeSpawnerV2 {
	//ShapeSpawner의 스타틱으로 지정한거 전부 클레스로 변경할 예정
	//main에 호출을 제외한 다른 기능은 사용하지 않을 예정
	//높이를 입력받아 적용되게 할 예정
	//홀수값만 넣을수있게하고 다른 값이 들어오면 만들어둔 오류메시지 출력 (문자도 포함)
	public static void main(String[] args) {
		MainRun startshape = new MainRun();
		startshape.MainRun();
	}
}
