package C20230630;

public class C20230630 {
	public static void main(String[] args) {
		// 이차원 인트 배열 num을 선언하고 크기를 2 x 3으로 지정하고 값을 초기화
		int num[][] = { {80,90,4},{-30,54,32}}; 
		// 바깥쪽 반복문으로 num 배열의 첫 번째 인덱스를 0으로 설정하고, 2 (num 배열의 행의 개수)보다 작을 때까지 반복
		for(int i=0; i<2; i++) {
			// 안쪽 반복문으로 num 배열의 두 번째 인덱스를 0으로 설정하고, 3 (num 배열의 열의 개수)보다 작을 때까지 반복
			for(int j=0; j<3; j++){
				// num 배열의 i행 j열의 요소값 출력
				System.out.println(num[i][j]);
			}
		}
		// 이차원 인트 배열 num2을 선언하고 크기를 2 x 3으로 지정하고 값을 초기화
		int num2[][]= {{20,40,60},{-30,50,70}}; // 배열의 요소 합을 저장할 변수 sum을 선언하고 0으로 초기화
		int sum=0;// num2 배열의 두 번째 인덱스(열)를 기준으로 바깥쪽 반복문 실행
		for(int i =0; i<2; i++) {
			// num2 배열의 첫 번째 인덱스(행)를 기준으로 안쪽 반복문 실행
			for(int j=0; j<3; j++) {
				// num2 배열의 i행 j열의 요소값을 sum에 더하기
				sum+=num[i][j];
				// 더해진 sum 값 출력
				System.out.println(sum);
			}
		}
		
		
	}
}
