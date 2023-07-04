package C20230704;
/*
 * 1-1 Student 클래스가 생성 될때마다 학생수 카운트를 올려보자
- 멤버변수 : String name, int kor, int math, int eng
- count 변수는 객체가 생성된 숫자를 가지고 있어야 한다. 
- 생성자를 오버로딩 하여 아래의 예시처럼 만들자. 
- 멤버메서드 : getTotal() 성적의 합계를 반환한다.
	getAverage()  성적의 평균을 반환한다.
	
	ㅓ
	1-2Student 클래스에 기능을 추가하자
	Student[] 길이10의 배열을 만들어 반복문을 이용해서 객체를 생성하자
	앞선 만든 생성자를 이용해 이름과 성적을 초기화 한다.(이름은 모두 다르게)
	성적은 Math.radom() 을 활용해서 0~100 랜던으로 입력한다.
 */
class Student{
	String name; //박주병..
	int kor;
	int math;
	int eng;
	static int count;
	Student(){ //디폹트 생성자.
		count++;
	}
	Student(String name){ //디폹트 생성자.
		this.name =name;
		count ++;
		System.out.println(this.name); //박주병 
	}
	Student(String name, int kor,int math, int eng){ //디폹트 생성자.
		count++;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		
	}
	int getTotal() {
		//성적의 합계를 반환한다
		return kor+math+eng; //호출하곳에 반환 
		
	}
	double getAverage() {
		//성적의 평균을 반환한다.
		return (kor+math+eng)/3.0; //호출한곳에 리턴으로 반환해서 total에 ~ 
		
	}
}
public class C20230704EX03 {
	
	public static void main(String[] args) {
		Student student1 = new Student(); //아무런 매개변수를 넣지않았음으로 0 ..
		
		Student student2 = new Student("박주병");
		
		Student student3 = new Student("홍길동",32,13,23);
		
		Student[] STD = new Student[10]; //길의 10의 Stduent 배열 생성
		
		
		int total3 = student3.getTotal(); //st1객체의 메서드호출 및 ...total1에 넣어준다.
		System.out.println("학생3의 성적합계는? "+total3+"입니다");
		double average3 = student3.getAverage();
		System.out.println("학생3의 성적평균은?"+average3+"입니다");
		
		
		System.out.println("학생의수는 "+Student.count+"입니다");  //3

	}

}

