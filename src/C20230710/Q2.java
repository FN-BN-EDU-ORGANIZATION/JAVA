package C20230710;

import java.util.ArrayList;

public class Q2 {
	//숫자를 입력받고, 그 수가 0~9 중 중복되는 수를 사용해 만들어진 것인지를 판별
	
	static boolean duplicate(String data) {
		ArrayList<String>result = new ArrayList<>();
		for(String c : data.split("")) {
			if(result.contains(c)) { // 같은 수를 포함하고 있다면 ...
				return false;
			}else {
				result.add(c);
			}
		}
		return result.size()==10;
	}
	
	public static void main(String[] args) {
		System.out.println(duplicate("0987456213")); //true
		System.out.println(duplicate("122123"));	 //false
	}

}
