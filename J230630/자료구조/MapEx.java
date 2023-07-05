package J230630.자료구조;

import java.util.HashMap;
import java.util.Scanner;

//Map : 키를 통해서 값을 참조할 수 있는 구조
//특징 : 인터페이스이기 때문에 사용하려면 업 캐스팅이 필요
//Map을 구현한 대표 클래스 : HashMap, TreeMap

//HashMap : Key와 Value 값으로 데이터를 저장하는 형태
//특징 : Map 인터페이스의 한 종류로 Map의 모든 속성을 갖고 있으며 저장방식 동일하다
//Key의 중복은 허용하지 않으나 Value의 중복은 허용
//Hashing 이라는 검색 알고리즘 (문제를 해결하기 위한 절차적 해결 과정)
//└▶메모리 낭비를 최소화 하기 위해 저장할 값을 입력 받을시, 연산을 통해 새로운 주소값을
//	생성하여 메모리에 저장(매핑,mapping) 하는 기법



public class MapEx {
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		//1. put(ket,value)
		hm.put("apple", "사과");
		hm.put("paper", "종이");
		hm.put("flower", "꽃");

		String voca;
		System.out.print("알고 싶은 단어를 입력하세요 : ");
		voca = sc.nextLine();
		//2. containsKey(key) : key가 hashmap에 존재하면 true
		if(hm.containsKey(voca)) {
			//3. get(key) : value 반환
			System.out.println("해당하는 뜻은 : "+hm.get(voca));
		}
		else {
			System.out.println("해당하는 단어에 대한 뜻은 데이터베이스에 없습니다.");
		}
	
	}	
}
