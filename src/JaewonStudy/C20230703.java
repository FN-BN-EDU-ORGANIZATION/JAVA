package JaewonStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class C20230703 {
	// 의문점
	// HashMap 클래스는 Map인터페이스를 구현하므로, 중복된 키로는 값ㅇ르 저장할수 없다. 하지만 같은값을 다른 키로 저장하는것은 가능하다.

//		예제1 - HashMap 클래스
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>(); // Hashmap 선언

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
//	put()메소드를 이용하여 요소 저장

		System.out.println("맵에 저장된 키들의 집한 : " + map.keySet());
		for (String key : map.keySet()) {
			System.out.printf("키 : %s, 값 : %s", key, map.get(key));
//		for문과 get()메소드를 이용하여 값 출력
		}
		map.remove("four");
//	remove()메소드를 이용하여 값 삭제

		map.replace("three", 30);
//	replace() 메소드를 이용하여 값 수정
	}

//		예제 2 - 재귀호출
	Scanner sc = new Scanner(System.in); // 스캐너 호출 
	int recursiveSum(int n) {  // recursiveSum 메소드 호출
		n = sc.nextInt();		// 스캐너로 값을 하나 받아온다.
		if(n==1) {				// if문을 이용하여 1을 받았따면 1을 반환하여 메소드 종
			return 1;
		}
		return n + recursiveSum(n-1);  // 1이 아닌값을 받을경우 받은값 + 받은값 -1을하여 전체 수의 합을 구한다.
	}
	
}
