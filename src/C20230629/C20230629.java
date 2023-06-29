package C20230629;

import java.util.Scanner;

public class C20230629 {
	public static void main(String[] args) {

		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		
		
		//예제 1
		//"돈이 있으면 택시를 타고 가고 돈이 없으면 걸어 간다."
		//프로그래밍도 위처럼 조건을 판단해서 그 상황에 맞게 처리해야 할 경우가 생기게 된다. 
		//이렇듯 조건을 판단하여 해당 조건에 맞는 상황을 수행하는데 쓰이는 것이 바로 if문
		boolean money = true;
		if (money) {
		    System.out.println("택시를 타고 가기");  //돈이 있다면 택시를 탐
		}else {
		    System.out.println("걸어가기");   //그 외의 상황(돈이 없다)에선 걸어가기를 택한다
		}
		
		//예제 2
		//"만약 3000원 이상의 돈을 가지고 있으면 택시를 타고 그렇지 않으면 걸어가라"
		//상황을 발전시켜 특정 조건을 더 추가하였다
		int money1 = 2000;
		if (money1 >= 3000) {
		    System.out.println("택시를 타고 가라");  //현재 돈이 2천원이기 때문에 if (money1 >= 3000)가 거짓이 된다
		}else {
		    System.out.println("걸어가라");	//따라서 else문의 걸어가기가 출력된다
		}
		
		//예제 3
		 Scanner sc = new Scanner(System.in);  //입력을 위한 스캐너 추가
         System.out.println("점수를 입력 해주세요 : ");
         int number = sc.nextInt();		//점수 입력
         
         if(number >= 60) {
                System.out.println("합격");	//60점 이상이라면 합격을 출력할 것 이고
         }
         else {
                System.out.println("불합격");  //60점 미만이라면 불합격을 출력할 것 이다.
         }
		
		
	}
}
