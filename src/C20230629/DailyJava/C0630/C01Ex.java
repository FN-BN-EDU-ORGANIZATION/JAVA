package C0630;

import java.util.Scanner;

interface Stack{
	int length(); //현재 스택에 저장된 개수 리턴
	int capacity(); //스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 톱에 실수 저장
	boolean push(String val); //스택의 톱에 저장된 실수 리턴
}
class StringStack implements Stack{
	private int num; //저장 가능한 개수
	private int set; //저장 인덱스
	private String [] stack;
	public StringStack(int num){
		this.num = num;
		this.set = 0;
		stack = new String[num];
	}
	public int length() {
		return set;
	}
	public int capacity() {
		return stack.length;
	}
	public String pop() {
		if(set-1<0) return null; //stack에 아무것도 넣지 않았을 때
		set--; //stack 한칸을 내려줌(stack[set]은 빈공간을 가리키고 있음
		String s = stack[set]; //맨위의 값
		return s;
	}
	public boolean push(String val) {
		if(set<num) {
			stack[set] = val; //맨위에 문자열을 넣어줌
			set++; //한칸 올려줌
			return true;
		}
		else return false;
	}
}

public class C01Ex {
//	다음 Stack 인터페이스를 상속받아 실수를 저장하는 StringStack 클래스를 구현하라.
//
//	interface Stack {
//	   int length(); // 현재 스택에 저장된 개수 리턴
//	   int capacity(); // 스택의 전체 저장 가능한 개수 리턴
//	   String pop(); // 스택의 톱(top)에 실수 저장
//	   boolean push(String val); // 스택의 톱(top)에 저장된 실수 리턴
//	}
//	그리고 다음 실행 사례와 같이 작동하도록 StackApp 클래스에 main() 메소드를 작성하라.
//
//	총 스택 저장 공간의 크기 입력 >> 3
//	문자열 입력 >> hello
//	문자열 입력 >> sunny
//	문자열 입력 >> smile
//	문자열 입력 >> happy
//	스택이 꽉 차서 푸시 불가!
//	문자열 입력 >> 그만
//	스택에 저장된 모든 문자열 팝 : smile sunny hello 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장 공간 크기 입력");
		int num = sc.nextInt();
		StringStack stack = new StringStack(num);
		while(true) {
			System.out.println("문자열 입력");
			String val = sc.next();
			if(val.equals("그만")) break;
			if(!stack.push(val)) {
				System.out.println("스택이 꽉 참");
			}
		}
		System.out.println("스택에 저장된 모든 문자열 팝");
		int len = stack.length();
		for(int i = 0; i<len; i++) {
			String s = stack.pop();
			System.out.println(s+ " ");
		}
		sc.close();
	}
}
