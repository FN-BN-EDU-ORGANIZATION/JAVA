package 이종현;

public class C20230630 {

	// 의문점 : 이해안했던 점 적기
	// 정리 : 코드에 대한 전반적인 정리/해석

	// 예제 1
	//MVC 대 의문점은 if 로 이동해서 이거나 아니거 나 구분하는대 순서가 어떻게 되는지를 이해를 못했습니다
	
	
//	if(!role.equals("ROLE_MEMBER")) { 변수가 ROLE_MEMBER가 아닌경우 [WARN] 사서만 로그인 할수 있게 출력 
//		System.out.println("[WARN] 사서만 로그인 할 수 있습니다");
//	}
//if(dto!= null) { dto 변수가 null이 아닌경우 즉 도서 정보가 조회 되어 있다면 수행 됨니다
//		//도서존재 유무 확인
//		BookDto bdto = bookService.getBook(bookcode);
//		LendDto ldto=null;
//		try {
//			ldto= dao.select(bookcode);
//		}catch(Exception e) {}
	
//if(ldto ==null) { 도서 대여 정보가 없는 경우 를 나타 내며 , 있으면 대여가 가능하게 된다
//				//도서가 대여가능한 상태라면
//				dao.insert(new LendDto(0,bookcode,userid,null,null));
//				System.out.println("[INFO] 도서대여 환료 외었습니다.");
//				return true;
//			}
//			System.out.println("[WARN] 요청한 도서는 존재하지 않습니다");
//		

	// 예제 2
	// 메소드 오버로딩에 대해 아직 잘몰라서 인터넷 겁색을해 복습을 해보았습니다
	
//	public class Test {
//	   Test t = new Test();
//       t.something();
//       t.something(10);
//       t.something(10,10);
//       t.something(10,10.1);
//   } 
//   void something() {
//       System.out.println("something!");
//   }
//   void something(int i) {
//       System.out.println(i);
//   }
//   void something(int i, int i2) {
//       System.out.println(i+i2);
//   }
//   void something(int i, double d) {
//       System.out.println(i+d);
//   }
	
	
	
	
	// 예제 3

	public static void main(String[] args) {

	}
}
