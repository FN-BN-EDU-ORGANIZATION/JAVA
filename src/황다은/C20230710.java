package 황다은;

public class C20230710 {
	//예제 1 메서드
	public static int findMinValue(int[] array) {
		// 배열의 첫 번째 요소를 초기 최소값으로 설정
		int min = array[0];

		// 배열의 나머지 요소들과 비교하여 최소값 갱신
		for (int i = 1; i < array.length; i++) {
			// 현재 요소가 최소값보다 작으면 최소값을 해당 요소로 업데이트
			if (array[i] < min) {
				min = array[i];
			}
		}

		// 최소값 반환
		return min;
	}
	
	//예제2 메서드
	public static String concatenateStrings(String str1, String str2) {
        // 두 문자열을 연결하여 새로운 문자열 생성
        String concatenatedString = str1 + str2;

        // 연결된 문자열 반환
        return concatenatedString;
    }
	
	//예제3 메서드
	public static void bubbleSort(int[] array) {
        int n = array.length;

        // 배열을 순회하면서 인접한 요소들을 비교하여 정렬
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // 현재 요소와 다음 요소를 비교하여 순서가 잘못되어 있다면 위치를 교환
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

	public static void main(String[] args) {
		
		//예제 1
		// 정수배열에서 가장작은 값을 반환하는 메서드
		int[] array = {5, 8, 2, 7, 1};
		int minValue = findMinValue(array);
		System.out.println("가장 작은 값: " + minValue);
		
		//예제2
		// 두개의 문자열을 매개변수로 받아, 두문자열을 연결한 결과반환메서드
		String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = concatenateStrings(str1, str2);

        // 연결된 문자열 출력
        System.out.println("연결된 문자열: " + concatenatedString);
        
        
        //예제3
        // 정수배열을 버블정렬로 오름차순으로 정렬하는 메서드
        int[] array1 = {5, 8, 2, 7, 1};
        bubbleSort(array1);

        // 정렬된 배열 출력
        System.out.print("정렬된 배열: ");
        for (int num : array1) {
            System.out.print(num + " ");
        }

	}

}
