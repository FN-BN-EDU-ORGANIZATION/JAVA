package C20230703;



public class ProductController {
	
	
	//productService class와 연결
	private ProductService service;
	
	public ProductController() {
		service = ProductService.getInstance();
	}
	
	//execute method 생성 -> serviceNo와 param입력 -> 해당 service 실행
	public Map<String,Object> execute (int serviceNo, Map<String,Object>param){
		
		//Request All Product Info -> ProdDto를 LIST형식으로 출력해 사용자에게 정보 제공
		if(serviceNo==1) {
			//파라미터 없이 모든 정보를 제공
			//때문에 입력값 검증 코드도 불필요
			//서비스 실행
			List<ProdDto> list = null;
			try {
				list = service.reqAllProd();
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			//출력
			System.out.println("Prod_Select All Block!");
			Map<String,Object>result = new HashMap();
			result.put("result", list);
			return result;
		
		//Request One Product Info -> product_code를 입력받아 해당 상품 정보를 ProdDto형으로 제공
		}else if(serviceNo==2) {
			//파라미터 입력
			String sid = (String)param.get("sid");
			Integer product_code = (Integer)param.get("product_code");
			//입력값 검증
			if(sid==null||product_code==null) {
				System.out.println("[ERROR] Data Validation Check Error");
				return null;
			}
			//서비스 실행
			ProdDto dto = null;
			try {
				dto =service.reqProd(product_code);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			//출력
			Map<String,Object>result = new HashMap();
			result.put("result", dto);
			return result;
		
			//상품추가 서비스 -> Boolean 형으로 서비스 실행 여부를 T/F로 출력
		}else if(serviceNo==3) {
			//상품 추가에는 관리자 role 인증이 필요
			//또한 ProdDto에 들어갈 정보들을 파라미터로 입력받아야 한다.
			
			String sid = (String)param.get("sid");
			Integer product_code = (Integer)param.get("product_code");
			String product_name = (String)param.get("product_name");
			Integer amount = (Integer)param.get("amount");
			
			//입력값 검증
			if(product_code==null||product_name == null || amount ==null) {
				System.out.println("[ERROR] Data Validation Check Error");
				return null;
			}
			
			//상품 추가 서비스 실행
			ProdDto dto = new ProdDto(product_code,product_name,amount);
			
			Boolean rValue = false;
			try {
				rValue = service.addProd(sid,dto);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Product_Add Block!");
			Map<String,Object> result = new HashMap();
			result.put("result", rValue);
			return result;
		
			//상품 정보 서비스 -> 관리자 권한 인증이 필요하고 ProdDto에 수정될 갈 파라미터들이 요구된다.
		}else if(serviceNo==4) {
			String sid = (String)param.get("sid");
			Integer product_code = (Integer)param.get("product_code");
			String product_name = (String)param.get("product_name");
			Integer amount = (Integer)param.get("amount");
			
			//입력값 검증
			if(product_code==null||product_name==null||amount==null) {
				System.out.println("[ERROR] Data Validation Check Error");
				return null;
			}
			
			//서비스 실행
			ProdDto dto = new ProdDto(product_code,product_name,amount);
			
			Boolean rValue=false;
			try {
				rValue=service.updateProd(sid,dto);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			System.out.println("Product_Add Block!");
			Map<String,Object>result= new HashMap();
			result.put("result", rValue);
			return result;
			
			//상품 삭제 서비스 -> 관리자 권한 인증과 삭제할 상품의 product_code가 파라미터로 요구된다.
		}else if(serviceNo==5) {
			String sid= (String)param.get("sid");
			Integer product_code = (Integer)param.get("product_code");
			
			//입력값 검증
			if(sid==null||product_code==null) {
				System.out.println("[ERROR]Data Validation Check Error");
				return null;
			}
			Boolean rValue = false;
			try {
				rValue=service.removeProd(sid,product_code);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			Map<String,Object> result = new HashMap();
			result.put("result", rValue);
			return result;
		}
		return null;

	}