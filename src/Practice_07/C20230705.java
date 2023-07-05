package Practice_07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class C20230705 {
	public static void main(String[] args) {

		//의문점		: X
		//정리 : while문 공부, 프로젝트 복습
//		1. while
//		- while(조건){}
//		- 조건이 참일경우 실행되고 계속 조건을 반복적으로 확인하여 거짓이 나올때까지 반복
//		- 반복무한루프	
//		- for문으로 대신 사용가능
//			
//		
		//예제 1
//		
//		while(sum<50){
//		int += dice = random.nextInt(6)+1
//		-> 주사위 숫자
//		sum += dice;
//		-> 주사위 숫자 합
//		count++;
//		-> 주사위 굴린횟수
//		System.out.println("합이 50이상 횟수 : " +count);
//		System.out.println("총합" + sum);
//		-> 주사위를 돌려서 생성된 랜덤숫자의 합이 50 넘을때까지 무한반복
//		-> 50넘었을경우 횟수, 총합 값 저장
//		
//		예제1 for문으로 변형(while -> for)
//		
//		for(count =0; sum< 50; count++){
//		int dice = random.nextInt(6) + 1;
//		sum += dice
//		}
//		System.out.println("합이 50이상 횟수 : " +count);
//		System.out.println("총합" + sum);
//
//		
//		
//		예제2
//		 postListModel = new DefaultListModel<>();
//        postList = new JList<>(postListModel);
//        JScrollPane postScrollPane = new JScrollPane(postList);
//
//        // 게시글 선택 이벤트 처리
//        postList.addListSelectionListener(e -> {
//            int selectedIndex = postList.getSelectedIndex();
//            if (selectedIndex != -1) {
//                controller.handleSelectPostButton(selectedIndex);
//            }
//        });
//			-> 게시글 목록 저장
//			-> DefaultListModel 객체 사용하여 JList 생성
//			-> JList를 JScrollPane으로 스크롤
//			-> PostListmodel에 객체 저장하여 표시
////		
	}
}
