package 이찬진;

import java.util.StringTokenizer;

public class C20230711 {

	public static void main(String[] args) {
		
		//예제1
		//a,3,b,5,c,6 => 합은 14가 출력되는 코드를 작성하시오
		
//		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6",",=");
//		int sum=0;
//		
//		while(st.hasMoreTokens()) {
//			String tk = st.nextToken();
//			System.out.println(tk);
//			
//			try {
//				sum += Integer.parseInt(tk);
//			}
//			catch(NumberFormatException e) {
//				
//			}
//		}
//		System.out.println("합은 :"+sum);
		
		//예제2
		//1부터 n까지의 합 차례로 출력하는 코드
		
		int i, sum=0;
		
		for(i=1;i<=10;i++) {
			sum += i;
			System.out.printf("1부터 %2d까지의 합 : %2d\n",i,sum);
		}

	}

}
