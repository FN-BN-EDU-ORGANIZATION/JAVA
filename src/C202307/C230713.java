package C202307;

import java.util.HashMap;

public class C230713 {

	public static void main(String[] args) {
		//a:b:c:d
		//문자열의 split와 join 메서드를 사용하여 위 문자열을 다음과 같이 고치기
		//a#b#c#d
		 String str = "a:b:c:d";
	     String[] temp = str.split(":");  // ":" 로 분리
	     String result = String.join("#", temp);  // "#" 으로 합침
	     System.out.println(result);  // "a#b#c#d" 출력

//	     HashMap<String, Integer> a = new HashMap<>();
//	     a.put("A", 90);
//	     a.put("B", 80);
//	     System.out.println(a.get("C"));  // null 출력
	     //a 맵에는 'C'라는 key가 없으므로 위처럼 null이 출력된다. 
	     //'C'에 해당하는 key 값이 없을 경우 null 대신 70을 얻을 수 있도록 수정하기
	     HashMap<String, Integer> a = new HashMap<>();
	     a.put("A", 90);
	     a.put("B", 80);
	     System.out.println(a.getOrDefault("C", 70));  // 70 출력
	}

}
