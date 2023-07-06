package JaewonStudy;



public class C20230706 {

	// 의문점
	// 
	
	
	
//		예제1 -  Array관련
	public static void main(String[] args) {
		int[] numbers = {2,-9,0,5,12,-25,22,9,8,12}; // 배열 생성
		int sum = 0;	// sum 변수 선언 및 초기화
		double average;	// average 변수 선언
		
		for(int number : numbers) {	// for문을 이용하여 전체 배열 요소 합을 구해 sum변수에 저장
			sum += number;
		}
		int arrayLength = numbers.length; // arrayLength변수 선언함과 동시에 배열의 개수 저장
				
		average = ((double)sum / (double)arrayLength); // average를 sum과 arrayLength를 double로 형변환하여 계산.
		
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + average);
		// Sum과 Average를 출력.
	
	
//		예제 2 - 향상된 for (Enhanced For)
		String[] strArr = {"향상된","FOR","LOOP","테스트"}; // String arraylist 생성
		for(String arr : strArr) {	// enhanced for문을 이용하여 모든배열 요수 출력.
			System.out.println(arr);
		}
	}	
}
