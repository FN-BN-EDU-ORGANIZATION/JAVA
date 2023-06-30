package 이종현;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C20230629 {
	public static void main(String[] args) {

		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		
		//예제 1
		// 콤보 박스에 값을 넣기 위해선 배열 함수처럼 여러가지 를 넣어야 실행이 가능 한다점입니다.
		
		//int로 배열 생성
		int [] A = {1,2,3,4,5};
		
		//콤보박스 생성
		JComboBox Combo1;
		Combo1 = new JComboBox();
		//콤보박스 크기 조절
		Combo1.setBounds(70,40,100,20);
		
		// 패널 생성
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//안에 넣을 값 
		Combo1.addItem(A);
		
		//패널 연결 생성
		panel.add(Combo1);
		
		//예제 2
		
		// 창을 닫히는건 해보았지만 (JFrame.DISPOSE_ON_CLOSE) 을 이용해 창을 숨기거나 해당 창을 다시 블로오는것을 해보았다
		
		//창을 닫을때 해당 프래임은 닫고, 계속 실행을 한다
//		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// 창 안보이게 하기 
//		setVisible(false);
		
	
		
		//예제 3
		
		
		
	}
}
