package 김민수.C2023_07_03;


//명세서 : 휴대폰의 기능을 상속받은 dmb폰을 활용하여 상대방과 전화통화를 한 뒤 dmb 12번 방송을 본 후 dmb를 종료한다.
class CellPhone{ //기본 폰의 기능은 멤버변수로 모델과, 색상을 선택할 수 있고 전원을 키고, 끄고 벨이 울리며 메신저를 송수신 할 수 있다.
	String model;
	String color;
	
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기: "+message);}
	void receiveVoice(String message) {System.out.println("상대방 : "+message);}
	void hangUp() {System.out.println("전화를 끊습니다.");}
}

class DmbCellPhone extends CellPhone{ //dbm폰의 기능을 부과한 뒤 dmb채널을 선택할 수 있는 멤버 변수가 있고 수신, 채널변경, dmb수신 종료할 수 있는 메서드를 하위클래스의 기능을 가진다.
	int channel;
	public DmbCellPhone() {
		super(); //하위 생성자는 상위 생성자를 이미 호출하고 있음. 생략되어있지만, 컴파일러에서 상위생성자를 호출하기 때문에 우리는 당연하게 상속되는지 알고 있음.
	}
	DmbCellPhone(String model, String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 "+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " +channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
public class DmbCellPhoneExample{
	public static void main(String[] args) {
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10); //10번으로 설정한 검정색의 자바폰 객체를 생성한다. 
		//이 때 하위클래스에서 상위클래스의 멤버를 상속받았기 때문에 생성자와 함께 channel만이 아니라 model과 color을 사용할 수 있다.
		System.out.println("모델: "+dmbCellPhone.model); //dmb폰의 모델을 표시한다.
		System.out.println("색상: "+dmbCellPhone.color); //dmb폰의 색상을 표시한다.
		
		System.out.println("채널: "+dmbCellPhone.channel); //dmb폰의 channel을 표싷한다.
		
		dmbCellPhone.powerOn(); //dmb폰을 켠다.
		dmbCellPhone.bell(); //전화벨이 울린다.
		dmbCellPhone.sendVoice("여보세요"); //상대방에게 전화 내용을 전달한다.
		dmbCellPhone.receiveVoice("안녕하세요! 저는 김민수인데요."); //상대방이 나에게 전화 내용을 전달한다.
		dmbCellPhone.sendVoice("아~ 예 반갑습니다."); //대답한다.
		dmbCellPhone.hangUp(); //전화를 끊는다.
		
		dmbCellPhone.turnOnDmb(); //방송을 켠다 지금의 channel은 10번이다..
		dmbCellPhone.changeChannelDmb(12); //12번으로 channel을 옮긴다.
		dmbCellPhone.turnOffDmb(); //방송 수신을 멈춘다.
		
	}
}
