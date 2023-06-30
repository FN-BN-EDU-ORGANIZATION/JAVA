package 이헌지;

public class D2 {

//   	1. 변수의 선언및 초기화 
//		public static void main(String[] args) {
			//변수의 선언과 초기화 
			
			//변수(variable): 단 하나의 값을 저장할 수 있는 메모리 공간
//			int year=0;  //초기화 선언  
//			int age=23;
//			
//			System.out.println(year);
//			System.out.println(age);
//			
//			year=age+2000;  //변수 age값에 2000을 더해서 변수 year에 저장
//			age=23+1;       //변수 age에 저장된 값을 1증가시킨다
//			
//			System.out.println(year);
//			System.out.println(age);    
			
			//출력값   : 0 
//			           23
//			           2030
//	}
//}

	// 2. 두 변수의 값 교환하기
	
	
		public static void main(String[] args) {
			int x = 10, y = 20;       //x=10 y=20 으로 선언 
			int tmp = 0;              // 출력값: x:10y:20 
			
			System.out.println("x:" + x + "y:" +y);
			
	      tmp = x;
			x = y;
		    y = tmp;
			
			System.out.println("x:" + x + "y:" +y);
			
		}              
}
			                       //출력값:x:20y:10

			
			
			//처리순서 
//			->System.out.println("x: " + x + "y:" + y);
//			->System.out.println("x: " + 10 + "y:" + 20);
//			->System.out.println("x:10 "+ "y:" + y);
//			->System.out.println("x:10 " + "y:20");
//			->System.out.println("x:10 y:20");