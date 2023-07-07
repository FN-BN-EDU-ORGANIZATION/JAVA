package CPractice;

import java.time.LocalDate;

public class C20230707_1 {
    public static void main(String[] args) {
    	//다른 과정을 통해서 입력값이 아닌 오늘을 기준으로 몇월인지 출력해보기
    	// 현재 날짜 가져오기
        LocalDate currentDate = LocalDate.now();

        // 월 가져오기
        int month = currentDate.getMonthValue();
        String monthString = "";
        switch (month) { 
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString); //결과값 : July
    }
}
