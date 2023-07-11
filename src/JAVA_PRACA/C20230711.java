package JAVA_PRACA;

import java.util.Scanner;

public class C20230711 {

public static void main(String[] args) {
		
		// 숫자 출력하는 변수 
		int num1, num2, num3, num4, num5, num6, bonusnum;

		// do while 문으로 각 변수를 초기화 시키는 작업
		do {
		    num1 = (int) (Math.random() * 45) + 1;
		    num2 = (int) (Math.random() * 45) + 1;
		    num3 = (int) (Math.random() * 45) + 1;
		    num4 = (int) (Math.random() * 45) + 1;
		    num5 = (int) (Math.random() * 45) + 1;
		    num6 = (int) (Math.random() * 45) + 1;
		    bonusnum = (int) (Math.random() * 45) + 1;
		} while (num1 == num2 || num1 == num3 || num1 == num4 || num1 == num5 || num1 == num6 || num1 == bonusnum ||
		         num2 == num3 || num2 == num4 || num2 == num5 || num2 == num6 || num2 == bonusnum ||
		         num3 == num4 || num3 == num5 || num3 == num6 || num3 == bonusnum ||
		         num4 == num5 || num4 == num6 || num4 == bonusnum ||
		         num5 == num6 || num5 == bonusnum ||
		         num6 == bonusnum);

		
		// 사용자가 6개 의 숫자를 입력하는 코드
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int n1 = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int n2 = scan.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int n3 = scan.nextInt();
		System.out.print("네번째 숫자를 입력하세요 : ");
		int n4 = scan.nextInt();	
		System.out.print("다섯번째 숫자를 입력하세요 : ");
		int n5 = scan.nextInt();
		System.out.print("여섯번째 숫자를 입력하세요 : ");
		int n6 = scan.nextInt();
		
		// 랜덤 숫자와 사용자의 숫자가 일치하는지 카운트 하는 함수
		int count = 0;
		
		// 사용자의 번호와 랜덤 번호를 비교하는 코드
		if(n1 == num1 || n1 == num2 || n1 == num3 ||  n1 == num4 || n1 == num5 || n1 == num6 || n1 == bonusnum)
			count ++;
		if(n2 == num1 || n2 == num2 || n2 == num3 ||  n2 == num4 || n2 == num5 || n2 == num6 || n2 == bonusnum)
			count ++;
		if(n3 == num1 || n3 == num2 || n3 == num3 ||  n3 == num4 || n3 == num5 || n3 == num6 || n3 == bonusnum)
			count ++;
		if(n4 == num1 || n4 == num2 || n4 == num3 ||  n4 == num4 || n4 == num5 || n4 == num6 || n4 == bonusnum)
			count ++;
		if(n5 == num1 || n5 == num2 || n5 == num3 ||  n5 == num4 || n5 == num5 || n5 == num6 || n5 == bonusnum)
			count ++;
		if(n6 == num1 || n6 == num2 || n6 == num3 ||  n6 == num4 || n6 == num5 || n6 == num6 || n6 == bonusnum)
			count ++;
		 System.out.println("당첨 번호는 : "  + num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6  + "\t" + bonusnum);
		System.out.println(count + "만큼 맞췃습니다.");
		
		// 맞추 개수에 맞게 순위 출력
		if(count == 6)
			System.out.println("1등 당첨");
		else if(count == 6 && n1 == bonusnum && n2 == bonusnum && n3 == bonusnum && n4 == bonusnum && n5 == bonusnum && n6 == bonusnum)	
			System.out.println("2등 당첨");
		else if(count == 5)
			System.out.println("3등 당첨");
		else if(count == 4)
			System.out.println("4등 당첨");
		else if(count == 3)
			System.out.println("5등 당첨");
		else
			System.out.println("꽝");
		
	// ------------------------------------------------------------------------------------
		// 기본 방법으로 영수증 출력하는 코드
		Scanner scan1 = new Scanner(System.in);
		System.out.print("총합: ");
		int total = scan1.nextInt();
		
		System.out.print("가격: ");
		int price = scan1.nextInt();
		
		System.out.print("물품개수: ");
		int num = scan1.nextInt();
		
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
		}
		
	// -------------------------------------------------------------------------------------
		
		// 스트링 배열에 단어를 적어서 그 적힌 코드를 랜덤하게 재배치후 배열안에 들어간 단어를 맞추는 게임
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner scan2 = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++)
		{
			char[] question = words[i].toCharArray();
			
			for(int j=0;j<question.length;j++)
			{
				int idx = (int)(Math.random()*question.length);
				
				char tmp = question[i];
				question[i] = question[idx];
				question[idx]=tmp;
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요.>",i+1, new String(question));
			
			String answer = scan2.nextLine();
			
			if(words[i].equals(answer.trim()))
			{
				System.out.printf("맞았습니다.%n%n");
			}else
			{
				System.out.printf("틀렸습니다.%n%n");
			}
		}
	}
	}

