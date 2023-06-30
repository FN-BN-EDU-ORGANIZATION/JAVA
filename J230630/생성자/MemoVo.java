package J230630.생성자;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVo {

//	멤버 변수의 종류는 정적(static)멤버 변수와 인스턴스 멤버 변수가 있다
//	인스턴스 멤버 변수는 현재 클래스로 생성 되는 모든 객체에서 독립된 기억공간을 가신다
//	정적 멤버 변수는 현재 클래스로 생성되는 모든 객체에서 공유해서 사용한다.
	public static int count;
	private int no; //접근이 불가능한, 정수를 기억하는 변수, 0 자동 초기화
	//▲객체가 생성 될 때마다 자동으로 1씩 증가
	private String name; //접근이 불가능한, 문자열을 기억하는 변수, null 자동 초기화
	private boolean gender; //접근이 불가능한, 성별을 기억하는 변수, false 자동 초기화
	private String memo; //접근이 불가능한, 실수를 기억하는 변수,  0 자동 초기화
	private Date writeDate; //접근이 불가능한, 객체 생성 순간의 날짜를 기억하는 변수, null 자동 초기화

//생성자 메서드 (이하생성자)
	//생성자 이름은 반드시 클래스 이름과 같아야 한다.
	//생성자는 return을 가지지 않는다. return을 가지지 않는 메소드는 접근 권한에 "void"를 입력하는데 생성자는 접근 권한을 쓰지 않는다.
	//생성자를 선언하지 않으면 자바 컴파일러가 아무런 일도 하지 않는 기본생성자를 만들어 준다
	//하지만 사용자가 생성자를 선언하면 기본 생성자는 자동으로 생성되지 않는다
	//생성자는 객체가 생성될 때 자동으로, 실행되며 멤버 변수를 초기화 시키는 목적으로 사용한다.
	//마우스 우클릭 -> source //컨트롤 + 스페이스 (기본생성자)
	public MemoVo() {
//		System.out.println("기본 생성자가 실행 됩니다.");
//		name = "무명씨";
//		gender = false;
//		memo = "없음";
		this("무명씨",false,"없음"); //생성자 MemoVo(String name, boolean gender, String meno 실행
	}
//	public MemoVo(String name, boolean gender, String meno) {
//		//▲ name,gender,memo 데이터를 넘겨 받아서 초기화
//		//같은 {} 블록에 같은 이름을 가지는 지역 변수와 멤버 변수가 있을 경우 지역변수에 우선권
//		this.name = name; 
//		this.gender = gender;
//		this.memo = memo;
//	}
//	우클릭 -> source -> Generate Constructor using Fields

	public MemoVo(String name, boolean gender, String memo) {
//		super(); : 부모클래스의 생성자, 생략하면 super()를 컴파일러가 자동으로 넣어준다
//		this() : 현재 클래스의 생성자를 의미
//		super()와 this는 반드시 생성자의 첫줄에 코딩해야 한다.
//		super : 부모 클래스를 의미.
//		this : 현재 클래스를 의미.
		no = ++count;
		this.name = name;
		this.gender = gender;
		this.memo = memo;
		writeDate = new Date();
		
	}
//private 권한으로 설정된 멤버 변수는 클래스 외부에서 접근 할 수 없다.
//이 규칙이 너무 엄격히 적용 되므로 이 규칙에 대한 예외 지정을 getter and setter 메소드를 사용한다
//	public String getName() {
//		return name;
//	}//getter는 private 권한을 가지는 멤버 변수의 값을 얻어 올 때 사용
//	public void setName(String name) {
//		this.name = name;
//	}//setter는 private 권한을 가지는 멤버 변수의 값을 수정할 때 사용
//	우클릭 -> source -> Generate getter and setter
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	
	
//	객체에 저장된 네용을 출력해야 한다면 toString() 메소드를 override(재정의)
//	우클릭 -> Source -> Generate toString
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd(E) HH:mm:ss.SSS");
		return no + ". " + name +"(" + ( gender ? "남" : "여") + ")님이" + sdf.format(writeDate) +"에남긴말 " + memo ;
	}

	
	
	
}
