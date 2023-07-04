package 김민수.C2023_07_04;
class Calculator{ //계산기 클래스를 정의
	double areaCircle(double r) { //클래서에서 반지름을 매개변수로 받아 원의 넓이를 return 받는 메서드를 정의
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159*r*r;
	}
}
class Computer extends Calculator{ //컴퓨터 클랫가 계산기 클래스로부터 상속을 받음.
	@Override
	double areaCircle(double r) { //상속을 통해 상위클래스의 areaCircle메소드를 재정의(오버라이드)함.
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI*r*r;
	}
}
public class ComputerExample {
	public static void main(String[] args) {
		int r = 10; //반지름의 값을 r로 정의
		
		Calculator calculator = new Calculator(); //계산기 객체를 생성하여 원의 넓이를 구함.
		System.out.println("원면적 : "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer(); //컴퓨터 객체를 생성하여 원의 넓이를 구함.
		System.out.println("원면적 : "+computer.areaCircle(r));
		
		//메서드 오버라이드를 통하여 메서드 재정의를 함으로써 객체 생성시 다른 함수를 카리킴.
	}
}
