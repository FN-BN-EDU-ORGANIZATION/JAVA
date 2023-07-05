package JaewonStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C20230705 {

	// 의문점
	// 
	
	class Car{
	}
	public static void main(String[] args) {
		
	
//		예제1 - List 컬렉션 클래스 ==> ArrayList<E>
	ArrayList<Integer> arrList = new ArrayList<Integer>(); // arrylist 생성
	
	arrList.add(40);
	arrList.add(30);
	arrList.add(20);
	arrList.add(10);
	
	//	생성된 list에 add()메소드를 이용해서 데이터 입력
	
	for(int i=0;i<arrList.size();i++) {
		System.out.print(arrList.get(i)+ " ");
	}
	// for문과 get()메소드를 이용하여 각 요소 출력
	System.out.println();
	
	arrList.remove(1);	// remove()메소드를 이용해서 요소 삭제.
	
	for(int e: arrList) {
		System.out.print(e + " ");
	}
	// enhanced for문을 이용하여 각도소 출력.
	System.out.println();
	
	Collections.sort(arrList);	// collections.sort()를 이용해서 요소 정렬
	
	Iterator<Integer> iter = arrList.iterator();
	while(iter.hasNext()) {
		System.out.print(iter.next() + " ");
	}
	// iterator() 메소드를 이용하여 각 요소 출력
	System.out.println();
	
	arrList.set(0, 20);	// set()메소드를 이용하여 요소 데이터 변경
	
	for(int e : arrList) {
		System.out.print(e + " ");
	}
	System.out.println();
	
	System.out.println("리스트의 크리 : " + arrList.size());
	// size() 메소드를 이용한 요소의 총 개수
	

//		예제2 - equals()메소드 -> 메소드는 해당 인스턴스를 메개변수로 전달받는 참조변수와 비교하여 그 결과 반환.
	Car car01 = new Car();

	Car car02 = new Car();
	 
	System.out.println(car01.equals(car02));

	car01 = car02; // 두 참조 변수가 같은 주소를 가리킴.

	System.out.println(car01.equals(car02));
	}
}
