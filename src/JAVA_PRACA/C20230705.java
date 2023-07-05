package JAVA_PRACA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Domain.Common.Dto.MemberDto;
import Domain.Common.Dto.OrderDto;
import Domain.Common.Dto.ProdDto;

public class C20230705 {
	public void ManagerMenu() {
		while (true) {
			System.out.println("--------------------------");
			System.out.println("관리자메뉴");
			System.out.println("--------------------------");
			System.out.println("[상품]			[회원]			[주문]");
			System.out.println("1 상품조회하기		5 				6 주문 전체조회"	);
			System.out.println("2 상품추가하기					    7 주문 단건조회"	);
			System.out.println("3 상품수정하기		 				8 			"	);
			System.out.println("4 상품삭제하기									"	);	
			System.out.println("9  ");
			System.out.println("10 ");
			System.out.print("번호 : ");
			int num = sc.nextInt();
			switch(num)
			{
			// 상품 전체 조회 서비스
			case 1:
				Map<String, Object> result = controller.execute("/product", 1, null);
				List<ProdDto> list = (List<ProdDto>) result.get("result");
				list.stream().forEach((dto) -> {System.out.println(dto);});
				break;
				
				// 상품 추가기능
			case 2:
				System.out.print("상품코드 상품명 재고량 상품가격 입력 : ");
				int product_code = sc.nextInt();
				String product_name = sc.next();
				int amount = sc.nextInt();
				int prod_price = sc.nextInt();
				
				Map<String,Object> param = new HashMap();
				
				param.put("product_code", product_code);
				param.put("product_name", product_name);
				param.put("amount", amount);
				param.put("prod_price", prod_price);
				param.put("sid", sid);
				
				Map<String,Object> result2 = controller.execute("/product",3,param);
				Boolean isInsert = (Boolean)result2.get("result");
				if(isInsert==true)
					System.out.println("[INFO] 상품 등록 완료!");
				
				break;
				
				// 상품 수정 기능
			case 3:
				
				System.out.print("상품명 재고량 상품가격 상품코드 입력 : ");
				
				String product_name1 = sc.next();
				int amount1 = sc.nextInt();
				int prod_price1 = sc.nextInt();
				int product_code1 = sc.nextInt();
				Map<String,Object> param1 = new HashMap();
				
				param1.put("product_name", product_name1);
				param1.put("amount", amount1);
				param1.put("prod_price", prod_price1);
				param1.put("product_code", product_code1);
				param1.put("sid", sid);
				
				Map<String,Object> result3 = controller.execute("/product",4,param1);
				Boolean isUpdated = (Boolean)result3.get("result");
				if(isUpdated==true)
					System.out.println("[INFO] 상품 수정 완료!");
				break;
				
				// 상품 삭제 기능
			case 4 :
				System.out.print("상품코드 상품명 재고량 상품가격 입력 : ");
				int product_code2 = sc.nextInt();

				
				Map<String,Object> param2 = new HashMap();
				
				param2.put("product_code", product_code2);
				param2.put("sid", sid);
				
				Map<String,Object> result4 = controller.execute("/product",5,param2);
				Boolean isDeleted = (Boolean)result4.get("result");
				if(isDeleted==true)
					System.out.println("[INFO] 상품 삭제 완료!");
				break;
				
				// 회원 전체 조회 기능
			case 5 :
				Map<String, Object> result5 = controller.execute("/member", 1, null);
				List<MemberDto> list1 = (List<MemberDto>) result5.get("result");
				list1.stream().forEach((dto) -> {System.out.println(dto);});
			
				break;
				
				// 주문 정보 전체 조회 기능 
			case 6 :
				Map<String, Object> result6 = controller.execute("/order", 1, null);
				List<OrderDto> list2 = (List<OrderDto>) result6.get("result");
				list2.stream().forEach((dto) -> {System.out.println(dto);});
				break;
				
				// 주문 정보 단일 조회 기능
			case 7:
				System.out.print("주문 번호 입력 : ");
				String order_id = sc.next();
				Map<String,Object> param3 = new HashMap();
				
				param3.put("sid", sid);
				param3.put("order_id", order_id);
				
				
				Map<String, Object> result7 = controller.execute("/order", 2, param3);
				OrderDto dto = (OrderDto) result7.get("result");
				System.out.println(dto.toString());
				break;
				
			case 10 : 
				return ;
				
			}
			
		}
	}
}
	
	

