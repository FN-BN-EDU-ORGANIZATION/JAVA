package 김민수.C2023_07_04;

class Airplane{ //이륙, 착륙, 일반비행을 할 수 있는 비행기 클래스를 생성
	public void land() {
		System.out.println("착륙합니다.");
	}
	public void fly() {
		System.out.println("일반비행합니다.");
	}
	public void takeOff() {
		System.out.println("이륙합니다.");
	}
}

class SupersonicAirplane extends Airplane{ //슈퍼소닉 비행기가 비행기의 기능을 상속함
	public static final int NORMAL = 1; //기본비행값을 1
	public static final int SUPERSONIC=2; //슈퍼비행값을 2
	
	public int flyMode = NORMAL; //비행값이 기본값으로 설정
	
	@Override
	public void fly() { //비행값이 슈퍼비행값일 때는 초음속 비행을 아니면, 부모의 비행을 가리킴.
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
	}
}

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa= new SupersonicAirplane(); //슈퍼비행기 객체를 생성
		sa.takeOff(); //이륙함.
		sa.fly(); //기본값이 1이므로 일반비행함.
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //sa비행기 플라이모드값을 슈퍼비행값(2)으로 변경
		sa.fly(); //초음속 비행
		sa.flyMode=SupersonicAirplane.NORMAL; //다시 일반비행 값으로 변경
		sa.fly(); //일반비행
		sa.land(); //착륙
	}
}
