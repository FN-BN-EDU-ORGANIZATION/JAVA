package JaewonStudy;

public class C20230713 {
	// 의문점
	// 정리
	public static void main(String[] args) {

//		예제 1 - 배열 복사(for)
		
		int [] oldIntArray = {1,2,3};
		int [] newIntArray = new int[5];
		
		for(int i=0;i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		
	

//		예제 2 - 배열복사  System.arraycopy() 메소드사용

		String[] oldStrArray= {"java","array","copy"};
		String[] newStrArray= new String[5];
		
		System.arraycopy(oldStrArray, 0 , newStrArray, 0, oldStrArray.length);
		
		
	}
}
