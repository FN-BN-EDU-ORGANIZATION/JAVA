package J230630.접근권한생성자;

public class MemberTest {

	public static void main(String[] args) {
		
		//클래스 객체를 생성하는 방법
		//클래스이름 객체명 = new 생성자();
		MemberVO vo = new MemberVO(); //memberVo클래스의 객체 생성
		//생성된 객체의 멤버에 접근하려면 객체 이름에 "."을 찍어서 접근
		System.out.println(vo.no);
		System.out.println(vo.name);
		System.out.println(vo.gender);
		System.out.println(vo.height);
	}
}
