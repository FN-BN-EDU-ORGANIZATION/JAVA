package C202307;

public class C20230703 {

	public static void main(String[] args) {
		//배, 사과, 오렌지를 키우고 있는데 각 과일의 하루 생산량은 각각 5, 6, 7개
		//1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력
		//2)시간당 과일의 생산 갯수를 출력

		//단, 과일의 갯수를 저장하는 변수는 int타입으로 하루에 생산되는 과일의 총 갯수를 저장하는 변수도 int타입으로
		//시간당 생산 갯수를 저장할 변수는 float타입으로 작성할 것.
		int pear = 5;
		int apple = 6;
		int orange = 7;

		int total = pear + apple + orange;
		float avg = total / 24f;

		System.out.println("하루에 생산되는 과일의 총 갯수 :"+ total + "개");
		System.out.println("시간당 생산 갯수 :"+ avg + "개");
		
		//변수 n에 정수값을 저장하고 1부터 입력받은 정수 n까지의 합을 계산하여 
		//그 결과를 출력하는 프로그램을 작성.예를들어 정수 5를 입력받으면, 1 + 2 + 3 + 4 + 5의 연산결과인 15를 출력해야 한다.
		int result = 0;
		int n = 5;

		for(int i = 1; i <= n; i++) {
		    result += i;
		}

		System.out.println("결과 :"+ result);
	}

}
