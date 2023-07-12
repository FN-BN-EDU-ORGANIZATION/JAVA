package JaewonStudy;

public class C20230629 {
	
	// 의문점
	//정리 
		public static void main(String[] args) {
		
//	예제 1 - 2차원 배열
			int[][] arr = new int [2][3];
			int k = 10;
			for(int i = 0;i<arr.length;i++) {
				for(int j=0;j<arr[j].length;j++) {
					arr[i][j]=k;
					k+=10;
				}
			}
			
			for (int i = 0; i< arr.length;i++) {
				for(int j= 0;j<arr[i].length;j++) {
					System.out.println(arr[i][j] + " ");
				}
			}
			System.out.println();
			
//	예제 2 - 1차원 배열활용
			
			int[] scores = {83,90,87};
			
			int sum = 0;
			for(int i=0;i<scores.length; i++) {
				sum += scores[i];
			}
			System.out.println(sum);
			
			double avg = (double) sum / scores.length;
			System.out.println(avg);
			
			
}
}