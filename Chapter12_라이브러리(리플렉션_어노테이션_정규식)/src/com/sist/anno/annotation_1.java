package com.sist.anno;
/*
 * annotation:
 *            다른 프로그램에 정보를 제공해주는 역할, 쉽게 정보를 찾을 수 있게 해줌
 *            예) 책 -> 목차(인덱스) 같은 것
 *            구분자를 쓴다
 *               1) 멤버변수
 *               2) 클래스
 *               3) 메소드
 *               4) 생성자
 *----------------------------------------------------------------------
 *어노테이션
 *
 *1. 어떤 것을 구분할 것인지
 *    @Target: TYPE -> 클래스 구분해서 다른 프로그램에서 쉽게 찾을 수 있게 함
 *             METHOD -> 메소드 구분
 *             CONSTRUCTOR -> 생성자
 *             FILED -> 멤버변수
 *             
 *2. 저장기간 :
 *           SOURCE -> 클래스파일(.class)가 존재 시까지
 *           CLASS -> 컴파일 시만 유지, 실행 시 사라진다
 *           RUNTIME -> 파일 존재, 프로그램 종료 시까지
 *           
 *3. 사용방법 : 인터페이스라 별다른 기능은 없고 찾기만 가능하다
 *           public @interface 어노테이션
 *           {
 *              메소드 선언;
 *           }
 *4. 배치 
 *@=>TYPE 구분자마다 지정하는 정보가 다름, 제어하는(구분하는) 구분자나 메소드 바로 위, 옆에 배치
 *class ClassName          
 *{
 *    @=>FIELD
 *    변수
 *    
 *    @=>FIELD 변수
 *    
 *    -> 두가지로 쓸 수 있음
 *    -------------
 *    @CONSTUCTOR
 *    생성자
 *    --------------
 *    @METHOD
 *    메소드
 *    --------------
 *}
 *            
 *                        
 */
public class annotation_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
