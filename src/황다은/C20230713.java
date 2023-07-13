package 황다은;

class Data {int x;}

public class C20230713 {

	public static void main(String[] args) {
		// 참조형매개변수와 참조형 반환타입
//		Data d = new Data();
//		d.x=10;
//		System.out.println("main() : x = "+d.x);
//		
//		change(d);
//		System.out.println("After change(d)");
//		System.out.println("main() : x = "+d.x);
		
		//참조형 반환타입
//		Data d = new Data();
//		d.x = 10;
//		
//		Data d2 = copy(d);
//		System.out.println("d.x="+d.x);
//		System.out.println("d2.x="+d2.x);
	}
//	static void change(Data d) {//참조형매개변수를 썼기때문에 매개변수 d에 복사되어짐
//		d.x=1000;
//		System.out.println("change():x="+d.x);
//	}
	//기본형매개변수와 달리 d.x값이 변경되어있음
	//change메서드의 매개변수가 참조형이기때문에 값이 아니라 '값이 저장된 주소'를 넘겨주기때문에
	//읽어오는 것뿐만아니라 변경하는 것도 가능..
	
	//참조형 반환타입
//	static Data copy(Data d) {	//참조형 매개변수
//		Data tmp = new Data();	//새로운 객체 tmp생성
//		tmp.x = d.x;			//d.x의 값을 tmp.x에 복사
//		
//		return tmp;				//복사한 객체의 주소 반환
//	}
	//ㅇㅣ 메서드의 반환타입이 'Data'이므로, 호출결과를 저장하는 변수의 타입 역시 'Data'타입의 참조변수여야함
	//Data d2 = copy(d);	// static Data copy(Data d)
	//"반환타입이 '참조형'이라는 것은 메서드가 '객체의 주소'를 반환하는 것을 의미
	
	

}
