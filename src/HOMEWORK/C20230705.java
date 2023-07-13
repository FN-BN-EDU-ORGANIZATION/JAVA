package HOMEWORK;

import java.util.Scanner;

import HOMEWORK2.Circle;
import HOMEWORK2.Triangle;

	//의문점
	
	//정리
	
	//예제 1 : 클래스 기초 연습문제 - 삼각형, 사각형, 원 클래스 정의 후 객체생성, 선택한 도형의 넓이를 구하는 프로그램 만들기
	class Triangle { //삼각형 클래스
		public int width;	//가로
		public int height;	//세로

		public void area() { //삼각형 넓이 구하는 기능 구현
			System.out.println("삼각형의 넓이 : " + ((width * height) / 2)); 
		}
	}

	class Rectangle { //사각형 클래스
		public int width;	//가로
		public int height;	//세로
	
		public void area() { //사각형 넓이 구하는 기능 구현
			System.out.println("사각형의 넓이 : " + (width * height));
		}
	}

	class Circle { //원형 클래스
		public int half_width;	//반지름

		public void area() { //원형 넓이 구하는 기능 구현
			System.out.println("원의 넓이 : " + (half_width * half_width) * 3.14);
		}
	}

public class C20230705 {

//	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//객체 생성
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();

		System.out.println("넓이를 구할 도형을 입력하세요");
		System.out.println("1.삼각형 2.사각형 3.원");
		int num = sc.nextInt();
		switch (num) { //switch문으로 도형 선택
		case 1:
			System.out.println("밑변과 높이 입력");
			tri.width = sc.nextInt();
			tri.height = sc.nextInt();
			tri.area();
			break;

		case 2:
			System.out.println("밑변과 높이 입력");
			rec.width = sc.nextInt();
			rec.height = sc.nextInt();
			rec.area();
			break;

		case 3:
			System.out.println("반지름 입력");
			cir.half_width = sc.nextInt();
			cir.area();
			break;

		default:
			System.out.println("숫자를 다시 입력하세요");
//			return;
		}

	}
	
	
	
	//예제 2 : 클래스 연습문제 - 키, 몸무게 입력받아 BMI지수 계산
	class Person{ //사람 클래스 생성
		double height;
		double weight;
		double BMI;
		
		Person(double height, double weight){ //인자를 받는 생성자 구현
			this.height = height;
			this.weight = weight;
		}
		
		void BMI_out() { //BMI지수 출력하는 기능 구현
			System.out.println("당신의 BMI지수는 : ");
			BMI = weight / ((height/100)*(height/100));
			System.out.print(BMI);
			
			if(BMI >=0 && BMI < 18.6) { //BMI에 따른 출력조건 구현
				System.out.println("저체중");
			} else if(BMI >= 18.6 && BMI < 22.9) {
				System.out.println("정상");
			} else if(BMI >= 22.9 && BMI < 24.9) {
				System.out.println("과체중");
			} else if(BMI >= 24.9 && BMI < 30) {
				System.out.println("비만");
			} else if (BMI >= 30) {
				System.out.println("고도비만");
			}
			
			
		}
		
	}
	
//	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int height;
		int weight;
		
		System.out.println("키 : ");
		height = sc.nextInt();
		System.out.println("몸무게 : ");
		weight = sc.nextInt();
		
		Person man = new Person(height,weight);
		
		man.BMI_out();
		
	}
	
	
	
}

