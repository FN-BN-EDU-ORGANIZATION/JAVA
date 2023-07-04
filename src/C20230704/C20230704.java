package C20230704;

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성. main()메소드를 포함하고 실행 결과와 같이 출력되게 하라

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String str) {
		this.color = str;
	}

	public String toString() {
		String str = color + "색의" + "(" + getX()+ "," + getY() + ")의 점";
		return str;
	}
	
}

// Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스 작성. main()메소드를 포함하고 실행결과와 같이 출력되게 하라

class ColorPoints extends Point{
	private String color;
	public ColorPoints() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPoints(int x, int y) {
		super(x,y);
		this.color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		String str = color + "색의" + "(" + getX()+ "," + getY() + ")의 점";
		return str;
	}
}

public class C20230704 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10,20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
		//RED색의 (10,20)의 점입니다.
		
		
		ColorPoints zeroPoint = new ColorPoints();
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoints cp1 = new ColorPoints(10,10);
		cp1.setXY(5,5);
		cp1.setColor("RED");
		System.out.println(cp1.toString() + "입니다.");
		
		//BLACK색의 (0,0)점입니다.
		//RED색의 (5,5)점입니다.
		
	}
}
