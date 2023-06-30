package C20230629;

public class C20230630 {
	public static void main(String[] args) {

		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		//예제1
//		class Connection  {
//			  private static Connection _inst = null;	//_inst = 인스턴스 저장, 초기값 = null
//			  private int count = 0;					//count = 0
//			     public static Connection get() {
//			      if(_inst == null) {					//_inst가 null이면
//			      _inst = new Connection();				//_inst 변수에 새로운 Connection 인스턴스 생성하여 할당
//			      return _inst; 						//_inst 변수 반환
//			      }
//			    return _inst;
//			    }
//			  public void count() { count ++; }			//count 메서드 호출시 count 1증가
//			  public int getCount() { return count; } 	//getCount 메서드 호출시 count 변수값 반환
//			}
//			 
//			public class C20230629 {
//				public static void main(String[] args) {
//			    Connection conn1 = Connection.get(); 	//connection 클래스의 인스턴스를 가져와서 conn1 변수에 할당
//			    conn1.count();							//conn1 객체에 count()메서드 호출 - count 변수 1증가
//			    Connection conn2 = Connection.get();	//인스턴스 다시 가져와서 conn2 변수에 할당
//			    conn2.count();							//conn2 객체에 count()메서드 호출 - 같은 인스턴스라서 count 변수 1증가
//			    Connection conn3 = Connection.get();    //인스턴스 다시 가져와서 conn2 변수에 할당
//			    conn3.count();							//conn3 객체에 count()메서드 호출 - 같은 인스턴스라서 count 변수 1증가
//			    
//			    System.out.print(conn1.getCount());		//conn1 객체의 getCount()메서드 호출하여 count 변수의 값 출력, count = 3
//			  }
			
			//예제2

//		 public class C20230629 {
//		    public static void main(String[] args) {
//		        int n;									//변수 n 선언
//		        int k;									//변수 k 선언
//		        int s;									//변수 s 선언
//		        int el = 0;								//변수 el 선언 후 0으로 초기화
	//
//		        for (n = 6; n <= 30; n++) {				//6부터 30까지 반복문 실행
//		            s = 0;								//변수 s 0으로 초기화
//		            k = n / 2;							//변수 k에 n의 절반 값 저장
//		            for (int j = 1; j <= k; j++) {		//1부터 k까지 반복문
//		                if (n % j == 0) {				//j가 n의 약수인 경우 아래코드 실행
//		                    s = s + j;					//s 변수에 j를 더해서 n의 약수들의 합 계산
//		                }
//		            }
//		            if (s == n) {						//s 와 n이 같으면, 아래코드 실행
//		                el++;							//el 변수 1증가
//		            }
//		        }
	//
//		        System.out.printf("%d", el);			//el값 출력 = 완전수 출력
//		    }											
//		}


			//의문점 : 이해안간거
			//정리 : 코드에 대한 정리해석
			
			
			
	
		
		
		
	}
}
