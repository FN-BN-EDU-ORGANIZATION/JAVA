package C202307;

public class C20230704 {

	public static void main(String[] args) {
		// 1000 아래의 3과 5의 배수의 합을 구하시오.

		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i%3 == 0 || i%5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("3과 5의 배수 합 : " + sum);
		// 답 : 233,168
		
		//A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
		//A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.

		// 예시를 가져와보자
		String str = "int sum = 0;\r\n"
				+ "		for (int i = 1; i < 1000; i++) {\r\n"
				+ "			if (i%3 == 0 || i%5 == 0) {\r\n"
				+ "				sum += i;\r\n"
				+ "			}\r\n"
				+ "		}";
		
		System.out.println(str.replace("\t", "    "));
		
	}

}

