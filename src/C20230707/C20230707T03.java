package C20230707;

public class C20230707T03 {
	package mystudy01_solve;

	public class MyJava02_Pyramid1 {
		
		//삼각형 모양의 피라미드 출력
		//입력 : 3
		//2n+1 혹은 2n-1 이런식으로 늘어남 = *(별)의 개수
		//1 3 5 7
		//  *
		// ***
		//*****
		//입력 : 5
		//    *     //공백 4개
		//   ***  //공백 3개 
		//  *****//공백 2개 
		// *******//공백 1개
		//*********//공백 0개 
		
		// i, j
		static void printPyramid(int floor) {
			for(int i = 0; i<floor; i++) {
				
				for(int j = floor-i-1; j>0; j--)
					System.out.print(" ");
				for(int j = 0; j<2*i+1; j++)
					System.out.print("*");
				
				System.out.println();//줄띄움
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//함수(=메소드)를 통해서 매개변수 넣고 그에 따라서 피라미드 모양 다르게 출력하기
			printPyramid(5);

		}

	}

}
