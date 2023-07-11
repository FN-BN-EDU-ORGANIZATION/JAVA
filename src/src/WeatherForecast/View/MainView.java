package WeatherForecast.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import WeatherForecast.ApiExplorer;
import WeatherForecast.Controller.FrontController;

class MainView extends JFrame {
	calendar aa;
	// 컨트롤러 값 추출용 틀
	Set<String> set1;
	Set<String> set2;
	Set<String> set3;
	// 패널
	JPanel panel;
	// 콤보박스
	static JComboBox Combo1;
	static JComboBox Combo2;
	static JComboBox Combo3;

	// 선택된 지역 주소 저장
	static String name1 = null;
	static String name2 = null;
	static String name3 = null;

	// 다음 버튼
	JButton btnNext;

	// -----------------------------------------------------------//
	// 프레임
	JFrame weather;

	// 버튼
	JButton lbBak; // 날씨 버튼 (뒤로가기)
	JButton lbEnd; // 날씨 버튼 (닫기)

	// 이미지
	ImageIcon icn; // 아이콘

	// 레이블
	JLabel lbIcn; // 아이콘
	JLabel lbT1h; // 온도
	JLabel lbPty; // 현재 강수량
	JLabel lbRn1; // 1시간 강수량
	JLabel lbReh; // 습도
	JLabel lbMxy;// 지역

	static String nx;
	static String ny;

	String PTY = null;// 강수상태
	String RN1 = null;// 1시간 강수량
	String REH = null;// 습도
	String T1H = null;// 기온

	public static FrontController FC;


	// -----------------------------------------------------------//

	public MainView() throws Exception {

		super("기상예보");
		//프론트 컨트롤러 연결
		FC = FrontController.getInstance();

		
		setBounds(500, 300, 500, 200);

		// 패널 생성
		panel = new JPanel();
		panel.setLayout(null);


		// 버튼 설정
		btnNext = new JButton("1번");

		// 콤보 ㅠ수박스
		Combo1 = new JComboBox(); // 시
		Combo2 = new JComboBox(); // 군
		Combo3 = new JComboBox(); // 동

		// 콤보 박스 샛팅
		Combo1.setBounds(70, 40, 100, 20);
		Combo2.setBounds(190, 40, 100, 20);
		Combo3.setBounds(310, 40, 100, 20);
		// 콤보박스 초기값 설정
		setUp();
		// 다음 버튼
		btnNext.setBounds(190, 100, 100, 30);
		// 배경색
		Color col = new Color(128, 255, 255);

		

		// 생성
		add(panel);
		panel.setBackground(col);

		panel.add(btnNext);
		panel.add(Combo1);
		panel.add(Combo2);
		panel.add(Combo3);
		
		// 종료 버튼
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		// =========================액션===================================
		Combo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("콤보박스 1 동작");
				String a = (String) Combo1.getSelectedItem();
				name1 = a; //선택된 값을 name1에 저장
				System.out.println("name1 = " + name1);
				//선택된 값을 저장해 컨트롤러를 통해 전달하기위한 맵
				Map<String, Object> cityVal = new HashMap();
				Map<String, Object> countyVal = new HashMap();
				//선택된 값을 맵에 저장
				cityVal.put("city", name1);
				countyVal.put("city", name1);
				countyVal.put("county", name2);
				//처리된 값을 받아온뒤 저장 하기위한 set
				set2 = new HashSet();
				set3 = new HashSet();

				try {
					//맵을 통해 보낸 선택된 값의 처리 결과를 받아와 set에 저장
					set2 = (Set<String>) FC.execute("/Sub", "/county", cityVal).get("result");
					set3 = (Set<String>) FC.execute("/Sub", "/dong", countyVal).get("result");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				//set에 저장된 값을 콤보박스에 적용
				Combo2.setModel(new DefaultComboBoxModel<>(set2.toArray()));
				Combo3.setModel(new DefaultComboBoxModel<>(set3.toArray()));
				//공백인 경우 좌표 검색 오작동 방지를 위해 name1 , name2를 초기화
				name2 = "";
				name3 = "";

			}

		});
		Combo2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("콤보박스 2 동작");
				String a = (String) Combo2.getSelectedItem();
				name2 = a; //선택된 값을 name2에 저장
				System.out.println("name2 = " + name2);
				//선택된 값을 저장해 컨트롤러를 통해 전달하기위한 맵
				Map<String, Object> countyVal = new HashMap();
				//선택된 값을 맵에 저장
				countyVal.put("city", name1);
				countyVal.put("county", name2);
				//처리된 값을 받아온뒤 저장 하기위한 set
				set3 = new HashSet();
				//선택된 값이 공백인지 아닌지에 따라 처리 선택
				if (a.equals("") || a == null) {
					System.out.println("lvl2 if 동작");
					System.out.println("a = " + a);
					try {
						//맵을 통해 보낸 선택된 값의 처리 결과를 받아와 set에 저장
						set3 = (Set<String>) FC.execute("/Sub", "/dong", countyVal).get("result");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//set에 저장된 값을 콤보박스에 적용
					Combo3.setModel(new DefaultComboBoxModel<>(set3.toArray()));
					//공백인 경우 좌표 검색 오작동 방지를 위해 name1 , name2를 초기화
					name2 = "";
					name3 = "";
				} else {
					System.out.println("lvl2 else 동작");
					System.out.println("a = " + a);
					try {
						//맵을 통해 보낸 선택된 값의 처리 결과를 받아와 set에 저장
						set3 = (Set<String>) FC.execute("/Sub", "/dong", countyVal).get("result");
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//set에 저장된 값을 콤보박스에 적용
					Combo3.setModel(new DefaultComboBoxModel<>(set3.toArray()));

				}

			}

		});
		Combo3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("콤보박스 3 동작");
				String a = (String) Combo3.getSelectedItem();
				name3 = a;  //선택된 값을 name3에 저장
				System.out.println("name3 = " + name3);

			}

		});
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(name1!=null) {
					Map<String, Object> coordinateVal = new HashMap();
					coordinateVal.put("city", name1);
					coordinateVal.put("county", name2);
					coordinateVal.put("dong", name3);
					try {
						FC.execute("/Sub", "/coordinate", coordinateVal);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
				WeatherNcst();
				calendar();

			}
		});
		

	}
	public void calendar() {
		if(aa==null)
		aa = new calendar();
	}

	public void WeatherNcst() {
		// 추가 함수
		String a, b, c;
		a = name1;
		b = name2;
		c = name3;

		// 생성
		weather = new JFrame("현제 날씨"); // 날씨 창 프레임
		panel = new JPanel(); // 날씨 창 패널
		panel.setLayout(null);
		btnNext = new JButton("시간별 예보"); // 시간별 예보 버튼
		lbBak = new JButton("뒤로가기"); // 뒤로가기 버튼
		lbEnd = new JButton("닫기"); // 닫기 버튼
		lbIcn = new JLabel(); // 날씨 이미지
		lbMxy = new JLabel(); // 지역
		lbT1h = new JLabel(); // 기온
		lbPty = new JLabel(); // 강수량
		lbReh = new JLabel(); // 습도


		
		// 실행 코드
		// X Y 좌표 값
	
			//API에 좌표값 입력 코드

		Map<String ,Object> ncst=new HashMap<>();
		try {
			ncst=FC.execute("/Sub", "ncst", null);
		} catch (SQLException e) {
			e.printStackTrace();
		}


			PTY = (String) ncst.get("PTY");//강수상태
			RN1 = (String) ncst.get("RN1");//1시간 강수량
			REH = (String) ncst.get("REH");//습도
			T1H = (String) ncst.get("T1H");//기온




		// 날씨 코드

			if (PTY.equals("0")) {
				icn = new ImageIcon("0.png");
			} else if (PTY.equals("1")) {
				icn = new ImageIcon("1.png");
			} else if (PTY.equals("2")) {
				icn = new ImageIcon("2.png");
			} else if (PTY.equals("3")) {
				icn = new ImageIcon("3.png");
			} else if (PTY.equals("4")) {
				icn = new ImageIcon("4.png");
			} else if (PTY.equals("5")) {
				icn = new ImageIcon("5.png");
			} else if (PTY.equals("6")) {
				icn = new ImageIcon("6.png");
			} else if (PTY.equals("7")) {
				icn = new ImageIcon("7.png");
			}


		Image sunIcon = icn.getImage();
		Image PxImge = sunIcon.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon pxIcon = new  ImageIcon(PxImge);
		lbIcn.setIcon(pxIcon);
		
		// 지역 코드
		if (name2 == "") {
			b = "";
			c = "";
		} else if (b == null) {
			b = "";
		} else {
			b = name2;
		}

		if (name3 == "") {
			c = "";
		} else if (c == null) {
			c = "";
		} else {
			c = name3;
		}
		
	//Text
		//지역
		lbMxy.setText(a + " " + b + " " + c);
		// 기온
		lbT1h.setText("기온:" + T1H + " ℃");
		// 강수량
		lbPty.setText("강수량:" + RN1 + " mm");
		// 습도
		lbReh.setText("습도:" + REH + " %");

		// 위치,사이즈
		weather.setBounds(700, 200, 400, 550);
		lbBak.setBounds(80, 400, 100, 30);
		lbEnd.setBounds(90, 450, 200, 30);
		btnNext.setBounds(200, 400, 100, 30);
		lbMxy.setBounds(50, -120, 300, 300);
		lbT1h.setBounds(100, 80, 200, 300);
		lbPty.setBounds(100, 160, 200, 300);
		lbReh.setBounds(100, 120, 200, 300);
		lbIcn.setBounds(140,80,100,100);
		
		// 폰트
		lbMxy.setFont(new Font("NanumGothic", Font.BOLD, 20));
		lbT1h.setFont(new Font("NanumGothic", Font.BOLD, 30));
		lbPty.setFont(new Font("NanumGothic", Font.BOLD, 30));
		lbReh.setFont(new Font("NanumGothic", Font.BOLD, 30));
	
		
		
		// 가운대 정렬
		lbMxy.setHorizontalAlignment(SwingConstants.CENTER);
		lbT1h.setHorizontalAlignment(SwingConstants.CENTER);
		lbPty.setHorizontalAlignment(SwingConstants.CENTER);
		lbReh.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		// 실행
		panel.add(lbIcn);
		panel.add(lbEnd);
		panel.add(lbBak);
		panel.add(btnNext);
		panel.add(lbT1h, BorderLayout.CENTER);
		panel.add(lbPty, BorderLayout.CENTER);
		panel.add(lbReh, BorderLayout.CENTER);
		panel.add(lbMxy, BorderLayout.CENTER);
		
		weather.add(panel);
		 
		
		// 종료 설정
		weather.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		weather.setVisible(true);
		
		// 날씨 창 ( 닫기, 뒤로가기) 이벤트	
	//~=============================(액션)==============================~//
		lbEnd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.exit(0);

			}
		});
		lbBak.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				weather.setVisible(false); // 창 안보이게 하기

			}
		});

//		btnNext.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				WeatherFcst();
//
//			}
//		});

	}
	//콤보 박스의 초기값을 지정하는 메서드
	public void setUp() throws SQLException {
		name1 = "대구광역시"; //초기값을 name1에 저장
		//초기값을 저장해 컨트롤러를 통해 전달하기위한 맵
		Map<String, Object> cityVal = new HashMap();
		//초기값을 맵에 저장
		cityVal.put("city", name1);
		//초기값을 받아온뒤 저장 하기위한 set
		set1 = new HashSet();
		set2 = new HashSet();
		//맵을 통해 보낸 초기값의 처리 결과를 받아와 set에 저장
		set1 = (Set<String>) FC.execute("/Sub", "/city", null).get("result");
		set2 = (Set<String>) FC.execute("/Sub", "/county", cityVal).get("result");
		//set에 저장된 값을 콤보박스에 적용
		Combo1.setModel(new DefaultComboBoxModel<>(set1.toArray()));
		//콤보박스의 리스트중 디폴트로 지정될 값(대구광역시(10))의 인덱스 지정
		Combo1.setSelectedIndex(10);
		Combo2.setModel(new DefaultComboBoxModel<>(set2.toArray()));
		Combo3.setModel(new DefaultComboBoxModel<>());
	}

	public static void main(String[] args) throws Exception {
		new MainView();
	}
}
