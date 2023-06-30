package J230630.GUI;

import java.awt.FlowLayout;

import javax.swing.*;

//GUI 컴퓨터를 사용하는 사용자를 위해 만들어진 특전한 기능을 가진 그래픽 요소
//GUI 프로그래밍 : 사용자가 프로그램을 쉽게 다룰 수 있도록 그래픽을 제공하도록 프로그래밍 하는것
//AWT : 자바에서 GUI를 프로그래밍 하기 위해 처음으로제공 한 라이브러리
//┕▶ Frame, Window, Panel, Button, Label 등, 운영체제의 자원 활용

//Swing : AWT를 대체하기 위해 자바로 작성된 GUI 객체
//운영체제에 의존적이지 않으며, 운영체제와 관예없이 동일한 모양 사용
//AWT와 구분하기위헤 J를 붙임 (JFrame, JWindow, JPanel, JButton, JLabel등)
//운영체제의 자원을 사용하지 않기 때문에 운영체제에 대한 부담감이 적으므로 swing를 사용한다
//컴포넌트 : JAVA에서 GUI를 구성하는 요소
//컨테이너 : 다른 컴포넌트를 포함할 수 있는 컴포넌트

//실제 사용하는 GUI 프로그래밍 메서드
//setLocation(int x, int y) 프레임의 위치 지정
//setSize(int width, int height) 프레임의 크기 지정
//setIconImage(Imege IconImage) 프레임의 타이틀 바에 보여질 아이콘 설정
//setTitle(String title) 타이틀바 제목 설정
//setVisible(boolean b) 화면에 표시 여부를 걸정

//GUI 프로그래밍 순서
//1. extends JFrame : JFrame 클래스를 상속받아, 나만의 프레임 클래스 작성
//	 생성자에서 컴포넌트 및 프레임 디자인 구현
//2. 기본설정=>생성자에서 하기 : title, size, visible 설정
//	 title 설정: setTitle("타이틀명"); 
//	 size 설정 : setSize(가로길이, 세로길이);
//	 visible 설정: setVisible(true);

public class GUI extends JFrame{ //extends : JFrame에서 사용하는 기능을 상속 받겠다

	GUI(){
		setTitle("JFrame");
		setSize(300,300);
		
		//컴포넌트 만들기
		JButton button=new JButton("button");
		JCheckBox box=new JCheckBox("checkbox");
		JSlider slide=new JSlider();
		JTextField tf=new JTextField("text 입력",20);
		this.setLayout(new FlowLayout());
		//Layout 배치관리자 
		//Flow 흐름, 흘러가는 흐름대로 배치 하겠다
		//★배치관리자
		//FlowLayout 왼쪽 -> 오른쪽 순서대로 배치
		//BorderLayout 컨테이너 공간을 동서남북 중앙으로 나누고 지정한 영역에 배치
		//GridLayout 컨테이너 공간을 동일 크기의 2차원 격자로 나누고 들어오는 순서대로 왼->오 배치
		//CardLayout 카드를 쌓아 놓은 듯이 컴포넌트를 쪼개어 배치
		
		this.add(button);
		this.add(box);
		this.add(slide);
		this.add(tf);
		
		
		setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//내 프로그램을 닫는 기능을 닫기버튼으로 설정
	}
	
	public static void main(String[] args) {
		new GUI(); //생성자 호출

	}

}
