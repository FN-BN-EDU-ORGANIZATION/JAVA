package C202306;

public class C20230630 {

	public static void main(String[] args) {
		//의문점		: 이해안했던 점 적기
		//정리 : 코드에 대한 전반적인 정리/해석
		String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }
        
//        *
//        **
//        ***
//        ****
//        *****
        
        //for문을 사용해 1부터 100까지의 숫자를 출력
	}

}
