package CPractice;

import java.util.HashMap;

public class C20230706 {
    public static void main(String[] args) {
    	//key와 value가 String 형태인 HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
    //put을 이용하여 값 삽입

//key에 해당하는 value값을 얻기 위해서는 get 메서드를 사용
    System.out.println(map.get("people"));
    //people에 해당하는 사람 출력된다
    }
}//간단한 자바 코드 리뷰이후 정처기 공부 이어서 하겠습니다
