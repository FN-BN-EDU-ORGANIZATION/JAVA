package 이찬진;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame implements ActionListener{

	static String[] arr = {
			"0","1","2","*",
			"3","4","5","/",
			"6","7", "8","+",
			"9","CE","=","-"
	};
	
	static JButton[] btn = new JButton[16];
	static JLabel calc_txt;
	static JLabel result_txt;
	static Calculator calculator;
	
	static String total_data = "";
	
	
	public static void main(String[] args) {
		System.out.println("사칙연산계산기 만들기");
		
		calculator = new Calculator();
		
		JFrame frm = new JFrame("찬진's 계산기");
		frm.setSize(500,500);
		frm.setLocationRelativeTo(null);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		frm.getContentPane().setLayout(null);
		
		calc_txt = new JLabel("0");
		calc_txt.setBounds(0,0,500,100);
		calc_txt.setOpaque(true);
		calc_txt.setBackground(Color.GRAY);
		calc_txt.setForeground(Color.WHITE);
		
		
		result_txt = new JLabel("result");
		result_txt.setBounds(0,100,500,50);
		result_txt.setOpaque(true);
		result_txt.setBackground(Color.darkGray);
		result_txt.setForeground(Color.WHITE);
		
		
		
		JPanel grid_panel = new JPanel();
		grid_panel.setLayout(new GridLayout(4,4,0,0));
		
		for(int idx=0;idx<arr.length;idx++) {
			btn[idx] = new JButton(arr[idx]);
			
			if(arr[idx].contains("*") || arr[idx].contains("/") || arr[idx].contains("+") || arr[idx].contains("-")) {
				btn[idx].setBackground(Color.BLACK);
			}
			else if(arr[idx].contains("CE") || arr[idx].contains("=")) {
				btn[idx].setBackground(Color.darkGray);
			}
			else {
				btn[idx].setBackground(Color.GRAY);
			}
			btn[idx].setForeground(Color.WHITE);
			btn[idx].addActionListener(calculator);
			
			grid_panel.add(btn[idx]);		
				
		}
		grid_panel.setBounds(0,150,500,320);
		
		frm.getContentPane().add(calc_txt);
		frm.getContentPane().add(result_txt);
		frm.getContentPane().add(grid_panel);
		
		frm.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch(e.getActionCommand()) {
		
		case "0":
			total_data += "0";
			calc_txt.setText(total_data);
			break;
		case "1":
			total_data += "1";
			calc_txt.setText(total_data);
			break;
		case "2":
			total_data += "2";
			calc_txt.setText(total_data);
			break;
		case "3":
			total_data += "3";
			calc_txt.setText(total_data);
			break;
		case "4":
			total_data += "4";
			calc_txt.setText(total_data);
			break;
		case "5":
			total_data += "5";
			calc_txt.setText(total_data);
			break;
		case "6":
			total_data += "6";
			calc_txt.setText(total_data);
			break;
		case "7":
			total_data += "7";
			calc_txt.setText(total_data);
			break;
		case "8":
			total_data += "8";
			calc_txt.setText(total_data);
			break;
		case "*":
			total_data += "*";
			calc_txt.setText(total_data);
			break;
		case "/":
			total_data += "/";
			calc_txt.setText(total_data);
			break;
		case "+":
			total_data += "+";
			calc_txt.setText(total_data);
			break;
		case "-":
			total_data += "-";
			calc_txt.setText(total_data);
			break;
		case "CE":
			total_data = "";
			calc_txt.setText("0");
			result_txt.setText("result");
			break;
		case "=":
			if(total_data != null && total_data.length() > 0) {
				int data = calc(total_data);
				result_txt.setText(String.valueOf(data));
			}
			else {
				result_txt.setText("result");
			}
			break;
		default : 
			calc_txt.setText("NO");
			break;
		}
	}


	public static int calc(String input) {
		int idx;
		idx = input.indexOf('+');
		
		if(idx != -1) {
			return calc(input.substring(0, idx)) + calc(input.substring(idx +1));
		}
		else {
			idx = input.indexOf('-');
			if(idx != -1) {
				return calc(input.substring(0, idx)) - calc(input.substring(idx + 1));
			}	
			else {
				idx = input.indexOf('*');
				if(idx != -1) {
					return calc(input.substring(0, idx)) * calc(input.substring(idx + 1));
				}
				else {
					idx = input.indexOf('/');
					if(idx != -1) {
						return calc(input.substring(0, idx)) / calc(input.substring(idx + 1));
					}
				}
			}
		}
		String data = input.trim();
		if(data == null || data.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(data);
				
	
	}
	
	
	
}
		
		

	


