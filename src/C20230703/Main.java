package C20230703;

import java.util.*;
import java.sql.*;
import java.sql.Date;



public class Main {
	
	public static void Main(String[] args) {
		String result;
		
		ArrayList<String> arr = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		
		String getval = "";
		
		do {
			System.out.print("value: ");
			getval += sc.nextLine();
			
			
		}while(!getval.endsWith("="));
		
		
		System.out.print(getval);
		
		
		java.util.Date currentDate = new java.util.Date();
		Date sqlDate = new Date(currentDate.getTime());
		
		
		
		
		
	}
}
