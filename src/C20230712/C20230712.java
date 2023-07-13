package C20230712;

import java.util.Scanner;

/*
#문제2
다음과 같이 n x n 크기의 격자에 1부터 n x n까지의 수가 하나씩 있습니다.
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC1_qysbr6.png)
이때 수가 다음과 같은 순서로 배치되어있다면 이것을 n-소용돌이 수라고 부릅니다.
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC2_ol8snc.png)
소용돌이 수에서 1행 1열부터 n 행 n 열까지 대각선상에 존재하는 수들의 합을 구해야 합니다.
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC3_cbcdg3.png)
위의 예에서 대각선상에 존재하는 수의 합은 15입니다.
격자의 크기 n이 주어질 때 n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 하도록 solution 메소드를 완성해주세요.

---
##### 매개변수 설명
격자의 크기 n이 solution 메소드의 매개변수로 주어집니다.

* n은 1 이상 100 이하의 자연수입니다.

---
##### return 값 설명
n-소용돌이 수의 대각선상에 존재하는 수들의 합을 return 해주세요.

---
##### 예시

| n 	| return 	|
|---	|--------	|
| 3 	| 15     	|
| 2 	| 4      	|

##### 예시 설명
예시 #1
문제의 예와 같습니다.

예시 #2
![image](http://res.cloudinary.com/sgc109/image/upload/c_scale,w_300/v1517462270/%EA%B7%B8%EB%A6%BC4_astq7q.png)
1과 3을 더하여 4가 됩니다.
 */
public class C20230712 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        _0712_ sol=new _0712_();
        int n;
        while(true) {
            System.out.println("1이상 100이하의 숫자를 입력해주세요");
            n = sc.nextInt();
            if(n>=1||n<=100)
                break;
        }

        System.out.println("소용돌이 수의 대각선의 합: "+sol.solution(n));

    }
}

class _0712_{

    int solution(int n){
        int sum=0; //대각선 수의 합
        int num=1; //최근에 계산한 대각선 수
        int x=n; //외곽 사각형을 일주한 후 내부 사각형 크기
        int innerSquare=0; //내부 사각형으로 이동 감지용 변수
        while(x>0 && num<=n*n){

            sum+=num; //a[n-1]

            if(x-1<1)
                break;

            num=num+2*(x-1);


            innerSquare++;
            if(innerSquare==2){
                innerSquare=0;
                x=x-2;
            }

        }

        return sum;
    }
}

/*
    1

    1 2
    4 3

    1 2 3
    8 9 4
    7 6 5

    01 02 03 04
    12 13 14 05
    11 16 15 06
    10 09 08 07

    01 02 03 04 05
    16 17 18 19 06
    15 24 25 20 07
    14 23 22 21 08
    13 12 11 10 09

    01 02 03 04 05 06
    20 21 22 23 24 07
    19 32 33 34 25 08
    18 31 36 35 26 09
    17 30 29 28 27 10
    16 15 14 13 12 11

    1 다음 첫번째로 큰 대각선의 수= 1+(n-1)*2
    첫번째 대각선 수(두번쨰) 다음으로 큰 대각선수= 첫번째 대각선수+(n-1)*2
    세번쨰 네번쨰 = 두번쨰, 세번쨰+(n-1)

    1은 항상 포함
    홀수면 마지막 수는 n*n
    짝수면 마지막 수는 n*n-1
    처음에서 숫자 2개(두번쨰 세번쨰) 이후 다음 작은 사각형이 된다 그래서 더해지는 수가 달라짐
    그러면 2번쨰 숫자 이후 n을 다음 사각형 크기로 변경한 후 기존방식대로 (n-1)*2를 이용하면 되는가?
    n=5의 경우
    첫번쨰수 1 (5-1)*2씩 더하기
    1 9 17
    n=>3
    첫번쨰수 17 (3-1)*2씩 더하기
    17 21 25

    숫자 2번 더한 후 n을 줄이는 방향의 법칙
    a1=1
    a2=a1+2(n-1)
    a3=a2+2(n-1)  n=n-2
    a4=a3+2(n-1)
    a5=a4+2(n-1)  n=n-2
    ax=a(x-1)+2(n-1)  ax는 첫번째 n제곱 이하, n>1
 */

