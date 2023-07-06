package KwonIlkeun;

import java.util.HashMap;

public class C20230706 {

	public static void main(String[] args) {
		
		//Map
//		"사람"을 예로 들면 누구든지 "이름"="홍길동","생일"="몇월며칠" 등으로
//		구분할 수 있다. 자바의 맵은 이러한 대응관계를 쉽게 표현할 수 있게 해주는 자료형이다.
//		이것은 요즘 나오는 대부분의 언어들도 갖고 있는 자료형으로  Associative array,Hash라고도 불린다.
//		
//		맵(Map)은 사전(dictionary)과 비슷하다. 즉 people이란 단어에 "사람",baseball이라는 단어에 "야구"라는
//		뜻이 부합되듯이 Map은 Key와 Value를 한 쌍으로 갖는 자료형이다.
//		
//		Map은 리스트나 배열처럼 순차적으로 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다.
//		Map의 가장 큰 특징은 key로 value를 얻어낸다는 점이다. baseball이라는 단어의 뜻을 찾기 위해서
//		사전의 내용을 순차적으로 모두 검색하는 것이 아니라 baseball이라는 단어가 있는 곳만을 펼쳐보는 것이다.
//		
		

//		HashMap
//		Put
		HashMap<String,String>map = new HashMap<>();
		map.put("people","사람");
		map.put("baseball","야구");
	
	//키와 밸류는 위 예제에서 보듯이 put메서드를 이용하여 추가할 수 있다.
	//HashMap 역시 제네릭스를 이용한다. 위의 HashMap의 제네릭스는 Key,Value 모두 String타입이다.
	//따라서 Key,Value에 String이외의 자료형은 사용할 수 없다.
	
		//get
		//key에 해당하는 value값을 얻어내기 위해서는 get메서드를 사용한다.
		System.out.println(map.get("people"));//"사람"출력
		//map객체의 키"people"에 대응하는 값"사람"이 출력됨
		
		//containsKey 메서드는 맵에 해당하는 키가 있는지를 조사하여 그 유무를 참,거짓으로 리턴
		System.out.println(map.containsKey("people"));//true출력
		
		//remove메서드는 맵의 항목을 삭제하는 메서드로 키갑에 해당되는 아이템(key,value)을 삭제한 후 
		//그 밸류값을 리턴한다
		System.out.println(map.remove("people"));//"사람"출력
		
		//size메서드는 Map의 갯수를 리턴한다.
		System.out.println(map.size());
		//"people","baseball"두값을 가지고 있다가 "people"항목이 삭제되었으므로 1이 출력
		
		
		
	}
}
