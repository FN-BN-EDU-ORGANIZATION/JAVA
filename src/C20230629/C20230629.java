package C20230629;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class C20230629 {
	public static void main(String[] args) {

		//10미만의 양의 실수 10개 중 n번째로 큰 값 구하기

		//예제 1 0~10사이의 양의 실수 10개 배열리스트에 저장 후 소숫점 둘째자리까지 출력
		ArrayList<Double> list=new ArrayList<Double>();
		_0629_ex1 ex1=new _0629_ex1();
		list=ex1._0629_ex1();

		for (int i = 0; i < 10; i++) {
			System.out.printf("(%.2f) ",list.get(i));
		}
		System.out.println();

		
		//예제 2 만든 배열리스트 오름차순으로 sorting 후 출력
		_0629_ex2 ex2=new _0629_ex2(list);
		for (int i = 0; i < 10; i++) {
			System.out.printf("(%.2f) ",list.get(i));
		}
		System.out.println();
		
		//예제 3 n번째로 큰 값 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("1부터 10까지의 수 입력: ");
		int n=sc.nextInt();
		while(n<1||n>10){
			System.out.print("1부터 10까지의 수를 다시 입력하세요: ");
			n= sc.nextInt();
		}
		System.out.print("n번째로 큰 수: ");
		System.out.printf("%.2f",list.get(10-n));

		
	}
}

class _0629_ex1{
	ArrayList<Double> list=new ArrayList<>();
	Random random=new Random();
	double x;
	int i;

	ArrayList<Double> _0629_ex1(){


		for(i = 0; i < 10; i++) {
			x=random.nextDouble(10);
			list.add(x);
		}

//		for (i = 0; i < 10; i++) {
//			System.out.printf("%d:(%.2f) ",i+1,list.get(i));
//		}
//		System.out.println();
//		for(double i:list){
//			System.out.printf("(%.2f) ",i);
//		}
//		System.out.println();
		return  list;
	}
}

class _0629_ex2{

	_0629_ex2(ArrayList<Double> list){
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if(list.get(i)<list.get(j)){
					double temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
					i=0;
					break;
				}
			}
		}
	}
}