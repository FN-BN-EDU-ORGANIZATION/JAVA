package C20230629;

//예제 1번
//점수를 입력받고
//총합과 평균을 반환

public class MyMath {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private float avg;
	public MyMath() {}
	public MyMath(String n, int k, int e, int m){
		name = n;
		kor = k;
		eng = e;
		mat = m;
		tot = kor + eng + mat;
		avg = tot/3.f;
	}
	
	//setter
	public void setName(String n) {
		name = n;
	}
	
	public void setKor(int k) {
		kor = k;
	}
	
	public void setEng(int e) {
		eng = e;
	}
	
	public void setMat(int m) {
		mat = m;
	}
	
	//getter
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMat(){
		return mat;
	}
	
	public int getTotal() {
		return tot = kor + eng + mat;
	}
	public float getAvg() {
		return avg = getTotal()/3.f;
	}


	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		mm.setName("pmy");
		mm.setKor(10);
		mm.setEng(20);
		mm.setMat(30);
		
		System.out.println(mm.getTotal());
		System.out.println(mm.getAvg());
	}
	
	
}

