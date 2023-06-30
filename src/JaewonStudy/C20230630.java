package JaewonStudy;

public class C20230630 {
	// 의문점
	//정리 Method Overloading은 메소드의 이른은 같지만 매개변수 갯구나 타입이 다르면 동일한 이름의 메소드를 여러개 만들 수 있다.

		
//	예제1 - this와 this()
	
		class Car{
			private String modelName;
			private int modelYear;
			private String color;
			private int maxSpeed;
			private int currentSpeed;
//			======================인스턴스 변수선언==================
			
			Car(String modelName, int modelYear, String color, int maxSpeed){
				this.modelName = modelName;
				this.modelYear = modelYear;
				this.color = color;
				this.maxSpeed = maxSpeed;
//				========================this참조 변수를 통해서 인스턴스변수의 주소를 가르키고있다.
				this.currentSpeed = 0;
			}
			
			Car()
			{
				this("소나타", 2023, "black",200 );
//				================this() 메소드를 이용해서 앞에 있는 같은 매개변수 개수와 타입 순서를 가지는 메소들를 가르킨다.
			}
			
		}
		
		
		
		
//	예제 2 - 메소드 오버로딩 ( Method Overloading)
		
		public void hello() {
			System.out.println("hello 메서드 입니다~"); // hello 메서드 생성
		}
		public void hello(int i) {
										// 매개변수가 1개인 hello 메서드
		}
		public void hello(boolean i) {
										// 매개변수가 1개이지만 다른타입의 메서드
		}
		public void hello(String sr, int i) {
										// 매개변수가 2개인 hello 메서드
		}
		
}
