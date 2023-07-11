package KwonIlkeun;

class Product{
	int price;	//제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스점수
	
	Product(int price)
	{
		this.price = price;
		bonusPoint = (int)(price/10.0);//보너스점수는 제품가격의 10%
	}
}
class Tv1 extends Product{

	Tv1() {
		//조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);//Tv의 가격을 100만원으로 한다.
		}
	public String toString() {return "Tv1";}
	//Object클래스의 toString()을 오버라이딩한다. 
}
class Computer extends Product{
	Computer() {super(200);}
	
	public String toString() {return "Computer";}
	//Object클래스의 toString()을 오버라이딩한다. 
}

class Buyer{
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스점수
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;	//가진돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; //제품의 보너스점수를 추가한다.
		System.out.println(p + "을/를 구입하셨습니다.");
		
	}
}

//class Car{}
//class FireEngine extends Car{}

public class C20230711 {

	public static void main(String[] args) {
		
//		FireEngine fe = new FireEngine();
//		
//		if(fe instanceof FireEngine)
//			System.out.println("This is a FireEngine instance.");
//		if(fe instanceof Car)
//			System.out.println("This is a Car instance.");
//		if(fe instanceof Object)
//			System.out.println("This is an Object instance.");
//		System.out.println(fe.getClass().getName());//참조변수.getClass().getName()은 참조변수가 가리키고 있는 인스턴스의 
		//클래스이름을 문자열(String)로 반환한다.
		
		//생성된 인스턴스는 FireEngine타입인데도 Object타입과 Car타입의 instanceof연산에서도 true결과를 얻었다. 그 이유는 FireEngine클래스는
		//Object클래스와 Car클래스의 자손 클래스이므로 조상의 멤버들을 상속받았기 때문에 FireEngine인스턴스는 Object인스턴스와 Car인스턴스를 포함하고 
		//있는 셈이기 때문이다. 요약하면, 실제 인스턴스와 같은 타입의 instanceof연산 이외에 조상타입의 instanceof연산에서도 true값을 얻으며
		//instanceof연산의 결과가 ture라는 것은 검사한 타입으로의 형변환을 해도 아무 문제가 없다는 뜻이다.

		
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+ b.money + "만원입니다.");
		System.out.println("현재 보너스점수는" + b.bonusPoint + "점입니다.");
		
	}

}
