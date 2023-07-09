package C0709;

import java.util.Scanner;

class Subject{
//	국어 영어 수학 점수를 받아 모두 더하는 메서드
	static double sum (double kor,double eng, double mat) {
		return kor+eng+mat;
	}
//	국어 영어 수학 점수를 받아 더하여 평균을 구하는 메서드
	static double avg(double kor,double eng, double mat) {
		return (kor+eng+mat)/3;
	}
//	총점과 평균을 출력해주는 메서드
	static void showInfo(double kor,double eng,double mat) {
		System.out.println("총점 : " +sum(kor,eng,mat));
		System.out.println("평균 : " +avg(kor,eng,mat));
	}
}

public class C01Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어, 영어, 수학 점수를 입력해주세요");
		double kor = sc.nextDouble();
		double eng = sc.nextDouble();
		double mat = sc.nextDouble();

		Subject.showInfo(kor,eng,mat);
		
	}
}
