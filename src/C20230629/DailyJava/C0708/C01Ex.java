package C0708;

class Inform{
//	멤버 변수 정의
	int age; String name; boolean married; int babnum;
//	모든 인자를 받는 생성자 생성
	Inform(int age,String name,boolean married,int babnum){
		this.age = age;
		this.name = name;
		this.married = married;
		this.babnum = babnum;
	}
}

public class C01Ex {
	public static void main(String[] args) {
		Inform person = new Inform(30,"홍길동",true,3);
		System.out.println("나이 : " + person.age);
		System.out.println("이름 : " + person.name);
		System.out.println("결혼여부 : " + person.married);
		System.out.println("자녀 수 : " + person.babnum);
	}
}
