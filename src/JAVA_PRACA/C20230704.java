package JAVA_PRACA;

import Domain.Common.Dto.MemberDto;
import Domain.Common.Dto.OrderDto;
import Domain.Common.Dto.ProdDto;

public class C20230704 {

	public boolean reqOrder(String sid,String id, int product_code, int odr_amount) throws Exception {
		
//		Map<String, Object> login_sid = memberService.login("member1","1234");;
		// 관리자 로그인 확인, Role 받기
		String role = memberService.getRole(sid);
		if (!role.equals("Role_Member")) {
			System.out.println("[WARN] 관리자만 로그인 할 수 있습니다.");
			return false;
		}
		// 회원 존재 유무 확인
		MemberDto mdto = memberService.memberSearchOne("Role_user", id);

		if (mdto != null) {
			// 상품 존재 유무 확인
			ProdDto pdto = productService.reqProd(product_code);
			if (pdto != null) {
				//pDao.UpdateAmount();
				// 주문완료		
				oDao.insert(new OrderDto("16",mdto.getId(),pdto.getProduct_code(),"청바지",mdto.getAdr_addr(),odr_amount,null,100));		
				System.out.println("[INFO] 주문완료");
				return false;
			}
			System.out.println("[INFO] 제품없음.");
			return false;
		}
		System.out.println("[INFO] 해당 회원이 존재하지 않습니다.");
		return false;
	}
	
	
}
