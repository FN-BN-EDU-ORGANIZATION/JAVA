package 김민수.C2023_07_06;

class A{} //A라는 클래스가 있음

class B extends A{} //B는 A로부터 상속 받음
class C extends A{}	//C는 A로부터 상속 받음

class D extends B{} //D는 B로 부터 상속 받음 A -> B(A<super();호출>) ->D(B<super();>호출>
class E extends C{} //E는 C로 부터 상속 받음 A -> B(A<super();호출>) ->D(B<super();>호출>

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B(); 
		C c = new C(); 
		D d = new D();
		E e = new E();
		
		A a1 = b; //A클래스의 a1객체는 A가 B클래스를 참조 할 수 있음.
		A a2 = c; //A클래스의 a2객체는 A가 B클래스를 참조 할 수 있음.
		A a3 = d; //A클래스의 a3객체는 A->B->D의 주소값을 가리킬 수 있으므로 A가 D클래스를 참조 할 수 있음.
		A a4 = e; //A클래스의 a4객체는 A->C->e의 주소값을 가리킬 수 있으므로 A가 E클래스를 참조 할 수 있음.
		
		B b1 = d; //위와 같음.
		C c1 = e; //위와 같음.
		
		//B b3 = e; //B클래스는 E클래스의 주소값을 가리킬 수 없으므로 오류
		//C c2 = d; //C클래스는 E클래스의 주소값을 가리키므로 이 또한 오류
		
		
		
	}
}
