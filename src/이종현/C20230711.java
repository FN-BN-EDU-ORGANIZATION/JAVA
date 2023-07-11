package 이종현;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C20230711 {
	// 의문점 : 이해안했던 점 적기
	// 정리 : 코드에 대한 전반적인 정리/해석

	// 예제 1
	//현재 팀 프로젝트를 한느대 버튼이 아닌 이미지 클릭으로 하는대 클릭을 할시
	//이벤트 창이 생성된는 것을 알아 보아서 적용을 해보았습니다.
	
//	// 이미지 클릭시 이벤트 창 생성
//	lbIcn.addMouseListener(new MouseAdapter() {
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// 이벤트 창 띄우기
//			WeatherFcst();
//		}
//	});
	
	
	// 예제 2
	//팀 프로젝트 에 이용되는 캘린더 만들어 보았습니다. 현재 입력 되어 있는 캘린더는
	//버튼 prev 과 next 을 이벤트 처리로 이용을 해서 날짜와 요일을 빠꿀려고 했습니다.
	//이벤트 처리로 하기 전에 새로운 메소드에 각각 다르게 만들어서 월 과 요일 그리고 일 을 
	//만들어서 메소드에 return 을 이용해서 다시 돌리게 하면서 그걸 이제 액션에 연결을 한다음
	//역션이 이제 버튼을 누를때 이제 날짜와 요일이 바뀌면서 한달이 지나면 월이 변경되게 되는것을 알게 되었습니다.
	//
//	// prev 버튼 액션 구현
//	prev.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			currentDate = currentDate.minusWeeks(1); // 1주 전 날짜로 변경
//
//			// 변경된 날짜에 맞게 라벨들과 텍스트 영역들을 업데이트
//			month.setText(getCurrentMonth());
//			for (int i = 0; i < 7; i++) {
//				dayLabels[i].setText(getDayOfWeek(i));
//				dateLabels[i].setText(getDate(i) + "일, ");
//				textAreas[i].setText("메모를 입력하세요"); // 이전 주의 내용 초기화
//			}
//		}
//	});
//	// next 버튼 액션 구현
//	next.addActionListener(new ActionListener() {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			currentDate = currentDate.plusWeeks(1); // 1주 후 날짜로 변경
//
//			// 변경된 날짜에 맞게 라벨들과 텍스트 영역들을 업데이트
//			month.setText(getCurrentMonth());
//			for (int i = 0; i < 7; i++) {
//				dayLabels[i].setText(getDayOfWeek(i));
//				dateLabels[i].setText(getDate(i) + "일, ");
//				textAreas[i].setText("메모를 입력하세요"); // 다음 주의 내용 초기화
//			}
//		}
//	});
//	// 현재 월을 문자열로 반환하는 함수
//		private String getCurrentMonth() {
//			int month = currentDate.getMonthValue();
//			return month + "월";
//		}
//
//		// 현재 요일의 날짜를 반환하는 함수
//		private int getDate(int dayIndex) {
//			int currentDayOfWeek = currentDate.getDayOfWeek().getValue();
//			int offset = dayIndex - currentDayOfWeek + 1;
//			LocalDate targetDate = currentDate.plusDays(offset);
//			return targetDate.getDayOfMonth();
//		}
//
//		// 요일을 반환하는 함수
//		private String getDayOfWeek(int dayIndex) {
//			int currentDayOfWeek = currentDate.getDayOfWeek().getValue();
//			int offset = dayIndex - currentDayOfWeek + 1;
//			LocalDate targetDate = currentDate.plusDays(offset);
//			return targetDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN);
//		}
}
