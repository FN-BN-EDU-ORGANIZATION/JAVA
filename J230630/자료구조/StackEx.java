package J230630.자료구조;

import java.util.Stack;
//Stack : 한쪽끝에서 삽입과 삭제가 모두 일어나는 구조
//특징 : 후입선출(LIFO) 구조 Last in first out
//top: 삽입, 삭제 / Vector의 자식 클래스
//Stack은 클래스 이므로 바로 사용 가능
public class StackEx {
public static void main(String[] args) {
	Stack<String> s = new Stack<String>();
	
	//1. push(): 데이터 삽입
	s.push("apple");
	s.push("banana");
	s.push("cherry");
	System.out.println(s);
	
	//2. pop() : top의 데이터 삭제
	System.out.println("pop: "+s.pop());
	System.out.println(s);
	
	//3. peek() : top의 데이터 보기
	System.out.println("peek: "+s.peek());
	
	//4. search()
	System.out.println(s.search("apple"));
	System.out.println(s.search("banana"));
}
}
