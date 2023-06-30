package C20230629;


//예제2 - 자바의 정석 챕터 5

//입력되는 수를 축적하여 더하는 add 매서드와 그 답을 출력하는 getValue, 입력된 값의 홀짝 여부를 판별하는 isOdd 매서드로 구성
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
	
	boolean isOdd(int val) {
		if(val%2==1) {
			return true;
		}else {
			return false;
		}
	}
	
}

//calculator를 상속받아 빼기 기능을 구현

class UpgradeCalculator extends Calculator{
	void minus (int val) {
		this.value -= val;
	}
}

//calculator 상속받아 결과값 최댓값을 100으로 제한

class MaxLimitCalculator extends Calculator{
	@Override
	int getValue() {
		if(this.value>100) {
			return 100;
		}else {
			return this.value;
		}
	}
}
	

public class Calculater {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.isOdd(3));
		System.out.println(cal.isOdd(2));
		cal.add(30);
		cal.add(900);
		System.out.println(cal.getValue());
	}

}
