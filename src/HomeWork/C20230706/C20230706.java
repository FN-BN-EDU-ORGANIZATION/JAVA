package HomeWork.C20230706;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C20230706 {

	public static void main(String[] args) {
		
		//주어진 문자열(공백 없이 쉼표로 구분되고 있음)을 가지고 아래 문제에 대한 프로그램을 작성하시오
		String names = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String[] namesary = names.split(",");
		
		int kimcnt = 0;
		int leecnt = 0;
		int cnt = 0;
		
		//1. 김씨와 이씨는 각각 몇 명 인가요?
		//문자열을 ,로 구분하여 배열로 변환
		//개선된 for문을 사용함
		//for (element_type element : collection){ 반복실행될 코드 }
		//element_type 은 배열이나 컬렉션의 요소 타입을 나타내고 element는 각 요소를 나타내는 변수이다.
		//collection은 반복될 배열이나 컬렉션을 나타낸다.
		for(String name : namesary) {
			if(name.startsWith("김")) {
				kimcnt ++;
			}else if(name.startsWith("이")) {
				leecnt ++;
			}
		}
		System.out.println("김씨 " + kimcnt + "명");
		System.out.println("이씨 " + leecnt + "명");
		
		//name.startWith() 는 문자열(String) 객체의 시작부분을 특정 문자열 또는 문자로 확인하는 메서드
		
		System.out.println("---------------------------------------------");
		
		//2. "이재영"이란 이름이 몇번 반복되는가?
		String searchname = "이재영";
		for(String name : namesary) {
			if(name.equals(searchname)) {
				cnt++;
			}
		}
		
		System.out.println("이재영이라는 사람은 " + cnt + "명");
		
		System.out.println("---------------------------------------------");
		
		//3. 중복을 제거한 이름을 출력하세요.
		//Set은 자바 컬렉션 프레임워크의 인터페이스로 중복을 허용하지 않는 요소의 집합을 나타낸다.
		//HashSet은 Set인터페이스를 구현한 구체적인 클래스이다
		//일반적으로 Set을 사용하여 중복된 요소를 제거하거나 고유한 요소만을 유지하는데 사용되는데 
		//HashSet을 사용하면 요소의 순서가 보장되지 않지만, 빠른 검색 속도를 제공해준다.
		Set<String> uniqueNames = new HashSet<>();
		for(String name : namesary) {
			uniqueNames.add(name);
		}
		for(String name : uniqueNames) {
			System.out.println(name);
		}
		
		System.out.println("---------------------------------------------");
		
		//4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		List<String> sortedNames = new ArrayList<>(uniqueNames);
		Collections.sort(sortedNames);
		for (String name : sortedNames) {
            System.out.println(name);
        }
		
		//Collections.sort() 는 유틸리티 클래스에 포함된 메서드로서 컬렉션을 정렬하는데 사용된다.
		//리스트나 배열등의 컬렉션 요소들을 정렬이 가능함.
		
	}
}
