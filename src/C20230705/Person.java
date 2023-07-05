package C20230705;
/*
 * 1. Person 클래스를 만든다.
 * 
 * 2. 이름 , 주민번호 , 여권번호가있다 (셋다 String)
 * 
 * 3. 주민번호는 필수 정보이며, 
 * 이름과 여권번호는 알고 있으면 적고 모르면 안 적어도 되는 정보다
 * 
 * 4. 이를 이용해서 class 를 만들고
 * Main에 3명의 사람을 만들고 각각 출력해보세요
 */
public class Person{
	public String name; 		//이름 
	public String sNum; //주민번호 
	public String pNum; //여권번호 
	
	public Person(String n) {
		sNum = n;
	}
	//2 개를 적었을 땐 뭐부터 들어간다고 봐야할까? 여기선 내 판단이 들어가야한다.
	public Person(String sNum, String name) {
		this.sNum = sNum;
		this.name = name;
	}
	public Person(String sNum, String name, String pNum) {
		this.sNum = sNum;
		this.name = name;
		this.pNum = pNum;
	}
	
	
	
}

	


		
	
	

