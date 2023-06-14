package EX.Generic;
// 문제: 제너릭을 사용하여 Pair<T, U> 클래스를 구현하세요.
// Pair 클래스는 두 개의 요소를 담을 수 있는 클래스입니다.
// 제한사항:
// - Pair 클래스는 제너릭 타입 T와 U를 가지며, 첫 번째 요소와 두 번째 요소를 각각 저장할 수 있어야 합니다.
// - getFirst 메서드는 첫 번째 요소를 반환합니다.
// - getSecond 메서드는 두 번째 요소를 반환합니다.

public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Alice", 25);
        Pair<Boolean, Double> pair2 = new Pair<>(true, 3.14);

        System.out.println("Pair 1:");
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println("Pair 2:");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
    }
}
