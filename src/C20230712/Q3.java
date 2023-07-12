package C20230712;
//주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.

public class Q3 {
	
	public static void main(String[] args) {
		char[][] star = {
			//4행 5열 -> star.length = 4 / star[0].length = 5;
			//이를 90도 돌린다는 것은, 행과 열을 바꾼다는 것
			//즉 result[4][3]의 이중배열을 새로 만들고,
			//star[i][j]인덱스의 값을 result[j][]에 넣어야 한다.
				
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}		
		};
		
		char[][] result = new char[star[0].length][star.length];

		
		for(int i = 0; i < star.length; i++) { //star이중배열의 모든 idx 출력
			for(int j =0; j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0; i<star.length;i++) {
			for(int j=0; j< star[i].length;j++) {
				int x = j; // star[i][j]==result[x][y]
				int y = star.length-1-i; //int y = 4-1-i (i=0~3) / y={3,2,1,0}
				// result[0].length == star.length로, star배열의 행과 result 배열의 열 길이 값은 i로 같다.
				// 그러나, 값의 대입에 단순히 이를 적용해선 안 된다.
				// star[4][0]의 값이 result[0][4]에 대입되는 것이 아니기 때문.
				
				result[x][y]=star[i][j]; 
				
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j = 0; j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	
	
	
	}
}
