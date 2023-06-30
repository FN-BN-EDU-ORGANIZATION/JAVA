package 김민수.C2023_06_30_final;

//명세서: 계산기를 켜고 4+3과 , 나누기 10/3을 한 뒤 계산기를 종료시키려고 한다.
class Calculator{  //계산기 객체를 생성하기 위한 Calculator객체를 생성한다.
	void power() {	//명세서에 따라서 계산기를 켜야 하기 때문에 power()메서드를 정의한다.
		System.out.println("전원을 켭니다.");
	}
	int plus(int a, int b) {	//명세서에 4+3을 더해주는 메서드를 정의해야 하기 때문에 정수형 두 수를 받을 수 있도록 2개의 파라밀터를 int형으로 정의한다.
		return a+b; //계산기 객체를 이용하여 사용자가 값을 받을 수 있도록 더하기 연산을return 해준다.
	}
	double divide(int a, int b) {
		return (double)a/(double)b; //계산기 객체를 이용하여 사용자가 값을 받을 수 있도록 나눗셈 연산을 return 해준다.
	}
	void powerOff() { //명세서에 따라서 계산기를 꺼야 하ㅣ 때문에 poweroff()메서드를 정의한다.
		System.out.println("전원을 끕니다.");
	}
}

//명세서: 계산기를 켜고 4+3과 , 나누기 10/3을 한 뒤 계산기를 종료시키려고 한다.
//메모리 공간에서의 주석처리

public class CalculatorExample {
	public static void main(String[] args) { //최초 스택에서 main메서드가 실행됨
		Calculator myCalc = new Calculator();  //스택의 myCalc 참조변수가 힙 영역의 Calculator()객체를 생성하여 가리키고 있음.
		myCalc.power(); //main스택위에 myCalc의 power()메소드를 실행 후 pop이됨.
		
		int resultAdd=myCalc.plus(4, 3); //스택 resultAdd라는 int형 변수 안에 myCalc.plus(4,3)메소드가 실행 후 result값 7을 반환후 main메서드는 계속 실행
		System.out.println("4+3 = resultAdd : "+resultAdd); //main 스택위에 println메서드가 push되어 7이라는 결과값을 console창에 실행 후 pop됨.
		
		double resultDivide=myCalc.divide(10, 3); //resultAdd와 같은 방식으로 resultDivide에 myCalc.divide메서드의 리턴값이 저장됨. 이때 중요한 것은 리턴형의 일치를 위해서 결과값을 받을 수 있는 자료형을 맞춰야 함.
		System.out.println("10/3 = resultDivide : "+resultDivide); //main 스택위에 println메서드가 push되어 3.3333333333333335를 출력후 pop됨. 이 때 double은 소수점 15자리까지 정밀도를 가짐.
		
		myCalc.powerOff();// myCalc의 powrOff()메소드가 push, pop이 됨.
		
		return; //스택에서 main메서드가 pop이 된 후 프로그램이 종료됨.
	}
}
