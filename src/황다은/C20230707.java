package 황다은;

//예제1 동물클래스
class Animal{
	void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}
//각각의 동물 하위 클래스
class Dog extends Animal{
	void bark() {
		System.out.println("강아지가 멍멍 짖습니다.");
	}
}
class Cat extends Animal{
	void meow() {
		System.out.println("고양이가 야옹하고 울고 있습니다.");
	}
}
//예제2 도형클래스
class Shape{
	void draw() {
		System.out.println("도형을 그리고 있다.");
	}
}
//예제2 도형 하위 클래스
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리고 있다.");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("사각형을 그리고 있따.");
	}
}
public class C20230707 {
	public static void main(String[] args) {
		//예제1 상속관련문제
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		//Animal클래스를 상속받아 각각의 메소드bark,meow를 추가로 사용
		//상속을 받으면서 개인의 기능을 추가 할 수 있다.
		
		//예제2 
		Circle circle = new Circle();
		circle.draw();
		Square square = new Square();
		square.draw();
		
		//상속 개념 정리
		//자바에서 상속이란?
		//클래스간에 코드를 공유하고 재사용하는 방법
		//기존 클래스의 특성을 이어받아 새로은 클래스를 만들수 있고
		//필요에 따라 기능을 추가하거나 변경가능함
		//상속을 사용함으로써 코드의 재사용성과 유지보수성을 높일 수 있다.
	}
}
