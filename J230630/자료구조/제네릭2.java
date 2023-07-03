package J230630.자료구조;

class A<T>{
	//제네릭클래스 A에 타입 매개변수 입력
	T x; //필드타입 x 생성
	T y; //필드타입 y 생성
}
public class 제네릭2 {
public static void main(String[] args) {
	A<Integer>a1=new A<>(); //A<Integer> 타입 인스턴스 a1 생성
	a1.x=10;	//a1객체의 x필드에 10 할당
	a1.y=20;	//a1객체의 y필드에 10 할당
	System.out.println(a1.x+a1.y); //x값 y값 합계 출력

	A<String>a2 = new A<>(); //A<Integer> 타입 인스턴스 a2 생성
	a2.x ="hellow "; //a2객체의 x필드에 hellow 할당
	a2.y ="world";	//a2객체의 y필드에 world 할당
	System.out.println(a2.x+a2.y); //x값 y값 연결 출력
}
//제네릭을 사용하여 클래스 내부의 필드의 타입을
//각각의 타입에 맞는 데이터를 저장하고 데이터를 가져오도록 설정하고
//A<Integer>와 A<String> 인스턴스를 생성하여 각각의 타입에 맞는 연산을 수행
}
