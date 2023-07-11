package study;

class Marine{
	int hp = 40;		//hp초기값 40
	static int power = 4;	//power 초기값 4,static 변수(클래스 내에 있는 모든 인스턴스가 공유)
	static int armor = 0;	//armor 초기값 0,static 변수(클래스 내에 있는 모든 인스턴스가 공유)
	
	void showState() {		 //체력, 공격력,방어력 출력
		System.out.println("체력 :" + hp + " 공격력: " + power + " 방어력: " + armor);
	}
	
	void powerUp() {
		power++;		//공격력 1증가
	}
	void armorUp() {
		armor++;		//방어력 1증가
	}
}

public class C0711 {

	public static void main(String[] args) {
		
		예제1(); //Marine클래스를 만들고 객체를 생성하여 사용해보자
				//멤버변수 : int hp, int power, int armor
				//멤버메서드 : showState() : 객체의 상태 표시

		예제2(); //Marine클래스에 powerUp, armorUp 메서드를 만들자


	}
	public static void 예제1() {
		
		Marine m1 = new Marine();  //m1 인스턴스 생성
		Marine m2 = new Marine();  //m2 인스턴스 생성
		
		m1.showState();  	//showState호출
		m2.showState();		//showState호출
		
		System.out.println();
		
	}
	public static void 예제2() {
		
		Marine marine1 = new Marine();	//marine1 인스턴스 생성
		Marine marine2 = new Marine();	//marine2 인스턴스 생성
		
		marine1.powerUp();	//powerUp 호출
		marine2.armorUp();	//armorUp 호출
		
		marine1.showState();	//showState호출	
		marine2.showState();	//showState호출

	}

}
