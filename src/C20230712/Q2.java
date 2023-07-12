package C20230712;
//아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이 클래스를 상속받고록 코드를 변경하시오.


//
//class Marin {
//	int x,y;
//	void move(int x,int y) {}
//	void stop() {}
//	void stimPack() {}
//}
//
//class Tank{
//	int x,y;
//	void move(int x, int y) {}
//	void stop() {}
//	void changeMode() {}
//}
//
//class Dropship{
//	int x,y;
//	void move(int x, int y) {}
//	void stop() {}
//	void load() {}
//	void unload() {}
//}


//--------------------------------------------

abstract class Unit{
	int x, y;
	abstract void move(int x, int y); //abstract class
	void stop() {}
}

//---------------------------------------------

class Marin extends Unit {
	void move(int x,int y) {}
	void stimPack() {}
}

class Tank extends Unit{
	void move(int x, int y) {}
	void changeMode() {}
}

class Dropship extends Unit{
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}