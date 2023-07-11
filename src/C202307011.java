package mystudey04;
abstract class Phone {
    String phoneNumber;
    // abstract 키워드를 사용 ,  세미콜론(;)으로 끝남
    // 추상 메서드  추상 메서드(Abstract Method)는 메서드의 선언만 있고 구현 내용이 없는 메서드입니다
    // 추상 메서드는 메서드의 동작 방식을 정의하지 않고, 이를 상속받는 하위 클래스에서 구현하도록 강제하는 역할을 합니다
    //추상 메서드는 추상 클래스(Abstract Class) 또는 인터페이스(Interface)에서 선언됩니다.
    abstract void call();

    // 기타 공통적인 동작
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}

class Galaxy extends Phone {
	//생성자
    Galaxy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //메서드 오버라이딩
    @Override
    void call() {
        System.out.println("갤럭시로 전화를 거봅니다.");
    }
}
	
class IPhone extends Phone {
    IPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    void call() {
        System.out.println("아이폰으로 전화를 거봅니다.");
    }
}

public class 추상메서드예시 {
    public static void main(String[] args) {
        Galaxy galaxy = new Galaxy("010-1234-5678");
        galaxy.powerOn();
        galaxy.call();
        galaxy.powerOff();

        IPhone iPhone = new IPhone("010-9876-5432");
        iPhone.powerOn();
        iPhone.call();
        iPhone.powerOff();
    }
}


