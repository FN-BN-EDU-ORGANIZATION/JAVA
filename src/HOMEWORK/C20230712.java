package HOMEWORK;
	//의문점
	//정리
		//초기화 블럭의 개념은 처음 보는 개념인데 생성자에서 공통으로 수행되는 코드들을 넣어 사용하므로 코드의 중복을 제거할 수 있다!
		//잘만 사용한다면 더 깔끔하게 코드를 작성할 수 있을 것 같다..
	//예제1 : 변수 초기화
		//변수를 선언하고 처음으로 값을 저장하는 것 - 초기화
		//멤버변수는 초기화를 하지 않아도 기본값으로 초기화됨. but 지역변수는 사용하기 전에 반드시 초기화를 해야함!

class InitTest{
	//멤버변수 x, y (x는 초기화되지 않은 변수. 에러나지 않음!)
	int x;
	int y = x;
	
	void method1() { 
		//지역변수 i, j (i는 초기화되지 않은 변수. 에러! 지역변수인데도 초기화되지 않았기 때문)
		int i;
		int j = i;
	}
}

	//명시적 초기화 - 변수 선언과 동시에 초기화하기(기본적)
class Car{
	int door = 4; //기본형 변수 초기화
	Engine e = new Engine(); //참조형 변수 초기화
}

//초기화 블럭
class BlockTest{
	static {	//클래스 초기화블럭 - 클래스변수의 초기화에 사용. 클래스가 처음 로딩될 때 한번만 수행됨!
		System.out.println("static { }");
	}
	{	//인스턴스 초기화블럭 - 인스턴스변수의 초기화에 사용. 생성자와 같이 인스턴스를 생성할 때마다 수행됨!
		//				  모든 생성자에서 공통으로 수행되어야 하는 코드를 넣는 데에 사용
		System.out.println("{ }");
	}
	public BlockTest() {
		System.out.println("생성자");
	}
}

	//예제2 : 멤버변수의 초기화 시기와 순서
		//클래스변수는 클래스가 처음 로딩될 때 단 한번 초기화 됨
		//인스턴스변수는 인스턴스가 생성될 때마다 각 인스턴스 별로 초기화가 이루어짐. 생성자보다 먼저 초기화됨!

class Product{
	//멤버변수
	static int count = 0; //count가 static변수로 선언되어 있기 때문에 객체를 새로 생성해도 증가된 count값이 그대로 있음!
						  //객체들이 같은 메모리를 공유하고 있기 때문!
	int serialNo;
	
	{	//인스턴스 초기화블럭 - Product객체가 생성될 때마다 공통으로 실행됨. count값 증가, serialNo에 count값 저장
		++count;
		serialNo = count;
	}
}

public class C20230712 {
	//예제1 출력
	//	public static void main(String[] args) 
	{
		System.out.println("BlockTest bt = new BlockTest();");
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}
	
	//예제2 출력
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 SerialNo는 "+p1.serialNo);
		System.out.println("p2의 SerialNo는 "+p2.serialNo);
		System.out.println("p3의 SerialNo는 "+p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
	}
}
