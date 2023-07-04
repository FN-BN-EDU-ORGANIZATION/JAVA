package 박영민; // 패키지명 : 클래스를 분류하고 폴더와 같은 역할을 한다.

public class Home0703 { // 클래스명 : 객체지향언어의 핵심 (파일명과 동일해야한다)

	public static void main(String[] args) { // 엔트리포인트 : 프로그램의 시작 지점

		System.out.println("-------------"); // 모니터로 데이터를 표시해주는 표준 입출력 함수

		// 예제1
		int age; // int : 변수타입 age : 변수명 int라는 변수타입을 가진 변수를 선언한다.
		age = 25; // '=' 이라는 대입연산자를 사용해 변수에 오른쪽 값을 저장한다. 변수에 값을 담는것이 초기화라고 한다.

		int a, b, c; // 선언만 할수도 있다.
		int d = 4, e = 10, f = 20; // 한번에 여러개의 변수선언과 초기화도 가능하다.

		System.out.println("나이 : " + age); // 나이 : 25 로 출력된다.
		// 예제2
		System.out.println("-------------");
		int small = 100; // int 타입 small에 100의 값을 저장한다.
		int big = 200; // int 타입 big에 200의 값을 저장한다.
		int middle; // int 타입 middle을 선언한다.

		middle = small; // small의 100을 middle에 저장한다.
		small = big; // big의 200을 small에 저장한다.
		big = middle; // middle의 100을 big에 저장한다.

		System.out.println("small : " + small + " big : " + big);
		// 처음에 초기화한 각각의 값이 아닌 서로 바뀐 값을 출력한다.

		System.out.println("-------------");

		// Bonus
		int A = 100;
		int B = 200;
		int C = 3;

		C = A; // A의 값 1을 C에 넣는다.
		A = B; // B의 값 2를 A에 넣는다.
		B = C; // B의 값 2를 C에 넣는다.

		System.out.println(A + "," + B + "," + C);
		// 초기화가 된 값이라도 결국 담는거에 결과가 달라진다. 쓸모가 없는듯.
	}
}