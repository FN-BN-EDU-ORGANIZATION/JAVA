package C20230706;


class Student{
	 String name;
	 int ban;
	 int no;
	 int kor;
	 int eng;
	 int math;
	 
	 int getTotal() {

		 return kor+eng+math;
		}
	 
	 float getAverage() {
		   return Math.round((float) getTotal() / 3 * 10) / 10f;
	 }
	 
	 Student(String n, int b, int nb, int k, int e, int m){
		name = n;
		ban = b;
		no = nb;
		kor = k;
		eng = e;
		math = m;
	 }
	 Student(){}
	 String info() {
		 String infoStr = name +" "+ ban + " " + no + " " + kor + " " + eng + " " + math + " " + getTotal() + " " +getAverage();
		return infoStr; 
	 }
}


public class stdmain {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "gildong";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("name : " + s.name);
		System.out.println("tscore : " + s.getTotal());
		System.out.println("avg : " + s.getAverage());
		
		Student s2 = new Student("minyoung",1,1,100,60,76);
		System.out.println(s.info());
	}

}
