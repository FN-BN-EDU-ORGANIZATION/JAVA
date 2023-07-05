package C20230705;

import java.util.Scanner;

public class C20230705 {
    public static void main(String[] args) {

        //정렬된 배열에서 원하는 값 찾는데 걸리는 시간 비교

        //초기화

        int sortedArr[]=new int[100];
        int num;
        for (int i = 0; i < 100; i++) {
            sortedArr[i]=i+1;
        }

        //찾을 값 입력 받기
        Scanner sc=new Scanner(System.in);
        System.out.print("1~100의 수 하나 입력: ");
        num=sc.nextInt();

        //1~100이 아닌 경우 재입력받기
        while(num<0||num>100){
            System.out.print("1~100의 수 하나 입력: ");
            num=sc.nextInt();
        }

        //sequential search
        int n=0,i=0;
        while(true){
            n++;
            if(num==sortedArr[i]) {
                System.out.println("찾는데 걸린 횟수: "+n);
                break;
            }
            i++;
        }

        //binary search


        n=0;
        int start=0,last=99;
        while(true){
            n++;
            i=(start+last)/2;
            if(num==sortedArr[i]){
                System.out.println("찾는데 걸린 횟수: "+n);
                break;
            }
            else if (num>sortedArr[i]) {
                start=i;
            }
            else if (num<sortedArr[i]){
                last=i;
            }
        }


    }
}
