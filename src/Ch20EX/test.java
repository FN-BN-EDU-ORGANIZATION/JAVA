package Ch20EX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



class c04GUI extends JFrame implements ActionListener,KeyListener{
	
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	
	JTextField txt2;
	JTextArea area1;
	JScrollPane scroll1;
	
	c04GUI(){
		super("Chatting Server"); // 상속관계를 둬서 상위프레임 호출
		
		//Frame
		setBounds(100, 100, 430,450);
		
		//Panel
		JPanel panel = new JPanel(); //패널 생성
		
		
		//Component
		//button 생성
		btn1 = new JButton("파일로 저장");
		btn1.setBounds(275,10,120,50);
		
		btn2 = new JButton("1 : 1 요청");
		btn2.setBounds(275,90,120,50);
		
		btn3 = new JButton("대화기록보기");
		btn3.setBounds(275,170,120,50);
		
		btn4 = new JButton("입력");
		btn4.setBounds(275,330,120,50);
		
		//TXT_Component
		
		txt2=new JTextField();
		txt2.setBounds(10,330,250,50);
		
		//TxtArea_Component
		area1=new JTextArea();
		area1.setBounds(10,10,250,300);
		
		//ScrollerPan_Component
		scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,10,250,300);
		
		//Add_Panel_Component
		panel.setLayout(null);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt2);
		panel.add(scroll1);
		
		//event
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	
		txt2.addKeyListener(this);

		
		//Add_Panel_Component
		panel.setLayout(null);

		
		//Frame
		add(panel); //프레임에 panel 추가
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	
	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==txt2) {
			if(e.getKeyCode()==10) {
				System.out.println("txt's Enter");
				String txt = txt2.getText();
				area1.append(txt+"\n");
				txt2.setText("");
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장");
		}else if(e.getSource()==btn2) {
			System.out.println("1 : 1 요청");
		}else if(e.getSource()==btn3) {
			System.out.println("대화기록 보기");
		}else if(e.getSource()==btn4) {
			System.out.println("입력");
			if(e.getSource()==btn4) {
				String txt = txt2.getText();
				area1.append(txt+"\n");
				txt2.setText("");
			}
		}
	}
	

}

public class test {

	public static void main(String[] args) {

		
		new c04GUI();
		
		
		
	}

}