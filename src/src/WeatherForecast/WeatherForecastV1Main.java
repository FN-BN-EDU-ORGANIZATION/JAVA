//pstmt.close();
//conn.close();
package WeatherForecast;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;

class DBSelector{
	// DB정보
	static String id = "root";
	static String pw = "1234";
	static String url = "jdbc:mysql://localhost:3306/weather";
	
	// JDBC참조변수
	static Connection DBcon = null; // DB연결용 참조변수
	static PreparedStatement DBprepar = null; // SQL쿼리 전송용 참조변수
	static ResultSet DBresult = null; // SQL쿼리 결과(SELECT결과) 수신용 참조변수
	

	
	//주소 검색 결과를 저장하는 리스트
	static Set<String> set1 = null;
	static Set<String> set2 = null;
	static Set<String> set3 = null;
	
	//좌표값을 저장하는 변수
	static String NX;
	static String NY;
	
	//데이터 베이스 연결
	public static void DBConnector() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이브 적재
		System.out.println("Driver Loading Success..");
		DBcon = DriverManager.getConnection(url, id, pw);
		System.out.println("DB Connected..");
	}
	
	public static void DBclose() throws SQLException {
		DBprepar.close();
		DBresult.close();
	}
	
	//무슨 시 인지 검색
	public static Set<String> selectNamesLevel1() throws SQLException {

		DBprepar = DBcon.prepareStatement("select 1단계 from tbl_api group by 1단계");
		DBresult = DBprepar.executeQuery();
		set1 = new HashSet();
		if (DBresult != null) {
			while (DBresult.next()) {
				set1.add(DBresult.getString("1단계"));
			}
			System.out.println(set1);
			DBclose();
		}
		return set1;
	}
	
	
	//무슨 구 인지 검색
	public static Set<String> selectNamesLevel2(String a) throws SQLException {
		set2 = new HashSet();
		if (a != null&&!a.equals("")) {
			DBprepar = DBcon.prepareStatement("select 2단계 from tbl_api where 1단계 =?;");
			DBprepar.setString(1, a);
			DBresult = DBprepar.executeQuery();

			if (DBresult != null) {
				while (DBresult.next()) {
					set2.add(DBresult.getString("2단계"));
				}
				DBclose();
				System.out.println(set2);
			}
			return set2;
		} else {
			DBclose();
			set2.add("");
			return set2;
		}
	}
	
	
	//무슨 동 인지 검색
	public static Set<String> selectNamesLevel3(String a,String b) throws SQLException {
		set3 = new HashSet();
		if (a != null&&!a.equals("")) {
			DBprepar = DBcon.prepareStatement("select 3단계 from tbl_api where 1단계 =? and 2단계 = ?;");
			DBprepar.setString(1, a);
			DBprepar.setString(2, b);
			DBresult = DBprepar.executeQuery();

			if (DBresult != null) {
				while (DBresult.next()) {
					set3.add(DBresult.getString("3단계"));
				}
				System.out.println(set3);
				DBclose();
			}
			return set3;
		} else {
			DBclose();
			set3.add("");
			return set3;
		}

	}
	//좌표값 생성기
	public static void getcoordinate(String a,String b,String c) throws SQLException {
		DBprepar = DBcon.prepareStatement("select * from tbl_api where 1단계 =? and 2단계=? and 3단계 =?");
		DBprepar.setString(1, a);
		if(b!=null&&!b.equals("")) {
		DBprepar.setString(2, b);	
		}else {
		DBprepar.setString(2, "");
		}
		if(c!=null&&!c.equals("")) {
		DBprepar.setString(3, c);
		}else {
		DBprepar.setString(3, "");
		}
		DBresult = DBprepar.executeQuery();
		if(DBresult != null) {
			DBresult.next();
				NX=DBresult.getString("격자 X");
				NY=DBresult.getString("격자 Y");
				System.out.println(NX);
				System.out.println(NY);
				DBclose();
				
		}
		
	}
}



class MainRun extends JFrame implements ActionListener {
	//콤보박스
	static JComboBox Combo1;
	static JComboBox Combo2;
	static JComboBox Combo3;
	//DBSelector 클레스 연결
	static DBSelector DBS;
	
	//선택된 지역 주소 저장
	static String name1 = null;
	static String name2 = null;
	static String name3 = null;
	
	

	JButton btn1;
	JButton btn2;
	
	//이벤트 날씨창 
	
	JFrame weather;
	
	JButton lb00; // 날씨 버튼 (뒤로가기)
	JButton lb01; // 날씨 버튼 (닫기)
	ImageIcon icn; // 아이콘
	JLabel lb02; // 아이콘
	JLabel lb03; // 온도
	JLabel lb04; // 현재 강수량
	JLabel lb05; // 1시간 강수량
	JLabel lb06; // 습도
	JLabel lb07;// 지역

	//좌표값 (x, y)
	
	static String nx;
	static String ny;

	String PTY=null;//강수상태
	String RN1=null;//1시간 강수량
	String REH=null;//습도
	String T1H=null;//기온

	MainRun() throws Exception {
		super("기상예보");
		setBounds(500, 300, 500, 200);

		
		// 패널
		JPanel panel = new JPanel();
		panel.setLayout(null);

			
		//콤버 박스 생성 
		DBSelector DBS = new DBSelector();
		DBS.DBConnector();


		//지역

		//시
		Combo1 = new JComboBox();
		Combo1.setBounds(70,40,100,20);
		//군
		Combo2 = new JComboBox();
		Combo2.setBounds(190,40,100,20);
		//동
		Combo3 = new JComboBox();
		Combo3.setBounds(310,40,100,20);
		
		//초기값 설정
		Combo1.setModel(new DefaultComboBoxModel<>(DBS.selectNamesLevel1().toArray()));
		Combo1.setSelectedIndex(10);
		name1 = "대구광역시";
		Combo2.setModel(new DefaultComboBoxModel<>(DBS.selectNamesLevel2(name1).toArray()));
		Combo3.setModel(new DefaultComboBoxModel<>());






		//=========================액션===================================
		Combo1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("콤보박스 1 동작");
				String a = (String) Combo1.getSelectedItem();
				name1 = a;
				System.out.println("name1 = "+name1);
				try {
					Combo2.setModel(new DefaultComboBoxModel<>(DBS.selectNamesLevel2(name1).toArray()));
					Combo3.setModel(new DefaultComboBoxModel<>(DBS.selectNamesLevel3(name1,name2).toArray()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				name2 = "";
				name3 = "";
			}
		});
		Combo2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("콤보박스 2 동작");
				String a = (String) Combo2.getSelectedItem();
				name2 = a;
				System.out.println("name2 = "+name2);
				if(a.equals("")||a==null) {
					System.out.println("lvl2 if 동작");
					System.out.println("a = "+a);
					try {
						Combo3.setModel(new DefaultComboBoxModel<>(DBS.selectNamesLevel3(name1,name2).toArray()));
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					name2 = "";
					name3 = "";
				}else {
					System.out.println("lvl2 else 동작");
					System.out.println("a = "+a);
				try {
					Combo3.setModel(new DefaultComboBoxModel<>(DBS.selectNamesLevel3(name1,name2).toArray()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
				
			}
		});
		Combo3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String a = (String) Combo3.getSelectedItem();
				System.out.println("콤보박스 3 동작");
				name3 = a;
				System.out.println("name3 = "+name3);
			}
		});





		// 버튼 설정
		btn1 = new JButton("1번");
		btn1.setBounds(190,100,100,30);	
		btn1.addActionListener(this);
		


		
		
		// 배경색
		Color col = new Color(128, 255, 255);
		panel.setBackground(col);
	
		
		//생성
		add(panel);
		panel.add(Combo1);
		panel.add(Combo2);
		panel.add(Combo3);
		panel.add(btn1);
		

		// 종료 버튼
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	//&&name2!=null&&name3!=null
	//날씨 창
	@Override
	public void actionPerformed(ActionEvent e) {
		//-----------------------------------------------
		if(name1!=null) {
			try {
				DBS.getcoordinate(name1, name2, name3);
				this.nx=DBSelector.NX;
				this.ny=DBSelector.NY;
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}


		//API에 좌표값 입력

		ApiExplorer weatherAPI=new ApiExplorer();
		try {
			weatherAPI.ApiExplorer(nx, ny);
			PTY=weatherAPI.PTY;//강수상태
			RN1=weatherAPI.RN1;//1시간 강수량
			REH=weatherAPI.REH;//습도
			T1H=weatherAPI.T1H;//기온
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
		
		//----------------------------------------------
			
			//날씨 창 프레임
			weather = new JFrame("현제 날씨");
			weather.setBounds(700,200,400,550);
			weather.setLayout(null);
			
			//날씨 창 패널
			JPanel pane1 =new JPanel();
			
			//날씨 창 배경색
			Color col = new Color(128, 255, 255);
			pane1.setBackground(col);
		
			
			//버튼
			lb00 =new JButton("뒤로가기");
			lb00.setBounds(80,400,100,30);
			
			lb01=new JButton("닫기");
			lb01.setBounds(210,400,100,30);

			
			//날씨 이미지
			lb02=new JLabel();

		if (PTY.equals("0")){
			icn = new ImageIcon("0.png");
		}else if (PTY.equals("1")){
			icn = new ImageIcon("1.png");
		}else if (PTY.equals("2")){
			icn = new ImageIcon("2.png");
		}else if (PTY.equals("3")){
			icn = new ImageIcon("3.png");
		}else if (PTY.equals("4")){
			icn = new ImageIcon("4.png");
		}else if (PTY.equals("5")){
			icn = new ImageIcon("5.png");
		}else if (PTY.equals("6")){
			icn = new ImageIcon("6.png");
		}else if (PTY.equals("7")){
			icn = new ImageIcon("7.png");
		}
			Image sunIcon = icn.getImage();

			Image PxImge = sunIcon.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			ImageIcon pxIcon = new  ImageIcon(PxImge);

			lb02.setIcon(pxIcon);
			lb02.setBounds(150,20,200,200);
			
			
			//Font
			//지역
			lb07=new JLabel();
			String a,b,c;
            a= name1;
            b= name2;
            c= name3;

            if(name2=="") {
                b="";
                c="";
            }else if(b==null) {
                b="";
            }else {
                b= name2;
            }


            if(name3=="") {
                c="";
            }else if(c==null) {
                c="";
            }else {
                c= name3;
            }

            lb07.setBounds(10, -120, 300, 300);

            lb07.setText(a+" "+b+" "+c);

            lb07.setFont(new Font("NanumGothic", Font.BOLD, 20));
            lb07.setHorizontalAlignment(SwingConstants.CENTER);

			//기온
			lb03=new JLabel();
			lb03.setBounds(100, 80, 200, 300);
			lb03.setText("기온:"+T1H+" ℃");
			lb03.setFont(new Font("NanumGothic", Font.BOLD, 30));
			lb03.setHorizontalAlignment(SwingConstants.CENTER); // 가운대 지정
			
			//강수량
			lb04=new JLabel();
			lb04.setBounds(100, 160, 200, 300);
			lb04.setText("강수량:"+RN1+" mm");
			lb04.setFont(new Font("NanumGothic", Font.BOLD, 30));
			lb04.setHorizontalAlignment(SwingConstants.CENTER); // 가운대 지정
			//습도
			lb05=new JLabel();
			lb05.setBounds(100, 120, 200, 300);
			lb05.setText("습도:"+REH+" %");
			lb05.setFont(new Font("NanumGothic", Font.BOLD, 30));
			lb05.setHorizontalAlignment(SwingConstants.CENTER); // 가운대 지정
			
			
			//생성
			weather.add(pane1);
			weather.add(lb00);
			weather.add(lb01);
			weather.add(lb02);
			weather.add(lb03, BorderLayout.CENTER);
			weather.add(lb04, BorderLayout.CENTER);
			weather.add(lb05, BorderLayout.CENTER);
			weather.add(lb07, BorderLayout.CENTER);
			
			
			
			//날씨 창 닫기 이벤트
			weather.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			weather.setVisible(true);
			 setVisible(false); // 창 안보이게 하기 
			 
			lb01.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					 System.exit(0);
					 
				}
			});
			
			lb00.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					
					
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					setVisible(true);
					weather.setVisible(false); // 창 안보이게 하기
				
				}
			});
				
		

		
	}
	

}

public class WeatherForecastV1Main {

	public static void main(String[] args) throws Exception {
		
		
		new MainRun();

	}

}