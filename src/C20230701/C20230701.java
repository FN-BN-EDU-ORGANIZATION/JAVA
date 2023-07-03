package C20230701;
class Mymath{
	
	//static 사용하면 객체생성안하고 호출가능
	//주의 오버라이딩 불가능
	int add(int x, int y){
		
		return x+y;
		
		
	}
	int subtract(int x , int y)
	{	
		return x-y;
	}
	int multiply(int x, int y)
	{
		return x*y;
	}
	int divdie(int x , int y)
	{
		return x/y;
	}

}
public class C20230701 {

	public static void main(String[] args) {
		//실습문제2 변수는 result 한개만사용
		//맴버변수 x , 메서드 add(int 2개) 리턴 더하기 결과 , subtract , multiply , divide
		Mymath math = new Mymath();
		int result = 0;
		result = math.add(5, 3);
//		int a = math.multiply(3, 27);
//		int b = math.subtract(a,5);
//		int c = math.divdie(500, 5);
//		int result = math.add(c,b);
//		

		
		System.out.println(result); 
//		System.out.println(500/5+3*27-5);
		
	}

}
