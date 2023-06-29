package C20230629;

import java.util.Scanner;

public class C20230629 {
	public static void main(String[] args) {

		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		
		//예제 1
		/*
		 * 코리아 아이티에는 강의실이 3개가 있다
		 * 각 강의실에는 학생이 5명이 있다 //열 x5
		 * 각 학생들의 나이를 입력을 받아보세요
		 * +)전부 출력도 해보세요
		 */
		
//		//자동으로 형변환시켜준다 var이 .. 
//		var od = 10; 
//		var ood="dj";
//		System.out.println(od);
//		System.out.println(ood);
		
		
		
//!!!!주의 koreaItRoom[i].length; i값을 써야지 열의 길이가 나온다!!
//!!!!koreaItRoom.length; 쓰면 행의 길이가 나와버린다.
		
		//참고 Object 라는것을쓰면  정수 문자를 쓸수있다
		Scanner s = new Scanner(System.in);
		int[][] koreaItRoom = new int[3][5];
		for(int i=0; i<koreaItRoom.length; i++)
		{	System.out.println(i+1+"번째 교실 학생 5명 나이 입력하세요");
			for(int j =0; j<koreaItRoom[i].length; j++)
			{
				koreaItRoom[i][j] = s.nextInt();
				
			}
		}
		for(int i=0; i<koreaItRoom.length;i++)
		{
			System.out.println(i+1+"번쨰 교실");
			for(int j=0; j<koreaItRoom[i].length; j++) {
				System.out.print(koreaItRoom[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	
		
		
		//예제 2
		int[][] gugu = new int[8][9];
		/*
		 * 2,3,4,5,6,7,8,9 = 8개
		 * 각각 x1 부터 x9 까지니까 9개 
		 */
		for(int i =0; i<gugu.length; i++)
		{
			for(int j= 0; j<gugu[i].length; j++) {
				gugu[i][j]= (i+2)*(j+1);
			}
		}
		for(int i=0; i<gugu.length; i++)
		{
			System.out.println((i+2)+"단 결과");
			for(int j= 0; j<gugu[i].length; j++)
			{
				System.out.println(gugu[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		//예제 3
		//java 5강 배열 실습문제2 1-1
		//int 타입 길이5의 배열을 만들어 임의의값을 넣어 평균을 구해보자
		//결과는 float로 출력
				
				Scanner sc= new Scanner(System.in);
				
				//길이 5의 배열 생성
				int[] int1 = new int[5];
				
				//합계설정
				int sum = 0;
				//합계 / 배열의 길이 5
				for(int i=0;  i<int1.length;  i++)   //i를 5번 반복
				{
					System.out.println("값을 입력하세요");
					int1[i]=sc.nextInt();  //i 5번 아무숫자 입력 
				}
				for(int i=0; i<int1.length; i++)
				{
					sum+=int1[i]; //입력한 값이 sum에 누적
				}
				float average =(float)sum/int1.length; //똑같은 바이트 자동형변환 쌉가능
				System.out.println(average);
				
				//메모리 누수 방지
				
				
				//1-2 int타입 길이 10의 배열을 만들어 임의의값을 넣고 최대값과 최소값을 출력하자
				int[] int2 = {5,10,40,50,20,30,40,10,20,60}; //길이10의 배열설정 초기값 설정 
				int max = int2[0]; //첫번째 인덱스에 5를 max 로 할당
				int min = int2[0];
		/*
		* 예를 들어, 배열 {5, 3, 9, 2, 1}이 있다면, int max = arr[0];는 max 변수에 초기값으로 5를 할당합니다.
		*  이후에 반복문(for)문을 사용하여 배열의 나머지 요소를 확인하면서 최대값을 찾게 됩니다.
		*  for 반복문에서 i를 1로 초기화하여 배열의 두 번째 요소부터 시작합니다. 
		*  (i는 0부터 시작하는 인덱스이기 때문에 첫 번째 요소는 이미 max 변수에 할당되었습니다.)
		*/
				for(int i =1; i<int2.length;i++ ) // i = 1<길이10; //중요 i<int2.length;는 i=1이면 1번째인덱스의 값을
				{
					if(int2[i]>max)  //int2[1] 인덱스의 값을 비교 i의 단순 숫자를 비교하는것이 아님 
					{
						max = int2[i];
					}
					if(int2[i]<min) 
					{
						max = int2[i];
					}
					
				}
				System.out.println(max);
				System.out.println(min);
		
		
	}
}
