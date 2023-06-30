package C0630;

interface Device{
	void on();
	void off();
}

public class C02Ex implements Device{
//	실행 예시와 같이 출력되도록 클래스 TV에 필요한 메소드를 추가 작성하라.
//
//	________ Device {
//	   void on();
//	   void off();
//	}
//	public class TV _________ Device {
//	   public static void main(String[] args) {
//	      TV myTV = new TV();
//	      myTV.on();
//	      myTV.watch();
//	      myTV.off();
//	   }
//	}
//	켜졌습니다.
//	방송중입니다.
//	종료합니다.
	
	public static void main(String[] args) {
		C02Ex myTV = new C02Ex();
		myTV.on();
		myTV.watch();
		myTV.off();
	}
	public void on() {
		System.out.println("켜졌습니다");
	}
	public void off() {
		System.out.println("꺼졌습니다");
	}
	public void watch() {
		System.out.println("방송중입니다");
	}
}
