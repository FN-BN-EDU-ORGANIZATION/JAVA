package C20230707;

public class C20230707T02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package mystudy01_solve;

public class T03 {

	public static void main(String[] args) {
		/*
		 * 아래의 규칙을 따르는 수열의 20번쨰숫자 프로그램을 만들어 찾으시오
		 * 1, 11, 12, 1121, 122111, 112213
		 * 첫 번째 수열 : 1
		 * 두 번쨰 수열 : 1이 1개 =11
		 * 세 번쨰 수열 : 1이 2개 = 1121
		 * 네 번쨰 수열  1이 1개 , 2가 1개 = 1121
		 * 다섯 번쨰 수열 : 1이 2개 , 2가 1개 , 1이 1개 = 122111
		 * 여섯 번쨰 수열 : 1이 1개 ,2가 2개 ,1이 3개 = 112213
		 */
		// 힌트) 문자열로 접근해야한다
		
		
		// * 1, 11, 12, 1121, 122111, 112213
		String start ="1"; //시작점
		for(int i = 0; i <20; i++) {
			System.out.println((i+1)+start); //0+"1"
			String end =""; //문자열 설정 
			char number = start.charAt(0); // 읽는숫자 charAt(0) 0번째 순서대로 읽는다 .  "1" 출력 
			int count =0; //읽은 개수를 센다
			for(int  j =0; j<start.length(); j++) {
				if(number != start.charAt(j)) { //글자 변화 있으면 number랑 카운트를 리셋해야함 
						end = end+number+count;
						number= start.charAt(j);
						count =1;
				}else {
					count++;
					
				}
			}
			end = end+number+count;  //"" 과 int와 만나 문자열로 변환 
			start =end;  //문제는 1의대한 개수를 셀수는있는데 2는 몇개다 3은 몇개다 써줄수가 없다. 
		}
	}

}
