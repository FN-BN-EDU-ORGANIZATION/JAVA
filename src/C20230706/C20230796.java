package mystudy01_arr_class;





public class Student1 {
	
	private String name;
	private int age;
	
	//Getter, Setter
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

	//원래 기본으로 있는 생성자
	//Constructor = 생성자
	//메모리에서 Student 모양(String 타입 값 하나랑 int 값 하나를 저장할 모양)의 공간을 하나 할당할 때
	//하는 행동
	
	//생성자를 새로 만들면 없어지기 때문에
	//이 기본 생성자를 다시 쓰고 싶으면 내가 명시적으로 써줘야 한다.
	
	public Student1(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}
	public Student1() {
		//super();
	}
	
	
	public void sleep() {
		System.out.println(name+"학생은 잠을 잡니다.\n" + age+"살때는 많이 자야죠.");
	}
	public void study() {
		System.out.println(name+"학생은 책상에서 공부합니다.\n"+age+"살이니 많이 해야죠.");
	}
	public void play() {
		System.out.println(name+"학생은 놉니다.\n"+age+"살이니 많이 놀아야죠.");
	}
	
	//패키지(=폴더) 가 달라도 public 이 붙어있으면 불러올수있따
	//protected 는 패키지가 같으면 불러올수 없다
	package mystudy01_arr_class;

import mystudy01_arr_class.Student;

public class Myjava01_Array {

		public static void main(String[] args) {
			//배열
			//하나의 변수가 여러 개의 값을 관리하는것
			int [] numarr = new int[5];
			int [] numarr1 = {1,2,3,4,5};
			numarr[0] = 10;
			numarr[1] = 10;
			numarr[2] = 10;
			numarr[3] = 10;
			numarr[4] = 10;
			System.out.println(numarr[0]);
			System.out.println(numarr[numarr.length-1]);
			
			
			int a = 30;
			
			//클래스 배열
			//왜 생성자라는 것이 필요한 지
			Student s1 = new Student();
			Student s2 = new Student("이나경",20);
			//s1, s2 는 배열처럼 메모리의 시작점을 가리키는 것
			
			Student[] students = new Student[2];
			students[0] = s1;
			students[1] = s2;
			
			//생성자를 만드는 이유
			//생성자를 만들어야지만 heap 영역에 메모리가 할당됨
			//무슨 말이나면 new 클래스명() 이렇게 적어줘야지만 메모리가 할당이 된다
			//그 전엔 메모리 자체가 없다.
			
			
			
			
		}

	}

	

}
