package C20230706;

import java.util.Random;
import java.util.Scanner;

public class C20230706 {
    public static void main(String[] args) {

        //merge sorting 생각해서 만들어보기

        //초기화
        int a[]={1,12,15,32,37};
        int b[]={7,17,23,36,45};
        int n[]=new int[10];
        int x=0,y=0;//array a,b pointing

        while(x+y<10) {
            if(x<a.length && y<b.length){//x,y가 배열 밖을 가리키지 않을경우
                if (a[x] < b[y]){
                    n[(x + y)] = a[x];
                    x++;
                } else {
                    n[(x + y)] = b[y];
                    y++;
                }
            }
            else{//x or y 가 배열 밖을 가리키고 있을 경우
                if(x==a.length){
                    n[(x + y)] = b[y];
                    y++;
                }
                else if(y==b.length){
                    n[(x + y)] = a[x];
                    x++;
                }
            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.print(n[i]+" ");
        }



    }
}
