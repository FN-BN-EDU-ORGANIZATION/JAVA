package Practice_07;

public class C20230703 {
	public static void main(String[] args) {

		//의문점		: X
		//정리 : boolean에 대해 공부, 프로젝트 복습
		
		// boolean
		// 논리데이터 유형 중 하나
		// true 또는 false 중 하나 가짐
		// 평과결과를 저장
		
		//예제 1
//		 회원 비회원 구분
//		 private boolean isMember;
//		 -> 비회원
//		public void register() {
//			isMember = true;
//			System.out.println("회원이다");
//		}
//		-> register 호출되면 회원등록
//		public void unregister() {
//			isMember = false
//			System.out.println("회원 해지Bye");
//		}
//		-> unregister 호출되면 회원 해지
//		public boolean isMember() {
//			return isMember;
//		}
//		-> 반환되면 회원 여부 확인 가능
//		public static void main(String[] args) {
//			Membership membership = new Membership();
//			
//			System.out.println("회원 여부 : " + membership.isMember());
//			membership.register();
//			System.out.println("회원 여부 : " + membership.isMember());
//			membership.unregister();
//			System.out.println("회원여부 : " + membership.isMember());
	
		
//		예제2
//		public void createPost(String postContent) {
//	        postList.add(postContent);
//	        System.out.println("글 생성");
//	    }
//		-> postContent를 매개변수로 받아 글생성 
//
//	    public void updatePost(String oldPostContent, String newPostContent) {
//	    	int index = postList.indexOf(oldPostContent);
//	    	if(index != -1) {
//	    		postList.set(index, newPostContent);
//	    		System.out.println("글 수정");
//	    	}
//	    	else {
//	    		System.out.println("해당 글을 찾을 수 없습니다.");
//	    	}
//	    }
//	    -> old, new를 매개변수로 받아 글수정
//		-> postList를 new로 값 수정
//
//	    public void deletePost(String postContent) {
//	        if(postList.contains(postContent)) {
//	        	postList.remove(postContent);
//	        	System.out.println("글 삭제");
//	        }
//	    	System.out.println("해당 글을 찾을 수 없습니다.");
//	    }
//		-> postList에 postContent가 포함되면 제거
//		-> 그게아니면 찾을수없음
//		
	}
}
