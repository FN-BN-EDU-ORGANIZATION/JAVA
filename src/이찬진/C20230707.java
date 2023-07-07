package 이찬진;

import java.util.Scanner;

public class C20230707 {
	
	
}
	//	//예제1
	//	//네 값의 최댓값을 구하는 max4 메서드 작성
	//static int max4(int a, int b, int c, int d) {
	//	int max = a;
	//	if(b>max)
	//		max = b;
	//	if(c>max)
	//		max = c;
	//	if(d>max)
	//		max = d;
	//	
	//	return max;
	//}
	//public static void main(String[] args) {
	//	System.out.println("max4 중에 제일 큰수는 :" + max4(1,2,3,4));
	//}
	
		
		//예제2
	
class Main{
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		return answer;
	}
	public void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("최대한 긴 영어를 입력해보세요 : ");
		String str = sc.nextLine();
		System.out.println("위의 입력한 영어에서 찾고 싶은 알파펫을 하나만 입력하세요 : ");
		char c = sc.nextLine().charAt(0);
		System.out.println("찾고 싶은 알파벳 총 개수 : ");
		System.out.println(T.solution(str,c));
				
	}
}
		
//}

