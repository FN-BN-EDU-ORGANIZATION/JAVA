package 이종현;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class C20230701 {
	// 의문점 : 이해안했던 점 적기
	// 정리 : 코드에 대한 전반적인 정리/해석

	// 예제 1

	// 싱글톤 패턴에 대해 잘 이해 못했다가 현재 하고있는 과제에 활용 을 하기위해
	// 전에 했던 수업을 복습을 하고있는대 한번 어떤 용도를 사용 되는지 알아 보다가
	// 반복적으로 new 를 계속 선언 할필요 가 없고 싱글톤 패턴으로 그대로 너으면 된다는것을 알게 되었습니다.

//	private static BookDao instance; 
//	public static BookDao getInstance() {
//		if(instance==null)
//			instance=new BookDao();
//		return instance;
//		}

	// 예제 2

	// ActionListener 리스트에 대해 좀더 알게 되었습니다.
	
	// 넣으면 추상클래스로 되어 이벤트 처리가 되어 위에 있는 싱글톤 패턴에 이용해 메인 클래스로 이용할까 했는대 안되서 GPT로 이용해 
	// 알아 봐는대 추상클래스로 이용해 안에 이벤트 처리를 싱글톤 패턴에 이용하는것이 안된다 했어습니다.
	// class MainRun extends JFrame implements ActionListener

	// 대신 이벤트 처리를 메소드 안에 넣어서 따로 이용해 서 사용할수 밖에 없다는것을 알게 되었습니다.
	// public WeatherNcst() throws Exception
		
		//(O)
	//	@Override
	//	public void actionPerformed(ActionEvent e) 

	//}
		//(X)
	//	@Override
	//	public void actionPerformed(ActionEvent e) 
	
	//}
	
}
