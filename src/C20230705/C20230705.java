package C20230705;

//의문점 

//정리
/*
 * 인터페이스란
 * 인터페이스는 객체를 어떻게 구성해야 하는지 정리한 설계도
 * interface를 이용하여, 개발 코드를 직접 수정하지 않고도, 사용하고 있는 객체만 변경할 수 있도록 하기 위해사용한다.
 
 * <특징>
 * 인터페이스는 interface 키워드를 사용하여 정의한다.
 * 인터페이스는 상수, 추상메소드, default,static메소드로 구성되어 있다. 자바 8부터는 default 메소드와  static 메소드가 사용가능하다.
 * 인터페이스 안의 모든 상수는 public static final타입
 * 인터페이스 안의 모든 추상메소드는 abstract public 타입
 * 추상클래스와 마찬가지로 인스턴스를 만들 수 없다
 * 인터페이스는 다른 인터페이스를 extends 키워드로 상속 받을 수 있으며, 다중 상속이 가능하다.
 * 클래스에서 인터페이스의 구현은 implements 키워드를 사용하여 구현할 인터페이스를 지정후, 추상메소드를 모두 오버라이드 하여 내용을 완성해야한다.

<사용법>
[public] interface 인터페이스이름 { ... }
public interface User { ... }
 
 * */

/*예제1-------------------------------------------------------
	// 인터페이스 정의
	interface Attackable {
	    void attack();
	}

	// Human 클래스 정의
	class Human {
	    String name;

	    public void speak() {
	        System.out.println(name + ": 안녕하세요");
	    }
	}

	// Archer 클래스 정의 (Human 상속, Attackable 구현)
	class Archer extends Human implements Attackable {
	    @Override
	    public void attack() {
	        System.out.println(name + ": 공격합니다.");
	    }
	}

	public class C20230705 {
	    public static void main(String[] args) {
	        Archer a1 = new Archer(); // Archer 클래스 타입
	        a1.name = "정세인";
	        a1.speak();
	        a1.attack();

	        Attackable a2 = new Archer(); // Attackable 인터페이스 타입
	        // a2.name = "정세인"; // 사용불가
	        // a2.speak(); // 사용불가
	        a2.attack();
	    }
	}
---------------------------------------------------------------------------------------*/


/* 예제2

//인터페이스 정의
interface Printable {
 void print();
}

//Human 클래스 정의
class Human {
 String name;

 public void speak() {
     System.out.println(name + ": 안녕하세요");
 }
}

//Writer 클래스 정의 (Human 상속, Printable 구현)
class Writer extends Human implements Printable {
 @Override
 public void print() {
     System.out.println(name + ": 글을 씁니다.");
 }
}

public class C20230705 {
 public static void main(String[] args) {
     Writer w1 = new Writer(); // Writer 클래스 타입
     w1.name = "작가1";
     w1.speak();
     w1.print();

     Printable w2 = new Writer(); // Printable 인터페이스 타입
     // w2.name = "작가2"; // 사용불가
     // w2.speak(); // 사용불가
     w2.print();
 }
}
----------------------------------------------------------------*/

/*예제3
 package C20230705;

// 인터페이스 정의
interface Runnable {
    void run();
}

// Human 클래스 정의
class Human {
    String name;

    public void speak() {
        System.out.println(name + ": 안녕하세요");
    }
}

// Athlete 클래스 정의 (Human 상속, Runnable 구현)
class Athlete extends Human implements Runnable {
    @Override
    public void run() {
        System.out.println(name + ": 달립니다.");
    }
}

public class C20230705 {
    public static void main(String[] args) {
        Athlete a1 = new Athlete(); // Athlete 클래스 타입
        a1.name = "운동선수1";
        a1.speak();
        a1.run();

        Runnable a2 = new Athlete(); // Runnable 인터페이스 타입
        // a2.name = "운동선수2"; // 사용불가
        // a2.speak(); // 사용불가
        a2.run();
    }
}

 * */
