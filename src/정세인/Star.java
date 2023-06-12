package 정세인;
import java.util.Scanner;
public class Star {
	
	public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.print("별 높이: ");
        int height = star.nextInt();
        int i = 0;
        
        while (i < height) {
            int j = 0;
            while (j < height - (i + 1)) {
                System.out.print(" ");
                j++;
            }
            
            int k = 0;
            while (k < 2 * i + 1) {
                System.out.print("*");
                k++;
            }
            
            System.out.println();
            i++;
        }
    }
	

	

}
