package LEEJUHYUN;

//public class C20230710 {
//
//	public static void main(String[] args) {
	

//		생성자(constructor)
//		자바에서는 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 있는 생성자(constructor)라는 메소드를 제공한다.
//		자바에서 생성자(constructor)의 이름은 해당 클래스의 이름과 같아야 한다.
//		즉, Car 클래스의 생성자의 이름은 Car가 된다.
		
		// 예제1 : 생성자 호출
//		class Car {
//		    private String modelName; // 자동차의 모델 이름을 저장
//		    private int modelYear; // 자동차의 모델 연도를 저장
//		    private String color; // 자동차의 색상을 저장
//		    private int maxSpeed; // 자동차의 최대 속도를 저장
//		    private int currentSpeed; // 자동차의 현재 속도를 저장
//		
//		    Car(String modelName, int modelYear, String color, int maxSpeed) {
//		        this.modelName = modelName; // 인스턴스의 모델 이름을 초기화
//		        this.modelYear = modelYear; // 인스턴스의 모델 연도를 초기화
//		        this.color = color; // 인스턴스의 색상을 초기화
//		        this.maxSpeed = maxSpeed; // 인스턴스의 최대 속도를 초기화
//		        this.currentSpeed = 0; // 인스턴스의 현재 속도를 초기화
//		    }
//		
//		    public String getModel() {
//		        return this.modelYear + "년식 " + this.modelName + " " + this.color; 
//		        // 모델 연도, 모델 이름, 색상을 조합하여 반환
//		    }
//		}
//		
//		public class C20230710 {
//		    public static void main(String[] args) {
//		        Car myCar = new Car("아반떼", 2016, "흰색", 200); // Car 클래스의 생성자를 호출하여 인스턴스를 생성
//		        System.out.println(myCar.getModel()); // 생성된 인스턴스의 모델 정보를 출력
//		    }
//		}

//		 정리 : Car 클래스는 자동차의 정보를 저장하고 반환하는 기능을 가지고 있다. 
//		 C20230710 클래스는 main 메서드를 포함하고 있으며, 
//		 여기서 Car 클래스의 인스턴스를 생성하여 "2016년식 아반떼 흰색" 이라는 모델 정보를 출력.
		
		
		// 예제2 : Car 클래스에 생성자를 정의하지 않고, 기본 생성자를 호출
//		class Car {
//		    private String modelName = "소나타"; // 자동차의 모델 이름 기본값으로 "소나타"를 설정
//		    private int modelYear = 2016; // 자동차의 모델 연도 기본값으로 2016을 설정
//		    private String color = "파란색"; // 자동차의 색상 기본값으로 "파란색"을 설정
//		
//		    public String getModel() {
//		        return this.modelYear + "년식 " + this.color + " " + this.modelName; 
//		        // 모델 연도, 색상, 모델 이름을 조합하여 반환
//		    }
//		}
//		
//		public class C20230710 {
//		    public static void main(String[] args) {
//		        Car myCar = new Car(); // Car 클래스의 기본 생성자를 호출하여 인스턴스를 생성
//		        System.out.println(myCar.getModel()); // "2016년식 파란색 소나타" 모델 정보를 출력
//		    }
//		}

//		정리 : Car 클래스의 인스턴스인 myCar는 기본 생성자를 사용하여 생성됩니다.
//		하지만 기본 생성자는 아무런 동작도 하지 않으므로, 인스턴스 변수를 클래스 필드에서 바로 초기화하고 
//		이처럼 인스턴스 변수의 초기화는 생성자를 사용하여 수행할 수도 있지만, 클래스 필드에서 바로 수행할 수도 있습니다.
		
		
		
		
		
		
		
		
		
//	}
//
//}
