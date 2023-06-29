package Songjaeuk.D230629;

public class C230629 {

	public static void main(String[] args) {
		//문제점 -변수에 대한 이해를 부족
		//해결 - 이중for문에 대한 형식과 출력값을 이해 &print와 println의 차이 이해
		
		for (int i = 0; i < 5; i++) {//별의 높이를 5줄로 정함

			for (int j = 4; j > i; j--) { //4개의 공백을 시작으로 하나씩 감소
	            System.out.print(" ");

	        }

	        for (int k = 0; k < i*1+1; k++) {//

	            System.out.print("*"); 
	                                    

	                                }

	        System.out.println();

	    }
	}

}
