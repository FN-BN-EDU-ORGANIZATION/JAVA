package J230630.객체지향;

//생성자 함수(메서드)
//객체 생성시에 한번 호출되는 특수한 메서드
//객체 생성시에 1회 호출
//객체 생성시 필요한 초기값을 부여
//생성자 함수는 클래스이름과 동일하며 반환자료형을 가지지 않는다.
//생성자 함수를 명시하지 않을때 기본적으로 컴파일러에 의해 주입되는 생성자가 있는데 이를 디폴트 생성자 라고 한다.
//컴파일러에 의해 주입받는 디폴트 생성자는 모든 멤버의 초기값을 0(or false or null) 지정


class Simple //지금부터 Simple이라고 하는 생성자의 설계도를 만들겠다
{
	int m1; //정수형 데이터 선언
	double m2; //실수형(소수점) 데이터 선언
	boolean m3; //논리형 데이터 선언 (true와 false 중 하나를 저장 할 수 있다)
	String m4; //문자열 데이터 선언 
	
	//디폴트 생성자
	Simple() //매개변수를 받지 않고 호출될 때 실행 될 생성자 
	{
		System.out.println("디폴트 생성자 호출!");
		this.m1=10;			//m1 변수에 초기값 10 할당
		this.m2=20.2;		//m2 변수에 초기값 20.2 할당
		this.m3=true;		//m3 변수에 초기값 true 할당
		this.m4="공부중~";	//m4 변수에 초기 문자 할당
	}
	
	
	Simple(int x) //int 형식의 매개변수 x를 받을 생성자
	{
		System.out.println("Simple(int x) 생성자 호출!");
		this.m1 = x; //매개변수 x의 값을 m1변수에 할당
		
	}
	
	Simple(int ...x) //가변인자를 받을 생성자 x
	{
		System.out.println("Simple(int ...x) 생성자 호출!");
		for(int arg : x) //int 타입의 가변인자 x에 대해 반복 처리하는 for문 생성
		{
			this.m1+=arg; //arg값을 m1멤버변수에 누적
		}
	}
	
	@Override //규칙 재정의
	public String toString() //객체정보를 문자열 출력
	{
		return //반환 할 규칙 값
		"Simple [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
	
	
}
public class Calculator {




		public static void main(String[] args) {
			Simple obj = new Simple(); 
			//obj 객체생성, 디폴트생성자를 호출하여 초기값 할당
			System.out.println(obj.toString());
			//obj 객체의 toString메서드를 호출하여 문자열로 반환후 출력
			System.out.println();
			//줄바꿈
			
			Simple obj2 = new Simple(20); 
			//obj2를 생성하고 simple클래스에 인수 20을 전달하여 int x를 받는 생성자를 호출 
			System.out.println(obj2.toString());
			//obj2 객체의 toString메서드를 호출하여 문자열로 반환후 출력
			System.out.println();
			//줄바꿈
			
			Simple obj3 = new Simple(20,100,20,30,40,50,60,70,80,100,101);
			//obj3를 생성하고, 가변인자 int... x를 받는 생성자를 호출하여 여러개의 인수 전달
			System.out.println(obj3.toString());
			//obj2 객체의 toString메서드를 호출하여 문자열로 반환후 출력


	}

}
