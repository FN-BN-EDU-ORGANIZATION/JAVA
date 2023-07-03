package C20230629;

//public class C20230703 {
	//예제3

//    public static void main(String[] args) {
//        int[] result = new int[5];				//크기가 5인 result 정수형 배열 선언
//        int[] arr = {77, 32, 10, 99, 50};		//주어진 값으로 초기화한 크기 5의 arr 배열 선언
//        
//        for (int i = 0; i < 5; i++) {			//0부터 4까지 반복문 실행 = 배열 검사
//            result[i] = 1;						//result 인덱스 i에 1 저장 = 초기화 작업
//            for (int j = 0; j < 5; j++) {		//0부터 4까지 반복문 실행 = 비교를 위한 루프
//                if (arr[i] < arr[j])			//arr[i] 보다 arr[j]가 크면 아래코드 실행
//                    result[i]++;				//result 배열의 현재 인덱스 i에 1 더하기
//            }
//        }
//        
//        for (int k = 0; k < 5; k++) {			//0부터 4까지 반복문 실행 = result 배열의 요소들을 출력
//            System.out.println(result[k]);		//result 현재 인덱스 k값 출력 = arr 내림차순 
//        }
//    }
//}
	
//	    public static void main(String []args){
//	        int i=0;
//	        int sum=0;
//	        while (i<10){
//	            i++;			//i 변수값 1증가
//	            if(i%2==1)      //i를 2로 나누고 나머지가 1인 경우 아래코드 실행
//	              continue;		//다시 while문으로 돌아감
//	        sum += i;			//i를 2로 나눳을 때 나머지가 1이 아닌경우 sum = sum + i
//	        }
//	    System.out.print(sum);	//sum 출력 = 2,4,6,8,10 더한 값 출력
//	    }
//	}
//
