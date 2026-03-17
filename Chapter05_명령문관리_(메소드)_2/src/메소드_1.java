/*
 * 한가지 수행이 가능
 * 
 * 게시판(입력)
 * -> 글쓰기
 * -> 상세보기
 * -> 수정
 * -> 추가
 * -> 삭제
 * 
 * 
 * 회원가입(입력)
 * -> 가입/ 취소
 * -> 아이디 중복체크
 * -> 비밀번호 확인
 * -> 우편번호                              => 전부 메소드
 * 
 * 예약(선택을 하면서 들어간다)
 * -> 목록 출력
 * -> 날짜 출력
 * -> 시간 출력
 * -> 인원
 * -> 좌석
 * -> 결제
 * 
 * ----------------------------------------
 * 
 * 
 */
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String s1="Hello";
              // int length( )
              System.out.println("s1이 가지고 있는 문자 개수 : "+s1.length());
              System.out.println("hello 문자 개수 : "+"Hello".length()); // 두버전으로 쓸 수 있다
              // 문자열 자체가 주소
              
              String msg="Hello Java";
   //         		      0123456789 (프로그램 언어는 0번 부터 시작한다)
            // 3번째 문자를 가지고 온다 -> 문자 1개 추출할 때는 char charAt(int index)이용
            System.out.println("3번째 문자 읽기: "+msg.charAt(2));
            System.out.println("7번째 문자 읽기: "+msg.charAt(6));
            
            		  
	}

}
