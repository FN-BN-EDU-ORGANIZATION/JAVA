package 이찬진;

public class C20230706 {

	public static void main(String[] args) {
		
		//예제1 
		//for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%3 ==0) {
				sum = sum +i;
			}
		}
		System.out.println("3의 배수의 합 : "+ sum);
		
		
		//예제2
		//while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 떄 나오는 눈을 (눈1, 눈2)형태로 출력하고,
		// 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하시오
		
		while(true) {
			int i = (int)(Math.random() * 6) +1;
			int j = (int)(Math.random() * 6) +1;
			
			if(i+j == 5) {
				System.out.println("(" + i + "," + j+")");
				break;
			}
			System.out.println("(" + i + "," + j+")");
		}
	}

}
