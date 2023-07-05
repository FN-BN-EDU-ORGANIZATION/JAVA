
import java.util.UUID;
		//Service 부분 OrderService / 주문하기 서비스 구현 코드
// -------------------------------------------------------------------------------------- 민영씨 코드
		
		//주문자 아이디에 따라 어떤 상품을 얼마나 주문할 지 입력
		public boolean reqOrder(String id, int product_code, int odr_amount) throws Exception {
		    MemberDto mdto = new MemberDto();
		    ProdDto pdto = new ProdDto();
		    OrderDto odto = new OrderDto();

		    String role = memberService.getRole(id);
//		    if (!role.equals("Role_user")) {
//		        System.out.println("[WARN] 회원만 로그인 할 수 있습니다.");
//		        return false;
//		    }
		    
		    mdto = memberService.memberSearchOne(role, id);
		    if (mdto != null) {
		        pdto = productService.reqProd(product_code);
		        if (pdto != null) {
		            int currentStock = pdto.getAmount();
		            if (currentStock >= odr_amount) {
		                int updatedStock = currentStock - odr_amount;
		                pdto.setAmount(updatedStock);
		                // tbl_product 의 내용 수정(ok)
		                
		                // insert 유무에 관하여 T/F 설정
		                boolean updateSuccess = productService.updateProdAmount(product_code, pdto); // 현재 상품재고량 수정

		                // insert가 되면 상품 재고 업데이트를 실행
		                if (updateSuccess) {
		                    int pp = odr_amount * pdto.getProd_price();
		                    String oid = UUID.randomUUID().toString();
		                    //랜덤한 문자열을 반환 / odr id로 설정
		                    odto.setOrder_id(oid); // 주문 ID 설정
		                    odto.setProduct_code(product_code);

		                    // tbl_order 의 내용 추가(x)
		                    
		                    // insert 여부를 확인하는 코드
		                    int insertSuccess = oDao.insert(new OrderDto(oid, mdto.getId(), pdto.getProduct_code(),
		                            pdto.getProduct_name(), mdto.getAdr_addr(), odr_amount, null, pp));
		                    
		                    // insert 가 무사히 되었을시 true값을 리턴
		                    if (insertSuccess==1) {
		                        System.out.println("[INFO] 주문완료");
		                        return true;
		                        
		                    } 
		                    // insert가 되지 않았을시에 false값을 리턴
		                    else {
		                        System.out.println("[INFO] 주문 내역 추가 실패");
		                        // 주문 내역 추가 실패 시 상품 재고량을 원래대로 복구
		                        pdto.setAmount(currentStock);
		                        productService.updateProdAmount(product_code, pdto);
		                        return false;
		                    }
		                } 
		                // insert가 되지 않았을시 상품재고량 업데이트하지 않고 false 값을 리턴
		                else {
		                    System.out.println("[INFO] 상품 재고량 업데이트 실패");
		                    return false;
		                }
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