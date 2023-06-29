package EX.Generic;
// 문제: 제너릭을 사용하여 스택(Stack) 클래스를 구현하세요.
// 제한사항:
// - Stack 클래스는 제너릭 타입 T를 가지며, push, pop, isEmpty 메서드를 구현해야 합니다.
// - push 메서드는 스택에 요소를 추가합니다.
// - pop 메서드는 스택의 가장 위에 있는 요소를 제거하고 반환합니다.
// - isEmpty 메서드는 스택이 비어있는지 여부를 반환합니다.

public class Ex2<T> {

    private T[] elements;
    private int top;

    public Ex2(int capacity) {
        elements = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T element) {
        elements[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty.");
        }
        return elements[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Ex2<Integer> stack = new Ex2<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
