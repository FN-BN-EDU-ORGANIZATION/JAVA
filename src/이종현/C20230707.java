package 이종현;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C20230707 {
	// 의문점 : 이해안했던 점 적기
	// 정리 : 코드에 대한 전반적인 정리/해석

	// 예제 1
	//액션  효과로 다른 메소드나 다른 클래스 파일에 있는 것을 버튼으로 눌러을때 하는 방법을 
	//알아 보았습니다. 그냥 액션안에서 했을떄는 바로 해서 되지만 void 함수 나 다른 클래스 에 있는 것들은 불러오는 것으로
	//된다는것을 알았습니다.
//	Next.addActionListener(new ActionListener() {
//	@Override
//	public void actionPerformed(ActionEvent e) {

	// 클래스 에서 블로오기
//	TEST calendar = new TEst();	
//	calendar();
	
	// 메서드 에서 블로오기
//	WeatherNcst();
//}
//});
//}

	// 예제 2
	//배열 문과 반복문으로 이용해서 레이블을 복사 하는듯이 같이 생성 되는지 해보았고
	//현재 팀 프로젝트에 값이 들어올때 배열 문 안에 있는것들이 같이 들어가 if문으로 이용해서 각각 나누어 서 
	//시간별로 해볼려고 하고 있습니다.

	//JLabel[] Labtxt;
	//calendar() {
	//  super("Calendar"); // 프레임창 제목
	//JPanel panel = new JPanel(); // 패널 생성
	//setBounds(100, 100, 1500, 450); // 프레임 창 사이즈
	//panel.setLayout(null); // 레이아웃 매니저를 null로 설정하여 수동으로 위치 지정
	//Labtxt = mew JLabel[7];
//	   for (int i = 0; i < 7; i++) {
//           Labtxt[i] = new JLabel();
//           this.add(Labtxt[i]);
//       }
//
//	 dateLabels[0].setBounds(20, 100, 150, 50);
//     dateLabels[1].setBounds(220, 100, 150, 50);
//     dateLabels[2].setBounds(430, 100, 150, 50);
//     dateLabels[3].setBounds(640, 100, 150, 50);
//     dateLabels[4].setBounds(850, 100, 150, 50);
//     dateLabels[5].setBounds(1060, 100, 150, 50);
//     dateLabels[6].setBounds(1270, 100, 150, 50);
	
}
