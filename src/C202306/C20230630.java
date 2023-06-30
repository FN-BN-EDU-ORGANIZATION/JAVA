package C202306;

import java.util.Scanner;

public class C20230630 {

	public static void main(String[] args) {
		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		//다음 코드의 출력 결과는?
		String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");		//a 문자열에 wife가 포함된 글자가 있다면 wife를 출력 - 거짓
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");		//once라는 단어는 a 문자열에 있고 run a 문자열에 없을때 once를 출력 - 거짓
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");		//a 문자열에 everywhere가 없으면 everywhere가 출력 
        } else if (a.contains("anywhere")) {		//- 진실 everywhere가 출력!
            System.out.println("anywhere");		//a 문자열에 anywhere가 포함된 글자가 있다면 anywhere를 출력 
        } else {								//- 위에 이미 값이 출력
            System.out.println("none");		//그 외의 경우에는 none을 출력 - 위에 이미 값이 나옴
        }
        
        //별찍기
    	Scanner sc = new Scanner(System.in);	//높이입력을 위한 스캐너 생성
		int height = sc.nextInt();
		int i = 0;  //개행
		int j = 0;  //공백
		int k = 0;  //별
		System.out.println("높이입력 : " + height);	//콘솔에 높이입력
        while(i < height) {
			//공백
			j=0;
			while(j<=(height-2)-i) {		//j 값이 (height-2)-i보다 작거나 같을 때까지 공백을 출력
				System.out.print(" ");
				j++;						//j 증가
			}		
			//별
			k=0;
			while(k<=2*i) {					//k 값이 2*i보다 작거나 같을 때까지 별을 출력
				System.out.print("*");
				k++;						//k증가
			}
			System.out.println();
			i++;							//한 줄이 완성되면 개행을 출력 후 i 값을 증가시켜 다음 줄로 이동
		}			
        
        //while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합 구하기
        int result = 0;			//결과를 저장할 변수
        int e = 1;				//반복문의 변수 초기값 설정
        while (e <= 1000) {		//i가 1000보다 크거나 같을때 까지 반복
            if (e % 3 == 0) {  	//3으로 나누어 떨어지는 수는 3의 배수
                result += e;	//3의 배수인 경우 result에 더하기
            }
            e += 1;				//i가 1씩 증가 반복
        }
        System.out.println(result); 
	}

}
