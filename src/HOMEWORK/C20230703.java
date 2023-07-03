package HOMEWORK;

import java.util.Scanner;

public class C20230703 {
	public static void main(String[] args) {
		
	
		//의문점
		//정리
		
		//예제1 : 명품자바 4장 클래스 문제 4번 다시 풀어보기
		//		 직사각형을 표현하는 Rectangle클래스 
	class Rectangle{
		private int x;
		private int y;
		private int width;
		private int height;
		
		Rectangle(int x, int y, int width, int height){
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		public int square() {
			return width*height;
		}
		
		public void show() {
			System.out.printf("(%d,%d)에서 크기가 %dx%d인 사각형\n",x,y,width,height);
		}
		
		public boolean contains(Rectangle r) {
			this.x = x;
			this.y = y;
			if(x < r.x && y < r.y) 
				if((width+x)>(r.width+r.x)&&(height+y)>(r.height+r.y))
				return true;				
			return false;			
	}
	}
//	public static void main(String[] args) {
		 Rectangle r = new Rectangle(2, 2, 8, 7);
		 Rectangle s = new Rectangle(5, 5, 6, 6);
		 Rectangle t = new Rectangle(1, 1, 10, 10);
		   
		 r.show();
		 System.out.println("s의 면적은 "+s.square());
		 if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		 if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
	
		
		//예제2 : 명품자바 4장 클래스 문제 8번 다시 풀어보기
		//
	class Phone{
		private String name;
		private String tel;
		
		Phone(String name, String tel){
			this.name = name;
			this.tel = tel;
		}
		
		String getName() { //검색 - 반환만 하면 됨!
			return name;
		}
		
		String getTel() { //검색 - 반환만 하면 됨!
			return tel;
		}
	}

//	public class C04_Class08 {
//		public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Phone book[];
		int i;
		System.out.println("인원수 >>");
		int num = sc.nextInt();
		book = new Phone[num];
		for(i=0;i<book.length;i++) {
			System.out.println("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>>");
			String name = sc.next();
			String tel = sc.next();
			book[i] = new Phone(name,tel);
		}
		System.out.println("저장되었습니다...");
		while(true) {
			System.out.println("검색할 이름 >>");
			String name = sc.next();
			for(i=0; i<num; i++) {
				if(name.equals(book[i].getName())) {
					System.out.println(name+"의 번호는 "+book[i].getTel()+"입니다.");
					break;
				}
			}
			if(name.equals("그만")) break;
			if(i == num) System.out.println(name+"이 없습니다.");
		}	
		sc.close();
		}
	}

