package 박영민;

public class Home0706 {
	
	public static void main(String[] args) {
		//예제1 int형 변수를 나누어서 double로 형변환시켜 값을 내자.
		int a = 3;
		int b = 2;
		
		double c = (double)a/(double)b; //int형 변수를 double로 형변환한다.
		System.out.println(c);
		
		System.out.println("------------------");
		//예제2 문자열을 비교하자
		String A = "안녕하세요";
		String B = "안녕하세요";
		System.out.println(A.equals(B));//같으면 true를 출력
		
	}
}
