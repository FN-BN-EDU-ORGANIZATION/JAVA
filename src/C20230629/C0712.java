package study;

class Marine{
	int hp = 40;		//hp초기값 40
	static int power = 4;	//power 초기값 4,static 변수(클래스 내에 있는 모든 인스턴스가 공유)
	static int armor = 0;	//armor 초기값 0,static 변수(클래스 내에 있는 모든 인스턴스가 공유)
	
	void showState() {		 //체력, 공격력,방어력 출력
		System.out.println("체력 :" + hp + " 공격력: " + power + " 방어력: " + armor);
	}
	
	void powerUp() 
	{
		power++;		//공격력 1증가
	}
	void armorUp() 
	{
		armor++;		//방어력 1증가
	}
	void attack(Marine target)		//Marine target을 공격하는 메서드 공격 대상의 체력에서 마린의 공격력+방어력을 차감시킴
	{
		target.hp -=(power-target.armor);
	}
}

class Student{
	
	String name;
	int kor;
	int math;
	int eng;
	static int count;
	
	{
		count++;			//객체가 생성될 때마다 count가 증가
	}
	
	Student()			//기본 생성자
	{ 
		
	}
	
	Student(String name)		//이름을 입력받는 생성자
	{
		this.name = name;
		
	}
	
	Student(String name, int kor, int eng,int math)	//이름과 점수를 받는 생성자
	{
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

	
}

public class C0712 {

	public static void main(String[] args) {
		
		예제1(); //Marine 클래스에 attack 메서드 구현
				//멤버메서드 : void attack(Marine target)
				//공격시(공격력 - 상대방의 방어력) 만큼 상대 체력을 감소시킨다.

		예제2(); //Student클래스가 생성 될때마다 학생 수 카운트를 올려보자
				//멤버변수 : String name, int kor, int math, int eng
				//count 변수는 객체가 생성된 숫자를 가지고 있어야 한다.
				//멤버메서드 : getTotal() : 성적 합계
				//			getAverage() : 성적 평균
		
		
		
	}
	public static void  예제1() {
		
		Marine marine1 = new Marine();	//marine1 인스턴스 생성
		Marine marine2 = new Marine();	//marine2 인스턴스 생성
		
		marine1.powerUp();		//powerup 메서드 호출
		marine1.armorUp();		//armorrup 메서드 호출
		
		marine1.attack(marine2);	//marine1의 attack 메서드를 호출하여 marine2공격
		
		marine1.showState();	//marine1의 상태 출력
		marine2.showState();	//marine2의 상태 출력
		
		
		
		
	}
	public static void 예제2() {
		
		Student student1 = new Student();		//student1 인스턴스 생성 기본 생성자 호출
		Student student2 = new Student("오구");	//student2 인스턴스 생성 이름을 받는 생성자 호출
		Student student3 = new Student("뚜지",11,22,33);	//student3 인스턴스 생성 이름,점수를 받는 생성자 호출
		Student student4 = new Student("오구",11,22,33);	//student4 인스턴스 생성 이름,점수를 받는 생성자 호출
		
		
		System.out.println(Student.count);	//객체의 개수 출력
		
	}

}
