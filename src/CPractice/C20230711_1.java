package CPractice;

public class C20230711_1 {
    public static void main(String[] args) {
        int result = 0;
        int i = 1;
        while (i <= 1500) {//1500까지의 수 중에서 3의 배수의 합을 구하는 while문
            if (i % 5 == 0) {  // 5로 나누어 떨어지는 수는 5의 배수
                result += i;
            }
            i += 1;
        }
        System.out.println(result);  // 225750 출력
    }
}