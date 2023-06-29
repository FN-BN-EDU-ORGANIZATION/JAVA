package JaewonStudy;

public class C20230629 {
	
	// 의문점
	//정리 
//		java에서의 변수는 클래스변수, 인스턴스 변수, 지역변수가 있으며 변수의 종류는 변수가 선언된 위치에 따라 정해진다.
//		1) 인스턴스변수 - 클래스영역에 생성되며 인스턴스가 생성될때 메모리에 할당됩니다.
//		2) 클래스변수 - 클래스 영역에 생성되며 인스턴스 변수에 static이 붙어있는 형태니다. 클래스가 메모리에 올라갈때 메로리에 할당됨.
//		3) 지역변수 - 클래스 이외의 영역에 생성됨(메서드, 생성자, 초기화블럭). 변수 선언문이 수행되었을때 메모리에 할당됨
		
//	예제1 - Java의 변수 종류와 구분.
	
		int instanceVariable; // 인스턴스 변수
		
		static int classVariable; // 클래스변수
		
		void method() {
			int localVariable; // 지역변수
		}
		
		
//	예제 2 - Static의 이해
//			==> static의 경우 클레스에 고정되어 있는 변수나 메서드임을 의미함. 따라서 메모리에 고정적으로 할당되
//				객체 생성 없이 바로 사용할수있다
//		public void print() {
//			System.out.println("이게 실행될까요?");
//		}
//			print();      ========>실행되지 않는다.
//		====2가지 해결방법=====
		public void print() {
			System.out.println("이게 실행될까요?");
		}
		public static void print2() {
			System.out.println("이게 실행될까요?");
		}
		public static void main(String[] args) {			
			C20230629 main = new C20230629();
			main.print();
//================================================
			print2();
		}

}
