package Songjaeuk.D230705;



// 추상 클래스
abstract class Shape {
    private String color;

    // 생성자
    public Shape(String color) {
        this.color = color;
    }

    // 추상 메서드: 면적을 계산하는 기능을 구현하는 메서드
    public abstract double getArea();

    // 일반 메서드: 색상을 반환하는 메서드
    public String getColor() {
        return color;
    }
}

// Circle 클래스: Shape 클래스를 상속받음
class Circle extends Shape {
    private double radius;

    // 생성자
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // 추상 메서드 구현
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle 클래스: Shape 클래스를 상속받음
class Rectangle extends Shape {
    private double width;
    private double height;

    // 생성자
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // 추상 메서드 구현
    public double getArea() {
        return width * height;
    }
}

public class Exam01 {

	// 메인 클래스
	
	    public static void main(String[] args) {
	        // Circle 객체 생성
	        Circle circle = new Circle("Red", 2.0);
	        System.out.println("Circle Area: " + circle.getArea()); // 동그라미의 면적 출력
	        System.out.println("Circle Color: " + circle.getColor()); // 동그라미의 색상 출력

	        // Rectangle 객체 생성
	        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);
	        System.out.println("Rectangle Area: " + rectangle.getArea()); // 사각형의 면적 출력
	        System.out.println("Rectangle Color: " + rectangle.getColor()); // 사각형의 색상 출력
	    }
	}

}
