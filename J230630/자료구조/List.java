package J230630.자료구조;

import java.util.ArrayList;
import java.util.LinkedList;

//List : 데이터를 일렬고 늘어놓은 구조로 순서가 있고 중복을 허용하지 않는다
//List 인터페이스의 주요 메서드
//add(int index,E elem)  : index 위치에 elem 추가
//get(int index) 		 : index위치에 있는 요소 반환
//indexOf(Object o)		 : 요소 o가 있는 위치 반환
//listiterator()		 : Listiterator() 반환
//remove(int index)		 : index 위치 요소 삭제 후 삭제값 반환
//set(int inex,E elem)	 : index 위치 요소를 elem으로 변경

public class List {
public static void main(String[] args) {
	ArrayList list1 = new ArrayList(10); //초기용량이 10인 ArrayList 객체 list1 생성
	list1.add("A");
	list1.add("C");
	list1.add("E");
	list1.add("D"); //list1 에 A,C,E,D 추가
	System.out.print("초기상태 : ");
	System.out.println(list1); //list1 초기상태 출력
	
	System.out.print("인덱스 1위치에 B추가 : ");
	list1.add(1,"B"); //인덱스 1 위치에 B 추가
	System.out.println(list1); //list1 상태 출력
	
	System.out.print("인덱스 2위치의 값 삭제 : ");
	list1.remove(2); //인덱스 2위치의 값 삭제
	System.out.println(list1); //list1 상태 출력
	
	System.out.println("인덱스 2 위치의 값 반환 : "+list1.get(2));//인덱스 2 위치의 값 반환
	System.out.println("--------------------------------------");
	
	
	ArrayList al = new ArrayList(); 	//빈 ArrayList의 객체 al 생성
	LinkedList ll = new LinkedList();	//빈 LiskedList의 객체 ll 생성
	long start = System.currentTimeMillis();	//작업시간 기록
	
	for(int i=0; i<100000; i++) {	//0부터 99999까지 반복 하는 반복문
		al.add(0,String.valueOf(i));//반복적으로 호출한 값을 정수i에 문자열로 변환하여 추가
	}
	long end = System.currentTimeMillis();		//작업 종료시간 기록
	System.out.println("ArrayList 작업시간 : "+ (end-start));

	start = System.currentTimeMillis();
	for(int i=0; i<100000; i++) {
		ll.add(0,String.valueOf(i));
	}
	end=System.currentTimeMillis();
	System.out.println("LinkedList 작업시간 : " + (end-start));
	
}
}
