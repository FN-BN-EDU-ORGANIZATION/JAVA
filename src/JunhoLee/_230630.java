package JunhoLee;

import java.util.*;


class _obj{//이름, 나이 받는 객체
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}




public class _230630 {
	

	public static void main(String[] args) {
		
		ArrayList<_obj> arr = new ArrayList();//동적 배열
		
		Scanner sc = new Scanner(System.in);//스캐너
		
		_obj _obj;//값을 저장할 객체
		
		int i = 0;
		do {
			System.out.println(i + "번째 ");
			
			_obj = new _obj();//새로운 객체 생성
			System.out.println("이름: ");
			String name = sc.nextLine();

			System.out.println("나이: ");
			int age = sc.nextInt();
			

			System.out.println();
			
			_obj.setName(name);//객체에 값 저장
			_obj.setAge(age);
			
			arr.add(_obj);//배열에 저장
			
			i++;
		}while(i < 3);//3번 반복

		
		for(_obj obj : arr) {//저장한 값 출력
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
		}
		
		
		return;

	}

}
