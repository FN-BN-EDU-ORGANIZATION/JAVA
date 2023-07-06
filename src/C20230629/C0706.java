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
	
	
}

class Student{
	
	String name;
	int kor,eng,math;
	
	int getTotal()
	{
		return kor+eng+math;
	}
	
	int getAverage()
	{
		return getTotal()/3;
	}
}
public class C0706 {

	public static void main(String[] args) {
		
		
		
		예제1();		//Student 클래스를 구현 후 출력
					/*
					 클래스명 : Student
					 멤버변수 : String name;
					 		  int kor;
					 		  int eng;
					 		  int math;
					 메서드 : getTotal() return 합계
					 		getAverage() return 평균
					 */
		
		예제2();		// 앞에서 만든 MyMath 클래스의 add메서드를 float과 double도 가능하도록 오버로딩하기

	}
	public static void 예제1() {
		Student[] students = new Student[5];	// 배열의 크기가 5인 students 생성
		
		students[0] = new Student();	// students 배열의 인덱스에 Student 객체를 생성하고 저장
		students[1] = new Student();
		students[2] = new Student();
		students[3] = new Student();
		students[4] = new Student();
		
		System.out.println("국어 \t영어 \t수학 \t합계 \t평균");		//국어 영어 수학 합계 평균 출력
		for(Student std : students)				// students 배열의 각 학생 반복
		{
			std.kor = (int)(Math.random()*100)+1;		// 1부터 100사이의 랜덤 값을 생성 후 대입
			std.eng = (int)(Math.random()*100)+1;
			std.math = (int)(Math.random()*100)+1;
		
		System.out.println(std.kor
				+"\t"+std.eng
				+"\t"+std.math
				+"\t"+std.getTotal()
				+"\t"+std.getAverage());		//국어 영어 수학 합계 평균 출력
		}
	}

	public static void 예제2() {
		
		MyMath math = new MyMath();  // math 객체 생성
		
		float result = math.add(30.5f, 25.5f); // result 변수에 30.5f + 25.5f 더한 값을 저장
		System.out.println(result);		// result 출력
		
		double result2 = math.add(30.5, 25.5); // result2 변수에 30.5 + 25.5 더한 값을 저장
		System.out.println(result2);	// result2 출력
		
		
		
	}

}
