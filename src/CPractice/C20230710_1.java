package CPractice;

public class C20230710_1 {
    int sum(int a, int b) { //메서드
        return a + b;
    }

    public static void main(String[] args) { //객체 생성
        int a = 3;
        int b = 4;

        C20230710_1 sample = new C20230710_1();
        int c = sample.sum(a, b);

        System.out.println(c);
    }
}