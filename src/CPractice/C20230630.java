package CPractice;

public class C20230630 {
	
	
	public static void main(String[] args) {
    
    int[] number = {1, 2, 3, 4, 5};
    System.out.println("첫 번째 요소는 " + number[0] + "입니다.");
    System.out.println("두 번째 요소는 " + number[1] + "입니다.");
    System.out.println("세 번째 요소는 " + number[2] + "입니다.");
    //배열함수를 통해서 요소를 하나씩 빼내는 작업을 하였습니다. 
    for (int i = 0; i < number.length; i++) {
      System.out.println("요소 " + i + "은(는) " + number[i] + "입니다.");
    }
    //반복문을 통해 한줄로 그 과정을 나타낼 수 있었습니다. 
    
  }
}
