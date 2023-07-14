package mysutdy02_abstract;

public class Gorilla extends Mammal {
	public void Fight(String enemy) {
		System.out.println(enemy+"쌈");
	}


	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("손으로 먹습니다");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("손으로 먹습니다");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("손으로 먹습니다");
	}
	
	//public 없이 abstract void eat() 하면 다른 후손 
	
}
