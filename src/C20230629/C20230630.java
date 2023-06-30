package C20230629;

import java.util.Scanner;

public class C20230630 {
	public static void main(String[] args) {

		//의문점		: 예외처리할때 throws Exception, try-catch가 단지 구간(범위)의 차이인지
//					  아니면 좀더 다른성격의 차이가 있는지 궁금합니다.
		//정리 : MVC 복습
		
		
		//예제 1
		
//			public int insert(BookDto dto) throws Exception{
//			pstmt=conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
//			북테이블에 도서 정보를 SQL문을 사용하여 insert
		
//			pstmt.setInt(1, dto.getBookcode());					
//			pstmt.setString(2, dto.getBookname());
//			pstmt.setString(3,dto.getPublisher());
//			pstmt.setString(4, dto.getIsbn());
//			매겨변수에 도서 코드를 설정, dto에서 도서코드를 가져옴.
		
//			int result=pstmt.executeUpdate();
//			SQL문을 실행하여 도서정보들을 데이터베이스에 저장
		
//			pstmt.close();
//			pstmt를 닫음
		
//			return result;
//			삽입된 도서정보 반환
//			
//		}
		// 
//		
//		public List<BookDto> select() throws Exception{
//			List<BookDto> list = new ArrayList();
//			ArrayList를 사용하여 BookDto객체를 저장하는 list 변수 선언
			
//			BookDto dto=null;
//			pstmt=conn.prepareStatement("select * from tbl_book");
//			book 테이블에서 전체를 지정
			
//			rs=pstmt.executeQuery();
//			SQL문 실행하여 결과 가져옴
			
//			if(rs!=null)
//			{
//				while(rs.next()) {
//					dto=new BookDto();
//					dto.setBookcode(rs.getInt("bookcode"));
//					dto.setBookname(rs.getString("bookname"));
//					dto.setPublisher(rs.getString("publisher"));
//					dto.setIsbn(rs.getString("isbn"));
//					list.add(dto);
//				}
//			if : rs이 null 아닌지 확인
//			while : 결과에 더이상 행이 없을때 까지 반복 또 반복
//			dto : 각 열의 값을 가져와서 설정
//			list : Bookdto를 list에 추가
			
//				rs.close();
//			}
//			pstmt.close();
//				
//			return list;
//		}
//		public BookDto select(int bookcode) throws Exception{
//			 
//			BookDto dto=null;
//			bookdto 객체 초기화
			
//			pstmt=conn.prepareStatement("select * from tbl_book where bookcode=?");
//			bookcode 정보를 조회
			
//			pstmt.setInt(1, bookcode);
//			rs=pstmt.executeQuery();
//			SQL문 실행하여 결과 가져옴
			
//			if(rs!=null&& rs.isBeforeFirst())
//			{
//					rs.next();
//					dto=new BookDto();
//					dto.setBookcode(rs.getInt("bookcode"));
//					dto.setBookname(rs.getString("bookname"));
//					dto.setPublisher(rs.getString("publisher"));
//					dto.setIsbn(rs.getString("isbn"));
//			
//			조회된 결과가 있을 경우에만 도서 정보가져오는 코드 : null이 아니고 첫번쨰 행 이전에 결과가
//			있을때만 실행
			
			
//					rs.close();
//			}
//			pstmt.close();
//			return dto;
//		}	
//		
//		
//		public List<BookDto> select(String keyword){
//			return null;
//		}
//		public List<BookDto> select(String keyfield,String keyword){
//			return null;
//		}
		
		
		//예제 2
		
//		public int update(BookDto dto) throws Exception{
//			pstmt=conn.prepareStatement("update tbl_book set bookname=?,publisher=?,isbn=? where bookcode=?");
//			bookcode 정보를 업데이트
		
//			pstmt.setString(1,dto.getBookname() );
//			pstmt.setString(2,dto.getPublisher() );
//			pstmt.setString(3,dto.getIsbn());
//			pstmt.setInt(4,dto.getBookcode() );
//			int result=pstmt.executeUpdate();
//			pstmt.close();
//			return result;
//		}
//		bookname, publisher, isbn, bookcode 설정 -> pstmt 닫고 -> 반환
		
		
//		public int delete(int bookcode)  throws Exception{
//			pstmt=conn.prepareStatement("delete from tbl_book where bookcode=?");
//			pstmt.setInt(1, bookcode);
//			int result=pstmt.executeUpdate();
//			pstmt.close();
//			return result;
//		}
//		bookcode 정보 삭제 -> 삭제할 행을 받아서 삭제 -> 닫기 -> 반환
		
		

		

		
		
		
		
		
	}
}
