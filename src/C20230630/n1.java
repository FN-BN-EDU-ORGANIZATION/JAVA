package C20230630;

import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
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



public class n1 {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int [] data1 = {3,3,3,3,3};
		int result1 = cal.avg(data1);
		System.out.println(result1);
		
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
		int result2 = cal.avg(data2);
		System.out.println(result2);
	}

}
