package J230630.GUI;

import java.awt.*;
//awt 패키지의 모든 클래스를 사용 하겠다
import javax.swing.*;
//스윙 패키지의 모든 클래스를 사용 하겠다

class FlowWindow extends JFrame{ 
	//JFrame의 기능을 상속 받는 FlowWindow class 생성
	FlowWindow(){ //FlowWindow의 설계도를 만들겠다
		setTitle("flow window"); //프레임 제목 설정
		setSize(300,300); //프레임 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 동장 설정
		
		JButton btn1 = new JButton("btn1"); // "btn1"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn2 = new JButton("btn2"); // "btn2"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn3 = new JButton("btn3"); // "btn3"이라는 텍스트를 가진 JButton 객체를 생성
		
		this.add(btn1); //btn1 추가
		this.add(btn2); //btn2 추가
		this.add(btn3); //btn3 추가
		
		this.setLayout(new FlowLayout());
		//현재 프레임의 레이아웃 설정
		setVisible(true); //현재 프레임을 보이도록 설정
}
}
	
class BorderWindow extends JFrame{
	BorderWindow(){
		setTitle("Border window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("btn1"); // "btn1"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn2 = new JButton("btn2"); // "btn2"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn3 = new JButton("btn3"); // "btn3"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn4 = new JButton("btn4"); // "btn4"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn5 = new JButton("btn5"); // "btn5"이라는 텍스트를 가진 JButton 객체를 생성
		
		this.setLayout(new BorderLayout());
		this.add(btn1,BorderLayout.EAST); //btn1 동쪽에 추가
		this.add(btn2,BorderLayout.WEST); //btn2 서쪽에 추가
		this.add(btn3,BorderLayout.SOUTH); //btn3 남쪽에 추가
		this.add(btn4,BorderLayout.NORTH); //btn4 북쪽에 추가
		this.add(btn5,BorderLayout.CENTER); //btn5 중간에 추가
		
		
		setVisible(true);
	}
}
class GridWindow extends JFrame{
	GridWindow(){
		setTitle("Grid window");
		setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn1 = new JButton("btn1"); // "btn1"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn2 = new JButton("btn2"); // "btn2"이라는 텍스트를 가진 JButton 객체를 생성
		JButton btn3 = new JButton("btn3"); // "btn3"이라는 텍스트를 가진 JButton 객체를 생성
		
		this.add(btn1); //btn1 추가
		this.add(btn2); //btn2 추가
		this.add(btn3); //btn3 추가
		this.setLayout(new GridLayout());
		//3등분
//		this.setLayout(new GridLayout(2,2));
		//격자 무늬
		
		setVisible(true);
	}
	
	}


public class GUI2 {

	public static void main(String[] args) {
		new GridWindow();
		//상단 클래스명 호출
	}
}




