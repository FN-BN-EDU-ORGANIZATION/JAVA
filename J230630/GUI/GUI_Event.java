package J230630.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//awt 패키지의 모든 클래스를 사용 하겠다
import javax.swing.*;
//스윙 패키지의 모든 클래스를 사용 하겠다


//이벤트 객체 : 이벤트 발생시 이벤트에 개한 정보를 가진 객체
//이벤트 리스너 : 이벤트 객체에 의해서 호출되어 이벤트를 처리하는 객체
//	└▶ 이벤트 리스너 사용 시 해당 인터페이스의 추상 메서드를 구현 해야함

//ActionListener : void actionPerformed(ActionEvent)
//	└▶ Action이 발생 할때 Event를 발생 (버튼 클릭시)
//KeyListener : void KeyPressed(KeyEvent) 키가 눌려질 때
//			 : void KeyRelesed(KeyEvent) 눌려진 키를 뗄 때
//			 : void KeyTyped(KeyEvent) 유니코드 키 입력시

class Listener1 implements ActionListener{

	@Override//추상메서드 구현
	public void actionPerformed(ActionEvent e) {
		//버튼을 클릭했을때 작동하는 이벤트 리스너를 만들겠다
		JButton button = (JButton)e.getSource();
		//└▶ 이벤트 발생한 컴포넌트를 가져 오겠다 
		button.setText("버튼클릭"); 
		//└▶버튼 문자열 지정 
	// 버튼을 클릭했을때 "버튼클릭" 이벤트를 발생시키겠다
		
	}
}

public class GUI_Event extends JFrame{
	GUI_Event(){ //GUI_Event 프레임 생성
		setTitle("JFrame"); //프레임 타이틀 지정
		setSize(300,300); //프레임 사이즈 지정
		
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide=new JSlider();
		JTextField tf=new JTextField("text 입력",20);
		this.setLayout(new FlowLayout());
		//흘러가는 흐름대로 배치 하겠다
		
		this.add(button);	//버튼 추가
		this.add(box);		//체크박스추가
		this.add(slide);	//슬라이드 추가
		this.add(tf);		//text box 추가
		
		setVisible(true); //현재 프레임을 보이도록 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//내 프로그램을 닫는 기능을 닫기버튼으로 설정
		
		button.addActionListener(new Listener1());
		//버튼 컴포넌트에 액션이벤트 리스너를 사용 하겠다.
	}
	public static void main(String[] args) {
		new GUI_Event();

	}

}
