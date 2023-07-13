package 이찬진;

public class C20230713 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(2,2,8,7);
		Rectangle s = new Rectangle(5,5,6,6);
		Rectangle t = new Rectangle(1,1,10,10);
		
		r.show();
		System.out.println("s의 면적은"+s.square());
		if(t.contains(r)) {System.out.println("t는 r을 포함합니다");}
		if(t.contains(s)) {System.out.println("t는 s을 포함합니다");}

	}
static class Rectangle{
	int x,y,width,height;

	Rectangle(int a, int b, int c, int d) {
		x=a;
		y=b;
		width=c;
		height=d;
	}
	int square() {
		return width*height;
	}
	void show() {
		System.out.println("("+x+","+y+")에서 크기가"+width+"*"+height+"인 사각형");
	}
	boolean contains(Rectangle r) {
		if(((this.x+this.width)>(r.x+r.width))&&((this.y+this.height)>(r.y+r.height))) {
			return true;
		}else return false;
	}
	
}

}
