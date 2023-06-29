package 김민수.C2023__06_30;
//알고리즘 문제
//의문점?  c언어에서는 예전에 배울 때 주소의 연산을 통해 배열의 값에 접근 했던것 같은데, 왜? 자바에서는 안되는 걸까? 
public class MaxMin {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5}; //배열도 동적할당(힙)이라는 것을 한번 다시 대새겨봄. 
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i]; //보통 if문을 두개 두어서 max와 min 값을 구하는데, else가 반대 구문이라는 것을 적용함
			}
			else {
				min=arr[i];
			}
		}
		System.out.println("최대값 : "+max+"이고, 최소값 : "+min+"입니다.");
	}
}
