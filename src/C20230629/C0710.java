package study;

class Person {

	String name;		//이름 멤버변수
	String RRN;			//주민번호 멤버변수

	void showState() {		// 이름 주민번호 성별 출력하는 메서드
		System.out.println("이름 : " + name + "\t주민번호 : " + RRN + "\t성별 : " +getGender());
	}
	
	String getGender(){		//성별 반환 메서드
		
		String gender = RRN.substring(7,8);	// 주민번호의 8번째 자리에 위치
		
		if(gender.equals("1")			//1,3,5,7,9 = 남자 그 외에는 여자
				||gender.equals("3")
				||gender.equals("5")
				||gender.equals("7")
				||gender.equals("9"))
				gender = "남";
			else
				gender = "여";
		return gender;
	}

}

public class C0710 {

	public static void main(String[] args) {

		예제1(); // Person 클래스를 만드시오. ( 멤버변수 : String name, String RRN)
				// 출력 예시) 이름 : ㅇㅇㅇ 주민번호 : ㅇㅇㅇ
				// 			이름 : ㅇㅇㅇ 주민번호 : ㅇㅇㅇ
				// 			이름 : ㅇㅇㅇ 주민번호 : ㅇㅇㅇ

		예제2(); // Person 클래스에 기능을 추가하세요.
				// void showState() : 이름과 주민번호 출력
				// String getGender() : 주민번호를 이용해 성별을 반환

	}

	public static void 예제1() {
		
		Person p1 = new Person();	//p1 인스턴스 생성
		Person p2 = new Person();	//p2 인스턴스 생성
		Person p3 = new Person();	//p3 인스턴스 생성
		
		p1.name = "오구";			//p1의 이름
		p1.RRN = "980902-1234567";	//p1의 주민번호
		
		p2.name = "아기오구";			//p2의 이름
		p2.RRN = "980903-1234567";	//p2의 주민번호
				
		p3.name = "뚜지";			//p3의 이름
		p3.RRN = "980904-1234567";	//p3의 주민번호
		
		System.out.println("이름 : " + p1.name + "\t주민번호 : " + p1.RRN);	//이름과 주민번호 출력
		System.out.println("이름 : " + p2.name + "\t주민번호 : " + p2.RRN);
		System.out.println("이름 : " + p3.name + "\t주민번호 : " + p3.RRN);
		
		System.out.println();
		
		
		
	}

	public static void 예제2() {
		
		Person p1 = new Person();	//p1 인스턴스 생성
		Person p2 = new Person();	//p2 인스턴스 생성

		p1.RRN = "980902-1234567";	//p1의 주민번호
		p2.RRN = "980925-2234563";	//p2의 주민번호
		
		p1.showState();		//showState() 메서드를 호출하여 객체의 정보 출력
		p2.showState();		//showState() 메서드를 호출하여 객체의 정보 출력
			
		
	}

}
