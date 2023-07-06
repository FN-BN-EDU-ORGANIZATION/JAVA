package 윤광혁;

public class 예제20230706 {
	//1	쓰래드 Thread
	//Thread는 실행단위를 의미하며
	//하나의 프로세스 내에서 동시에 실행되는 작업의 흐름을 나타낸다.
	//즉 스레드를 사용하면 동시에 여러작업을 동시에 수행할수있다.
	
	//Thread를 사용하려면 Thread 클레스를 상속받은 상용자 정의 클레스를 작성하여
	//스레드를 생성하고 실행할수 있다.
	//사용자 정의 클레스는 'run()'메서드를 오버라이딩 하여 스레드가 실행될때 수행될 작업을
	//정의 할수있다.
	
	//또한 Rummable 인터페이스를 구현하는 클레스를 작성하여 스레드를 생성하고 실행할수도있다.
	//이방식 일때는 start()메서드로 스레드를 실행한다.
	//자바 스레드를 동기화 및 상호작용을 위한 다양한 기능과 메서드가있다
	//스레드 간의 동기화를 위해 synchronized 키워드를 사용하거나 wait(), notify(), notifyAll() 메서드를 활용할 수 있다.
	
	//2	자바로 난수 생성하기
	//자바에서 랜덤함수를 사용하여 난수를 생성할수있다.
	//Ramdom 클레스 객체를 생성하여 Random 객체의 메서드를 사용하여 난수를 생성할수있다.
	//일반적인 메서드로는 nextInt()메서드가 있으며 다양한 형식의 난수를 생성할수있다.
//	int r1 = random.nextInt(); // int 범위 내의 난수 생성
//	int r2= random.nextInt(10); // 0부터 9까지의 난수 생성
	//다양한 자료형으로 난수를 생성할수도 있다
//	double rDouble = random.nextDouble(); // 0.0부터 1.0 사이의 난수 생성
//	float rFloat = random.nextFloat(); // 0.0부터 1.0 사이의 난수 생성
//	boolean rBoolean = random.nextBoolean(); // true 또는 false 중 하나의 값을 가진 난수 생성
//	long rLong = random.nextLong(); // long 범위 내의 난수 생성
}
