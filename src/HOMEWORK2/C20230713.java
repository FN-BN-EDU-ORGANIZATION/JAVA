package HOMEWORK2;
	//의문점
	//정리
		//상속에 관한 기본적인 예제와 포함관계를 함께 공부함.
		//상속과 관련해서는 오버라이딩 개념이 나오기 때문에 오버라이딩을 더 자세히 이해할 수 있어야 할 것 같다!
		//오버로딩은 !한 클래스! 안에 같은 이름의 메서드를 여러개 정의하는 것을 말한다! 오버라이딩과 다른 개념!!!!!

	//예제 1: 상속 기본
//기존의 클래스를 재사용하여 새로운 클래스를 작성하는 것! 코드관리 및 추가, 변경 용이!
//	class Tv{
//		boolean power; 	//tv의 전원 켜고 끄기
//		int channel;	//채널조정
//		
//		void power() {power = !power;}
//		void channelUp() {++channel;}
//		void channelDown() {--channel;}
//	}
//	
//	class CaptionTV extends Tv{ //TV클래스를 상속받는 CaptionTV
//		boolean caption;	//캡션상태(on/off)
//		void displayCaption(String text) {
//			if(caption) {	//캡션상태가 on일 때만 text를 보여줌
//				System.err.println(text);
//			}
//		}
//		
//	}

public class C20230713 {
	public static void main(String[] args) {
//		CaptionTV ctv = new CaptionTV();	//CaptionTV 객체 생성
//		ctv.channel = 10;	//ctv는 TV클래스를 상속받으므로 channel변수 사용 가능. channel 10으로 초기화
//		ctv.channelUp();	//ctv는 TV클래스를 상속받으므로 channelUp변수 사용 가능. channel ++
//		System.out.println(ctv.channel); //11출력
//		ctv.displayCaption("HelloWorld");
//		ctv.caption = true;	//캡션상태 on
//		ctv.displayCaption("HelloWorld");	//text보여줌
		
//예제2 : 클래스 포함관계 표현
		//클래스 간 포함관계를 맺어준다는 것은 한 클래스의 멤버변수로 다른 클래스타입의 참조변수를 선언하는 것을 뜻한다!
		//포함관계란 ~는 ~을 가지고 있다. 라는 관계가 성립될 때 사용된다! (상속은 ~는 ~이다. 라는 관계일 때!)
		Point[] p = {new Point(100,100),
					 new Point(140, 50),
					 new Point(200,100)};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150),50);
		
		t.draw(); //삼각형을 그린다
		c.draw(); //원을 그린다
		}
		
	}

class Shape{ //도형의 기본적 클래스
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point{ //좌표 클래스
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0,0);
	}
	String getXY() {
		return "("+x+","+y+")"; //x와 y값 문자열로 반환
	}
}

class Circle extends Shape{ //원클래스는 도형클래스를 상속받는다.(원은 도형이다!)
	Point center; //원의 원점좌표. 원클래스는 좌표클래스를 포함한다.(원은 좌표를 가지고 있다!)
	int r;		  //반지름
	Circle(){
		this(new Point(0,0),100); //Circle(Point center, int r)호출
	}
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s]%n",center.x, center.y, r, color);
	}
}

class Triangle extends Shape{ //삼각형클래스는 도형클래스를 상속받는다.(삼각형은 도형이다!)
	Point[] p = new Point[3]; //삼각형의 세 점을 받을 배열 생성. 삼각형클래스는 좌표클래스를 포함한다.(삼각형은 좌표를 가지고 있다!)
	Triangle(Point[] p) {
		this.p = p;
	}
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}