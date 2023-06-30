package C20230630;

import java.util.Arrays;
import java.util.Scanner;

//의문점

/* 정리
 *<배열>
 * 동일한 데이터타입의 값들을 하나의 배열명으로 저장시킬 수 있는 자료구조
 
 *1.선언
 *데이터타입[]배열명 = new 데이터타입[배열크기];
 *데이터타입 배열명[] = new 데이터타입[배열크기];
 *데이터타입 배열명; 배열명 = new 데이터타입[배열크기];
 
 *2.사용하기
 *System.out.println(배열명[배열공간접근]);
 
 *3.특징
 *배열이 선언되고 크기가 지정되면 배열공간의 값은 자동으로 초기화 세팅이 된다 (정수형0 ,실수형 0.0)
 *예를 들어 크기가 10인 정수형 배열을 선언하고 크기 10을 지정하면 메로리상에 10개의 정수형 값을 담을 공간이 생긴다
 *배열변수는 참조형 타입으로써 해당 메모리공간을 가르킨다(즉, 해당 메모리공간의 주소값을 가진다)
 *배열은 한번 선언되고 나면 공간 자체를 직접 늘릴수는 없기 때문에 간접적인 방법으로 배열을 확장해야 된다.
 *따로 공간이 큰 배열을 새로 만들어 주고 기존의 배열의 내용을 새로 만든 배열에 복사하는 식으로 하여 배열을 간접적으로 확장하는 방법(System.arraycopy(), Arrays.copyOf() 메서드)
 * */

public class C20230630 {
	
	

	public static void main(String[] args) {
		 
		//사용_문자열
		 int[] arr0 = {100, 95, 80, 70, 60};
	        
	        // 루프문으로 직접 배열 원소 출력
	        for(int i = 0 ; i < arr0.length; i++){
	            System.out.println("받은원소: "+
	        arr0[i]);
	        }

	        // Arrays.toString() 메서드 사용하여 심플하게 바로 출력
	        System.out.println("문자열출력: "+Arrays.toString(arr0)); // [100, 95, 80, 70, 60]
	        System.out.println("-------------------------------------------");
	        
	       
	        
	     //에제1_최대값,최소값구하기--------------------------------------------------
	        int[] arr = { 10, 20, 5000, 20, 1, 60, -38 }; //arr을 선언하고 초기화
	        
	        int max = arr[0];
	        int min = arr[0];
	 
	        for (int i = 0; i < arr.length; i++) {
	            if (max < arr[i])
	                max = arr[i];
	 
	            if (min > arr[i])
	                min = arr[i];
	        }
	 
	        System.out.println("최대값: " + max + ", 최소값: " + min);
	        System.out.println("-------------------------------------------");
	        
	        
	        //에제2_2차원배열 합계,평균
	         
	        int [][] arr3 = {{1,2,3,4},{1,1,1,1},{3,2,4,8}}; //3개의 행과 4개의 열로 구성
	        int total = 0; // 총합을 저장할 변수
	        float avg = 0; // 평균을 저장할 변수
	        
	        // 이차원 배열을 탐색하여 총합과 평균을 계산
	        for(int i=0; i< arr3.length;i++) { // 행 탐색
	        	for(int j=0; j< arr3[i].length;j++) { //열 탑색
	        		
	        		total +=arr3[i][j]; // 요소를 총합에 더해준다
	    	        avg =total/(float)(arr3.length * arr3[i].length); //총합을 이차원 배열의 요소 개수로 나눈 평균 계산
	        	}
	        }
	        
	        System.out.println("total="+total); //총합
	        System.out.println("avg="+avg); //평균
	        System.out.println("-------------------------------------------");
		
		
		
	        //예제3_스캐너와배열_거스름돈 문제--------------------------------------------------
	        
	        Scanner scanner = new Scanner(System.in); //사용자 직접입력
	        
	        System.out.print("지불한 금액을 입력하세요: ");
	        int paidAmount = scanner.nextInt(); //줄바꿈
	        
	        System.out.print("물건의 가격을 입력하세요: ");
	        int itemPrice = scanner.nextInt();
	        
	        int change = paidAmount - itemPrice;
	        
	        int[] coins = {500, 100, 50, 10}; // 사용 가능한 동전 종류
	        int[] coinCount = new int[4]; // 동전 개수를 저장할 배열
	        
	        for (int i = 0; i < coins.length; i++) {
	            if (change >= coins[i]) {
	                coinCount[i] = change / coins[i];
	                change = change % coins[i];
	            }
	        }
	        
	        System.out.println("거스름돈:");
	        for (int i = 0; i < coins.length; i++) {
	            if (coinCount[i] > 0) {
	                System.out.println(coins[i] + "원: " + coinCount[i] + "개");
	            }
	        }
	}

}
