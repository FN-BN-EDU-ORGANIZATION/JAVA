package 자바내용정리;

//1.Math.random을 이용하여 카드섞기
//2.정수형을 실수형으로 변환하여 출력
//3.문자열 비교 함수 equals 사용하기

public class 자바0629 {
	
	public static void 문제1() {
		
		//number과 symbol 배열에 각각 값과 모양을 집어넣었다.
		String number[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		char symbol[] = {'♠', '◆', '♥', '♣'};
		
		//카드를 섞을 때 쓰이는 배열 (52개의 공간)
		int card[] = new int[52];
		
		for(int i=0;i<card.length;i++) {
			card[i] = i;
		}
		//symbol은 나누기의 값, number은 나누기의 나머지를 이용하여 출력한다.
		//symbol[0]을 13번 출력한뒤 줄바꿈하여 symbol[1]을 13번 출력하고 ... 반복
		for(int i=0;i<card.length;i++) {   
			System.out.printf("%2c%s", symbol[card[i]/13], number[card[i]%13]);
			
			//13개의 모양조합이 나오고 난 뒤 줄바꿈을 해준다.
			if((i+1)%13==0) {
				System.out.println();
			}
		}
		System.out.println("=================섞기 전====================\n");
		//card[0] (배열 첫번째) 와 card[r] (배열의 랜덤번째)를 10000번 교환하여 무작위로 섞는 for문
		for(int i=0;i<10000;i++) {
			int r = (int)(Math.random()*51+1);   //1부터 51까지 중 랜덤의 숫자 r을 선언한다.
			int temp = card[0];					 //card[0]과 card[r]의 숫자를 교환한다.
			card[0] = card[r];
			card[r] = temp;
		}
		
		//카드를 섞은 후 위에서 했던 출력을 복붙..
		for(int i=0;i<card.length;i++) {  
			System.out.printf("%2c%s", symbol[card[i]/13], number[card[i]%13]);
			
			if((i+1)%13==0) {
				System.out.println();
			}
		}
		System.out.println("=================섞은 후===================");
	}
	
	public static void 문제2() {
		int num1 = 3, num2 =2;
		//int를 double로 형변환
		double answer = (double)num1/(double)num2;
		System.out.println(answer);
		//1.5가 출력된다.
	}
	
	public static void 문제3() {
		String num1 = "망고다";
		String num2 = "망고다";
		System.out.println(num1.equals(num2)?"같다":"같지않다");
	}
	
	public static void main(String[] args) {
		문제1();
		문제2();
		문제3();
	}

}
