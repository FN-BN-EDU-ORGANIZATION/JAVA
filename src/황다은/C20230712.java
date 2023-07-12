package 황다은;

class Data{int x;}

public class C20230712 {
	//기본형 매개변수와 참조형 매개변수정리
	//자바에서 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다
	//매개변수의 타입이 기본형일때는 기본형 값이 복사되지만, 참조형이면 인스턴스의 주소가 복사된다
	//메서드의 배개변수를 기본형으로 선언하면 단순히 저장된값만 얻지만, 
	//참조형으로 선언하면 값이 저장된 곳의 주소를 알 수 있기 때문에 값을 읽어 오는 것은 물론 값을 변경하는것도 가능
	//따라서 
	//기본형매개변수 : 변수의 값을 읽기만 할 수 있다(only read!!!)
	//참조형매개변수 : 변수의 값을 읽고 변경할 수 있다.(read & write!!!)
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x ="+d.x);//결과 10
		
		change(d.x);//결과 1000
		System.out.println("After change(d.x)");
		System.out.println("main() : x ="+d.x);//결과 10 
		// 위에 change메서드를 사용해서 변수를 10에서 100으로 변경하였는데 결과는 맨 처음 그대로 10나온다
		// 그이유는 d.x의 값이 변경된것이 아니라 change메서드의 매개변수x값이 변경된 것임
		// 즉, 원본이 아닌 복사본이 변경된거여서 원본에는 영향 x
		// 따라서, 기본형 매개변수는 변수에 저장된값만 읽을 수만 있고 변경 할 수 없다.
		
	}
	static void change(int x) {	//기본형 매개변수
		x=1000;
		System.out.println("change() : x = "+x);
	}
	
}
