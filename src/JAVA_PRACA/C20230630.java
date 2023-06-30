package JAVA_PRACA;

class MyMath {

	// 수학 클래스 를 만들어 메서드를 오버로딩 하는 연습
	
	int add(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	float add(float x, float y)
	{
		float result = x + y;
		return result;
	}
	double add(double x, double y)
	{
		double result = x + y;
		return result;
	}
	
	
	// 각 수학에 사용되는 기본 연산자 메서드
	int substract(int x, int y)
	{
		int result = x - y;
		return result;
	}
	
	int multiply(int x, int y)
	{
		int result = x * y;
		return result;
	}
	
	int divide(int x, int y)
	{
		int result = x / y;
		return result;
	}
	
	
	// 평균, 최솟값, 최댓값 구하는 메서드 구현
	int avg(int...n)
	{
		int sum =0;
		for(int i : n)
			sum +=i;
		
		return sum/n.length;
	}
	
	int max(int...n)
	{
		int max = n[0];
		
		for(int i : n)
			if(max<i)
				max=i;
		
		return max;
	}
	
	int min(int...n)
	{
		int min = n[0];
		
		for(int i : n)
			if(min>i)
				min=i;
		
		return min;
	}
	
	
	// 재귀함수 연습
	long power(long x , long n)
	{
		if(n ==1)			// 재귀호출
			return x;
		
		
		return x*power(x,n-1);
	}
	
}
public class C20230630 {

	public static void main(String[] args) {
		
	
			MyMath math1 = new MyMath();
		
		 float result1 = math1.add(30.5f, 25.5f);
		
		 System.out.println(result1);
	
		 double result2 = math1.add(30.5, 25.5);
		 System.out.println(result2);
	

 
		MyMath math2 = new MyMath();
	
		 System.out.println(math2.avg(32,10,320,40,10,-5,3));
		 System.out.println(math2.max(32,10,320,40,10,-5,3));
		 System.out.println(math2.min(32,10,320,40,10,-5,3));


	
		MyMath math3 = new MyMath();
	
		 long result3 = math3.power(3, 2);
	
		 System.out.println(result3);
		 }

	}


