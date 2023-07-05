package 황다은;

public class C20230705 {

	public static void main(String[] args) {
		
		//예제1
//		int[]grade1 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
//
//		int[]grade2 = new int[3]; // 길이가 3인 int형 배열의 선언 및 생성
//
//		grade1[0]=85; // 인덱스를 이용한 배열의 초기화
//		grade1[1]=65;
//		grade1[2]=90;
//
//		grade2[0] = 85; // 배열의 길이보다 적은 수의 배열 요소만 초기화
//
//		for(int i=0; i<grade1.length;i++) {
//		    System.out.print(grade1[i] + " "); // 인덱스를 이용한 배열로의 접근
//		}
//
//		for(int i =0;i<grade2.length;i++) {
//		    System.out.print(grade2[i]+" "); // 인덱스를 이용한 배열로의 접근
//		}
		
		// 정리 :  int형 데이터를 3개 저장할 수 있는 배열을 선언과 동시에 생성하는 예제 풀이
		
		
		//예제 2
//		int[] grade =new int[]{85,65,90}; // 길이가 3인 int형 배열을 선언과 동시에 초기화
//
//		int sum = 0; // 'sum'변수 선언 0으로 초기화
//
//		for(int i = 0; i < grade.length; i++) {
//
//		    sum += grade[i];	// 반복문을 사용하여 'grade'배열의 각 요소에 접근
//		    					// 각 요소의 값을 'sum'에 더해줌
//		    					// 반복문을 통해 모든 과목의 점수를 더하고, 'sum'에 모든 점수의 합이 저장
//		}
//
//		System.out.println("모든 과목에서 받은 점수의 합은 " + sum + "입니다.");	
		// 'sum'에 저장된 값, 즉 모든 점수의 합이 출력
//
//		System.out.println("이 학생의 평균은 " + (sum / grade.length) + "입니다.");	
		//'sum'을 'grade'배열의 길이로 나눈 값, 즉 평균이 출력
		
		//정리 : 배열 요소의 합과 평균을 구하는 예제 풀이
	}

}