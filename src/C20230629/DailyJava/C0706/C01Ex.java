package C0706;

public class C01Ex {
//	필드 정의
	public String problem;
	
//	객체를 생성할때 호출되는 생성자
	public C01Ex() {
		System.out.println("C01Ex() 생성자 호출 !");
	}
//	Problem 객체를 인자로 받는 생성자
	public C01Ex(String problem) {
		this.problem = problem;
		System.out.println("C01Ex(Problem problem) 생성자 호출!");
		
	}
//	문제해결되는 메서드
	public void finish() {
		if(this.problem==null) {
			System.out.println("해결할 problem이 없어요");
			return; //메서드 끝내기
		}
		System.out.println("문제가 해결됐어요");
	}
	public static void main(String[] args) {
//		메인 클래에는 C01Ex() 생성자와 C01Ex(String problem)생성자 호출
		C01Ex c1 = new C01Ex();
		C01Ex c2 = new C01Ex("문제!!");
		c2.finish();
	}
}
