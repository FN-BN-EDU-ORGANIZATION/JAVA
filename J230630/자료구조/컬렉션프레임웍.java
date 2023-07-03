package J230630.자료구조;


	//컬렉션프레임웍 = 데이터를 효율적으로 다루기 위한 클래스들의 집합
	//자료구조 : 자료를 저장할 때 효율적인 구조로 저장하는 것(데이터의 구조)
	//컬렉션프레임웍 : 자바에서 제공하는 자료구조
	//Collection 인터페이스를 구현하는 클래스
	//Set
	//List
	//Queue
	//Map
	//제네릭 : 클래스가 다룰 객체를 미리 명시하는 기법
	//ex) 택시를 다루던, 버스를 다루던 그냥 자동차(일반화)라고 다룰게~
	//즉, 제네릭은 모든 종류의 타입을 다룰 수 있도록 클래스나 메서드를 타입 매개변수를 이용하여 선언한 기법
	//<E>,<K>,<V> 와 같은 형식
	
class Value{ 
	public <T> void typeSearch(T x) {
		//Value 에 제네릭 메서드 typeSerch(T라는 매개변수에 전달된 x의 유형을 확인하여 출력하는 역할)을 입력
		if(x instanceof Integer) {
			//instanceof 연산자를 사용하여 x의 유형을 확인 했을때 Integer 타입인경우 하단 메시지 출력
			System.out.println(x+"는 정수입니다.");
		}
		else if (x instanceof Double|| x instanceof Float) {
			//instanceof 연산자를 사용하여 x의 유형을 확인 했을때 Double 또는 Float 타입인경우 하단 메시지 출력
			System.out.println(x+"는 실수입니다.");
			
		}
		else if (x instanceof Character) {
			//instanceof 연산자를 사용하여 x의 유형을 확인 했을때 Character 타입인경우 하단 메시지 출력
			System.out.println(x+"는 문자형입니다.");
			
		}
		else if (x instanceof String) {
			//instanceof 연산자를 사용하여 x의 유형을 확인 했을때 String 타입인경우 하단 메시지 출력
			System.out.println(x+"는 문자열입니다.");
			
		}
		else if (x instanceof Boolean) {
			//instanceof 연산자를 사용하여 x의 유형을 확인 했을때 Boolean 타입인경우 하단 메시지 출력
			System.out.println(x+"는 논리형입니다.");
			
			
		}
	}
public class 컬렉션프레임웍 {
public static void main(String[] args) {
	Value v = new Value();
	//Value 클래스 이름을 v로 지정하고, 각각의 값에 대해 typeSearch 메서드 호출
	v.<Integer>typeSearch(3);
	//typeSearch 메서드에 Integer값을 전달하여 유형 확인
	v.typeSearch(3);
	//typeSearch 메서드에 값을 전달하여 유형 확인
	v.typeSearch(3.14);
	v.typeSearch(3.14f);
	v.typeSearch('a');
	v.typeSearch("hello");
	v.typeSearch(true);
			
}

}
}

