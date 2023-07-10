package C20230710;

interface Predator {
    String bark();
}

abstract class Animal {
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

public class Q3 {
    public static void main(String[] args) {
        Animal a = new Lion();
        Lion b = new Lion();
        Predator c = new Lion();

        System.out.println(a.hello());  // 1번
        System.out.println(a.bark());   // 2번 오류발생 
        //a는 동물 객체로 생성
        System.out.println(b.hello());  // 3번
        System.out.println(b.bark());   // 4번
        System.out.println(c.hello());  // 5번 오류발생
        //c는 포식자 객체로 생성
        System.out.println(c.bark());   // 6번
    }
}
