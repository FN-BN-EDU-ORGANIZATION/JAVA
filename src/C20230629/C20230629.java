package C20230629;

public class C20230629 {
	
	public static void main(String[] args) {
		
		
		//의문점		: 이해안했던 점 적기
		//정리 : 첫번째 문제는 아래의 코드가 더 간단하고 짧지만 배운것만 생각하다보니 위의 코드만 생각했다. 조금 더 간단하게 작성할수있게 고민을 더해봐야겠다
		//아직까지 전체적인 코드 사용이 익숙해지지 않아서 더 연습을 해야할것 같다. 바로바로 생각이 안난다.
				
				
		//이것이 자바다 4장 조건식 확인문제
		//for문 사용해서 1~100까지 정수중 3의 배수 총합을 구하는 코드 작성
		int sum=0;
		for(int i=1;i<=100;i++) {
			if(i % 3==0) 
				sum += i;
		}
		System.out.println("3의 배수의 합 : " + sum);
			
		int sum1=0;
		int i;
		for(i=0; i<=100;i+=3) {
			sum1+= i;
		}
		System.out.println("3의 배수의 합 : " + sum1);
		
				
		//이것이 자바다 4장 조건식 확인문제
		//while문과 Math.random()메소드를 이용해 주사위 (눈1,눈2)의 형태로 작성
		//단, 눈의 합이 5가 아니면 계속 주사위를 던지고 5면 실행을 멈춤
		
		while(true) {
			int r1 = (int)(Math.random()*6)+1;
			int r2 = (int)(Math.random()*6)+1;
			System.out.println("(" + r1 + "," + r2 + ")");
			if(r1+r2==5) break;
		}
				
				
				
				
		
		
		
		
		
	}
}
