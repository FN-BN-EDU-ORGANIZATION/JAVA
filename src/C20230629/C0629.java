package C0629;

import java.util.Scanner;

import C0629.Child;
import C0629.Parent;

class Parent{
	
	String name = "오구";			//인스턴스 변수 "오구"로 초기화
	int age = 26;					//인스턴스 변수 26으로 초기화
	
	Parent()			//기본 생성자
	{
		
	}
	
	Parent(String name, int age)		//매개변수를 받는 생성자로 인스턴스 변수에 값을 할당
	{
		this.name = name;				
		this.age = age;
	}
	
	void ShowState()			// name과 age 출력하는 메서드
	{
		System.out.println("이름 : " + name + " 나이 : " + age);
	}
}
class Child extends Parent{		//Parent 클래스를 상속 받는 Child 클래스
	
	Child()				//Child의 기본 생성자
	{

	}
}




public class C0629 {

	public static void main(String[] args) {
		
		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		예제1();		//백준 별찍기 2442번 - 삼각형 출력
		예제2();		//백준 별찍기 2443번 - 역삼각형 출력
		예제3();		//상속 기본 이해

		
		
		

	}
	public static void 예제1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");		//숫자를 입력하세요 출력 후 입력된 숫자를 변수 a에 저장
		int a = sc.nextInt();
		
	    for(int i=1;i<=a;i++)				// int i는 1부터 입력 받은 a까지 반복
	    {
	        for(int j=i;j<a;j++)
	        {
	          System.out.print(" ");		// int j는 i부터 a보다 작을 때까지 반복하며 공백 출력
	        }
	        for(int k=0;k<i*2-1;k++)		// int k는 0부터 i*2-1보다 작을 때까지 반복하여 * 출력
	        {
	        	System.out.print("*");
	        }
	        System.out.println(); 			// 줄바꿈
	    }
	}
	
	public static void 예제2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");		//숫자를 입력하세요 출력 후 입력된 숫자를 변수 a에 저장
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++)			// int i는 1부터 입력 받은 a까지 반복
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");		//int j는 1부터 i보다 작을 때까지 반복하며 공백 출력
			}
			for(int k=(a*2)-(i*2-1);k>0;k--)	// int k는 *을 출력하는 반복문이며 k가 0보다 클 때까지 반복을 합니다. 
			{									// 초기값은(a*2)-(i*2-1)으로 시작하는데 문제를 보면 입력을 5로 했지만
				System.out.print("*");			// 처음 출력된 별이 9개로 시작하기 때문에 초기값을 저렇게 설정하였습니다. 
			}
			System.out.println();			// 줄 바꿈
		}
		
	}
	public static void 예제3() {
		
		Parent p = new Parent();		// Parent 클래스의 객체 p 생성 name="오구", age=26으로 초기화
		Child child = new Child();		// Child 클래스의 객체 child 생성 
										// Parent를 상속받았기 때문에 child 객체에도 name="오구", age=26으로 초기화가 된다.
		
		
		p.ShowState();				// Parent의 name+age를 호출하는 메서드 실행
		child.ShowState();			// Paretn의 ShowState 메서드를 상속받아 name+age를 호출하는 메서드 실행
	}

}
