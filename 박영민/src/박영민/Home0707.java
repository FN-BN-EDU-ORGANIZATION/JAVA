package 박영민;

import java.util.Scanner;

public class Home0707 {
	
	public static void 예제1(){
		//뭔가 무기...강화어쩌고를 만들고싶은데 생각보다 복잡한거같다. 다음에 보안하기로..
		int weaponLevel=1;	//무기레벨1
		int damage=100;	//데미지 100
		
		while(weaponLevel<10) {	/*강화확률있어야하고 최대강화수치만들고
			강화수치가 높을수록 강화성공확률감소. 강화성공시 데미지 증가량 퍼센트 추가 일정강화단계에서 실패시 강화수치 초기화*/
			weaponLevel++;
			damage+=20;
		}
			System.out.println("무기레벨은 "+weaponLevel+"입니다.");
			System.out.println("데미지는 "+damage+"입니다.");
		//탈락.
	}
	public static void 예제2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 :");
		int a = sc.nextInt();
		
		switch (a) {		//switch문 : 조건식의 결과는 반드시 정수, 문자열이어야 한다.
							//case문의 값은 중복될수없다. case문의 값은 상수이어야 한다.
							//switch에서 Boolean사용불가능, case에서도 Boolean 사용불가능.
							//case에 여러값이 들어갈수 있다.
			case 3,4,5:
				System.out.println("봄입니다.");	//입력받은 수가 3,4,5일때 출력함
				break;							//입력받은 수가 3,4,5일때 멈춤 아니면 진행
			case 6,7,8:
				System.out.println("여름입니다.");	//입력받은 수가 6,7,8일때 출력함
				break;							//입력받은 수가 6,7,8일때 멈춤 아니면 진행
			case 9,10,11:
				System.out.println("가을입니다.");	//입력받은 수가 9,10,11일때 출력함
				break;							//입력받은 수가 9,10,11일때 멈춤 아니면 진행
			case 12,1,2:
				System.out.println("겨울입니다.");	//입력받은 수가 12,1,2일때 출력함
				break;							//입력받은 수가 12,1,2일때 멈춤 아니면 진행
			default :							
				System.out.println("1부터 12사이의 숫자를 입력하세요."); 
				//모든케이스에 걸리지않을 경우 실행된다. 필수요소는 아니다. this similar else...?
				break; //그리고 멈춘다. 다시 실행을 해야할거같긴한데...
			}
		}
	
	
	
	public static void main(String[] args) {
		예제1();
		System.out.println("--------------------");
		예제2();
	}
}
