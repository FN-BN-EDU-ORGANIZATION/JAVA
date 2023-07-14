package HOMEWORK2;
	//의문점
	//정리

	//예제1 : 상속 심화
		//Deck클래스에 Card클래스를 포함관계로 작성. 랜덤카드섞기
public class C20230714 {
//	public static void main(String[] args) {
//		Deck d = new Deck(); //카드 한 벌
//		Card c = d.pick(0); //섞기 전 제일 위의 카드 선택(기본값)
//		System.out.println(c); //toString 호출
//		d.shuffle();	//카드 섞기
//		c = d.pick(0);	//섞은 후 제일 위의 카드 선택
//		System.out.println(c); //toString 호출
//		
//	}
//}
//
//class Deck{
//	final int CARD_NUM = 52; //카드 개수
//	Card cardArr[] = new Card[CARD_NUM]; //Card 객체배열
//	
//	Deck() {
//		int i = 0;
//		for(int k=Card.KIND_MAX; k>0; k--) {
//			for(int n=0; n<Card.NUM_MAX; n++) {
//				cardArr[i++] = new Card(k, n+1);
//			}
//		}
//		}
//		
//	Card pick(int index) {	//지정된 위치(index)에 있는 카드 하나를 꺼내서 반환
//		return cardArr[index];
//	}
//	
//	Card pick() {
//		int index = (int)(Math.random() * CARD_NUM); 
//		return pick(index); //cardArr에 저장된 카드 객체 반환
//	}
//	
//	void shuffle() {
//		for(int i=0; i<cardArr.length; i++) {
//			int r = (int)(Math.random() * CARD_NUM); //Math.random()함수를 사용하여 카드 랜덤으로 섞기
//			
//			Card temp = cardArr[i];
//			cardArr[i] = cardArr[i];
//			cardArr[r] = temp;
//		}
//	}
//}
//
//	class Card{
//		static final int KIND_MAX = 4; //카드 모양 수
//		static final int NUM_MAX = 13; //무늬별 카드 수
//		
//		static final int SPADE = 4;
//		static final int DIAMOND = 3;
//		static final int HEART = 2;
//		static final int CLOVER = 1;
//		int kind;
//		int number;
//		
//		Card(){
//			this(SPADE,1);
//		}
//		Card(int kind, int number){
//			this.kind = kind;
//			this.number = number;
//		}
//		
//		public String toString() {
//			String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
//			String numbers = "0123456789XJQK"; //숫자 10은 X
//			return "kind : " + kinds[this.kind]+", number : "+numbers.charAt(this.number);
//		}

	//예제2 : 오버라이딩
		//조상클래스로부터 상속받은 메서드의 내용을 변경하는 것!
		//오버라이딩은 상속받은 클래스의 메서드와 이름, 매개변수, 반환타입이 같아야 한다!
		//오버로딩과 오버라이딩 구분하기!!!!!!!
		//오버로딩은 과적. 메서드의 이름은 같지만 새로운 메서드를 정의하는 것이다! 매개변수의 개수나 타입이 다름!
		//오버라이딩은 상속받은 클래스의 메서드를 수정하여 사용하는 것! 이름, 매개변수, 반환타입이 모두 같아야 한다!!
		//상속에서는 오버라이딩!
	class Point{
		int x;
		int y;
		
		String getLocation() {
			return "x : " + x + ", y : " + y;
		}
	}
	
	class Point3D extends Point{
		int z;
		
		String getLocation() { 
			//Point를 상속받는 Point3D클래스는 상속받은 getLocation()을 자신 클래스의 변수를 포함시켜 반환하도록 오버라이딩 함! 
			return "x : " + x + ", y : " + y + ", z : " + z;
		}
		
		
		
	}
	}