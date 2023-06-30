package C20230629;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C20230629 {
	public static void main(String[] args) {
		//의문점
			//
		
		//정리
			//아래 예제2번을 풀 때, 해당문제를 낸 사람의 답을 보니 변수의 수를 줄여서 더 간단하게 만들 수 있었다. 나는 생각하지 못했으니까 다음에는 좀 더 생각해서 풀어보기.
			//제네릭타입 개념 다시 정리하기, 다른 헷갈리는 개념들도 다시 정리하기
		
		
		//예제1 : 수업 복습 - 코드 리뷰
		switch(num)
		{
		case 1: //사서메뉴 중 도서조회하기 기능 출력
			Map<String,Object> result = controller.execute("/book", 1, null);
			//프론트 컨트롤러 객체인 controller를 사용해서 서브 컨트롤러인 bookcontroller의 execute 1번 기능(select)의 결과를 result에 담기
			List<BookDto> list = (List<BookDto>)result.get("result");
			//받아온 result의 값을 list에 저장
			list.stream().forEach((dto)->{System.out.println(dto);});
			//list의 값을 stream함수를 사용하여 각각의 값을 출력함
			break;
		case 2: //사서메뉴 중 도서추가하기 기능 출력
			System.out.println("도서코드 도서명 출판사 ISBN 입력 : ");
			int bookcode = sc.nextInt();
			String bookname = sc.next();
			String publisher = sc.next();
			String isbn = sc.next();
			//각 칼럼의 값 키보드로 받기
	
			Map<String,Object> param = new HashMap();
			//HashMap 객체 생성 - param
			param.put("bookcode", bookcode);
			param.put("bookname", bookname);
			param.put("publisher", publisher);
			param.put("isbn", isbn);
			param.put("sid", sid);
			//위에서 받은 key값과 value값 및 세션id map형태의 param에 넣기
			Map<String,Object> result2 = controller.execute("/book", 2, param);
			//controller객체를 사용해서 bookcontroller의 execute 2번 기능(insert) 실행하고 위에서 받은 param값 result에 넣기
			Boolean isInsert = (Boolean)result2.get("result");
			//위의 result값 받아와서 isInsert변수에 boolean형태로 넣기
			if(isInsert==true)
				System.out.println("[INFO] 도서 등록 완료!");
			//isInsert값이 적절히 들어간 경우에 도서등록완료 출력
			break;
		case 7: //사서메뉴 중 도서 대여 기능 출력
			int req_bookcode = sc.nextInt();
			//대여할 책의 도서코드 키보드로 입력받기
			String userid = sc.next();
			//저장된 회원만 도서대여가 가능하므로 id 키보드 입력받기
			Map<String,Object> lend_param = new HashMap();
			//HashMap 객체 생성 - lend_param
			lend_param.put("bookcode", req_bookcode);
			lend_param.put("id", userid);
			lend_param.put("sid", sid);
			//위에서 입력받은 key값과 value값 및 세션id lend_param에 넣기
			Map<String,Object> result7 = controller.execute("/lend", 2, lend_param);
			//controller객체를 사용해서 lendcontroller의 execute 2번 기능(insert) 실행하고 위에서 받은 lend_param값 result에 넣기
			Boolean isLend = (Boolean)result7.get("result");
			//위의 result값 받아와서 isLend변수에 boolean형태로 넣기
			if(isLend) {
				System.out.println("[INFO] 대여 완료!");
				//isLend값이 적절히 들어간 경우에 대여완료 출력
			}
			break;
		}
		
		
		//예제2 : for문 연습문제 풀이
		//for문을 이용하여 N일 동안의 평균 온도를 구하는 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		int day;
		double temp;
		double alltemp = 0;
		double avg = 0;
		
		System.out.print("몇일 동안의 온도를 입력 받겠습니까?");
		day = sc.nextInt();
		for(int i=1; i<=day; i++) {
			System.out.println(i+"일차 온도 입력: ");
			temp = sc.nextDouble();
			alltemp += temp;
			avg = alltemp/day;
			
		}
		
		System.out.println(day+"일 간의 평균 온도는 "+avg);
		
	}
}
