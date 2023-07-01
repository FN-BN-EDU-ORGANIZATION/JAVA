package Songjaeuk.D230630;


 class Person {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("이름 : " + name);
	}

	public final void whoAreYou() {
		System.out.println("이름 : ");
	}
}
 


public class BusinessPerson extends Person {

	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
    
	@Override
	public void showInfo() {
		System.out.println("이름 : 김철수\t회사 : " + company);
	}

	// Overloading (오버로딩)
	public void showInfo(int id) {
		System.out.println("id : " + id);
		showInfo();
	}

	
}
class Main {

	public static void main(String[] args) {
		// Person 클래스의 인스턴스 생성
		Person p1 = new Person();
		p1.setName("김철수");
		p1.showInfo();
		System.out.println();
       
		// BusinessPerson 클래스의 인스턴스를 생성
		BusinessPerson p2 = new BusinessPerson();
		p2.setName("홍길동");
		p2.setCompany("(주)조선");
		p2.showInfo();
	}
}