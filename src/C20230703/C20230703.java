package C20230703;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class C20230703 {
    public static void main(String[] args) {

        /*
            서비스에서 API작동 후 PTY,RN1,T1H,REH의 obsrValue를 Map<String,String>로
            저장한 값을 Map<String,Object>로 컨트롤에 전달,view에서 컨트롤에 전달된 api에서 받은 데이터를 바로 ui에
            띄울수 있게 하려고 해봤으나 기존의 방식처럼 직접적으로 클래스를 호출해서 하는것 말고
            여러 단계를 거쳐 값을 받는 방법은 어떻게 해야할지 모르겠음
         */
    }
}
class A{

}
class B{


    Map<String, Objects> pair=new HashMap<String ,Objects>();

    void setPair(C c){
        pair.put("c",new C("a","A"));
    }

}
class C{
    String c;
    String C;
    public C(String c, String C){
        this.c=c;
        this.C=C;
    }
}