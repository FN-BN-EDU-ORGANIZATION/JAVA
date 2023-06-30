package C20230630;

import java.util.Scanner;

public class n2 {

	public static void main(String[] args) {
		  
	      Scanner sc = new Scanner(System.in);
	      System.out.print("암호 : ");
	      String str = sc.nextLine();
	      char[] codearray = new char[str.length()];
	      
	      for (int i =0; i<str.length(); i++) {
	         char c = str.charAt(i);
	         int strn=(int)c;
	         if(Character.isWhitespace(c)) {
	            codearray[i]= ' ';         
	         }
	         else if(strn>64 && strn<68) {;
	            codearray[i] = (char)(strn+23);
	         }
	         else if(strn> 67 && strn<91) {
	            codearray[i] = (char)(strn-3);
	         }
	         else if (96<strn && strn<100) {
	            codearray[i] = (char)(strn+23);
	         }else if (100<strn && strn<123){
	            codearray[i] = (char)(strn-3);
	         }else {
	            codearray[i] = 'X';
	            break;
	         }
	               
	      }
	      String result = new String(codearray);
	      if(result.contains("X")){
	         System.out.println("영문자 외에 해독 불가");
	      }else{
	         System.out.println("해독 : " +result);
	      }

	}

}
