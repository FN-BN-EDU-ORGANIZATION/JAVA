package Songjaeuk.D230703;
/*
 # 추상클래스

- 추상 클래스는 인스턴스가 될 수 없다.
- 추상 클래스를 상속받는 자손이 인스턴스가 된다
- abstract키워드를 사용하여 클래스를 정의한다.
- 추상 클래스는 보통 1개 이상의 추상 메소드를 가진다.(추상 메소드가 없어도 오류가 발생하진 않는다)
- public abstract class클래스명{….}
 */





//Controller의 종류가 여러개인경우
//초기화-같은코드
//실행--다른 코드
//마무리 같은 코드

 abstract class Controller {

    //protected는 같은 package거나 상속받았을 경우 접근할 수 있다.
  protected  void init(){
        System.out.println("초기화 하는 코드");
    }


 protected  void close(){
        System.out.println("마무리 하는 코드");
    }

  protected   abstract void run(); //매번 다른 코드

    //내가 가지고있는 메소드를 호출한다.
    //어떤 순서를 가지고 있다. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init();
        this.run();
        this.close();
    }
}
 class FirstController extends Controller {

	    @Override
	   protected void run() {
	        System.out.println("별도로 동작한는 코드 00000");
	    }
	}

public class Exam2 {
	public static void main(String[] args) {
        Controller c1 =new FirstController();
        c1.execute();

    }

}
