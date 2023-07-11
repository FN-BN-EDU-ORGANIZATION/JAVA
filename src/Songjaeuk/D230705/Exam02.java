package Songjaeuk.D230705;

	class Ball {		//Ball에 숫자를 넣음
    private int number;
    public Ball(int number){
        this.number= number;

    }
    public int getNumber(){
        return number;

    }
}


public abstract class Exam02 {

	/*
	1.1~45까지 써있는 Ball을 로또 기계에 넣는디
	2.로또기계에 있는 Ball들을 섞는다.
	3.섞인 Ball중에서 6개를 꺼낸다.
	 */
	
	    //인터페이스가 가지고 있는 메소드는 모두 추상 메소드이기 때문에 abstract가 생략가능


	    int Max_BALL_COUNT = 45;
	    int RETURN_BALL_COUNT = 6;
	    public abstract void setBalls(Ball[]balls);  //Ball[] Ball이 여러개를 받겠다.
	    public abstract void mix(); //자기가 가지고 있는 Ball들을 섞는다.
	    public abstract Ball[] getball(); //6개의 Ball을 반환한다.

	}



