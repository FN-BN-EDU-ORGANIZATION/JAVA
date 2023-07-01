package 자바내용정리;

class mango{
	int age;
	String name;
	String say;
	
	mango(String say){	//생성자
		this.say = say;
		System.out.println(say);
	}
}

public class 자바0630 {
	public static void main(String[] args) {
		String sayme = "안녕";
		mango me = new mango(sayme);
	}

}
