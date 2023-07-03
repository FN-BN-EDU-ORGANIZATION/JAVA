package C20230703;
//참고))    실습문제 1-1 부터 1-3까지 포함되어있습니다  총 세문제 1-3은 어려워서 skip

//주민번호 성별표시 7번째 숫자참고
class Person{
	String name;
	String RRN;
	//기존의 showState 메서드 내부에서 getGender() 메서드를 이용해 성별도 같이 
	//나오도록 하자
	//인스턴스 변수와 지역변수가 같은경우? 지역변수 우선.
	void showState() {
		//이름과 주민번호를 출력한다.
		//즉, this.RRN = RRN;을 사용하여 멤버변수를 초기화하는 것은 매개변수로 전달된 값을 인스턴스 변수에 저장하여 객체의 상태를 설정하는 역할을 합니다.
		System.out.println(name); //이름 값을 할당안했기 때문에 null값으로 나온다..
		System.out.println(RRN);
		//기존의 showState 메서드 내부에서 getGender() 메서드를 이용해 성별도 같이 나오도록 하자.
		String gender = getGender(RRN); //getGender(RRN)메서드 호출 
		System.out.println(gender);
		
	}
	String getGender(String RRN) {	 
		//주민번호를 이용해 성별을 반환한다.
		String gender;
		//getGender 메서드 내부에서 String gender;를 다시 선언하는 이유는 해당 메서드 내에서 성별 값을 할당하기 위해서입니다. 
		//주민번호의 7번째 숫자에 따라 성별을 판별하고, 그에 맞는 성별 값을 반환해야 하기 때문에 gender 변수를 메서드 내부에서 선언하고 초기화합니다.
		if(RRN.charAt(7) == '1') {
			gender = "남성";

		}
		else if(RRN.charAt(7)=='0') {
			gender = "여성";
		}
		else {
			gender = "중성";
		}
		return gender;
	}

}

public class C20230703 {

	public static void main(String[] args) {
		//Pserson 클래스를 만들어 사용해보자...
		//맴버변수 String name (이름)
		//String RRN(주민번호)
	Person p1 = new Person();
	Person p2 = new Person();
	
	p1.RRN="050101-1234567"; //p1 객체의 주민번호에 값을 넣음
	p2.RRN="950101-0234567";
	
	p1.showState(); // showState 매서드 호출
	p2.showState();
}
}