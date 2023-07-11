package 윤광혁;

public class 예제20230711 {
	//1 자바스크립트 let과 const
	//let과 const 둘 모두 자바스크립트에서 변수를 선언하는대 사용된다.
	
	//let
	//let은 블록 스코프를 가지는 변수를 선언할대 사용된다.
	//변수의 재할당이 가능하다.
	//같은 스코프내에 중복된 변수이름 사용불가.
	//변수 선언전에 사용할수 없으며 호이스팅이 되지 않는다.
	//블록내에서 선언된 변수는 해당 블록내에서만 유효
	
	//const
	//const는 상수를 선언할때 사용된다,
	//변수에 할당된 값을 재할당이 불가능하다.
	//같은 스코프내에 중복된 변수 이름을 사용불가.
	//변수 선언전에 사용할수 없고 호이스팅 되지 않는다.
	//상수는 선언과 동시에 값을 할당해야한다.
	//상수로 선언된 객체나 배열은 변경할수있지만 변수에 다른 객체나 배열을 재할당 하는것은 불가능하다.
	
	//2수업중에 사용된 함수들 해석
	//split
	//name.split(separator, limit);
	//name 은 분리하고자하는 원본 문자열이다.
	//separator 에는 문자열을 분리할 구분자를 적는다. 구분자로 지정된 글자는 사라지고 구분자를 기준으로
	//배열로 나뉘어진다. limit 부분에 숫자를 지정하면 분리할 최대 요소 개수를 제한할수있다.
	
	//filter
	//filter는 함수는 배열에서 특정 조건을 만족하는 요소들로 이루어진 새로운 배열을 만드는대 사용된다.
	
	//reduce
	//reduce 는 배열의 각요소를 순차적으로 처리하여 단일 값 (누적된값)을 반환하는 메서드이다.
	//구성
	//array.reduce(callback(accumulator, currentValue, currentIndex, array), initialValue)
	//array는 대상이 되는 배열이다.
	//callback(accumulator, currentValue, currentIndex, array)
	//accumulator	현재까지 축적된 값.
	//currentValue	현재 처리중인 요소의 값(필수)
	//currentIndex	햔재 처리중인 요소의 인덱스값
	//array reduce()함수가 호출된 배열.
	
	//initialValue 초기 축적값으로 사용되는 값 생략시 배열의 첫번쨰 요소가 초기 값이 된다
	
	
	
}
