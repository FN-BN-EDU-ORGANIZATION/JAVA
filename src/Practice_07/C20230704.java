package Practice_07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class C20230704 {
	public static void main(String[] args) {

		//의문점		: X
		//정리 : for문 자바상속 공부, 프로젝트 복습
//		1. 상속이란
//		- 존재하는 클래스의 속성과 메서드를 다른 클래스에서 재사용
//		- 유지보수 재사용
//		- extends를 이용하여 상속받을 수 있음	
//		- 자식클래스는 부모클래스에게 상속받음
//		- 부모 클래스 기능 확장하는걸 overriding
//	
//		
//		2. for문
//		- for(시작;조건;증감){}
//		- for문을 사용하여 배열의 요소를 순회하거나 특정 반복횟수만큼 반복
//		
//		
//		
//		
//		
		//예제 1
////		public class BookTitleStorage {
//	    public static void main(String[] args) {
//	        String[] bookTitles = new String[10];  
//	        -> 10개의 책 제목을 저장할 배열
//
//	        Scanner scanner = new Scanner(System.in);
//
//	        for (int i = 0; i < bookTitles.length; i++) {
//	            System.out.print("책 제목을 입력하세요: ");
//	            bookTitles[i] = scanner.nextLine();
//	        }
//
//	        scanner.close();
//
//	        // 저장된 책 제목 출력
//	        System.out.println("저장된 책 제목:");
//	        for (int i = 0; i < bookTitles.length; i++) {
//	            System.out.println(bookTitles[i]);
//	        }
//	    }
//	}
//			for문을 사용하여 0부터 9까지 책제목을 입력받아 저장
//			책의 제목을 입력받아 저장
		
//		예제2
//		 class DeletePostButtonListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int selectedIndex = view.getSelectedPostIndex();
//            if (selectedIndex != -1) {
//                service.deletePost(selectedIndex);
//                view.clearInputFields();
//                view.updatePostList(service.getAllPostTitles());
//            }
//        }
//    }
//			-> ActionListenr 구현 버튼을 누를때 실행되는 작업 정의
//			-> view를 이용하여 index 가져온다
//			-> index가 -1이 아니라면 게시물 삭제
//			-> 버튼 눌렀을 경우 선택된 게시물 삭제, 게시물목록을 업데이트하는 역할
////		
	}
}