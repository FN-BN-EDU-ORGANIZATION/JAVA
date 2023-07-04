package study;

public class C0704 {

	public static void main(String[] args) {
		
		
		예제1();	// int 타입 길이5의 배열을 만들어 임의의 값을 넣어 평균을 구하시오.(결과는 float으로 출력)
		예제2();	// int 타입 길이 10의 배열을 만들고 임의의 값을 넣어 최대값과 최소값을 출력
		
		
		
		
		
	}
	public static void 예제1() {
		
		int arr[] = new int[5];		//int타입의 길이가 5인 배열 arr생성
		
		arr[0] = 10;		//0번 인덱스에 10 저장
		arr[1] = 20;		//1번 인덱스에 20 저장
		arr[2] = 30;		//2번 인덱스에 30 저장
		arr[3] = 40;		//3번 인덱스에 40 저장
		arr[4] = 50;		//4번 인덱스에 50 저장
		
		int sum = 0;		//sum변수 0으로 초기화
		
		for(int i=0;i<arr.length;i++)		// i를 0부터 arr의 길이(5) 미만까지 반복
			sum += arr[i];			//sum에 i의 해당하는 arr요소 값을 더한다
		System.out.println(sum/(float)arr.length); //sum을 arr의 길이(5)만큼으로 나누고 float으로 형변환
		
		
		
	}
	public static void 예제2() {
		
		int arr[] = {5,478,41,2,45,758,14,3,97,10};	//정수 10개가 포함된 변수 arr 초기화
		
		int max,min;	//max, min 변수 선언
		
		max = arr[0];	//초기값으로 arr[0] 할당
		min = arr[0];	//초기값으로 arr[0] 할당
				
		for(int i = 0 ;i<arr.length; i++)	//i는 0부터 arr의 길이까지 반복
		{
			if(max<arr[i])			//arr[i]가 max보다 크다면
				max = arr[i];		//max에 arr[i]값 할당
			
			if(min>arr[i])			//arr[i]가 min보다 작다면
				min = arr[i];		//min에 arr[i]값 할당

		}
		
		System.out.println("최대값은 : " + max);
		System.out.println("최소값은 : " + min);
	}

}
