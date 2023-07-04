package C20230704;
class MR{
	int hp = 80;
	int power;
	int armer;
	void showState(){
		
		System.out.println("마린의 정보");
		System.out.println("체력"+hp);
		System.out.println("공격력"+power);
		System.out.println("방어력"+armer);
	}
	void powerup() {
		//매개변수 없음 , 내용 모든 유닛의 power을 1 증가 시킨다, 리턴없음
		power = 10;
		power++; //공격력 11
		
	}
	void armerup() {
		//매개변수 없음 , 내용 모든 유닛의 power을 1 증가 시킨다, 리턴없음
		armer = 5;
		armer++; //방어력 6
	}
	void attack(MR target) {
		int damage = power - target.armer;
        target.hp -= damage;
        
	}
}
public class C20230704EX02 {

	public static void main(String[] args) {
		/* 1-1
		 * 마린 클래스를 만들고 객체를 생성하여 사용해보자\
		 * 멤버변수 int hp , int power(공격력) , int armer(방어력)
		 * 멤버 메서드 : showState() 객체의 상태를 표시한다.
		 */
		MR mr1 = new MR();
		MR mr2 = new MR();
		MR mr3 = new MR();
		
		
		//2-2 모든 객체가 같은 공격력을 가지며 업그레이드시 모든 객체가 다같이 올라가야한다.
		//power , armer 변수가 수정 되어야 한다.
		mr1.powerup();
		mr1.armerup();
		
		mr2.powerup();
		mr2.armerup();
		
//		mr3.powerup();
//		mr3.armerup();
		
		//2-3 mr 클래스의 attack 메서드를 구하자
		//멤버메서드 void attack (Marine target)
		//매개 변수로 받은 marine 객체의 체력을 감소시킨다
		//공격시(공격력 - 상대방의 방어력) 만큼 체력을 감소시킨다 .
		mr1.attack(mr2); //어택 메소드 호출 및 매개변수 m2// (체력80 , 공격력 11 , 방어력 6)
		
		mr1.showState();
		System.out.println();
		mr2.showState();
		System.out.println();
//		mr3.showState();
//		System.out.println();
		
		
	}

}
