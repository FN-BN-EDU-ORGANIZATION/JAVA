package C20230703;



  //의문점
 //클래스 상속과 인터페이스 상속이 헷갈렸다.
/* 정리
 * <클래스상속>
 * 자식 클래스가 부모 클래스를 선택하여 부모 클래스의 멤버(변수와 메서드)를 상속받아 그대로 사용할 수 있게 하는 것
 * 특징)
 * - 부모 클래스의 private 접근 제한을 갖는 필드 및 메소드는 자식이 물려받을 수 없다.
 * - 부모와 자식 클래스가 서로 다른 패키지에 있다면 부모의 default 접근 제한을 갖는 필드 및 메소드도 자식이 물려 받을 수 없다. 이 두가지 경우를 제외한 모든 건 상속의 대상이 된다.
 * - 자바는 다중 상속이 되지 않는다. 하지만 여러 자식 클래스에 상속은 가능하다.
 
 * <인터페이스 상속>
 * 한 인터페이스가 다른 인터페이스를 상속받는 것
 * 특징)
 * - 인터페이스 상속은 implements 키워드를 통해 상속 받을 수 있다.
 * - 인터페이스를 상속받은 자식 클래스는 상속받은 인터페이스의 메소드를 반드시 오버라이딩(재정의) 해야 한다.
 * */

//Animal 클래스
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + "가 소리를 낸다.");
    }
}

// Dog 클래스, Animal 클래스를 상속함
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("멍멍");
    }
}

// Cat 클래스, Animal 클래스를 상속함
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("야옹");
    }
}

//---------------------------------------------------

//인터페이스
//Animal 인터페이스
interface Animal2 {
 void talk();
}

//Dog 클래스, Animal 인터페이스를 구현함
class Dog2 implements Animal2 {
 private String name;

 public Dog2(String name) {
     this.name = name;
 }

 @Override
 public void talk() {
     System.out.println(name + "가 소리를 낸다.");
 }

 public void bark() {
     System.out.println("캬학");
 }
}

//Cat 클래스, Animal 인터페이스를 구현함
class Cat2 implements Animal2 {
 private String name;

 public Cat2(String name) {
     this.name = name;
 }

 @Override
 public void talk() {
     System.out.println(name + "가 소리를 낸다.");
 }

 public void meow() {
     System.out.println("꾸엑");
 }
}

//-------------------------------------------------------------
//부모 클래스: 학생(Student)
class Student {
 protected String name;
 protected int score;

 public Student(String name, int score) {
     this.name = name;
     this.score = score;
 }

 public void displayInfo() {
     System.out.println("이름: " + name);
     System.out.println("성적: " + score);
 }
}

//자식 클래스: 고등학생(HighSchoolStudent)
class HighSchoolStudent extends Student {
 private int grade;

 public HighSchoolStudent(String name, int score, int grade) {
     super(name, score);
     this.grade = grade;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("학년: " + grade);
 }
}

//자식 클래스: 대학생(CollegeStudent)
class CollegeStudent extends Student {
 private String major;

 public CollegeStudent(String name, int score, String major) {
     super(name, score);
     this.major = major;
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("전공: " + major);
 }
}

public class C20230703 {
	
	
		// 예제1_클래스 상속
		public static class Main {
			public static void main(String[] args) {
			System.out.println("-------------예제1----------------------------------------");
	        Dog2 dog = new Dog2("강아지2");
	        dog.talk(); // 멍멍이2가 소리를 낸다.
	        dog.bark();  // 캬학
	        System.out.println("-------------예제2----------------------------------------");
	    // 예제2_인터페이스 상속
	        Cat2 cat = new Cat2("고양이2");
	        cat.talk(); // 고양이2가 소리를 낸다.
	        cat.meow(); // 꾸엑
	        
	        System.out.println("-------------예제3----------------------------------------");
	    //예제3_성적관련 상속 예제
	        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("박병주", 90, 3);
	        highSchoolStudent.displayInfo();
	        /* 출력
	        이름: 박병주
	         성적: 90
	        학년: 3
	        */
	        
	        System.out.println();

	        CollegeStudent collegeStudent = new CollegeStudent("정세인", 100, "컴퓨터공학");
	        collegeStudent.displayInfo();
	        /* 출력
	        이름: 정세인
	        성적: 85
	        전공: 컴퓨터공학
	        */
			}
		}
}


