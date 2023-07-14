package 황다은;

class Person{
	public void introduce() {
		System.out.println("안녕, 나는 인간이야");
	}
}
class Student extends Person{

	@Override
	public void introduce() {
		System.out.println("안녕, 나는 고딩이야");
	}
	
}
class Teacher extends Person{
	@Override
	public void introduce() {
		System.out.println("안녕, 나는 선생이야");
	}
	
}

//class Shape{
//	private String type; 
//	public Shape(String type) {
//		super();
//		this.type = type;
//	}
//	public double getArea() {
//		return 0;
//	}
//	public void info() {
//		System.out.println("도형의 종류 : "+ type);
//	}
//}



public class C20230714 {

	public static void main(String[] args) {
		// 오버라이딩(Overriding)
		// 객체지향프로그래밍에서 상속관계에 있는 클래스들 간에 부모클래스의 메서드를
		// 자식 클래스에서 다시 정의하는 것
		// 자식클래스는 부모클래스로부터 상속받은 메서드의 이름,매개변수,반환타입을 동일하게 가져가며,
		// 자신의 동작을 추가하거나 변경할 수 있다
		
		// 오버라이딩을 사용하면 부모클래스의 메서드와 동일한 시그니처(메서드이름, 매기변수타입, 개수,순서,반환타입)을
		// 가지는 자식클래스의 메서드를 작성할 수 있다.
		// 그러면 자식클래스에서 해당 메서드를 호출할 때 부모 클래스의 메서드 대신 자식클래스에서 정의한 메서드 실행
		
		// 오버라이딩 구현하기 위한 규칙
		// 1. 오버라이딩하는 메서드는 부모 클래스의 메서드와 동일한 시그니처(이름,매개변수타입,개수,순서,반환타입)을 가져야 함.
		// 2. 접근 제어자는 부모 클래스의 메서드와 같거나 더 넓은 점위로 변경할 수 있다.
		//    즉, 부모 클래스의 메서드가 public이면 자식클래스에서 public 또는 protected로 오버라이당 가능
		// 	  private 메서드는 오버라이딩 할 수 없음
		// 3. 오버라이딩된 메서드는 부모 클래스의 메서드보다 더 낮은 접근 제어자를 가질 수 없다.
		//	  즉, 부모클래스의 메서드가 public이면 자식 클래스에서는 public이나 protected로 오버라이딩해야함
		// 4. 메서드의 예외처리는 부모 클래스의 메서드보다 더 일반적인 예외를 던지거나, 예외를 던지지 않도록 변경할 수 있다.
		// 	  즉, 부모 클래스의 메서드가 IOException을 던잔다면 자식클래스에서는 IOException또는 IOException을 
		// 	  상속받은 예외를 던지거나 예외를 던지지 않도록 변경할 수 있습니다.
		// 5. 정적(static)메서드는 오버라이딩할수 없다. 오버라이딩은 인스턴스메서드에 대해서만 적용 되어짐
		
		
		// 오버라이딩을 하는 이유?
		// 상속계층구조에서 부모클래스의 메서드를 재정의하여 자식클래스에서 특화된 동작을 구현하는데 이용되어진다
		// 따라서 이를 통해 코드재사용성과 유연성을 높일 수 있다.
		
		Person ps = new Person();
		ps.introduce();
		
		Student st = new Student();
		st.introduce();
		
		Teacher t = new Teacher();
		t.introduce();
		
		//정리 : 각각의 자식클래스에서 부모클래스의 메서드를 재정의하여 다르게 동작되도록 함.

	}

}
