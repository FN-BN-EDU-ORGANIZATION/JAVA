package 생활코딩;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("switch(1)");
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
		int val = 1;
		if(val == 1) {
			System.out.println("one");
		}
		else if(val == 2) {
			System.out.println("two");
		}
		else if(val == 3){
			System.out.println("three");
		}
		
			System.out.println("switch(2)");
			switch(1) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
			case 3:
				System.out.println("three");
			}
			System.out.println("switch(3)");
			switch(1) {
			case 1:
				System.out.println("one");
			case 2:
				System.out.println("two");
			case 3:
				System.out.println("three");
		}
	}

}
