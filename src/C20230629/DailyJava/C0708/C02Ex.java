package C0708;

class ChildProperty{
//	멤버변수 생성
	int beadvalue;
//	전달받은 구슬 개수 저장
	ChildProperty(int beadvalue){
		this.beadvalue=beadvalue;
	}
//	구슬 잃는 개수만큼 저장 
	void loseBead(int lose) {
		beadvalue -= lose;
	}
//	구슬 얻는 아이와 개수 저장
	void obtainBead(ChildProperty child, int obtain) {
		beadvalue += obtain;
		child.loseBead(obtain);
	}
//	보유 구슬 개수를 보여주는 메서드
	void showProperty() {
		System.out.println("보유 구슬 개수 " + beadvalue);
	}
}

public class C02Ex {
	public static void main(String[] args) {
		ChildProperty child1 = new ChildProperty(20);
		ChildProperty child2 = new ChildProperty(15);
		
		System.out.println("게임 전 구슬의 보유 개수");
		System.out.print("어린이 1 : ");
		child1.showProperty();
		System.out.print("어린이 2 : ");
		child2.showProperty();
		
		child1.obtainBead(child2,5);
		
		child2.obtainBead(child1,9);
		
		System.out.println("게임 후 구슬의 보유 개수");
		System.out.print("어린이 1 : ");
		child1.showProperty();
		System.out.print("어린이 2 : ");
		child2.showProperty();
	}
}
