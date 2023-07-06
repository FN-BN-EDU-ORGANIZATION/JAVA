package C202307;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator1 {
	int value;

	Calculator1() {
	     this.value = 0;
	 }

	void add(int val) {
	     this.value += val;
	 }

	int getValue() {
	     return this.value;
	 }
	    
    int avg(int[] data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.length;
    }

    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.size();
    }
}

class UpgradeCalculator extends Calculator1 {
    void minus(int val) {
        this.value -= val;
    }
}

public class C230706 {

	public static void main(String[] args) {
		//Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가
        UpgradeCalculator cal = new UpgradeCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());  // 10에서 3을 뺀 7을 출력
	        
	    //다음과 같이 정수 배열 또는 정수의 리스트로 그 평균값을 구해 리턴하는 Calculator 클래스를 작성
	    //메서드 오버라이딩 사용
        Calculator1 cal1 = new Calculator1();

        int[] data1 = {1, 3, 5, 7, 9};
        int result1 = cal1.avg(data1);
        System.out.println(result1);  // 5 출력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal1.avg(data2);
        System.out.println(result2);  // 5 출력
	    }

}
