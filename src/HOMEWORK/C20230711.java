package HOMEWORK;

	//의문점
	//정리
		//객체지향 관련해서 차근차근 다시 정리하는 게 기본적인 실수를 줄이는 데에 도움이 많이 될 것 같다.
		//코드를 좀 더 깔끔하게 짜는 데에도 도움이 될 것 같다~
		
	//예제1 : 생성자 정리
		//인스턴스 변수의 초기화 작업에 주로 사용됨!
		//생성자의 이름은 클래스의 이름과 같아야 한다. 생성자는 리턴값이 없다.
		//생성자도 오버로딩이 가능하기 때문에 하나의 클래스에 여러개의 생성자가 존재할 수 있다!
		class Data1{
			int value;
		}
		
		class Data2{
			int value;
			Data2(int x){ //매개변수가 존재하는 생성자 
				value = x;
			}
		}
		
//		class Car{
//			String color;
//			String gearType;
//			int door;
//			
//			Car(){} //기본생성자
//			//기본생성자의 경우 객체 생성 후 변수들을 따로 초기화해주어야 함.
//			Car(String c, String g, int d){ //매개변수를 갖는 생성자
//			//매개변수를 갖는 생성자의 경우 객체 생성과 동시에 변수도 같이 초기화 가능!
//				color = c;
//				gearType = g;
//				door = d;
//			}
//		}
	//예제2 : 생성자에서 this 사용하기
		//생성자 간 서로 호출하기 위해서 사용하는 this! 반드시 첫줄에서만 사용 가능
		class Car{
			String color;
			String gearType;
			int door;
			
			Car(){
				this("white","auto",4); //this를 사용해서 매개변수를 3개 갖고있는 Car생성자를 호출함!
			}
			
//			Car(String color){
//				this(color,"auto",4);
//			}
			
			Car(Car c){ //객체를 복사하기 위한 생성자(두 객체가 동일한 값을 갖고 있다)
				color = c.color;
				gearType = c.gearType;
				door = c.door;
			}
			
			Car(String color, String gearType, int door){ 
				this.color = color;
				this.gearType = gearType;
				this.door = door;
			}
		}
		
public class C20230711 {
	public static void main(String[] args) {
		//예제 1 출력
//		Data1 da1 = new Data1(); //Data2의 경우 기본생성자가 자동으로 생성됨(정의된 생성자가 하나도 없기 때문에)
//		Data1 da2 = new Data2(); //이 경우 컴파일에러 발생. Data2에는 기본생성자가 생성되어 있지 않기 때문!
		
		
//		Car c1 = new Car();
//		c1.color = "white";
//		c1.gearType = "auto";
//		c1.door = 4;
//		
//		Car c2 = new Car("white","auto",4);
//		
//		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door 수 = " + c1.door);
//		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door 수 = " + c2.door);
		
		//예제 2 출력
		Car c1 = new Car();
//		Car c2 = new Car("blue"); 	//매개변수를 하나 갖고 있는 Car생성자를 호출하고 해당 매개변수를 "blue"로 초기화 
		Car c2 = new Car(c1); //c1을 복사하는 c2 생성
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door 수 = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door 수 = " + c2.door);
		
		c1.door = 100; //c1의 door변수값 변경
		System.out.println("---------------------------");
		
		System.out.println("c1의 color = " + c1.color + ", gearType = " + c1.gearType + ", door 수 = " + c1.door);
		System.out.println("c2의 color = " + c2.color + ", gearType = " + c2.gearType + ", door 수 = " + c2.door);
		//c1의 door값만 변경되어 출력된다! - c2는 c1의 복사본이기는 하지만 서로 별도의 객체이므로 c1의 값을 변경해도 c2의 값은 변경되지 않는다.
		
	}
}
