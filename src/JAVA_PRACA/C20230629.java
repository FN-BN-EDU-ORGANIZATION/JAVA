package JAVA_PRACA;

import java.util.Calendar;
class Person {

	String name;
	String RRN;
	
	public Person()
	{
		
	}
	
	void showState()
	{
		System.out.println("이름:"+ name + "\t주민번호:" + RRN + "\t성별:" + getGender()+ "\t나이:" + getAge());
	}
	
	// 성별 성별 출력
	String getGender()
	{
		String gender = RRN.substring(7,8);
		
		switch(gender)
		{
		case "0", "2", "4", "6", "8": gender="F";
		break;
		case "1", "3", "5", "7", "9" : gender="M";
		break;
		}
		return gender;
	}
	
	// 만나이 계산
	int getAge()
	{
		Calendar cal = Calendar.getInstance();
		
		int nowYear = cal.get(Calendar.YEAR);
		int nowMonth = cal.get(Calendar.MONTH)+1;
		int nowDay = cal.get(Calendar.DAY_OF_MONTH);
				
				//년도 뒷자리 2개를 가져온다.
				int year = Integer.parseInt(RRN.substring(0,2));
				
				//성별을 가져온다. 성별의 숫자에 따라 태어난 년도가 결정되기에 필요하다.
				String generation = RRN.substring(7,8);
				
				switch(generation)
				{
					case "0","9":
						year +=1800;
						break;
					case "1","2","5","6":
						year +=1900;
						break;
					case "3","4","7","8":
						year +=2000;
						break;
				}
				
				int bornMonth = Integer.parseInt(RRN.substring(2,4));
				
				int bornDay = Integer.parseInt(RRN.substring(4,6));

				int bornYear = nowYear - year-(nowMonth>= bornMonth && nowDay>= bornDay ? 0 : 1);
					
				return bornYear;
	}
}

public class C20230629 {
	
	public static void main(String[] args) {
		
		// Person 클래스 만들어보기
		 Person p1 = new Person();
		 Person p2 = new Person();
	
		 p1.name = "홍길동";
		 p1.RRN = "750215-1234567";
	
		 p2.name = "김길동";
		 p2.RRN = "850215-1234567";
		 
		 System.out.println("이름:" + p1.name + "\t주민번호:" + p1.RRN);
		 System.out.println("이름:" + p2.name + "\t주민번호:" + p2.RRN);

		 // person 클래스에서 이름 주민등록번호 출력하는 메서드 및 성별 반환하는 메서드 확인 코드
		 Person p3 = new Person();
		 Person p4 = new Person();
	
	
		 p3.RRN = "950101-1234567";
	
		 p4.RRN = "950101-6789123";
	
		 p3.showState();
		 p4.showState();

		 // 주민번호를 이욯해 나이를 반화이 되는지 확인 코드 
		 Person p5 = new Person();
		 Person p6 = new Person();
	
	
		 p5.RRN = "010512-3234567";
	
		 p6.RRN = "950101-2789123";
		
		 p5.showState();
		 p6.showState();

	}

}
