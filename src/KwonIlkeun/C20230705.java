package KwonIlkeun;

import java.util.ArrayList;

public class C20230705 {

	public static void main(String[] args) {

		
		//리스트(List)
//		리스트는 배열과 비슷한 자바의 자료형으로 배열보다 편리한 기능을 많이 가지고 있다.
//		리스트와 배열의 가장 큰 차이는 배열은 크기가 정해져 있지만 리스트는 크기가 정해져 있지 않고
//		동적으로 변한다는 점이다.
//		박찬호 선수의 투구스피드를 저장해야 한다고 가정해보자. 배열을 이용하여 투구수를 저장할 수 있을까?
//		1회에 투구수가 3개도 될 수 있고 100개도 될 수 있다. 이렇게 동적으로 자료형의 갯수가 변하는 상황이라면
//		List를 사용해야 할 것이다.
		
//		ArrayList
//		List자료형에는 ArrayList,Vector,LinkedList등의 List인터페이스를 구현한
//		자료형이 있다. 여기서 말하는 List자료형은 인터페이스이다.
//		
//		add
//		박찬호 선수가 총 3번의 투구를 138,129,142km의 속도로 던졌다면 다음과 같이 코드를 
//		작성할 수 있다.
		
		ArrayList pitches = new ArrayList();
		pitches.add("138");
		pitches.add("129");
		pitches.add("142");
		
//		ArrayList객체인 pitches에 add라는 메서드를 이용하여 투구스피드를 저장했다. 만약 첫번째
//		위치에 "133"이라는 투구스피드를 삽입하고 싶다면 아래와 같이 삽입할 위치를 파라미터로 넘겨줘야 한다.
		
		pitches.add(0,"133");
		
		System.out.println(pitches.get(1));
//		ArrayList의 get메서드를 이용하면 특정 인덱스의 값을 추출할 수 있다.
		
		System.out.println(pitches.size());
//		size메서드는 ArrayList의 갯수를 리턴한다.
		
		System.out.println(pitches.contains("142"));
//		contain메서드는 리스트안에 해당 항목이 있는지를 판별하여 그 결과를 boolean으로 리턴한다.
		
		System.out.println(pitches.remove("129"));
//		"129"라는 항목이 성공적으로 삭제되고 true를 리턴한다.
		
		System.out.println(pitches.remove(0));
//		해당 인덱스의 항목을 삭제하고 삭제된 항목을 리턴한다
		
		
	}

}
