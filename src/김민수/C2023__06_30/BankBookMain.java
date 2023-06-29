package 김민수.C2023__06_30;
//객체지향적 문법들이 설계와 밀접적으로 와닿지 않아 설계와 관련된 예제들을 작성하고 해석하고자 함.
//객체지향은 객체의 메시지(객체와 객체 사이에 송신과 수신의 관계)를 중심으로 설계가 이루어지지만, 기초적으로 객체 하나부터 생성하여 어떻게 사용할 지에 대한 공부부터 시작하려고 함.

//명세서:사용자는 예금(돈을 은행에 넣는다.)과 출금(돈을 은행에서 인출한다.)을 통해 예금주가 민수인 통장의 잔액을 확인 할 수 있다.

//의문점? 객체에 객체 혹은 메서드를 모듈화를 시키면 기본적으로 정보은닉을 가지는 것 같은데, 보통 정보은닉과 모듈화의 개념을 개별적으로 본다. 
//     솔직히 모듈화(정보은닉을 포함)인 것 같은데, 구체적인 코드들이 있으면 좋을 것 같다.
class BankBook {
	
	private int money;
	//접근제한자를 두어 외부로부터 정보은닉을 가짐을 알 수 있다. 이와같은 정보은닉은 개별 객체를 생성했을 때 외부와 연결되는(public) 모듈화를 
	//통해 로직을 기능적으로 사용할 수 있지만 내부의 데이터와 기능은 외부에서 변경할 수 없도록 한다.
	public void deposit(int money) {
		this.money += money;
	//통장의 부품인 예금의 기능을 가지기는 하지만 외부에서 돈을 변경 할 수는 없도록 하였다.	
	}
	public void withdraw(int money) {
		this.money -= money;
	}	
	//통장의 부품인 출금의 기능을 가지기는 하지만 외부에서 돈을 변경 할 수는 없도록 하였다.
	public void showMoney() {
		
		System.out.println("잔액은"+money+"원 입니다.");
	}
}
public class BankBookMain {

	public static void main(String[] args) {

		//통장 생성
		BankBook minsu = new BankBook();
		//예금주가 민수라는 통장 객체를 생성하였고, 컴파일러에 의해 기본 생성자가 생성되었다.
		minsu.deposit(1500); //예금 1500원
		minsu.showMoney();
		minsu.deposit(700);	//예금 700원
		minsu.showMoney();
		minsu.withdraw(500); //출금 500원
		minsu.showMoney();  //마지막으로 잔액은 1700원이다.
	}
}