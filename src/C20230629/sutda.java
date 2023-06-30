package C20230629;

//예제3 - 자바의 정석 섯다카드

class SutdaCard{

	int num =(int)(Math.random()*10);
	boolean isKwang;
	SutdaCard(){
		this(3,false);
	}
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	
	public void info(){
		System.out.println(this.num);
		if(this.isKwang==false) {
			System.out.println("1K");
		} else {
			System.out.println("is Kwang");
		}
	}
	
}

public class sutda {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		SutdaCard card2 = new SutdaCard(3,true);
		card1.info();
		card2.info();
	}

}
