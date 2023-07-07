package C20230707;

//인터페이스 정의
interface Calculator {
 int add(int a, int b);
 int subtract(int a, int b);
}

//Calculator 인터페이스를 구현한 클래스
class BasicCalculator implements Calculator {
 public int add(int a, int b) {
     return a + b;
 }

 public int subtract(int a, int b) {
     return a - b;
 }
}

//메인 클래스
public class Interface2 {
 public static void main(String[] args) {
     Calculator calculator = new BasicCalculator();
     int sum = calculator.add(5, 3);
     System.out.println("덧셈 결과: " + sum); // 출력: 덧셈 결과: 8

     int difference = calculator.subtract(10, 4);
     System.out.println("뺄셈 결과: " + difference); // 출력: 뺄셈 결과: 6
 }
}
