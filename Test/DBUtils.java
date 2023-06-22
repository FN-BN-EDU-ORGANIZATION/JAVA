package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class DBUtils extends GUI{

	// 연결정보 저장용 변수
		private String id = "root";
		private String pw = "1234";
		private String url = "jdbc:mysql://localhost:3306/tempdb";
				
		// JDBC 참조변수
		private Connection conn = null;			// DB연결용 참조변수
		private PreparedStatement pstmt = null;	// SQL 쿼리 전송용 참조변수
		private ResultSet rs = null;			// SQL 쿼리 결과(Select 결과) 수신용 참조변수
	
	public DBUtils()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");		// 드라이버 적제
			System.out.println("Driver Loading Success");
			conn = DriverManager.getConnection(url,id,pw);
			System.out.println("DB Connected");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public void InsertData(String contents)
	{
		try {
            pstmt = conn.prepareStatement("insert into tbl_memo values(null,?,now())");
            pstmt.setString(1, contents);
            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("Insert Success");
            } else {
                System.out.println("Insert Failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
	}
	
	public ResultSet selectData() {
        try {
            pstmt = conn.prepareStatement("select * from tbl_memo");
            rs = pstmt.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            closeResources();
        }
        
        return null;
    }
		
	public void updateData(int no, String contents) {
        try {
            pstmt = conn.prepareStatement("Update tbl_memo set contents = ?, regdate = now() where no = ?");
            pstmt.setString(1, contents);
            pstmt.setInt(2, no);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("Update Success");
            } else {
                System.out.println("Update Failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }
	
	public void deleteData(int no) {
        try {
            pstmt = conn.prepareStatement("Delete from tbl_memo where no = ?");
            pstmt.setInt(1, no);

            int result = pstmt.executeUpdate();
            if (result > 0) {
                System.out.println("Delete Success");
            } else {
                System.out.println("Delete Failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResources();
        }
    }
	
	private void closeResources() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
