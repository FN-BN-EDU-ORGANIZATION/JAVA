package CPractice;

public class C20230710 {
    String say() { //say메서드 생성
        return "Hi";
    }

    public static void main(String[] args) {
        C20230710 sample = new C20230710();
        String a = sample.say(); //객체 생성
        System.out.println(a);  // "Hi" 출력
    }
}