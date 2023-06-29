package C0629;

//(1) this()를 이용하여 생성자를 수정하라.

//class TV {
//	   int size;
//	   String manufacturer;
//	   public TV() {
//	      size = 32;
//	      manufacturer = "LG";
//	      System.out.println(size+"인치 "+manufacturer);
//	   }
//	   public TV(String manufacturer) {
//	      this.size = 32;
//	      this.manufacturer = "LG";
//	      System.out.println(size+"인치 "+manufacturer);
//	   }
//	   public TV(int size, String manufacturer) {
//	      this.size = 32;
//	      this.manufacturer = "LG";
//	      System.out.println(size+"인치 "+manufacturer);
//	   }
//	}
class TV{
//	tv클래스에 size와 manufacturer 2개의 속성을 가지고 있고
	int size;
	String manufacturer;
//	매개변수가 없는 생성자
	public TV() {
//		다른 생성자를 호출, size를 32로 manufacturer을 lg로 초기화함
		this(32,"LG");
	}
	public TV(String manufacturer) {
		this(32, manufacturer);
	}
	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
//		인치와 제조사 정보를 출력
		System.out.println(size+"인치 "+manufacturer);
	}
}
public class C02Ex {
	public static void main(String[] args) {
//		tv1, tv2 객체를 생성
		TV tv1 = new TV();
		TV tv2 = new TV("Samsung");
	}
}
