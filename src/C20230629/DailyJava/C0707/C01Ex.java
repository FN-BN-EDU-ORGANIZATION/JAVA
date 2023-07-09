package C0707;

class Triangle {
//	멤버 변수 선언
	double Height; double Bottom;
//	밑변과 높이를 초기화하는 멤버메서드
	void init(double Height,double Bottom) {
		this.Height = Height;
		this.Bottom = Bottom;
	}
//	삼각형의 넓이를 구하는 메서드
	double getArea() {
		double result = (Height*Bottom)/2;
		return result;
	}
//	밑변 설정
	void setBottom(double Bottom) {
		this.Bottom = Bottom;
	}
//	높이 설정
	void setHeight(double Height) {
		this.Height = Height;
	}
}

public class C01Ex {
	public static void main(String[] args) {
//		이를 참고하여 클래스 정의하기
		Triangle t = new Triangle();
		t.init(10,17);
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);
		t.setHeight(14);
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}
