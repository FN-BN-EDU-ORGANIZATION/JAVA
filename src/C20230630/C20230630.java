package C20230630;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class C20230630 {
    public static void main(String[] args) {

        /*  심사위원들의 점수를 집계하는 프로그램
            점수는 0.00이상 10.00미만 까지 가능
            최저 점수와 최고점수는 제외하고 평균이 심사점수
            Double 타입의 ArrayList 사용
         */

        ArrayList<Double> arrList=new ArrayList<>();
        Random random=new Random();

        //랜덤한 점수 10개 입력
        for (int i = 0; i < 10; i++) {
            arrList.add(random.nextDouble(10));
        }

        //최대 최소 점수
        double max=-1,min=100;
        for(double x : arrList){
            if(x>max)
                max=x;
            if(x<min)
                min=x;
        }

        //집계 점수에서 최대 최소 점수 제외하기
        int x=0;
        for (int i = 0; i < arrList.size(); i++) {
            if(arrList.get(i)==max)
                x = i;
        }
        arrList.remove(x);
        for (int i = 0; i < arrList.size(); i++) {
            if(arrList.get(i)==min)
                x = i;
        }
        arrList.remove(x);

        //전체점수
        System.out.println("전체점수");
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Double n : arrList) {
            String strList = decimalFormat.format(n);
            System.out.print(strList+" ");
        }

        //심사점수
        double sum=0;
        for (Double n : arrList){
            sum+=n;
        }
        double point=sum/ (double)arrList.size();
        System.out.printf("\n심사점수 : %.2f",point);


    }
}
