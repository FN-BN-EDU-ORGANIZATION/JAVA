package J230630.추상클래스;

import java.util.Scanner;

//다형성이란 하나의 메소드가 서로 다른 클래스에서 다양하게 사용 되는 것을 말한다.
//다형성을 구현할 메소드를 포함한 클래스는 같은 부모 클래스를 가져야  한다.
//부모 클래스와 자식 클래스에 반드시 같은 메소드가 있어야 하고, 자식 클래스는 이를 반드시 오버라이드 해서 사용
//부모 클래스의 객체에 자식클래스 객체를 대입해서 실행해야 한다.
abstract class Shape{
	public abstract void draw(); //다형성을 구현할 메소드, 추상메소드 상성
}
class Point extends Shape{

	@Override
	public void draw() {
		System.out.println("점을 찍는다");
		
	}
}
class Line extends Shape{
	
	@Override
	public void draw() {
		System.out.println("선을 그린다");
		
	}
}
class Circle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("원을 그린다");
		
	}
}
class Rect extends Shape {

	@Override
	public void draw() {
		System.out.println("사각형을 그린다");
		
	}
	
}
class TriAngle extends Shape{

	@Override
	public void draw() {
		System.out.println("삼각형을 그린다");
		
	}
	
}

public class 다형성 {

	public static void main(String[] args) {
		
//		Shape shape = new Point();
//		shape.draw();
	
		Shape[] shape = {new Point(),new Line(),new Circle(),new Rect(),new TriAngle()};
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 메뉴를 선택하세요 : ");
		int menu = sc.nextInt();
	
		shape[menu - 1].draw();
		
	
}
}