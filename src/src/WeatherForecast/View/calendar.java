	package WeatherForecast.View;
	
	import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
	
	public class calendar extends JFrame {
		// DB정보
			private String id = "root";
			private String pw = "1234";
			private String url = "jdbc:mysql://localhost:3306/weather";
			
			// JDBC참조변수
			private Connection DBcon = null; // DB연결용 참조변수
			private PreparedStatement DBprepar = null; // SQL쿼리 전송용 참조변수
			private ResultSet DBresult = null; // SQ
	    JLabel month;
	    JLabel[] dayLabels;
	    JLabel[] dateLabels;
	    LocalDate currentDate; // 인스턴스 변수 추가
	    //
	    JTextArea[] textAreas;
	    //캘린더 생성자
	    calendar() {
	        super("Calendar"); // 프레임창 제목
	        JPanel panel = new JPanel(); // 패널 생성
	        setBounds(100, 100, 1500, 450); // 프레임 창 사이즈
	        panel.setLayout(null); // 레이아웃 매니저를 null로 설정하여 수동으로 위치 지정
	
	        // 버튼 생성
	        JButton prev = new JButton("◀ PREV");
	        JButton next = new JButton("NEXT ▶");
	        
	        // 버튼 추가
	        this.add(prev);
	        this.add(next);
	        
	        // 버튼 위치
	        prev.setBounds(400, 15, 100, 50);
	        next.setBounds(1000, 15, 100, 50);
	
	        // 텍스트 라벨(날짜,요일) 생성
	        month = new JLabel();
	        dayLabels = new JLabel[7];
	        dateLabels = new JLabel[7];
	        
	        // 라벨 7번 반복 및 추가
	        this.add(month);
	        for (int i = 0; i < 7; i++) {
	            dayLabels[i] = new JLabel();
	            dateLabels[i] = new JLabel();
	           
	            this.add(dayLabels[i]);
	            this.add(dateLabels[i]);
	        }
	        // 라벨 Font
	        currentDate = LocalDate.now(); // 현재 날짜로 currentDate 초기화
	        month.setText(getCurrentMonth());
	        month.setFont(new Font("NanumGothic", Font.BOLD, 50));
	        for (int i = 0; i < 7; i++) {
	            dayLabels[i].setText(getDayOfWeek(i));
	            dayLabels[i].setFont(new Font("NanumGothic", Font.BOLD, 20));
	            dateLabels[i].setText(getDate(i) + "일, ");
	            dateLabels[i].setFont(new Font("NanumGothic", Font.BOLD, 20));
	        }
	        // 라벨 위치
	        month.setBounds(700, 20, 100, 50);
	        dayLabels[0].setBounds(70, 100, 150, 50);
	        dayLabels[1].setBounds(280, 100, 150, 50);
	        dayLabels[2].setBounds(490, 100, 150, 50);
	        dayLabels[3].setBounds(700, 100, 150, 50);
	        dayLabels[4].setBounds(900, 100, 150, 50);
	        dayLabels[5].setBounds(1110, 100, 150, 50);
	        dayLabels[6].setBounds(1320, 100, 150, 50);
	
	        dateLabels[0].setBounds(20, 100, 150, 50);
	        dateLabels[1].setBounds(220, 100, 150, 50);
	        dateLabels[2].setBounds(430, 100, 150, 50);
	        dateLabels[3].setBounds(640, 100, 150, 50);
	        dateLabels[4].setBounds(850, 100, 150, 50);
	        dateLabels[5].setBounds(1060, 100, 150, 50);
	        dateLabels[6].setBounds(1270, 100, 150, 50);
	
	        // 크기7의 텍스트영역 배열 생성
	        textAreas = new JTextArea[7];
	
	        // 텍스트 영역 생성 및 추가
	        for (int i = 0; i < 7; i++) {
	            textAreas[i] = new JTextArea("메모를 입력하세요");
	            this.add(textAreas[i]);
	        }
	
	        // 텍스트 영역 위치 설정
	        int x = 10;
	        for (int i = 0; i < 7; i++) {
	            textAreas[i].setBounds(x, 150, 200, 250);
	            x += 210;
	        }
	        
	        // prev(이전) 버튼 액션 구현 (버튼이 클릭되었을때 이벤트실행)
	        prev.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                currentDate = currentDate.minusWeeks(1); // 1주 전 날짜로 변경
	
	                // 변경된 날짜에 맞게 라벨들과 텍스트 영역들을 업데이트
	                month.setText(getCurrentMonth());
	                for (int i = 0; i < 7; i++) {
	                    dayLabels[i].setText(getDayOfWeek(i));
	                    dateLabels[i].setText(getDate(i) + "일, ");
	                    textAreas[i].setText("메모를 입력하세요"); // 이전 주의 내용 초기화
	                }
	            }
	        });
	        // next(다음) 버튼 액션 구현
	        next.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                currentDate = currentDate.plusWeeks(1); // 1주 후 날짜로 변경
	
	                // 변경된 날짜에 맞게 라벨들과 텍스트 영역들을 업데이트
	                month.setText(getCurrentMonth());
	                for (int i = 0; i < 7; i++) {
	                    dayLabels[i].setText(getDayOfWeek(i));
	                    dateLabels[i].setText(getDate(i) + "일, ");
	                    textAreas[i].setText("메모를 입력하세요"); // 다음 주의 내용 초기화
	                }
	            }
	        });
	
	        // 프레임에 패널 추가
	        add(panel);
	
	        currentDate = LocalDate.now(); // 현재 날짜 설정
	        setVisible(true);
	        // 내 프로그램을 닫는 기능을 닫기버튼으로 설정
	        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        
	        this.addWindowListener(new WindowAdapter() {
	            @Override
	            public void windowClosing(WindowEvent e) {
	                // 프레임 닫기 이벤트 발생 시 실행될 코드를 작성합니다.
	                // 예를 들어, 종료 확인 대화상자를 표시하거나 데이터를 저장하는 등의 동작을 수행할 수 있습니다.
	                
	                // 프레임을 닫을 때 추가로 처리해야 할 작업을 여기에 작성합니다.
	                System.out.println("종료종료");
	                
	                //모든 메모장에 있는 메모내용을 FrontController로 전달하면 저장요청
	                //MainView.FC;
	                
	                
	                
	                // 프레임 종료
	               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                
	                // 또는 프로그램 전체 종료
	                // System.exit(0);
	            }
	        });
	        
	        
	    }
	
	    // 현재 월을 문자열로 반환하는 함수
	    private String getCurrentMonth() {
	        int month = currentDate.getMonthValue();
	        return month + "월";
	    }
	
	    // 현재 요일의 날짜를 반환하는 함수
	    private int getDate(int dayIndex) {
	        int currentDayOfWeek = currentDate.getDayOfWeek().getValue();
	        int offset = dayIndex - currentDayOfWeek + 1;
	        LocalDate targetDate = currentDate.plusDays(offset);
	        return targetDate.getDayOfMonth();
	    }
	
	    // 요일을 반환하는 함수
	    private String getDayOfWeek(int dayIndex) {
	        int currentDayOfWeek = currentDate.getDayOfWeek().getValue();
	        int offset = dayIndex - currentDayOfWeek + 1;
	        LocalDate targetDate = currentDate.plusDays(offset);
	        return targetDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN);
	    }

	 // DB에 텍스트 저장하는 메소드
	 private void saveTextToDB(String text) {
	     try {
	         // 데이터베이스 연결
	         Connection conn = DriverManager.getConnection(url, id, pw);

	         // INSERT 쿼리 작성
	         String sql = "INSERT INTO mytable (text_column) VALUES (?)";
	         PreparedStatement statement = conn.prepareStatement(sql);
	         statement.setString(1, text);

	         // 쿼리 실행
	         int rowsInserted = statement.executeUpdate();
	         if (rowsInserted > 0) {
	             System.out.println("텍스트 입력이 DB에 저장되었습니다.");
	         } else {
	             System.out.println("텍스트 입력 저장에 실패했습니다.");
	         }

	         // 리소스 정리
	         statement.close();
	         conn.close();
	     } catch (SQLException ex) {
	         ex.printStackTrace();
	     }
	 }
	
	}
	public class DBclass {
	    // DB정보
	    private String id = "root";
	    private String pw = "1234";
	    private String url = "jdbc:mysql://localhost:3306/weather";
	    
	    // JDBC참조변수
	    private Connection DBcon = null; // DB연결용 참조변수
	    private PreparedStatement DBprepar = null; // SQL쿼리 전송용 참조변수
	    private ResultSet DBresult = null; // SQL쿼리 결과(SELECT결과) 수신용 참조변수
	
	   
	
	    // 데이터 베이스 연결
	    private DBclass() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver Loading Success..");
	            DBcon = DriverManager.getConnection(url, id, pw);
	            System.out.println("DB Connected..");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	    // Other methods for database operations
	    
	    // ...
	}
		
