package mystudy02_over;
/*
 * private 접근 제어자를 사용하면 해당 멤버 변수는 클래스 내부에서만 접근이 가능하고, 
 * 외부에서는 직접 접근할 수 없습니다. 이를 통해 클래스 외부에서는 멤버 변수에 접근할 수 없으므로, 
 * 변수에 부적절한 값이 저장되거나 무분별한 변경이 발생하는 것을 방지할 수 있습니다.

멤버 변수에 접근하기 위해서는 public으로 선언된 게터(Getter)와 세터(Setter) 메서드를 사용해야 합니다. 
게터 메서드는 멤버 변수의 값을 반환하고, 세터 메서드는 멤버 변수에 값을 설정합니다. 이렇게 접근 제어를 통해 멤버 변수의 유효한 상태를 유지하면서 외부에서는 필요한 데이터에 접근할 수 있습니다.
 */

public class Cat {
	private String name;
	private int age;
	private String species;
	
	
	//기능 메서드 자기, 먹기
	public void eat(String food) {
		System.out.println(food+"가 먹을만하다 ");
	}
	public void sleep(int time) {
		System.out.println(time+"시간 동안 웁니다");
	}
	
	
	
	//생성자 
	//알트 쉬프트 s 누르고 o
	//다른 생성자가 있다면 디퐅트 생성자는 삭제된다 만들고싶으면 명시적으로 만들어줘야한다 
	public Cat(String name, int age, String species) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
	}





	//게터 세터  private 떄문에 
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", species=" + species + "]";
	}


	//모든 클래스의 조상이 object 에서 파생된 메소드
	//오버라이딩 ~ 
	//toStirng 적고 컨트롤 스페이스 ㄱㄱ 

	
}
