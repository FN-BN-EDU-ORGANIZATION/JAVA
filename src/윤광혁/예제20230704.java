package 윤광혁;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class 예제20230704 {
	//DB연결 부분은 개인적으로 해석한걸 적어둿습니다. 나중에 검색으로 비교 보충할 생각입니다.
	
	//1
	//MVC 패턴
	//M은 모델로 애플리케이션 데이터와 비즈니스 로직을 담당합니다.
	//데이터 상태를 관리하고 데이터에 접근하거나 조작하는 작업을 수행하고
	//주로 데이터베이스와의 상호작용을 처리하거나 데이터 유효성검증 데이터변환 등을 담당합니다.(sql)
	
	//V는 뷰로 사용자에게 보여지는 부분이고 사용자의 입력을 받는 역할을합니다.
	//사용자에게 UI(인터페이스)를 보여주거나 데이터 표시방법을 결정합니다.
	//모델의 데이터를 표시하기위해 필요한 정보를 요청하고 모델의 상태변화를 감지하여 정보를 업데이트합니다.
	
	//C는 컨트롤러로 사용자의 입력을 처리하고 모델과 뷰를 관리하는 역할입니다.
	//모델과 뷰간의 상호작용을 조정하여 모델과 뷰의 느슨한 결합을 유지합니다.
	//사용자의 요청을 받아 해당하는 작업을 처리하고 모델과 뷰의 변화에따라 업데이트를 조절합니다.
	
	//MVC 패턴의 핵심은 아이디어는 각 구성 요소가 역핳을 분리함으로써 코드의 재사용성과 유지보수성을 향상시키는것입니다.
	
	//2
	//mysql 개인해석
//	Class.forName("com.mysql.cj.jdbc.Driver");
	//mysql 라이브러리에서 Driver의 위치를 지정해주고 적재시킵니다.
//	DBcon = DriverManager.getConnection(url, id, pw);
	//cmd를 통해 명령어를 넣었던것 처럼 url과 mysql 아이디 mysql 패스워드를 넣어줍니다.
//	private Connection DBcon = null; // DB연결용 참조변수
	//cmd를 통해 mysql과 연결했던것처럼 mysql과 자바를 연결해줍니다.
//	private PreparedStatement DBprepar = null; // SQL쿼리 전송용 참조변수
	//자바로 입력한 sql문을 실제 sql명령어처럼 처리해줍니다. ;는 생략가능
//	private ResultSet DBresult = null; // SQL쿼리 결과(SELECT결과) 수신용 참조변수
	//sql문을 수행한 결과를 자바로 가져옵니다.
	
	
	
	
	
}
