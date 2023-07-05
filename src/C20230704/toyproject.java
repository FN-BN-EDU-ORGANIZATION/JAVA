package Domain.Common.Service;

import java.util.List;
import java.util.UUID;

import Domain.Common.Dao.MemberDao;
import Domain.Common.Dao.OrderDao;
import Domain.Common.Dao.ProdDao;
import Domain.Common.Dto.MemberDto;
import Domain.Common.Dto.OrderDto;
import Domain.Common.Dto.ProdDto;

public class OrderService {
	
	private MemberService memberService;
	private ProductService productService;
	private OrderDao oDao;
	private MemberDao mDao;
	private ProdDao pDao;
	private static OrderService instance;
	
	public OrderService getInstance()
	{
		if(instance == null)
		{
			instance = new OrderService();
		}
		return instance;
	}
	
	public OrderService()
	{
		oDao = OrderDao.getInstance();
		mDao = MemberDao.getInstance();
		pDao = ProdDao.getInstance();
		memberService = MemberService.getInstance();
		productService = ProductService.getInstance();
		
	}
		
		//권한 확인을 위한 세션 id, 주문자 정보를 파악하기 위한 userid가 필요
		public boolean reqOrder(String sid,String id, int product_code, int odr_amount) throws Exception {
			
//			Map<String, Object> login_sid = memberService.login("member1","1234");;
			// 관리자 로그인 확인, Role 받기
			String role = memberService.getRole(sid);
			if (!role.equals("Role_Member")) {
				System.out.println("[WARN] 관리자만 로그인 할 수 있습니다.");
				return false;
			}
			// 회원 존재 유무 확인
			MemberDto mdto = memberService.memberSearchOne("Role_user", id);
			 mdto = memberService.memberSearchOne("Role_user", id);
			    if (mdto != null) { // 회원이 존재ㅏ한다면 해당 제품의 정보를 죄회
			    	pdto = productService.reqProd(product_code); 
			        if (pdto != null) {
			            int currentStock = pdto.getAmount();
			            if (currentStock >= odr_amount) {
			                int updatedStock = currentStock - odr_amount;
			                pdto.setAmount(updatedStock);
			                productService.updateProdAmount(product_code, pdto);
			                //주문 가격은 주문 제품 가격과 수량을 곱한 것. 
			                int pp = (odr_amount * pdto.getProd_price());
//			                odto.setOrder_id(UUID.randomUUID().toString()); // 랜덤한 String type 주문 ID 설정
//			                odto.setProduct_code(product_code);
			               
			                oDao.insert(new OrderDto("14",mdto.getId(),pdto.getProduct_code(),pdto.getProduct_name(),mdto.getAdr_addr(),odr_amount,null,pp));		
			                System.out.println("[INFO] 주문완료");
			                return true;
			            } else {
			                System.out.println("[INFO] 주문 수량이 재고보다 많습니다.");
			                return false;
			            }
			        } else {
			            System.out.println("[INFO] 해당 상품이 존재하지 않습니다.");
			            return false;
			        }
			    } else {
			        System.out.println("[INFO] 해당 회원이 존재하지 않습니다.");
			        return false;
			    }
			}

	
		//==================================피드백
		
		public boolean reqOrder2(String sid, String id,int product_code, int odr_amount) throws Exception {
			MemberDto mdto = new MemberDto();
			ProdDto pdto = new ProdDto();
			OrderDto odto = new OrderDto();
			
			String role = memberService.getRole(sid);
			if (!role.equals("Role_Member")) {
			      System.out.println("[WARN] 관리자만 로그인 할 수 있습니다.");
			      return false;
			}
			
		    mdto = memberService.memberSearchOne("Role_user", id);
		    if (mdto != null) {
		    	pdto = productService.reqProd(product_code); 
		        if (pdto != null) {
		            int currentStock = pdto.getAmount();
		            if (currentStock >= odr_amount) {
		                int updatedStock = currentStock - odr_amount;
		                pdto.setAmount(updatedStock);
		                productService.updateProdAmount(product_code, pdto);
		                int pp = odr_amount * pdto.getProd_price();
		                
		                odto.setOrder_id(UUID.randomUUID().toString()); // 주문 ID 설정
		                odto.setProduct_code(product_code);
		                
		                oDao.insert(new OrderDto("15d0",mdto.getId(),pdto.getProduct_code(),pdto.getProduct_name(),mdto.getAdr_addr(),odr_amount,null,pp));
		                System.out.println("[INFO] 주문완료");
		                return true;
		            } else {
		                System.out.println("[INFO] 주문 수량이 재고보다 많습니다.");
		                return false;
		            }
		        } else {
		            System.out.println("[INFO] 해당 상품이 존재하지 않습니다.");
		            return false;
		        }
		    } else {
		        System.out.println("[INFO] 해당 회원이 존재하지 않습니다.");
		        return false;
		    }
		}
	
	
	// 모드 주문확인
	public List<OrderDto> getAllOrder()
	{
		System.out.println("OrderService's getAllOrder()");
		return oDao.select();
		
	}
	
	// 건별 주문 확인
	public OrderDto getOrder(String order_id)
	{
		System.out.println("OrderService's getOrder()");
		return oDao.select(order_id);
		
	}
	
	// 주문하기
	public boolean addOrder(OrderDto dto, String login_sid)
	{
		System.out.println("OrderService's addOrder()");
		
		String role = memberService.getRole(login_sid);
		
		if(role.equals("Role_Member"))
		{
		int result = oDao.insert(dto);
		if(result > 0)
			return true;
		}
		return false;
		
	}
	
	// 주문정보 수정
	public boolean updateOrder(OrderDto dto, String login_sid)
	{
		System.out.println("OrderService's updateOrder()");
		
		String role = memberService.getRole(login_sid);
		
		if(role.equals("Role_Member"))
		{
		int result = oDao.update(dto);
		if(result > 0)
			return true;
		}
		return false;
	}
	
	// MemberDao를 참고하여 회원 아이디와 주소 , ProdDao 를 참고하여 prodcut_code를 주문 테이블에 넣는 작업
//	public boolean updateOrder(MemberDto mdto, String id, String addr, ProdDto pdto, int product_code,String sid)
//	{
//		System.out.println("OrderService's updateOrder()");
//		
//		String role = memberService.getRole(sid);
//		
//		if(role.equals("Role_Member"))
//		{
//		int result = oDao.update(mdto);
//		if(result > 0)
//			return true;
//		}
//		return false;
//	}
	
	// 주문 완료 및 취소 처리
	public boolean removeOrder(String order_id, String login_sid)
	{
		System.out.println("BookService's removeOrder()");
		String role = memberService.getRole(login_sid);
		if(role.equals("Role_Member"))
		{
		int result = oDao.delete(order_id);
		if(result > 0)
			return true;
		}
		return false;
	}


	
	

}