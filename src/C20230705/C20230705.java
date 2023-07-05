package C20230705;
/*
 * 1-1 Student 클래스가 생성 될때마다 학생수 카운트를 올려보자
- 멤버변수 : String name, int kor, int math, int eng
- count 변수는 객체가 생성된 숫자를 가지고 있어야 한다. 
- 생성자를 오버로딩 하여 아래의 예시처럼 만들자. 
- 멤버메서드 : getTotal() 성적의 합계를 반환한다.
	getAverage()  성적의 평균을 반환한다.

1-2Student 클래스에 기능을 추가하자

Student[] 길이10의 배열을 만들어 반복문을 이용해서 객체를 생성하자
앞선 만든 생성자를 이용해 이름과 성적을 초기화 한다.(이름은 모두 다르게)
성적은 Math.radom() 을 활용해서 0~100 랜덤으로 입력한다.
 */

class Student{
	String name;
	int kor;
	int math;
	int eng;
	static int count;
	//생성자 오버로딩
	Student(){
		count++;
	}
	
	Student(String name){
		count++;
	}
	
	Student(String name, int kor,int math, int eng){
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		count++;
	}
	
	int GetTotal(){
		return kor+math+eng;
	}
	double GetAverage(){
		return kor+math+eng/3.0;
	}
	
}
public class C20230705 {

	public static void main(String[] args) {
			Student student1 = new Student();
			Student student2 = new Student("박주병");
			Student student3 = new Student("홍길동", 32,13,23);
			
			Student[] SR = new Student[10]; //길이 10의 배열 생성
			
			//길이 10의 배열의 객채 인덱스 0~9까지 
			for(int i=0; i<SR.length; i++) {
				SR[i] = new Student();
			}
			
			System.out.println(Student.count);
			System.out.println(student3.GetTotal());  //3과목 성적합계
			System.out.println(student3.GetAverage()); //3과목 성적 평균

	}

}
package mystudy01_object_arr;

import java.util.Scanner;


public class Myjava01_KoreaIT {

	public static void main(String[] args) {
		KoreaITStudent a = new KoreaITStudent();
		KoreaITStudent b = new KoreaITStudent();
		KoreaITStudent c = new KoreaITStudent();
		
		a.name="박승찬";
		a.age = 30;
		a.stuNum="001";
		a.subject="java";
		
		b.name="이동준";
		b.age = 34;
		b.stuNum="009";
		b.subject="java";
		
		c.name="정우균";
		c.age = 35;
		c.stuNum="000";
		c.subject="network";
		System.out.println(a.name+a.stuNum); //학번 인트하면 알지? 
		System.out.println(b.name+b.stuNum);
		System.out.println(c.name+c.stuNum);
		
		
		Scanner sc = new Scanner(System.in);
		KoreaITStudent[] academy = new KoreaITStudent[3]; //크기 3의 배열생성  012
		
		for(int i = 0; i<academy.length; i++)//for 반복문 길이 3만큼 반복 012까지
		{
			System.out.println("학생의 학번은?"); //학번 입력하라고 띄워준다
			String num = sc.nextLine(); //학번 입력 String num 에 저장 001, 002
			
			for(int j = 0; j<i; j++) { //첫번째는 0이니까 반복문 실행 x 두번째 1부터실행
				if(academy[j].stuNum.equals(num)) { //stuNum 과 (num)을 비교 동일한지 확인 
					//요약하자면 중복된 학번이 있는지 확인하는 조건문이다
					//i가 1인경우 j =0임 그니까 아카데미 0번쨰 인덱스의 num과 값이 같은지 비교한다
					i--; //중복이면 i 값 -1 
					//num = null;  or num ="";
					num = null;
					break; //빠져나와 다음 실행 num값은 null값으로 다음 if문 실행 중복 & continue실행
				}
			}
			//if(num == null){}
			if(num.isEmpty()) {
				//입력한 학번이 비었을경우 참 - > if 문 실행 !! 출력
				System.out.println("중복!!");
				continue;  //continue문이 실행되면 이후의 코드 블록은 실행되지 않고, 다음 반복이 시작
			}
			System.out.println("학생의 이름은?");
			String name = sc.nextLine(); //학생의 이름 입력 변수 name 에 저장 
			System.out.println("학생의 나이는?");
			int age = Integer.parseInt(sc.nextLine()); //나이입력 변수 age 에 저장
			System.out.println("학생이 수강하는 과목은?");
			String subject = sc.nextLine();  //수강과목 입력 변수 subject에 저장
			
			KoreaITStudent temp = new KoreaITStudent(); //temp 객체생성 입력한 값을 넣어줌
			temp.name = name;
			temp.age = age;
			temp.stuNum = num;
			temp.subject = subject;
			academy[i] = temp;  //012 temp 객체에 넣어준값을 012 인덱스에 각각 다 넣어줌 
			//여기까지 for 문 반복
		}
		
		//새로운 for 문 
		for(KoreaITStudent koreaITStudent : academy) {
			System.out.println("학번"+koreaITStudent.stuNum);
			System.out.println("이름"+koreaITStudent.name);
			System.out.println("나이"+koreaITStudent.age);
			System.out.println("과목"+koreaITStudent.subject);
			
			
		}
	}

}

