package C20230629;

import java.util.Scanner;

public class C20230630 {
	public static void main(String[] args) {

		//의문점		: 
		//정리 : MVC 복습, 프로젝트 공부
		
		
		//예제 1
		
//		public int insert(QnADto dto) throws Exception{
//			
//			pstmt=conn.prepareStatement("insert into tbl_QnA values(null,?,curdate(),?,?)");
//			pstmt.setString(1, dto.getId());
//			pstmt.setString(2, dto.getTitle());
//			pstmt.setString(3,dto.getContents());
//			int result=pstmt.executeUpdate();
//			pstmt.close();
//			
//			return result;
//			
//		}
//		-> QnADto객체를 인수로가져와서 데이터베이스에 객체의 정보를 저장
//		-> SQL을 실행하여 문자열을 삽입
//		-> result에 저장
//		
//		public List<QnADto> select() throws Exception{
//			List<QnADto> list = new ArrayList();
//			QnADto dto=null;
//			pstmt=conn.prepareStatement("select * from tbl_QnA");
//			rs=pstmt.executeQuery();
//			if(rs!=null)
//			{
//				while(rs.next()) {
//					dto=new QnADto();
//					dto.setNo(rs.getInt("no"));
//					dto.setId(rs.getString("id"));
//					dto.setQnadate(rs.getDate("qnadate"));
//					dto.setContents(rs.getString("contents"));
//					dto.setTitle(rs.getString("title"));
//					list.add(dto);
//				}
//				rs.close();
//			}
//			
//			pstmt.close();
//				
//			return list;
//		}
//		-> QnaDto객체를 저장하기 위해 Arraylist사용
//		-> 행이 존재하면 계속해서 반복하여 읽음
//		
//		
//		public QnADto select(String title) throws Exception{
//			
//			QnADto dto=null;
//			pstmt=conn.prepareStatement("select * from tbl_QnA where title=?");
//			pstmt.setString(1, title);
//			rs=pstmt.executeQuery();
//			if(rs!=null && rs.isBeforeFirst())
//			{
//				rs.next();
//				dto=new QnADto();
//				
//				pstmt.setInt(1, dto.getNo());
//				pstmt.setString(2, dto.getId());
//				pstmt.setDate(3, dto.getQnadate());
//				pstmt.setString(4,dto.getContents());
//				pstmt.setString(5, dto.getTitle());
//				rs.close();
//			}
//			pstmt.close();
//				
//			return dto;
//		}	
//		-> resultset이 null이 아니고 첫행 이전 위치 확인
//		-> title 값이 일치하는 첫번쨰를 조회하여 QnA테이블 조회
//
////		
//		public int delete(int no)  throws Exception{
//			pstmt=conn.prepareStatement("delete from tbl_member where id=?");
//			pstmt.setInt(1, no);	
//			int result=pstmt.executeUpdate();
//			pstmt.close();
//			
//			return result;
//			
//		}
//		-> member테이블의 id값이 일치하는 것을 삭제

//		예제2
//		public void MainMenu() {
//
//			while (true) {
//				System.out.println("--------------------------");
//				System.out.println("MAIN");
//				System.out.println("--------------------------");
//				System.out.println("1 도서조회");
//				System.out.println("2 로그인");
//				System.out.println("3 회원가입");
//				System.out.println("4 종료");
//				System.out.print("번호 : ");
//				int num = sc.nextInt();
//				switch (num) {
//				case 1:
//					break;
//				case 2:
//					loginMenu();
//					break;
//				case 3:
//					break;
//				case 4:
//					System.out.println("프로그램을 종료합니다.");
//					System.exit(-1);
//				}
//			}
//
//		}
//		-> (도서조회, 로그인, 회원가입, 종료, 번호)를 출력하여 정수형 입력을받아 num 변수에저장
//		-> switch문 사용하여 변수값이 변동될때마다 다른 동작 수행
//		-> 반복표시하고, 사용자의 선택에 맞는 기능 실행하게 설계
//		
		
	}
}
