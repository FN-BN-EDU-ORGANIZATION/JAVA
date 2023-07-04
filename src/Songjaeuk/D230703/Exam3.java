package Songjaeuk.D230703;


/*final클래스

### 부모가 될 수 없는 클래스

- 상속을 금지 시키려면 클래스를 정의할 때 final키워드를 사용한다
- 대표적으로 String등이 있다.
- public final class 클래스명{…}
*/




public class Exam3 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        if (str1.equals(str2)){//equals는 값이 같냐를 의미
            System.out.println("str1과 str2의 값이 같다");
        }
        String s = str1.toUpperCase(); //toUppercase는 소문자를 대문자로 바꾸라는 의미
        System.out.println(s);
        System.out.println(str1);


        String substring = str1.substring(3);
        System.out.println(substring);
        System.out.println(str1);
    }
}
