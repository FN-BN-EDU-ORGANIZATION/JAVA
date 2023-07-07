package C202307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class C230707 {

	public static void main(String[] args) {
		//다음과 같은 [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들기(역순 리스트)
		ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());  // sort 이용 역순으로 정렬
        System.out.println(myList); // [5, 4, 3, 2, 1] 출력
        
        //다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력
        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList2);
        //myList 리스트의 각 단어들을 한 문장으로 조립할 때 단어들 사이마다 공백을 넣어 주어야 한다. 1개의 공백문자(" ")를 사용하여 join
        System.out.println(result); // "Life is too short" 출력
	}

}
