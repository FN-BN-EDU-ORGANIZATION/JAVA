package mystudy02_over;


//고양이를 상속받아서 사자를 만들어보자
//마우스 대고 Lion에 선택
public class Lion extends Cat {

	public Lion(String name, int age, String species) {
		super(name, age, species);  //조상 클래스인 cat 에 있는 생성자를 호출한것 
		//cat 에 생성자가 하나빡에 없어서 후손 클래스에선 반드시 이 생서자를  호출해야함 
		
	}
	@Override
	public void eat(String food) {
		System.out.println(food+"산채로 잡아먹습니다 ");
	}
	
	
	//오버로딩
	//매개변수의 개수나 타입이 다르면 메소드의 이름이 같아도된다
	public void eat() {
		System.out.println("백수의 왕");
	}

	@Override
	public String toString() {
		return "Lion [getName()=" + getName() + ", getAge()=" + getAge() + ", getSpecies()=" + getSpecies()
		+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
		+ "]";
	}
	
	
	

}
