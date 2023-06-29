
//<1>.자바로 프로그램 작성하기 ("Hello java" 작성)

//package 이헌지;                                 //패키지 이름
//
//public class D1  {                            //클래스 이름 
//	public static void main(String[] args){ 	
//		
//		System.out.println("Hello world");      // 화면에 글자를출력한다(실행될 문자를 입력)  
//                                              // 출력값 : "Hello wor
//		}
//	}

//이해과정 ( 올바른예시, 잘못된 예시)
// Hello2.java

// public class Hello2 {}    
//        class Hello3 {}       풀이: public class 가 있는 경우,소스파일의 이름은 반드시 public class 와 일치해야한다.

//  Hello2.java
//  class Hello2{}
//  class Hello3{}              풀이: public class가 하나도 없는 경우,소스파일의 이름은 둘 다 가능하다.


//  잘못된 예시 
//  Hello2.java
//  public class Hello2 {}      풀이:하나의 소스파일에 둘 이상의 public class가 존재하면 안된다.
//  public class Hello3 {}           각 클래스를 별도의 소스파일에 나눠서 저장하던가 아니면 둘 중의 한 클래스에 public을 붙이지 않아야 함.

//  Hello3.java
//  public class Hello2{}
//         class Hello3{}       풀이:소스파일의 이름이 public class의 이름과 일치하지 않는다.

//  hello2.java
//  public class Hello2 {}      풀이:소스파일의 이름과 public class의 이름이 다르다. 
//  public class Hello3 {}      또한 대소문자를 구분하므로 대소문자 까지 일치해야한다. 소스파일의 이름에서 'h'를 'H'로 바꾸면 해결.
		
//<2>.자주 발생하는 에러와 해결방법




//1. cannot find symbol 또는 can not resolve symbol
// 예시)
// system.out.println("Hello world");  해결방법 ->  system을 System으로 맨앞의 글자를 대문자로 변경
// 지정된 변수나 메서드를 찾을 수 없다는 뜻으로 선언되지 않은 변수나 메서드를 사용하거나,변수 또는 메서드의 이름을 잘못사용한 경우에 발생한다.
// 자바에서는 대소문자 구분을 하기떄문에 철자 뿐만아니라 대소문자의 일치여부도 꼼꼼하게 확인해야한다.


//2. ';' expected 세미콜론';'이 필요한 곳에 없다는 뜻,자바의 모든 문장의 끝에는 ';'을 붙여주어야 한다. 잊지말자!!!!

//예시)			
// System.out.println("Hello world")  해결방법 -> 끝에 세미콜론 ';'을 붙이면 해결     


//3. Exception in thread "main"java.lang.NOSuchMethodError:main
// 'main메서드를 찾을 수없다.'는 뜻인데 실제로 클래스 내에 main메서드가 존재하지 않거나 메서드의 선언부 
// 'public static void main(String[]args)'에 오타가 존재하는 경우에 발생한다.
// 에러의 해결방법은 main메서드가 클래스에 정의되어 있는지 확인하고,정의되어 있다면 main메서드의 선언부에 오타가 없는지 확인한다.
// 자바는 대소문자를 구별하므로 대소문자의 일치여부까지 정확히 확인해야한다.

//예시)                     
//	 public static void Main(String[]args){ 	 // 해결방법 -> Main을 main 으로변경   

// 4. EXception in thread "main" java.lang.NoClassDeFoundError:Hello
// 'Hello 라는 클래스를 찾을 수 없다' 는 뜻이다. 클래스 'Hello'의 철자,특히 대소문자를 확인하고 이상이 없으면 클래스파일(*.class)이 
// 생성되었는지 확인한다.

//ex)                            
//package 이헌지;
//public class d1  {                          //클래스 d1을 D1으로 변경 (클래스명이 D1.java임)
//	public static void main(String[] args){ 	
		
//		System.out.println("Good evening");       
                                              
//		}
//	}

// 5.illegal start of expression
// 직역하면 문장(또는 수식.expression)의 앞부분이 문법에 맞지 않는다는 의미인데,문장에 문법적 오류가 있다는 뜻이다.
// 괄호' ('나 '{열고서 닫지 않거나,수식이나 if문,for문 등에 문법적 오류가 있을 때 또는 public이나 static과 같은 키워드를 
// 잘못 사용한 경우에도 발생,에러가 발생한 곳이 문법적으로 옳은지 확인하자.1!!

// 예시)                        
//	  public static int main(String[] args)  	해결방법-> int를 void로 메서드를 재정의

// 6. class,interface,or enum expected
// 메세지의 의미는 '키워드 class나 interface 또는 enum이 없다.' 이지만 보통 괄호 '{' 또는 '}'의 개수가 일치 하지 않는 경우에 발생.
// 열린괄호'{'와 닫힌괄호'}'의 개수가 같은지 확인하자!!!!!!



// 에러가 발생했을 때
// 1.에러메세지를 잘 읽고 해당 부분의 코드를 살펴본다. 이상이 없으면 해당코드의 주위(윗줄과 아래줄)도 함께 살펴본다.
// 2.그래도 이상이 없으면 에러 메세지는 잊어버리고 기본적인 부분을 재확인한다. 대부분의 에러는 사소한 것
// 3.의심이 가는 부분을 주석처리하거나 따로 떼어내서 테스트 한다.

// 에러 메세지가 실제 에러와는 관계없는 내용일 때도 있지만,대부분의 경우 에러 메시지만 잘 이해해도 문제가 해결되는 경우가 많으므로 
// 에러 해결을 위해서 제일 먼저 해야 할 일은 에러 메시지를 잘 읽는 것임을 명심하자!!!!

     
                                              
		
	

		
	
