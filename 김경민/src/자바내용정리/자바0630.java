package 자바내용정리;

//1.5명의 학생 점수를 입력받아 1등, 꼴등, 평균점수를 출력하기(배열 이용)
//2.매개변수를 받는 생성자 기본 개념 실습

import java.util.Scanner;

public class 자바0630 {

	public static void 문제1() {
		int sum = 0;
		//5명 학생의 점수를 받기 위한 배열을 만든다.
		int score[] = new int[5];
		Scanner sc = new Scanner(System.in);

		// 키보드로 점수 입력
		System.out.println("총 5명의 학생 점수를 입력해주세요.");
		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + ". 학생 점수 입력 >> ");
			score[i] = sc.nextInt();
			//입력받자마자 sum에 점수를 누적한다.
			sum = sum + score[i];
		}

		//점수를 오름차순으로 재배치한다.
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 4; x++) {
				if (score[x] > score[x + 1]) {
					int temp = score[x];
					score[x] = score[x + 1];
					score[x + 1] = temp;
				}
			}
		}
		// 1등과 꼴등 출력
		System.out.println("1등은" + score[4] + "점 맞은 학생입니다.");
		System.out.println("꼴등은" + score[0] + "점 맞은 학생입니다.");

		// 전체 학생의 평균 출력
		System.out.println("평균은 " + ((double) sum / 5) + "점 입니다.");

		sc.close();
	}
	
	String name;
	int age;
	
	자바0630(String name, int age){
		//생성자
		//객체 생성시 최초 1번만 실행되는 특별한 메서드
		this.name = name;
		this.age = age;
		
		System.out.println(name + "("+age+")");
	}

	public static void main(String[] args) {
		문제1();
		자바0630 Q2 = new 자바0630("망고",24);
		//생성자에 매개변수를 넣어주면 선언할 때 바로
		//값을 넣어줄 수 있다.
	}

}
