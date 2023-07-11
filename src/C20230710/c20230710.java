package C20230710;

import java.time.LocalTime;
import java.util.Set;

public class c20230710 {

    /*
        key값이 시간 value값이 날씨정보(강수상태, 강수량, 기온, 습도)인 map에서
        시간별로 날씨정보를 정렬하여 출력할 수 있게 하기위해 key값을 Set으로 받은 후
        Set을 배열로 저장하여 필요한 시간대를 취사선택 할 수 있도록 연습해본 코드
     */

//    //단기예보
//    Set<String> fcstTime=weatherAPI.fcstPTY.keySet();
//    String[] keys = weatherAPI.fcstPTY.keySet().toArray(new String[0]);
//
//        for (int i = 0; i < keys.length; i++) {
//        System.out.println(keys[i]);
//    }
//
//
//        for(String key:keys) {
//        System.out.println(
//                key+"시 "+
//                        "강수상태: "+weatherAPI.fcstPTY.get(key)+
//                        " 강수량: "+weatherAPI.fcstRN1.get(key)+
//                        " 습도: "+weatherAPI.fcstREH.get(key)+"%"+
//                        " 기온: "+weatherAPI.fcstT1H.get(key)+"℃");
//    }
//
//    int hour;
//    String strHour;
//    LocalTime time=LocalTime.now();
//    hour=time.getHour();
//        for (int i = 1; i <= 6; i++) {
//
//        if(hour<10)
//            strHour="0"+hour+"00";
//        else
//            strHour=(hour+i)+"00";
//
//        System.out.println(
//                (hour+i)+"시 강수상태: "+weatherAPI.fcstPTY.get(strHour)+" / "+
//                        "강수량: "+weatherAPI.fcstRN1.get(strHour)+" / "+
//                        "습도: "+weatherAPI.fcstREH.get(strHour)+"% / "+
//                        "기온: "+weatherAPI.fcstT1H.get(strHour)+"℃"
//        );
//    }
}
