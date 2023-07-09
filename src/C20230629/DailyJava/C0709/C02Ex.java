package C0709;

import java.util.Scanner;

public class C02Ex {
	public static void main(String[] args) {
	    int N;
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    for(int i = 1; i<=2*N; i++) {
	    	if(i%2==1) {
	    		for(int j = 1;j<=N;j++) {
	    			if(j%2==1) System.out.print("*");
	    			else System.out.print(" ");
	    		}
	    	}
	    	else {
	    		for(int j=1;j<=N;j++) {
	    			if(j%2==1) System.out.print(" ");
	    			else System.out.print("*");
	    		}	
	    	}
	    	System.out.println("\n");
	    }
	}
}
