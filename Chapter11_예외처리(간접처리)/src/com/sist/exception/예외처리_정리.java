package com.sist.exception;
/*
 *1. 예외복구
 *   try : 정상 실행이 가능한 코딩
 *         에러가 발생할 수 있다(실수, 입력의 문제) => 이런걸 사전에 방지 하기위해 사용
 *         에러가 나면 에러문장과 밑에 문장들은 스킵한다(3~5 문장들이 스킵된다), 스킵 후 catch절로 이동
 *         예)
 *         1
 *         2
 *         3 -> 에러발생 => catch이동
 *         4
 *         5
 *         
 *   catch :에러 발생 시 처리하는 부분 -> 다중 catch 사용이 가능하다
 *          catch통합이 가능한데 그때는 Exception/Throwable을 사용해서 통합해
 *          자동 close 호출
 *          try~with~resource
 *           
 *         1) 에러 확인 가능
 *            printStackTrace : 에러 위치 확인 / getMassage : 에러 메시지만 전송
 *         2) 에러 복구가 가능
 *            이동시킴 : goto 이건 사용금지함
 *         
 *   finally : 생략이 가능
 *             try / catch 뭘 써도 상관없이 무조건 실행됨
 *             서버 / 오라클 / 파일닫기에 많이 사용
 *             
 *   
 * 2. 예외회피 : 에러를 등록해서 컴파일을 통과하기 위한 목적으로 만드는 것
 *    throws -> 특별한 경우가 아니면 throws 문장은 많이 없다
 *              예) 한글변환 같이 소스가 길거나 try/catch 위치를 잘 모를때
 *             메소드() throws 이 형식으로 쓴다
 *             사용자 정의 보다는 라이브러리에 많이 쓴다 
 *              
 * 3. catch 찾기 : 임의발생 -> throw
 *                필요시에는 직접 예외를 만들어서 사용
 *                직접만든 예외를 호출 시에는 throw new 클래스()를 사용 
 * --------------------------------------------------------------------
 * throw : 견고한 프로그램인지 확인
 * throws : 예상되는 에러를 선언한다
 *          메소드 호출 시 예외처리를 한 다음 사용
 *          throws / try~catch               
 *                    
 *                    
 */               
public class 예외처리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
