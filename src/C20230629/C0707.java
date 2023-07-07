package study;

class MyMath {
	
	int add(int a, int b)
	{
		return a+b;
	}
	
	int subtract(int a, int b)
	{
		return a-b;
	}
	
	int multiply(int a, int b)
	{
		return a*b;
	}
	
	int divide(int a, int b)
	{
		return a/b;
	}
	float add(float x, float y)
	{
		return x+y;
	}
	double add(double x, double y)
	{
		return x+y;
	}
	int avg(int...n)		// 가변인자 : 배열로 생성, 길이는 호출하는 쪽에서 인수의 개수로 정해진다.
	{
		int sum=0;			//sum변수 초기값 0
		for(int i:n)		//배열 n의 요소에 대해 반복 i는 현재 요소를 나타낸다
			sum+=i;			//sum에는 모든 요소의 합이 저장
		return sum / n.length;	// sum을 n.length로 나눔
	}
	int max(int...n)		//가변인자
	{
		int max=n[0];		//n배열 첫번째 요소를 max변수의 초기값으로 설정
		for(int i:n)		//배열 n의 요소에 대해 반복 i는 현재 요소를 나타낸다
			if(max<i)		//max가 i보다 작다면
				max=i;		//max=i
		return max;			//max를 리턴
	}
	int min(int...n)		//가변인자
	{
		int min=n[0];		//n배열 첫번째 요소를 min변수의 초기값으로 설정
		for(int i:n)		//배열 n의 요소에 대해 반복 i는 현재 요소를 나타낸다
			if(min>i)		//min이 i보다 크다면
				min=i;		//min=i
		return min;			//min을 리턴
	}
	long power(long x,long n)
	{
		if(n==1)
			return x;		// n이 1이면 x를 반환 재귀호출의 종료조건

		if(n%2 ==0)
			return power(x*x,n/2); 		//n이 짝수이면 (x*x) * (n/2) 리턴
		else 
			return x*power(x*x,(n-1)/2);	// 홀수이면 x*power(x*x,(n-1)/2) 리턴
	}
}

public class C0707 {

	public static void main(String[] args) {
		
		
		
		예제1();		//MyMath 클래스에 평균,최대,최소값을 구하는 메서드를 추가하세요.
					/*
					 메서드 : avg();
					 		 max();
					 		 min();
					 */

		예제2();		//MyMath 클래스에 거듭제곱을 계산하는 메서드 만들기 (재귀호출 사용)
					/*
					 메서드 : power() int x, int n 리턴 : x를 n제곱한 결과
					 */

	}
	public static void 예제1() {
		
		MyMath math = new MyMath();		//math 인스턴스 생성
		
		System.out.println(math.avg(32,10,320,40,10,-5,3)); //math.avg 호출
		
		System.out.println(math.max(32,10,320,40,10,-5,3));	//math.max 호출
		
		System.out.println(math.min(32,10,320,40,10,-5,3));	//math.min 호출
		
	}
	public static void 예제2() {
		
		MyMath math = new MyMath();		//math 인스턴스 생성
		
		long result = math.power(3,4);  //math.power 호출
		
		System.out.println(result);		//result 출력
		
	}
}
