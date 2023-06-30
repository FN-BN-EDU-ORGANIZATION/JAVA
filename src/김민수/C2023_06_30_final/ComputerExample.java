package 김민수.C2023_06_30_final;

//명세서: 이번에는 계산하는 컴퓨터를 만들어 달라고 하는데, 정수값이 몇개가 들어와도 합산을 할 수 있는 컴퓨터를 사용할 수 있도록 해달라고 한다.
class Computer{ //객체를 생성하기 위한 Computer클래스를 생성
	int sum1(int[] values) { //파라밀터를 배열공간으로 받아서 배열의 모든 요소를 모두 더하여 리턴 할 수 있는 메서드
		int sum=0;
		for(int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	int sum2(int ... values) { //파라밀터를 가변인자로 받아서 가변요소를 모두 더하여 리턴 할 수 있는 메서드
		int sum=0;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
}
public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1= {1,2,3}; //배열요소가 파라밀터에 들어가더라도 main함수가 끝나기전까지 values1이라는 배열객체가 주소값으로 가리키고 있음.
		int result1=myCom.sum1(values1); 
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5}); //배열 요소가 sum2메서드가 pop됨과 동시에 사라짐.
		System.out.println("result2: "+result2);
		
		int result3=myCom.sum2(1,2,3); //배열요소를 가변요소로 받아서 사용하는 함수
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: "+ result4);
	}
}
