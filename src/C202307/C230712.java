package C202307;

interface Predator {
	String bark();
}

class Animal {
    public String hello() {
        return "hello";
    }
}

class Dog extends Animal {
}

class Lion extends Animal implements Predator {
    public String bark() {
        return "Bark bark!!";
    }
}

public class C230712 {

	public static void main(String[] args) {
//		  Animal a = new Animal();  // 1번
//	      Animal b = new Dog();  // 2번
//	      Animal c = new Lion();  // 3번
//	      Dog d = new Animal();  // 4번 오류발생
//	      Predator e = new Lion();  // 5번
	      //Dog 클래스는 Animal의 자식 클래스로 IS-A 관계가 성립될 수 없기 때문 나머지는 모두 IS-A 관계가 성립
	      
	      Animal a = new Lion();
	      Lion b = new Lion();
	      Predator c = new Lion();

	      System.out.println(a.hello());  // 1번
	      System.out.println(a.bark());   // 2번 오류발생
	      System.out.println(b.hello());  // 3번
	      System.out.println(b.bark());   // 4번
	      System.out.println(c.hello());  // 5번 오류발생
	      System.out.println(c.bark());   // 6번
	      //2번 문장과 5번 문장에서 오류가 발생한다. 2번 문장이 오류가 발생하는 이유는 
	      //a 객체가 Animal 타입으로 생성되었기 때문이다. Animal 타입의 객체는 hello 메서드만 사용이 가능
	      //5번 문장이 오류가 발생하는 이유는 c 객체가 Predator 타입으로 생성되었기 때문
	      //Predator 타입의 객체는 bark 메서드만 사용이 가능
	      
	    }
    }
