package Ch19EX;
import java.util.*;
public class t2 {

	public static void main(String[] args) {
		// 1 ~ 45 까지 숫자 6개를 랜덤으로 받아(Random 클래스를 이용) set에 저장
		//[추가]저장된 set 오름차순정렬(검색을 통해 해결)
		
		Random random = new Random();
		Set<Integer> set = new HashSet();
		
		for(int i=0; i<7; i++) {
			int n = random.nextInt(45)+1;
			set.add(n);
		}
		Integer[] array = set.toArray(new Integer[0]);
		
		for(int i = 0; i<set.size();i++) {
			for(int j = 0; j<set.size()-1; j++) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		String arrayString = Arrays.toString(array);
		System.out.println(arrayString);
		
	}


}

