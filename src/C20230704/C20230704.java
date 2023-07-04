package C20230704;

import java.util.*;

public class C20230704 {
    public static void main(String[] args) {
        //메인에서 c에서 생성된 값이 a클래스만을 선언해서 전달되는지 확인
        a0704 x=new a0704();
        x.a0704();
        System.out.println(x.Abc);

        //c에서 생성된 Map이 잘생성 되었고 그 값이 b에 전달되었는지 확인
//        b0704 y=new b0704();
//        y.b0704();
//        System.out.println(y.aBc);
//
//        c0704 z=new c0704();
//        z.c0704();
//        System.out.println(z.abC);

        //List<String> 생성 후 값입력 후 출력 되는지 확인용
//        List<String > list=new ArrayList<>();
//        list.add("q");list.add("w");list.add("e");list.add("r");list.add("t");list.add("y");
//        System.out.println(list);
    }
}
class a0704{
    Map<String ,List> Abc;
    b0704 _b0704;
    public void a0704(){
        _b0704=new b0704();
        _b0704.b0704();
        Abc=_b0704.aBc;
    }
}
class b0704{
    Map<String ,List> aBc;
    c0704 _c0704;
    public void b0704(){
        _c0704=new c0704();
        _c0704.c0704();
        aBc=_c0704.abC;
    }
}
class c0704{
    Map<String , List> abC=new HashMap<>();


    public void c0704(){
        List<String> list=new ArrayList<String>();
        list.add("q");list.add("w");list.add("e");list.add("r");list.add("t");list.add("y");
        abC.put("abc",list);

    }
}