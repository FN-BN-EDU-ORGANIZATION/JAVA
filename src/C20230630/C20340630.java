package C20230630;

public class C20340630 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //예제 1
		//크기 5의 배열을 만들고 사용하던 중 더큰게  필요하다면?? 
		int[] arr=new int[5]; //길이 5 인덱스 01234
		int[] temp= new int[arr.length*2]; // 5*2 이런식으로 길이를 늘려서
		//새로운 객체에 투입한다,
//		== System.arraycopy(arr,0,temp,0,arr.length);
		//(원본배열,0,새로저장될배열,0,복사할개수)
		
		
		for(int i = 0; i<arr.length;i++)
			{//i 는 for의 루프범위므로 벗어나지 않도록 주의 한다 .
			temp[i]=arr[i];  //기본값 0 ....10개출력
			System.out.println(temp[i]);
			}
		//for문 끝나고 
		arr=temp; //다시 넣어주기 길이를 확인해보자
		System.out.println(arr.length);
		
		
		//char 배열의 출력
		//주의 int[] str = new int[50]  == 유니코드값이 나와버림
//		int[] str = new int[50];
////		char[] str=new char[50];  //인댁스 50개 생성
//		str[0] = 'k';
//		str[1] = 'k';
//		str[2] = 'k';
//		str[3] = 'k';
//		str[4] = 'k';
//		System.out.println(str[1]);
		
			//쓰레기 for문
//		int[] arr = new int[10];
//		for(int i= 0; i<arr.length; i++)
//			arr[i] = (int)(Math.random()*10);
		
		//향상된 for문  foreach
		//배열을 순차접근하는게 목적이라면 향상된 for문을 사용하자!!
		for(int i : arr) //arr.length = 10; i 10번반복..
			System.out.println(i);	
		
		
		//에제2 
		
//		int[] student=new int[5];
		// 에러발생 왜??
//student[5] =13;  // 실질적으로 0,1,2,3,4의 인덱스를 가지고있어서
//값을 할당할수없다!! 길이는 5가맞다 인덱스는 01234다 조심하자


//------------------------------------------------------------
//인덱스 0값 설정?? 
//	int[] student=new int[0]; //== int[] studnet= new int[]{}
//	int[] student={};
//	student[0] = 10; 
	//길이가 0인 배열을 객체를 사용할수있지만
	//길이가 0이니까 사용은 할수없다.
	
//	System.out.println(student.length); //인덱스 길이구하기

//int[] student=new int[5];
//for(int i =0; i<student.length;i++)
//System.out.println(student[i]);
//길이가 5니까 01234 5번반복 int타입의 기본값은 0 그래서 0이 다섯번찍힌다.
//예를 들어, int 배열인 student를 선언하고 크기를 5로 지정한 경우, 
//모든 요소는 int의 기본값인 0으로 초기화됩니다. 따라서 student 배열의 모든 요소는 0으로 초기화되어 있습니다.


//int[] student = new int[] {30,20,10}; //직접 초기화값을 지정한다.
// == int [] student = new int{30,20,10);   [] 생략가능
//직접 초기화 값을 적어주었다면 크기 지정은 불가능하다


//불가능 int[] student;   ..... student = {30,20,10);
//....new int생략 불가능
	}
}


