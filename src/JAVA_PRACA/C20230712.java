package JAVA_PRACA;

public class C20230712 {

	

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class Shopping
	 */
	@WebServlet("/main")
	class Shopping extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        response.setContentType("text/html; charset=UTF-8");
	        PrintWriter out = response.getWriter();

	        Connection conn = null;
	        Statement stmt = null;
	        ResultSet rs = null;

	        try {
	            // MySQL 데이터베이스에 연결
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3306/shoppingdb?useUnicode=true&characterEncoding=utf8"; // db_name은 실제 데이터베이스 이름으로 변경해야 함
	            String username = "root"; // 실제 사용자 이름으로 변경해야 함
	            String password = "1234"; // 실제 비밀번호로 변경해야 함
	            conn = DriverManager.getConnection(url, username, password);

	            // SQL 쿼리 실행
	            stmt = conn.createStatement();
	            String sql = "SELECT * FROM tbl_member"; // table_name은 실제 테이블 이름으로 변경해야 함
	            rs = stmt.executeQuery(sql);

	            // 결과 출력
	            while (rs.next()) {
	                String member_id = rs.getString("member_id"); // member_id은 테이블의 열 이름
	                String pw = rs.getString("pw"); // pw은 테이블의 열 이름
	                String name = rs.getString("name"); // name은 테이블의 열 이름
	                String adr_addr = rs.getString("adr_addr"); // adr_addr은 테이블의 열 이름
	                String role = rs.getString("role"); // role은 테이블의 열 이름
	                
	                
	                out.println("member_id: " + member_id + "<br>");
	                out.println("pw: " + pw + "<br>");
	                out.println("name: " + name + "<br>");
	                out.println("adr_addr: " + adr_addr + "<br>");
	                out.println("role: " + role + "<br>");
	                out.println("<br>");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            // 연결, 문장, 결과셋을 닫음
	            try {
	                if (rs != null)
	                    rs.close();
	                if (stmt != null)
	                    stmt.close();
	                if (conn != null)
	                    conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	}

}
