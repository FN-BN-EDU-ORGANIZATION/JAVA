package C20230704;

class Test{
	int iv = 10; //인변 -- 객체 생성시 생성 , 객체 소멸시 소멸
	static int cv = 1;  //클변 -- 프로그램 실행시 , 소멸 -- 종료시 
	void a()
	{
		int i = 5; //지변 생성 -- 수행시 -- 소멸 --수행끝나고즉시
		System.out.println(i);
		System.out.println(cv);
		System.out.println(iv);
	}
	void b()
	{
		
		System.out.println(cv);
		System.out.println(iv);
	}
}
public class C20230704EX01 {

	public static void main(String[] args) {
		

	}

}
