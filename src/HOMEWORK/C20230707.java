package HOMEWORK;
	
	//의문점

	//정리
		//인스턴스 변수는 각각 독립된 값을 가지고, 클래스변수는 한 클래스에서 모든 인스턴스가 하나의 저장공간을 공유하여 공통된 값을 갖는다!
		//기본형과 참조형 매개변수. 참조형 매개변수는 주소값을 주기 때문에 값을 변화시킬 수 있음!
	//예제1 : 변수와 메서드 정리!
		//클래스변수와 인스턴스변수의 차이 이해
	class Card{
		//인스턴스변수 : 독립적 저장공간 가짐. 서로 다른 값을 가질 수 있다. 인스턴스마다 고유한 상태를 유지해야하는 경우에 선언
		String kind; //카드의 무늬
		int number; //카드의 숫자
		//클래스변수 : 모든 인스턴스가 공통된 저장공간을 공유. 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 경우에 선언
		static int width = 100; //카드의 폭
		static int height = 250; //카드의 높이
	}

	
	//예제2 : 기본형 매개변수와 참조형 매개변수 구별
		//변수 클래스
	class Data{int x;} 
	
	
	public class C20230707 {
	public static void main(String[] args) {
		
	//예제1 출력	
		//클래스변수는 객체 생성을 하지 않아도 클래스명.클래스변수명 으로 사용 가능! 
//		System.out.println("Card.width = "+Card.width);
//		System.out.println("Card.height = "+Card.height);
		
//		Card c1 = new Card(); //인스턴스변수를 사용하기 위해 참조변수 c1으로 객체 생성
//		c1.kind = "heart"; //c1의 kind속성값 지정
//		c1.number = 7; //c1의 number속성값 지정
		
//		Card c2 = new Card(); //새로운 객체를 생성
//		c2.kind = "spade"; //c2의 kind속성값 지정
//		c2.number = 4; //c2의 number속성값 지정
		
//		System.out.printf("c1 카드는 %s %d이며, 크기는 (%d,%d)이다\n",c1.kind,c1.number,Card.width,Card.height);
//		System.out.printf("c2 카드는 %s %d이며, 크기는 (%d,%d)이다\n",c2.kind,c2.number,Card.width,Card.height);
		
//		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다");
//		Card.width = 50;
//		Card.height = 80;
		
//		System.out.printf("c1 카드는 %s %d이며, 크기는 (%d,%d)이다\n",c1.kind,c1.number,Card.width,Card.height);
//		System.out.printf("c2 카드는 %s %d이며, 크기는 (%d,%d)이다",c2.kind,c2.number,Card.width,Card.height);
		
		
		
		//예제2 출력(기본형 매개변수)
		//기본형 매개변수 출력라인
		Data d1 = new Data(); //참조변수 d로 Data 객체생성
		d1.x = 10; //d의 x값 설정
		System.out.println("main() : x = " + d1.x); //10 출력
		
		change(d1.x); //change기능으로 d의 x값 1000 출력됨
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d1.x); //d.x의 값은 그대로 10!!
		
		//참조형 매개변수 출력라인
		Data d2 = new Data();
		d2.x = 10;
		System.out.println("main() : x = " + d2.x); //10 출력
		
		change(d2); //change 기능(참조형)으로 값 1000으로 변경
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d2.x); //참조형으로 선언했기 때문에 값이 변화된다! 값이 저장된 주소를 넘겨주기 때문..
	}
	
	static void change(int x) { //기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
	
	static void change(Data d) { //참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
	
}
