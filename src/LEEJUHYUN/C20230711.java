package LEEJUHYUN;

public class C20230711 {

	public static void main(String[] args) {
		
//		this 와 this()
//		
//		1. this : 현재 객체를 가르키는 참조로, 인스턴스 메서드나 생성자 내에서 해당 객체의 멤버 변수 또는 다른 메서드를 호출할 때 사용된다.
//		this는 인스턴스 자신을 가르키므로, 인스턴스 변수와 메서드를 구별하기 위해 사용될 수 있다.
		
//		class Car {
//		    private String modelName;
//		    
//		    public void setModelName(String modelName) {
//		        this.modelName = modelName;
//		    }
//		    
//		    public String getModelName() {
//		        return this.modelName;
//		    }
//		}
		
		// 정리 : this.modelName은 인스턴스 변수를 가리키며, this를 사용하여 현재 객체의 modelName을 참조한다.
		
		
		
		
		
//		2. this(): 다른 생성자를 호출하는 데 사용되며, 동일한 클래스 내에서 다른 생성자를 호출하여 객체의 초기화를 수행한다. 
//		this()는 생성자 내의 첫 줄에서만 호출할 수 있으며, 같은 클래스 내에서 오버로딩된 다른 생성자를 호출할 때 사용된다.

//		class Car {
//		    private String modelName;
//		    private int modelYear;
//		    
//		    public Car() {
//		        this("Unknown", 0);
//		    }
//		    
//		    public Car(String modelName, int modelYear) {
//		        this.modelName = modelName;
//		        this.modelYear = modelYear;
//		    }
//		}
		
//		정리 : this("Unknown", 0)은 같은 클래스 내의 다른 생성자를 호출하여 인스턴스 변수 modelName과 modelYear를 초기화한다. 
//		this()를 사용하여 생성자 간의 코드 중복을 피할 수 있다.
	}

}
