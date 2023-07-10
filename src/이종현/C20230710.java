package 이종현;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C20230710 {
	// 의문점 : 이해안했던 점 적기
	// 정리 : 코드에 대한 전반적인 정리/해석

	// 예제 1
	//이미지 아이콘으로 이용해서 값이 변경 되면 for 안에 있는 값도 같이 밖끼 게금 해보려고 하가기 위해서 
	//이용 해봤습니다. 처음 if문으로 이용해 갑이 전달댈때 이용된 값이 밖뀌면서 pxIcon으로 
	//for 문 안에 들어가 잇는 FcIcn 배열로 이용해서 만든 다음 여러창을 나타 내고 크기도 각각 나타 내게 했습니다.
//	JLabel[] FcIcn = new JLabel[6];
//	if (FC.ncst.get("PTY").equals("0")) {
//		icn = new ImageIcon("0.png");
//	} else if (FC.ncst.get("PTY").equals("1")) {
//		icn = new ImageIcon("1.png");
//	} else if (FC.ncst.get("PTY").equals("2")) {
//		icn = new ImageIcon("2.png");
//	} else if (FC.ncst.get("PTY").equals("3")) {
//		icn = new ImageIcon("3.png");
//	} else if (FC.ncst.get("PTY").equals("4")) {
//		icn = new ImageIcon("4.png");
//	} else if (FC.ncst.get("PTY").equals("5")) {
//		icn = new ImageIcon("5.png");
//	} else if (FC.ncst.get("PTY").equals("6")) {
//		icn = new ImageIcon("6.png");
//	} else if (FC.ncst.get("PTY").equals("7")) {
//		icn = new ImageIcon("7.png");
//	}
//
//	Image sunIcon = icn.getImage();
//	Image PxImge = sunIcon.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
//	ImageIcon pxIcon = new  ImageIcon(PxImge);
//	
//	for(int j=0;j<6;j++) {
//		FcIcn[j] = new  JLabel(pxIcon);
//		if(j==0) {
//			FcIcn[0].setBounds(10,10,80,100);
//		}else {
//		FcIcn[j].setBounds(10,100*j,80,100);
//		}
//		panel.add(FcIcn[j]);
//	}
	
	
	// 예제 2
	//JLabel을 배열로 이용해서 나타 낸 것입니다. 현채 팀 프로젝트에 나타낸 기후 날씨를 
	//단기 예보를 나타 내기위해 시간대 별로 나오면 여러창을 간소화 하기위해 반복문으로 이용해서
	//여러 창과 크기등 for문으로 이용했습니다.
//	JLabel[] FcT1h = new JLabel[6];
//	JLabel[] FcPty = new JLabel[6];
//	JLabel[] FcReh = new JLabel[6];
//	for(int i=0;i<6;i++) {
//		FcT1h[i] = new JLabel();
//		FcPty[i] = new JLabel();
//		FcReh[i] = new JLabel();
//		
//		// 기온
//		FcT1h[i].setText("기온:" + FC.ncst.get("T1H") + " ℃");
//		// 강수량
//		FcPty[i].setText("강수량:" + FC.ncst.get("RN1") + " mm");
//		// 습도
//		FcReh[i].setText("습도:" + FC.ncst.get("REH") + " %");
//		
//		if(i==0) {
//			FcT1h[0].setBounds(100,10,150,60);
//		}else {
//		FcT1h[i].setBounds(100,100*i,150,60);
//		}
//		
//		if(i==0) {
//			FcPty[0].setBounds(100,30,150,60);
//		}else {
//		FcPty[i].setBounds(100,100*i+20,150,60);
//		}
//		
//		if(i==0) {
//			FcReh[0].setBounds(100,50,150,60);
//		}else {
//		FcReh[i].setBounds(100,100*i+40,150,60);
//		}
//	}
}
