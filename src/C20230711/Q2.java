package C20230711;

//공백을 제외한 문자 개수 

public class Q2 {
	
	static int getCharCount(String s) {
		int result = 0;
		for(int i = 0; i<s.length();i++) { // 문자열 s의 index 하나 하나를 돌며 / ' ', 즉 공백이 아닌 index일 경우 result에 1을 더한다. 
			if(s.charAt(i)!=' ') {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		String s = "안녕 하 십니까 !!  ";
		
		System.out.println(s.length()); // 문자열의 공백 포함 문자 수 반환
		System.out.println(getCharCount(s)); // 문자열의 공백 제외 문자 수 반환
	}
}
