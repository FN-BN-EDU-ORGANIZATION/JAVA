package LEEJUHYUN;

		//클래스 개념 정리
		
		
		
		//객체 지향 프로그래밍이란? 
//		객체 지향 프로그래밍에서는 모든 데이터를 객체(object)로 취급하며, 이러한 객체가 바로 프로그래밍의 중심이 된다.
//		객체(object)란 간단히 이야기하자면 실생활에서 우리가 인식할 수 있는 사물로 설명할 수 있다.
//		이러한 객체의 상태(state)와 행동(behavior)을 구체화하는 형태의 프로그래밍이 바로 객체 지향 프로그래밍이다.
//		이때 객체를 만들어 내기 위한 설계도와 같은 개념을 클래스(class)라고 한다.
		
		//클래스 란?
//		자바에서 클래스(class)란 객체를 정의하는 틀 또는 설계도와 같은 의미로 사용된다.
//		자바에서는 이러한 설계도인 클래스를 가지고, 여러 객체를 생성하여 사용하게 된다.
//		클래스는 객체의 상태를 나타내는 필드(field)와 객체의 행동을 나타내는 메소드(method)로 구성된다.
//		즉, 필드(field)란 클래스에 포함된 변수(variable)를 의미한다.
//		또한, 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있다.
		
		//인스턴스란?
//		자바에서 클래스를 사용하기 위해서는 우선 해당 클래스 타입의 객체(object)를 선언해야 한다.
//		이렇게 클래스로부터 객체를 선언하는 과정을 클래스의 인스턴스 화라고 한다.
//		또한, 이렇게 선언된 해당 클래스 타입의 객체를 인스턴스(instance)라고 한다.
		
		//메소드(method)
//		자바에서 클래스는 멤버(member)로 속성을 표현하는 필드(field)와 기능을 표현하는 메소드(method)를 가진다.
//		그중에서 메소드(method)란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 수 있다.

		
		
		//클래스 예제

		// 클래스 정의
		class Person {
		    private String name; // 문자열 형태의 이름을 저장하는 데이터 필드
		    private int age; // 정수형태의 나이를 저장하는 데이터 필드

		    // 생성자 - 이름과 나이를 전달받아 객체를 초기화하는 역할
		    public Person(String name, int age) {
		        this.name = name; // 전달받은 name 값을 name 데이터 필드에 저장
		        this.age = age; // 전달받은 age 값을 age 데이터 필드에 저장
		    }

		    // introduce 메서드 - 객체의 소개 정보를 출력하는 역할
		    public void introduce() {
		        System.out.println("안녕하세요, 제 이름은 " + name + "이고, 나이는 " + age + "세입니다.");
		    }
		}

		// 메인 클래스
		public class C20230706 {
		    public static void main(String[] args) {
		        // Person 클래스의 인스턴스 생성
		        Person person1 = new Person("John", 25); // 이름이 "John"이고 나이가 25인 person1 객체 생성
		        Person person2 = new Person("Emily", 30); // 이름이 "Emily"이고 나이가 30인 person2 객체 생성

		        // introduce 메서드 호출 - 각 객체의 소개 정보를 출력
		        person1.introduce(); // person1 객체의 introduce 메서드 호출하여 "안녕하세요, 제 이름은 John이고, 나이는 25세입니다." 출력
		        person2.introduce(); // person2 객체의 introduce 메서드 호출하여 "안녕하세요, 제 이름은 Emily이고, 나이는 30세입니다." 출력
		    }

	}

