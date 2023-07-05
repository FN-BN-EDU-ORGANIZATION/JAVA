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
}

public class C0705 {

	public static void main(String[] args) {
		
		예제1();		// 학생 5명의 국어,영어,수학 성적을 저장하는 2차원 배열을 만들고 평균도 출력
		
		예제2();		// MyMath 클래스 구현
					/* 클래스명 : MyMath
					   메서드 : add() int 2개 리턴:더하기 결과
					   메서드 : subtract() int 2개 리턴:빼기 결과
					   메서드 : multiply() int 2개 리턴:곱하기 결과
					   메서드 : divide() int 2개 리턴:나누기 결과
					 */


	}
	public static void 예제1() {
		
		int arr[][] = new int[][] {		// arr int배열 생성
			{30,50,30}
			,{70,20,90}
			,{100,80,70}
			,{90,40,30}
			,{10,40,100}
		};
		
		System.out.println("국어 \t영어 \t수학 \t평균");		//국어 영어 수학 평균 출력
		
		for(int student[] : arr)			// 학생의 점수를 나타내는 student 변수
		{
			int sum=0;				// sum 초기값 0
			for(int i : student)
			{
				sum+=i;				//학생 점수 누적
				System.out.print(i+" \t");	//국어 영어 수학 점수를 순서대로 출력
			}
			System.out.println(sum/student.length);	//평균을 구하여 출력
		}
		System.out.println(); 
	}
	
	
	public static void 예제2() {
		
		MyMath math = new MyMath();
		
		//divide 호출 500/5 + multiply 호출 3*27 - subtract 호출 181-5 = 176
		int result = math.subtract(math.add(math.divide(500, 5), math.multiply(3, 27)), 5);
		
		System.out.println(result);  	//result 출력
		System.out.println(500/5+3*27-5);	//result와 동일한 결과 출력
	}
}
