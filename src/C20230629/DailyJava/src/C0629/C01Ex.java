package C0629;

////	다음 코드를 객체 지향 프로그래밍 관점에서 바람직한 코드로 수정하라.
//class Power {
//	public int kick;
//	public int punch;	
//	
//}
//public class C01Ex {
//	public static void main (String args[]) {
//	    Power robot = new Power();
//	    robot.kick = 10;
//	    robot.punch = 20;
//	}
//}

class Power {
//	변수를 private으로 설정하여 직접 접근할 수 없게 설정하고 
//	setkick과 setpunch 매서드를 사용하여 속성값을 설정할 수 있다.
	private int kick;
	private int punch;	
	public void setkick(int kick) {
		this.kick = kick;
	}
	public void setpunch(int punch) {
		this.punch = punch;
	}
	
}
public class C01Ex {
//	다음 코드를 객체 지향 프로그래밍 관점에서 바람직한 코드로 수정하라.
	public static void main (String args[]) {
	    Power robot = new Power();
	    robot.setkick(10);
	    robot.setpunch(20);
	}
}
