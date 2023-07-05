package CPractice;

import java.util.Scanner;

public class C20230705 {
	public static void main(String[] args) {
		//배열의 합을 구하는 자바코드
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("배열의 크기를 입력하세요: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        
        System.out.println("배열의 합은? : " + sum);
        
        
    }
}