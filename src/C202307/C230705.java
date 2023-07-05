package C202307;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
    boolean isOdd(int num) {
        return num % 2 == 1;
    }
}

class MaxLimitCalculator extends Calculator {
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}

public class C230705 {

	public static void main(String[] args) {
		//객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들기 
		//단 MaxLimitCalculator 클래스는 반드시 다음의 Calculator 클래스를 상속해서 만들어야 한다.
		MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(50);  // 50 더하기
        cal.add(60);  // 60 더하기
        System.out.println(cal.getValue());  // 100 출력
		//메서드 오버라이딩을 활용
        
		//홀짝 판단하기
		//홀수이면 true, 짝수면 false를 리턴
		Calculator cal1 = new Calculator();
		System.out.println(cal1.isOdd(3));  // 3은 홀수이므로 true 출력
		System.out.println(cal1.isOdd(4));  // 4는 짝수이므로 false 출력
		}
	}
