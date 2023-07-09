
package C20230706;


//정리
//재너릭
//자바에서 컴파일 시 타입 체크를 해주는 기능으로
//클래스나 메서드에서 사용되는 타입을 컴파일 시점에 지정할 수 있게 한다.
//제네릭을 사용하여 코드의 재사용성과 타입 안정성을 높일 수 있다
import java.util.ArrayList;
import java.util.List;

class MyGenericClass<T> {
    private T value;
    
    public MyGenericClass(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
    
    // 제네릭 메서드
    public <U> List<U> transformList(List<?> list, U defaultValue) {
        List<U> transformedList = new ArrayList<>();
        for (Object item : list) {
            transformedList.add(defaultValue);
        }
        return transformedList;
        
    }
}

public class C20230706 {
    public static void main(String[] args) {
        MyGenericClass<String> strObj = new MyGenericClass<>("Hello");
        
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        
        // 제네릭 메서드 호출
        List<String> transformedList = strObj.transformList(intList, "Default");
        
        // 변환된 리스트 출력
        for (String item : transformedList) {
            System.out.println(item);
        }
    }
}
