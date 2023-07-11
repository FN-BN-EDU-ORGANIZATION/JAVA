package C20230711;

import java.util.Scanner;

class student{
	public String name;
	public int age;
	public double height;
}

class Triangle{
	int width=0;
	int height=0;
	
	int tri_area() {
		return (width*height)/2;
	}
}

class Rectangle{
	int width=0;
	int height=0;
	
	int rec_area() {
		return (width*height);
	}
}
class Circle{
	double radius=0;
	final double pi=3.14;
	
	double cir_area() {
		return (radius*radius*pi);
	}
}

public class C20230711 {
	public static void main(String[] args) {
		//클래스 기초 연습
		
		//student 클래스의 객체를 생성하여 
		//멤버 변수에 값을 대입한 다음 출력
		Scanner input = new Scanner(System.in);
		
		student std1 = new student();
		System.out.println("이름을 입력하세요.");
		std1.name=input.nextLine();
		
		System.out.println("나이를 입력하세요");
		std1.age=input.nextInt();
		
		System.out.println("키를 입력하세요 ");
		std1.height=input.nextDouble();
		
		System.out.println("이름 : "+std1.name);
		System.out.println("나이 : "+std1.age);
		System.out.println("키 : "+std1.height);
		
		//---------------------------------------
		
		//삼각형 클래스를 정의하고 객체 생성및 도형의 넓이구하기
		Triangle tri1= new Triangle();
		Scanner sc= new Scanner(System.in);
		System.out.println("밑변과 높이를 입력해주세요.");
		tri1.width = sc.nextInt();
		tri1.height=sc.nextInt();
		System.out.println("삼각형의 넓이는 "+tri1.tri_area());
		
		//-------------------------------------------------
		
		//위 클래스 기초를 이용하여 삼각형,사각형,원의 클래스를 정의하고 객체를 생성후
		// 선택한 도형의 넓이를 구하라
		Triangle tri = new Triangle();
		Rectangle rec = new Rectangle();
		Circle cir = new Circle();
		
		int choice =0;
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("넓이를 구할 도형을 입력하세요.");
		System.out.println("1.삼각형 2.사각형 3.원");
		choice = input1.nextInt();
		
		if(choice==1) {
			System.out.println("밑변과 높이를 입력해주세요.");
			tri.width = input1.nextInt();
			tri.height=input1.nextInt();
			System.out.println("삼각형의 넓이는 "+tri.tri_area());
		}
		else if(choice==2) {
			System.out.println("밑변과 높이를 입력해주세요.");
			rec.width = input1.nextInt();
			rec.height=input1.nextInt();
			System.out.println("사각형의 넓이는 "+rec.rec_area());
		}
		else if(choice==3) {
			System.out.println("반지름을 입력해주세요.");
			cir.radius=input1.nextDouble();
			System.out.println("원의 넓이는 "+cir.cir_area());
		}
		
	}
}
