package KwonIlkeun;

public class C20230704 {

	public static void main(String[] args) {
		
		//StringBuffer에 대한 내용정리
		
		//StringBuffer는 문자열을 추가하거나 변경할 때
		//주로 사용하는 자료형이다
		
//		StringBuffer sb = new StringBuffer();//StringBuffer 객체 sb생성
//		sb.append("hello");
//		sb.append("");
//		sb.append("jump to java");
//		String result = sb.toString();
//		System.out.println(result);//"hello jump to java" 출력
		
		//StringBuffer자료형은 append 메서드를 사용하여 계속 문자열을 추가해 나갈 수 있다.
		//그리고 위 예제와 같이 toString()메서드를 이용하여 String자료형으로 변경할 수 있다.
		//위 예제를 StringBuffer 대신 String자료형을 사용하도록 해보자.
		
//		String result = "";
//		result += "hello";
//		result += " ";
//		result += "jump to java ";
//		System.out.println(result);
		
		//두 예제의 결과는 같지만 내부적으로 객체가 생성되고 메모리가 사용되는 과정은 다르다
		//첫번째의 경우 StringBuffer객체는 한번만 생성된다. 두번째는 String자료형에 +연산이 있을
		//때마다 새로운 String객체가 생성된다(문자열간 +연산이 있는 경우 자바는 자동으로 새로운 String객체 생성)
		//두번째 예제는 총 4개의 String자료형 객체가 만들어진다.
		//String자료형은 한번 값이 생성되면 값을 변경할 수 없다. 하지만 StringBuffer는 값변경이 가능하다
		//하지만 StringBuffer는 String보다 무겁기 때문에 new StringBuffer()로 객체를 생성하는 것은
		//일반 String을 사용하는 것보다 메모리 사용량도 많고 속도도 느리다. 따라서 문자열 추가나 변경등의
		//작업이 많은 경우는 StringBuffer, 문자열 변경이 거의 없는 경우는 String을 사용하는 것이 유리하다.
	}

}
