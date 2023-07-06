package HomeWork.C20230630;

public class C20230630 {

	
	public static void main(String[] args) {
		//의문점		
		//정리 : 아직까지는 별찍기가 어렵게 느껴진다. for문을 좀 더 많이 풀어봐야겠다
		
						
						
		//이것이 자바다 4장 조건식 확인문제
		//중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구하여 (x, y) 형태로 출력. 단, x와 y는 10 이하의 자연수이다.
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (((4 * x) + (5 * y)) == 60) {
					System.out.println("(" + x + ", " + y + ")");
                    }
				}
		}
				
						
		//이것이 자바다 4장 조건식 확인문제
		//for문을 이용해서 직각삼각형을 출력하는 코드를 작성하기
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if(j==i) {
					System.out.println();
				}
			}
		}
				
	}
}

