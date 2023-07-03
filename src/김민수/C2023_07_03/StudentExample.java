package 김민수.C2023_07_03;

class People{
	String name; 
	String ssn;
	
	public People(String name, String ssn) {
		this.name=name;
		this.ssn=ssn;
	}
}
class Student extends People{

	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) { //이름과 주민번호 학생번호를 생성자 멤버변수 초기화가 이뤄지는데, 이름과 주민번호는 상위클래스 생성자를 호출한다.
		super(name, ssn); //주석을 처리하면 컴파일러에 의해서 상위클래스의 기본생성자를 호출하기 때문에 컴파일러 에러가 생긴다.
		this.studentNo = studentNo; //하위클래스 멤버변수에 저장된다.
	}
	
}

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동","123456-1234567", 1); //상속을 통해서 이름과 주민번호는 상위클래스 생성자를 호출하여 초기화가 이뤄진다.
		System.out.println("name : "+student.name);
		System.out.println("ssn : "+student.ssn);
		System.out.println("studentNo : "+student.studentNo);
		//상속이 이뤄졌기 때문에 학생 객체는 이름, 주민번호, 학번을 모두 사용할 수 있다.
		
	}
}
