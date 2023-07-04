package C20230704;

class Marine {
	int hp = 40;
	static int shootingRange = 6;
}

public class C20230704 {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
			
		m1.shootingRange = 10;
		System.out.println(m1.shootingRange);
		m2.shootingRange = 20;
		System.out.println(m2.shootingRange);
		m2.shootingRange = 30;
		System.out.println(m3.shootingRange);
		
	}
}
