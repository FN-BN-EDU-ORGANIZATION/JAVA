package BackJoonForWhilePrac;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총합: ");
		int total = scan.nextInt();
		
		System.out.print("가격: ");
		int price = scan.nextInt();
		
		System.out.print("물품개수: ");
		int num = scan.nextInt();
		
		while(total == (price*num))
		{
			System.out.println("총합: " + total + "\n가격: " + price + " 물품개수: " + num);
			System.out.println("Yes");
			break;
		}
		while(total != (price*num))
		{
			System.out.println("총합: " + total + "\n가격: " + price + " 물품개수: " + num);
			System.out.println("맞지 않습니다.");
			break;
		}

	}

}
