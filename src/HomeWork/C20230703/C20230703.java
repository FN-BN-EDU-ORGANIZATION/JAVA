package HomeWork.C20230703;


//정리 : 기본적인 클래스의 사용법에 대해 익숙해지고 있다.

public class C20230703 {
	
	// 일반 클래스들을 생성한다
	
	public static void ge1() // ge1()이라는 클래스 생성 
	{
		System.out.println("안녕 멍멍 하세요"); // 클래스를 호출했을때 화면에 출력되는 내용
	}
	public static void ge1(String st1) // String st1이라는 변수를 ge1()이라는 클래스에 적용하여 사용함 
	{
		System.out.println(st1+" 씨 안녕하세요"); // 클래스를 호출했을때 화면에 출력되는 내용
	}
	public static void ge1(String st1, int a) // String st1이라는 변수와 int a 라는 변수를 같이 사용하여 ge1()이라는 클래스에 적용하여 사용함 
	{
		System.out.println(st1+" 씨 당신 나이는 "+a+" 이군요"); // 클래스를 호출했을때 화면에 출력되는 내용
	}
	
	public static int suma(int a, int b) //suma 라는 클래스를 int a,b 라는 변수를 이용하여 사용함 자료형은 int로 사용
	{
		int c;	// 내부에 변수 c를 만들고
		c=a+b;	// 위에 만든 a와 b의 외부에서 받는 값을 더한값을 c에 적용
		
		return c; // c를 리턴해준다.
	}
	
	public static void sumb(int a) // sumb라는 클래스를 int a라는 변수를 이용하여 사용 자료형은 void 이므로 리턴이 없음
	{
		
		int i; // int i라는 내부 변수를 만듬
		if (a>0) 	// 외부에서 받는 변수 a가 0보다 크면
		{
			for (i=0; i<a;i++) // i가 0일때 i가 a보다 적을때까지 i를 1씩 증가시킨다
			{
				System.out.println(i); // i 값이 출력된다
			}
		}
		else if (a<0) // a가 0보다 적다면 
		{
			for (i=a; i<1; i++) // i는 a이고 i가 1보다 적을때까지 i를 1씩 증가시킨다
			{
				System.out.println(i); // i 값이 출력된다
			}
		}
		else // 위의 경우가 아니라면 
		{
			System.out.println("0"); // 0을 출력한다
		}
	}
	
	public static void main(String[] args) {
		
		// 위에 생성된 클래스를 메인에서 사용한다
		
		int a1; // a1이라는 변수를 생성
		
		System.out.println("안녕하세요"); 
		
		ge1(); // 위에 생성한 ge1이라는 클래스를 호출
		
		ge1("바둑이"); // ge1(바둑이)을 사용한 클래스를 호출 ()안에 문자열을 넣어서 클래스를 만든다
		
		ge1("철수", 33); // ge1(철수,33)을 사용한 클래스를 호출 ()안에 문자열과 숫자를 넣어서 클래스를 만든다
		
		a1=suma(5,100); // 위에 생성한 a1에 suma(5,100) 클래스를 호출 ()안에 숫자를 넣어 클래스를 만든다
		System.out.println("5+100="+a1);
		
		System.out.println("50+500="+suma(50,500));
		
		sumb(10);	// sumb 라는 클래스에 (10)이라는 값을 넣으면 10은 0보다 크고 i값이 10보다 작은동안에는 1을 계속 증가시킨 값이 출력된다
		sumb(-10); // sumb 라는 클래스에 (-10)이라는 값을 넣으면 -10은 0보다 작고 i 값이 1보다 작은동안에는 1을 계속 증가시킨 값이 출력된다
		
	}
	
}
