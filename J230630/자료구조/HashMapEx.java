package J230630.자료구조;

import java.util.*;


public class HashMapEx {
	static HashMap<String,String> hm = new HashMap<String,String>();
	//hm 이라는 HashMap 객체 생성
	static Scanner sc = new Scanner(System.in);
	//sc 라는 Scanner 객체 생성
	public static void main(String[] args) {
		int choice; //정수형 변수를 받아오는 변수 생성
		while(true) { //무한반복문 실행
			System.out.println("전화번호부");
			System.out.println("1. 고객 정보 저장");
			System.out.println("2. 고객 정보 검색");
			System.out.println("3. 고객 정보 출력");
			System.out.println("4. 끝내기");
			System.out.print("번호입력");
			choice = sc.nextInt();
			//사용자로 부터 받은 정수를 sc.nextInt() 메서드로 입력 받아 choice변수에 할당
			if(choice==1) { //만약 사용자가 1을 입력하면
				System.out.println("----- 고객 정보 저장 -----");
				insert();//insert 메서드 호출
			}
			else if(choice==2) {//사용자가 2을 입력하면
				System.out.println("----- 고객 정보 검색 -----");
				search(); //search 메서드 호출
			}
		
			else if(choice==3) {//사용자가 3을 입력하면
				System.out.println("----- 고객 정보 출력 -----");
				show(); //show 메서드를 호출
			}
			
			else if(choice==4) {//사용자가 4를 입력하면
				System.out.println("프로그램을 종료합니다.");
				break; // 프로그램을 종료
			}
			else {
				System.out.println("잘못 입력 하셨습니다");
			}
		
		
		
		
		
		}
		
}
	public static void insert() { // insert 메서드 고객정보추가
		String name,phone;//문자열 변수 name phone
		System.out.print("저장할 고객의 이름: ");
		name=sc.next(); //name에 고객의 이름을 입력 받고 변수에 저장
		if(hm.containsKey(name)) {////만약 존재하는 이름 이라면 (name이 key 이므로, 중복이 되지 않도록 체크)
			System.out.println("이미 존재하는 이름입니다");
			return; //중복저장을 막고 메세지 출력후 메서드 종료
		} else {//위의 조건이 만족하지 않는 경우, 중복되는 이름이 없으므로 실행
			System.out.println("저장할 고객의 번호: ");
			phone=sc.next();//사용자로부터 전화번호를 입력받아 phone 변수에 저장
			hm.put(name, phone); //HashMap에 이름을 키(key)로, 전화번호를 값(value)로 저장
			System.out.println("저장 완료!");
		}
	}
	public static void search() {// 전화번호부에서 고객정보 검색 메서드
		String searchName; //문자열 변수 선언
		System.out.print("검색할 이름 : ");
		searchName = sc.next(); // 사용자로부터 검색할 이름을 입력받고, serchNanme에 저장
		
		if(hm.containsKey(searchName)) {//만약 hm에 해당 이름을 key로 가지고 있다면
			System.out.println("검색 완료!");
			System.out.println("검색된 전화번호 : "+hm.get(searchName));
			//해당 이름에 대응하는 값을 반환하여 출력
		}
		else { // 조건을 만족하지 않는 경우
			System.out.println("검색된 이름이 없습니다. ");//메세지 출력
		}
	}
	public static void show() { //저장된 고객정보 보여주는 메서드
		Set<String> keyset=hm.keySet();//hm에 모든 키를 포함하는 keyset 생성
		Iterator i = keyset.iterator();//key의 요소 순회를 위한 Iterator 객체 i 생성
		while(i.hasNext()) { //i가 순회할 요소가 남아 있는지 확인
			String curName=(String)i.next();//i의 요소를 가져와 curname변수에 저장
			System.out.println("name: "+curName+",phone: "+hm.get(curName));;
			//현재 고객의 이름과 해당하는 전화번호를 반환
		}
	}
}
