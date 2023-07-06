package 김민수.C2023_07_06;

class Parent{
	public void method1() {
		System.out.println("Parent-method1()");
	}
	public void method2() {
		System.out.println("Parent-method2()");
	}
}
class Child extends Parent{
	@Override
	public void method2() { //상위클래스의 메서드를 상속함으로써 재정의함
		System.out.println("Child-method2()");
	}
	public void method3() { //상위클래스의 메서드가 아닌 Child클래스가 가진 메서드임.
		System.out.println("Child-method3");
	}
}
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //상위클래스가 하위클래스를 가리켜 parent객체를 만드는 업캐스팅
		parent.method1(); //상위클래스의 메서드이므로 사용가능
		parent.method2(); //상위클래스의 메서드를 재정의 했으므로 하위클래스가 정의한 내용을 사용함.
		//parent.method3(); //상위클래스의 메서드가 아니므로 사용 안됨.
		
		
		//의문점: 어떻게 상위클래스의 메서드를 오버라이드 하면 하위클래스의 내용을 호출 할 수 있는지 메모리상에서 이해가 안됨.
		
	}
}
