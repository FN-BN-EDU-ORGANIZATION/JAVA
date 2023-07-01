package Songjaeuk.D230630;
/* 상속

### 상속=일반화 + 확장

- 상속이란 일반화와 확장이라는 개념을 합한 것이라고 생각하면 됨
- 부모 클래스를 상속 받는다는 것은 부모가 가지고 있는 것을 자식이 물려받아 사용할 수 있다는 것을 의미

### 상속 선언 방법

```java
[접근제한자] [abstract|final] class 클래스명 extends 부모클래스명{

}
```

아무것도 상속받지 않으면 자동으로 java.lang.Object를  상속 받는다.

- 모든 클래스는 Object의 자손임

### 부모 타입으로 자손 타입을 참조할 수 있다.

- 버스는 자동차다

```java
Car car = new Bus();
```

### 다형성- 메소드 오버라이딩(Overriding)

- 상위 클래스의 메서드를 하위 클래스가 재정의 하는 것
- 메서드의 이름은 물론 파라미터의 갯수나 타입도 동일해야 하며, 주로 상위 클래스의 동작을 
상속 받은 하위 클래스에서 변경하기 위해 사용된다
- **메소드가 오버라이딩이 되면 무조건 자식의 메소드가 실행이 된다.(중요)**
- 필드는 Type를  따라가고, 메소드는 오버라이딩된 자식의 메소드가 실행된다
*/
 class Car {
    public void Run(){
        System.out.println("전륜구동을 달리다");
    }
}
 class Bus extends Car {
	    public void Run(){
	        System.out.println("후륜구동하다");
	    }
	 public void 안내방송(){
	     System.out.println("안내방송하다");
	 }
	}



public class inherit01 {
	public static void main(String[] args) {
		 Bus b1 = new Bus();
	        b1.Run();
//	        b1.안내방송();

	        Car c1 = new Bus(); //  부모 타입의 참조 변수로 자식이나 후손 인스턴스를 참소 할 수 있습니다.
	                            //  버스는 자동차다.
	        c1.Run();   // 그(c1)자동차는 달린다.
//	        c1.안내방송();
	        Bus b2 = (Bus)c1;   //c1이 참조하는 Bus인스턴스를 원래의 Bus형태로 참조해서 사용하겠다고 선언하는 것
	        b2.안내방송();



	        
	
	}
}
