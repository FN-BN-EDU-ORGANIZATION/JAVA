package C20230629;

public class C20230713 {

	//트랜잭션 ACID
//	atomicity(원자성)
//	데이터베이스에 모두 반영 or 전혀 반영되지 않아야함
//
//	consistency(일관성) 
//	트랜잭션 실행이 성공적으로 완료하면 일관성있는 데이터베이스 상태로 변환 
//
//	isolation(독립성) 
//	둘 이상의 트랜잭션 병행 실행 시 어느 하나의 트랜잭션 실행중 다른 트랜잭션의 연산이 끼어들수없음
//
//	durability(영속성)
//	성공적으로 완료된 트랜잭션의 결과는 시스템이 고장나더라도 영구적으로 반영
	
	//키의 종류
//	후보키 (candidate key)
//	튜플을 유일하게 식별
//
//	기본키
//	후보키에서 선정
//
//	대체키
//	후보키 2개이상일때 기본키를 제외한 나머지 키
//
//	슈퍼키
//	릴레이션 내 속성들의 집합
//
//	외래키
//	다른 릴레이션의 기본키를 참조
	
	//미들웨어
	

//	db
//	클라이언트에서 원격의 데이터베이스와 연결하는 미들웨어
//
//	rpc
//	원격 프로시저를 로컬프로시저처럼 호출
//
//	mom
//	비동기형 메시지 전달 미들웨어
//
//	tp-moniter
//	트랜잭션 처리 및 감시
//
//	orb
//	코바표준스펙 구현한 객체지향 미들웨어
//
//	was
//	동적인 콘텐츠 처리하기 위한 미들웨어
}
