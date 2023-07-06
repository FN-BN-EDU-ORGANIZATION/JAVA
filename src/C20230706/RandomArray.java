package C20230706;
import java.util.List;
	import java.util.ArrayList;
	import java.util.Random;
public class RandomArray {
	
		static ArrayList<Integer> s = new ArrayList<>();
		static int[] shuffle() {		
			int[] shuffle = new int[s.size()];
			List<Integer> tmpList = new ArrayList<>(s);
			Random random = new Random();

	        for (int i = 0; i < shuffle.length; i++) {
	            int j = random.nextInt(tmpList.size());
	            shuffle[i] = tmpList.get(j);
	            tmpList.remove(j);
	        }

			return shuffle;
		}

		public static void main(String[] args) {
			 s.add(1);
		     s.add(2);
		     s.add(3);
		     s.add(4);
		     s.add(5);
		     s.add(6);
		     s.add(7);
		     s.add(8);
		     s.add(9);
		     s.add(10);
		     int [] result = shuffle();
			System.out.println(java.util.Arrays.toString(result));
		}

}
