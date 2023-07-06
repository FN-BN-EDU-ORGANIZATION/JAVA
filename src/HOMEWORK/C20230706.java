package HOMEWORK;

	//의문점
	
	//정리
		//클래스 문제를 풀면서도 그냥 코드를 외운 느낌으로 풀게 되는데 좀 더 정확히 이해하기 위해서는 명확하게 개념을 정리할 필요가 있다!
		//객체와 인스턴스는 대체로 같은 뜻으로 사용된다고 볼 수 있다..
		//용어의 개념을 더 정확히 정리할 필요가 있다. 공부를 하다보면 또 헷갈리는 개념을 발견하게 될테니까 그럴 때마다 정리를 제대로 해야겠다..
	
	//예제1 : 인스턴스 개념 제대로 잡기(자바의 정석)
		//객체는 속성(멤버변수)과 기능(메서드)을 가진다.
		//tv클래스 만들어보기
class TV{
	//멤버변수 선언
	String color;	//tv색깔
	boolean power;	//tv전원
	int channel;	//tv채널
	
	//메서드 선언
	void power() {
		power = !power; //power값이 true일 경우 false로 바꾸고 false일 경우 true로 바꾸는 코드!
	}
	void channelUp() { //채널 올리기
		channel++;	
	}
	void channelDown() { //채널 내리기
		channel--;
	}
}

public class C20230706 {
	
	public static void main(String[] args) {
		TV tv;				//tv클래스를 받는 참조변수 tv선언
		tv = new TV();		//tv 객체 생성
		tv.channel = 7;		//tv 클래스의 멤버변수의 값 지정
		tv.channelDown();	//tv 클래스의 channelDown 기능 호출
		System.out.println("현재 채널은 " + tv.channel +"입니다.");

		
	//예제2 : 인스턴스 개념 제대로 잡기2 (자바의 정석)
		//위의 TV클래스를 사용하여 다른 예제 보기!
		
		TV tv1 = new TV(); //변수 tv1로 새로운 객체 생성
		TV tv2 = new TV(); //변수 tv2로 새로운 객체 생성
		//둘은 다른 주소값을 가진다!
		
		System.out.println("tv1의 채널은 "+tv1.channel+"입니다."); //channel의 값을 선언하지 않았으므로 0
		System.out.println("tv2의 채널은 "+tv2.channel+"입니다."); //channel의 값을 선언하지 않았으므로 0
		
		tv2 = tv1; //tv1의 주소를 tv2에 저장한다
		//tv2의 주소값이 없어짐! tv1이 참조하고 있던 객체를 tv2가 같이 참조하게 되기 때문~
		
		tv1.channel = 7; //tv1의 channel값을 7로 선언
		//tv1의 주소값과 tv2의 주소값이 같으므로 tv2의 channel값도 7이 됨!
		
		System.out.println("tv1의 채널을 7로 변경했습니다.");
		
		System.out.println("tv1의 채널은 "+tv1.channel+"입니다."); //channel값이 7로 선언되었으므로 7
		System.out.println("tv2의 채널은 "+tv2.channel+"입니다."); //tv1의 주소값과 같으므로 channel값 7
		
		
	}
	
	
	
	
}
