// 문제: 제너릭을 사용하여 배열의 요소를 출력하는 printArray 메서드를 구현하세요.
// 제한사항:
// - printArray 메서드는 제너릭 타입 T와 배열 arr을 매개변수로 받습니다.
// - 배열 arr의 모든 요소를 순서대로 출력해야 합니다.

public class GenericExample {

    // printArray 메서드 구현
    public static <T> void printArray(T[] arr) {
      
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Alice", "Bob", "Charlie"};

        System.out.println("Numbers:");
        printArray(numbers);

        System.out.println("Names:");
        printArray(names);
    }
}
//--------------------------------------------------------------