package C20230705;

// 상속을 이용하여 다음 클래스들을 간결한 구조로 재작성하라.
class SharpPencil{
	private int width;
	private int amount;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
}

class Ballpen{
	private int amount;
	private String color;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}

class FountainPen{
	private int amount;
	private String color;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	public void refill(int n) {setAmount(n);}
}

// Pen{} 이라는 공통내용을 가진 클래스를 생성한다. 하위 클래스에 사용하기 위해 protected로 지정
class Pen{
	protected int amount;
	protected String color;
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount = amount;}	
	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
}
// 샤프펜슬에는 개별적으로 있는 넓이를 제외하곤 Pen{} 클래스에서 상속받으면 수량에 대한 내용을 사용할수 있다
class SharpPencil1 extends Pen{
	private int width;
}
// 볼펜은 추가적으로 더 구성되어있는것이 없으므로 Pen{}클래스만 상속받으면 요소들을 다 사용할수 있다
class Ballpen1 extends Pen{
	
}
// 만년필은 리필을 위한 수량을 받기위해 int n 이라는 자료형을 setAmount()라는 메서드를 이용하여 상속받아 사용할수 있다 
class FountainPen1 extends Pen{
	public void refill(int n ) {setAmount(n);}
}

public class C20230705 {

	public static void main(String[] args) {
		
		// 10미만의 자연수에서 3과 5의 배수를 구하면 3,5,6,9이다. 이들의 총합은 23이다.
		// 1000미만의 자연수에서 3,5의 배수의 총합을 구하라.
		int i;
		int sum=0;
		for(i=1;i<1000;i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
			}
		}
		System.out.println("1000미만의 자연수에서 3 과 5의 배수의 합: " + sum);
	}
}
