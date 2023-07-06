package JAVA_PRACA;

import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C20230706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 파일을 불러오는 작업
		File file = new File("C:\\Users\\User\\Desktop\\자바2\\깃허브\\JAVACLASS2\\자바2\\src\\강의4\\Test");
		
		try(FileReader fileReader = new FileReader(file))
		{
			int fileContent =0;
			// 파일 입력한 값을 하나씩 출력하는 코드
			while((fileContent = fileReader.read())!= -1)
		{
			System.out.print((char)fileContent);
		}
		}
		catch(Exception ex)
		{
			
		}





		// 예외처리 연습
		try {
			int[] list = new int[5];

			for (int i=0 ; i<=5; i++)
				list[i] = i;

			System.out.println(list);
		}

		catch(RuntimeException ex)
		{
			System.out.println(ex);
		}







		// 값을 입력 받아 랜덤 숫자 맞추기 게임
		Scanner scanner = new Scanner(System.in);
		int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;
        
        do 
        {
        	count++;
        	System.out.print("1~100 사이의 값을 입력하세요 :");
        	
        	try
        	{
        		input = new Scanner(System.in).nextInt();
        	}
        	catch(java.util.InputMismatchException e)
        	{
        		System.out.println("비정상적인 값입니디ㅏ. 다시 입력하세요");
        		continue;
        	}
        	
        	if(answer > input)
        		System.out.println("더 큰 수를 입력하세요");
        	else if(answer < input)
        		System.out.println("더 작은 수를 입력하세요");
        		
        }
        while(answer!=input);
        System.out.println("정답입니다.");
        System.out.println(count +"번 만에 맞췄습니다.");
        }
}


