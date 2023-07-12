package LEEJUHYUN;

		
//		메소드 오버로딩(method overloading)
//		
//		메소드 오버로딩(overloading)이란 같은 이름의 메소드를 중복하여 정의하는 것을 의미한다.
//		자바에서는 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없다.
//		하지만 매개변수의 개수나 타입을 다르게 하면, 하나의 이름으로 메소드를 작성할 수 있다.
//		즉, 메소드 오버로딩은 서로 다른 시그니처를 갖는 여러 메소드를 같은 이름으로 정의하는 것이라고 할 수 있다.
//		이러한 메소드 오버로딩을 사용함으로써 메소드에 사용되는 이름을 절약할 수 있으며,
//		메소드를 호출할 때 전달해야 할 매개변수의 타입이나 개수에 대해 크게 신경을 쓰지 않고 호출할 수 있게 된다.
		

		//예제 1
//		class Test {
//		    static void display(int num1) { System.out.println(num1); }  // 전달받은 num1을 그대로 출력
//		    static void display(int num1, int num2) { System.out.println(num1 * num2); }	// 전달받은 두 정수의 곱을 출력
//		    static void display(int num1, double num2) { System.out.println(num1 + num2); }	// 전달받은 정수와 실수의 합을 출력
//		}
//
//		 
//		public class C20230712 {
//		    public static void main(String[] args) {
//		        Test myfunc = new Test();
//
//		        myfunc.display(10);			// 10출력
//		        myfunc.display(10, 20);		// 200출력
//		        myfunc.display(10, 3.14);	// 13.14 출력
//		        myfunc.display(10, 'a');	// 영문 소문자 'a'의 아스키 코드값이 97이므로, int형으로 자동 타입 변환되어 970 출력
//
//		    }
//
//		}
	


		//예제 2
		public class C20230712 {
		
		    public void display(String message) {
		        System.out.println("문자열 출력 : " + message);
		    }
		
		    public void display(int num1) {
		        System.out.println("정수형 출력 : " + num1);
		    }
		
		    public void display(String message, int num1, int num2) {
		        System.out.println(message + num1 * num2);
		    }
		    
		    public static void main(String[] args) {
		    	C20230712 a = new C20230712();
		    	
		    	a.display("JAVA");
		    	a.display(10);
		    	a.display(20);
		    	a.display("java ",30, 40);
		}
		    
		}

