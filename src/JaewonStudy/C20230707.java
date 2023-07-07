package JaewonStudy;

public class C20230707 {
	// 의문점
	// 
	
	
//	예제1 - toString()메소드 - toString() 메소드는 해당 인스턴스에 대한 정보를 문자열로 반환합니다.
	Car car01 = new Car(); // car에 대한 메소드 생성

	Car car02 = new Car(); 

	 

	System.out.println(car01.toString()); // 생성된 메소드의 값을 String으로 출력

	System.out.println(car02.toString());
	
	
	
//	예제2 - echarAt() 메소드 - charAt() 메소드는 해당 문자열의 특정 인덱스에 해당하는 문자를 반환합니다.
	String str = new String("Java");	// str 메소드 생성하여 java값을 넣는다.

	System.out.println("원본 문자열 : " + str);	메소드의 문자열을 출력

	 

	for (int i = 0; i < str.length(); i++) {	for문과 charAt메소드를 사용하며 문자열의 각 문자를 하나씩 출력한다.

	    System.out.print(str.charAt(i) + " ");

	}

}
