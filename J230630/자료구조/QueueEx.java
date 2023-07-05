package J230630.자료구조;

import java.util.LinkedList;
import java.util.Queue;

//Queue 한쪽 끝에서는 삽입이, 다르쪽 끝에는 삭제가 일어나는 구조
//선입선출 (FIFO)구조 first in first out
//front: 삭제, rear:삽입
//Queue는 인터페이스로, 업캐스팅이 필요하다



public class QueueEx {
	
	public static void main(String[] args) {
		Queue<String> q =new LinkedList<>();
		//1. add(e)
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		System.out.println();
		//2. E element : front에 위치한 데이터 반환
		System.out.println("element : " +q.element());
		System.out.println(q);
		System.out.println();
		//3. remove : front에 위치한 데이터를 반환 후 삭제
		System.out.println("remove: " +q.remove());
		System.out.println(q);
		System.out.println();
		//4. offer(e):rear위치에 데이터 삽입
		System.out.println("offer: peach");
		q.offer("peach");
		System.out.println(q);
		System.out.println();
		//5. peek(): front 위치에 있는 데이터의 값 반환
		System.out.println("peek: "+q.peek());
		System.out.println(q);
		System.out.println();
		//6. poll() : front에 위치한 데이터를 반환 후 삭제
		System.out.println("poll: " +q.poll());
		System.out.println(q);
		System.out.println();
	}
	
}
