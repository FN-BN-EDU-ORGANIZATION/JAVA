package Ch19EX;
import java.util.*;

public class t1 {

	public static void func1(List<String> list) 
	{	
		List<String> list1 = new ArrayList<String>();
		list1.add("AAAAAAA"); list1.add("BB"); list1.add("CCCCCCCC");
		for(String str : list1) 
		{
			if(str.length()>5) {
			 System.out.println(str);
			}
		}
	}
	
	public static void func2(List<String> list) {
		//~길이가 5보다 큰 문자열만 입력받는 코드를 작성하세요
		List<String> list2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력하세요 : ");
			String num = sc.nextLine();
			
			if(num.length()>5) {
				list2.add(num);
			}
			
			System.out.println("continue? (y/n)");
			String choice = sc.nextLine();
			
			if (choice.equalsIgnoreCase("n")) {
				break;
			}
		   }
		
		  for(String s : list2) {
				System.out.println(s);
		  }	
}
	
	
	
	public static void func3(List<Integer> list) {
		//ArrayList에 있는 정수값을 입력받는데 전달되는 수 중에 짝수의 값만 입력받는 코드
		List<Integer> list3 = new ArrayList<Integer>();
		Scanner sc1 = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int number = sc1.nextInt();
			
			if(number %2==0) {
				list3.add(number);
			}
			
			System.out.println("continue? (y/n)");
			sc1.nextLine();
			String ch = sc1.nextLine();
			
			if (ch.equalsIgnoreCase("n")) {
				break;
			}
		   }
		
		 for(int nn : list3) {
				System.out.println(nn);
		 }	
	
	
	}
	
	
	
	public static void main(String[] args) {
//		func1(new ArrayList());

//		func2(new ArrayList());
		
		func3(new ArrayList());


	}

}



