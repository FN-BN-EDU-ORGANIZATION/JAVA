package Songjaeuk.D230703;

/*
 생성자
- 인스턴스를 생성할 때 사용한다.
- 어떤 값을 가지고 인스턴스가 만들어지게 하고 싶다면 생성자를 사용한다
- 클래스 작성시 생성자를 하나도 만들지 않았다면 자동으로 기본 생성자가 생성된다
- 기본 생성자는 매개변수를 하나도 받지 않는 생성자를 말한다

### 생성자 오버로딩

- 생성자는 매개변수의 개수가 다르거나, 타입이 다르다면 여러개를 가질 수 있다.

### 자신의 생성자를 호출 할 때는 this()를 호출한다.

- this는 인스턴스 자기 자신을 참조할 때 사용하는 키워드이다
- this(),생성자는 자기자신의 생성자를 말한다.
- this()생성자는 생성자 안에서만 사용가능하다
- this()생성자는 생성자 안에서 super()생성자를 호출하느 코드 다음이나, 첫번째 줄에 
위치해야 한다.

### 부모의 생성자를 호출 할 때는 super()를 사용한다.

- super는 인스턴스 부모를 참조할 때 사용하는 키워드이다.
- super()생성자는 부모 생성자를 의미한다
- super()생성자는 생성자 안에서만 사용가능하다.
- super()생성자는 생성자 안에서 첫번째 줄에만 올 수 있다
- 생성자는 무조건 super()생성자를 호출해야 한다. 사용자가 super()생성자를 호출하는 코드를 
작성하지 않았다면 자동으로 부모의 기본 생성자가 호출된다
- 부모클래스가 기본 생성자를 가지고 있지 않다면 사용자는 반드시 직접 super()생성자를 호출하는 코드를 작성해야한다

### 불변객체

- 불변객체(immutable object)란 객체가 생성된 이후에 그 상태를 변경할 수 없는 객체를 의미합니다. 
객체의 상태를 변경하는 대신, 새로운 객체를 생성하여 변경된 값을 담아 반환합니다. 
이를 통해 객체의 상태 불일치 문제나 다중 스레드 환경에서 발생하는 문제를 예방할 수 있습니다.
대표적인 불변객체로는 String이나 불변 List 객체 등이 있습니다.
*/

class Car{
	public void printName() {}
}


 class Car2 {
//  public  Car2(String name) //생성자가 하나라도 만들어지면 기본생성자는 만들어지지 않는다
	public  Car2(){
      super(); //자동으로 들어간다
      System.out.println("Car2()생성자 호출");
  }
}
 class Bus2 extends Car2{

    public Bus2(){
        super(); //부모의 기본 생성자를 호출하는 코드가 자동으로 삽입된다.
        System.out.println("Bus2기본생성자");
    }

}

public class Exam1 {
    public static void main(String[] args) {
       Car c1 = new Car();
       System.out.println(c1); //println(object x)를 받아들이고 있음 - Object로 참조할 수 있는것은 무엇이든 받을 수 있다.
//        System.out.println(c1.toString());
        c1.printName();
        System.out.println("--------------------------");

   Car c2 = new Car();
   c2.printName();
    }
}
