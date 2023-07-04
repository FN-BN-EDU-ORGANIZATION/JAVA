package JaewonStudy;

import java.util.HashMap;
import java.util.Scanner;

	// 의문점
	// 다형성이란 하나의 객체가 여러가지 타입을 가질수 있는 것을 의미한다.상속을 통해 인스턴스를 참조할수있다.
	
	
	
//		예제1 - java 다형성(polymorphism)
	
class Animal{
	public void animalSound() {
		System.out.println("The animal makes a soud");
	}
}
// 부모 클래스를 생성한다.
class Pig extends Animal{  // 부모클래스를 상속받아 돼지 클래스를 만듬 
	public void animalSound() { 	// 보모 클래스의 animalSound메소드를 받아와 재정의함.
		System.out.println("the pig says : wee wee");
	}
}

class Dog extends Animal{		// 부모클래스를 상속받아 개 클래스를 만듬 
	public void animalSound() {		// 보모 클래스의 animalSound메소드를 받아와 재정의함.
		System.out.println("The dog says : bow wow");
	}
}
	

//		예제 2 - inner class 내부클레스
class OuterClass{ // 기본 클래스
	int x = 10;
	
	class InnerClass{ // 내부클래스
		int y = 5;
	}
}
public class C20230704 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass(); // 클래스를 객체화 시킴.
		OuterClass.InnerClass myInner = myOuter.new InnerClass(); // 내부 클래스를 객체화 시킴
		System.out.println(myInner.y + myOuter.x); // 객체화시킨 각각의 클래스의 변수를 합할수있다.
	}
	
	
}
