package J230630.자료구조;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

//Set(집합) : 요소들을 집합적으로 모아놓은 구조
//중복을 허용하지 않고, 저장 순서를 유지하지 않는다
//1. HashSet : Set과 동일하게 중복이 없고 순서가 없다.
	//HashSet() : 기본 생성사
	//HashSet(Collection c) : 컬렉션의 요소로 HashSet객체 생성
	//HashSet(int capacity) : capacity 용량을 갖는 객체 생성
//중복된 요소 add()시 집합에 추가 안되고 false값 반환
//2. TreeSet : Set과 동일하게 중복이 없으나, 정렬기능이 추가된 형태 -> 이진탐색트리구조

public class Set {
	public static void main(String[] args) {
		HashSet hs = new HashSet(); //HashSet 생성
		hs.add("demon");	
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		//HashSet에 내용 추가
		
		TreeSet ts = new TreeSet(); //TreeSet 생성
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");
		//TreeSet에 내용 추가
		
		Iterator it = hs.iterator(); // HashSet의 Iterator 객체 생성
		//HashSet객체에서 Iterator를 사용하여 데이터를 반복적으로 접근하고 출력
		System.out.println("<Hash Set 출력>");
		while(it.hasNext()) { //다음 데이터가 있는지 확인
			System.out.print(" " + it.next()); //다음데이터를 가져와 출력
		}
		System.out.println();
		
		Iterator it2 = ts.iterator(); // TreeSet의 Iterator 객체 생성
		//TreeSet객체에서 Iterator를 사용하여 데이터를 반복적으로 접근하고 출력
		System.out.println("<Tree Set 출력>");
		while(it2.hasNext()) { //다음 데이터가 있는지 확인
			System.out.print(" " + it2.next()); //다음데이터를 가져와 출력
		}
		
}
}

