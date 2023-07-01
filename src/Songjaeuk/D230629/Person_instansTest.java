package Songjaeuk.D230629;

public class Person_instansTest {
	public static void main(String[] args) {
		//문제 instans의 이해가 인스턴스 선언을 할 줄 몰랐음
		
	
	 Person_Instans p1= new Person_Instans() ; // p1은 null이다
	 Person_Instans p2 = new Person_Instans();

     p1.name = "홍길동"; //문자열은 new를 사용하지 않고 인스턴스를 사용할 수 있다. 
     p2.name = "조조";

     System.out.println(p1.name);
     System.out.println(p1.name.length());
     System.out.println(p1.address);
     System.out.println(p1.isVip);

     System.out.println(p2.name);
     System.out.println(p2.address);
     System.out.println(p2.isVip);

	}
 }


