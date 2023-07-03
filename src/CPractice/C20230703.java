package CPractice;

public class C20230703 {
	public static void main(String[] args) {
		//while문과 for문 두 반복문의 구조 차이를 비교
//		for (int i = 0; i < 10; i++) {
//		    System.out.println(i);
//		}
//		//0~9까지 출력하는 for문의 구조입니다
		int i = 0;
		while (i < 10) {
		    System.out.println(i);
		    i++;
		}
		//마찬가지로 0~9까지 출력하며 while문입니다
		//둘의 차이라면 for문은 일반적으로 반복 횟수가 정해져 있을 때 사용하며, 
		//while문은 반복 횟수가 정해져 있지 않거나 조건이 만족될 때까지 반복해야 할 때 사용합니다.
	}
}
