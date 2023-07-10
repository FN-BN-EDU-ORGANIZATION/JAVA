package HOMEWORK;

	//의문점
	//정리
		//오버로딩, 오버라이딩은 외워도 자꾸 헷갈리는 느낌..
		//오버로딩은 과적! 같은 이름이 다른 기능들을 많이 가지고 있으므로 하나의 이름에 기능이 과적되어 있다!

	//예제1 : 오버로딩
		//한 클래스 내에서 같은 이름의 메서드를 여러개 정의하는 것. 메서드 이름은 같고, 매개변수의 개수나 타입이 달라야 함.
		//println으로 알아보는 오버로딩~
class MyMath{ //매개변수의 타입 다르게 하여 같은 이름으로 메서드 선언한 클래스 생성
	int add(int a, int b) { //매개변수의 타입이 둘 다 int형
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) { //매개변수의 타입이 int형과 long형
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) { //같은 매개변수 타입을 갖고 있지만, 순서가 달라도 오버로딩 가능!
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) { //매개변수의 타입이 둘다 long형
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) { //배열도 가능하다!
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}



public class C20230710 {
	//예제 1 출력
//	public static void main(String[] args) 
	{
		//모두 오버로딩된 메서드들이라서 중복된 메서드로 인식하지 X. 잘 처리되어 출력된다!
		MyMath mm = new MyMath();
		System.out.println("mm.add(3,3)결과 : "+mm.add(3, 3));
		System.out.println("mm.add(3L,3)결과 : "+mm.add(3L, 3));
		System.out.println("mm.add(3,3L)결과 : "+mm.add(3, 3L));
		System.out.println("mm.add(3L,3L)결과 : "+mm.add(3L, 3L));
		
		int[] a = {100,200,300};
		System.out.println("mm.add(a)결과 : "+mm.add(a));
		
	}
	
	
	//예제2 : 가변인자와 오버로딩
	//가변인자는 (타입... 변수명) 형식으로 선언됨. 가변인자를 선언할 때에는 매개변수 중에서 가장 마지막에 선언!
	//배열도 인자가 될 수 있다! 가변인자는 내부적으로 배열을 사용하는 인자라고 할 수 있다.
	//매개변수의 타입을 배열과 가변인자로 하는 것의 차이는 배열은 반드시 인자를 지정해줘야 하지만, 가변인자는 인자가 아예 없어도 된다!
	public static void main(String[] args) {
		String[] strArr = {"100","200","300"};
		
		System.out.println(concatenate("","100","200","300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",", new String[] {"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
		}
	
	static String concatenate(String delim, String... args) { //가변인지로 매개변수. 문자열 개수 상관 X
		String result = "";
		
		for(String str : args) {
			result += str + delim; //입력된 가변인자 사이에 메인에서 작성한 "","-",","구분자를 포함시켜서 반환!
		}
		return result;
	}
	
	
	
	
	
	}

