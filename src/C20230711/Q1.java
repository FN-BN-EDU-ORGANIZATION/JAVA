package C20230711;

//광물 계산기는 금인 경우 100, 은인 경우 90, 구리의 경우는 80의 가치를 더하는 기능(add 메스드)이 있다. 
//하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다. 
//광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정하시오.

interface Mineral{
	int getValue();
}

class Gold implements Mineral{
	public int getValue() {
		return 100;
	}
}

class Silver implements Mineral{
	public int getValue() {
		return 90;
	}
}

class Bronze implements Mineral{
	public int getValue() {
		return 80;
	}
}

class MineralCalculator{
	int v = 0;
	public void add(Mineral m) {
		this.v += m.getValue();
	}
	public int getValue() {
		return this.v;
	}
}

public class Q1 {
	
	public static void main(String[] args) {
		MineralCalculator cal = new MineralCalculator();
		cal.add(new Gold());
		cal.add(new Gold());
		cal.add(new Silver());
		cal.add(new Bronze());
		//금 2 + 은 1 + 구리 1
		//	= 200 + 90 + 80
		//------------------
		//				370
		
		System.out.println(cal.getValue());
		
		
	}
}
