package WeatherForecast.Domain.Common.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import WeatherForecast.Domain.Common.Dto.CalendarDto;

public class CalendarDao {
	
	// DB정보
	private String id = "root";
	private String pw = "1234";
	private String url = "jdbc:mysql://localhost:3306/weather";
	//Connection을 사용하여 데이터베이스에 대한 연결을 생성하고, 
	//SQL 문을 실행하고, 결과를 검색할 수 있습니다.
	private Connection conn; 
	
	//PreparedStatement를 사용하면 SQL 문에 동적으로 값을 바인딩하여 실행할 수 있습니다.
	private PreparedStatement pstmt;
	
	//ResultSet은 SQL 문의 실행 결과를 나타내는 인터페이스입니다. 
	//사용하여 데이터베이스에서 검색된 결과를 가져올 수 있습니다
	//테이블의 행을 순회하면서 데이터에 접근할 수 있는 메서드와 속성을 제공합니다.
	private ResultSet rs;
	
	
	
	// JDBC참조변수
	private Connection DBcon = null; // DB연결용 참조변수
	private PreparedStatement DBprepar = null; // SQL쿼리 전송용 참조변수
	private ResultSet DBresult = null; // SQL쿼리 결과(SELECT결과) 수신용 참조변수
	
	
	private static CalendarDao Instance;
	public static CalendarDao getInstance(){
		if(Instance==null)
			Instance = new CalendarDao();
		return Instance;
	}
	
	//데이터 베이스 연결
	public CalendarDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loading Success..");
			DBcon = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..");
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	

	
	
	
	//CRUD
	//Select() 전체정보조회
	public List<CalendarDto> Select()throws Exception{
		List<CalendarDto> list = new ArrayList();//dto의 ArrayList를만들어 list 객체에 ~
		CalendarDto dto = null;
		pstmt=conn.prepareStatement("select * from tbl_calendar");
		rs=pstmt.executeQuery();
		if(rs!=null)
		{
			while(rs.next()) {
				dto=new CalendarDto();
				dto.setMemo(rs.getString("memo"));//게터세터의 
				dto.setId(rs.getInt("id"));
				dto.setDate(rs.getDate("data"));
				list.add(dto);
			}
			rs.close();
		}
		pstmt.close();
		return list;
	}


		
		
		
	//Insert  dto에서 가져온다
	public int Insert(CalendarDto dto) throws Exception {
		pstmt = conn.prepareStatement("INSERT INTO tbl_calendar (id,memo,date");
		pstmt.setInt(1,dto.getId());
		pstmt.setString(2,dto.getMemo());
		pstmt.setDate(3, dto.getDate());
		int result =pstmt.executeUpdate();
		pstmt.close();
		return result;
		}
	
	
	//Update
	public int Update(CalendarDto dto)throws Exception {
		pstmt=conn.prepareStatement("update tbl_calendar set id=?,Memo=?,date=?");
		pstmt.setInt(1, dto.getId());
		pstmt.setString(2, dto.getMemo());
		pstmt.setDate(3, dto.getDate());
		int result = pstmt.executeUpdate();
		pstmt.close();
		return result;
		
		
	}
	
	//Delete
	public int Delete(int id) throws Exception{
		pstmt=conn.prepareStatement("delete from tbl_book where bookcode=?");
		pstmt.setInt(1, id);
		int result=pstmt.executeUpdate();
		pstmt.close();
		return result;
		
	}
	
	
	
	
	
}
