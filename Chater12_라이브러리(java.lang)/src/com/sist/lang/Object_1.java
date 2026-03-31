package com.sist.lang;
/*p.498
 * 라이브러리 : 자바에서 지원하는 클래스의 집합
 *       1) 자바에서 지원하는 클래스 
 *       2) 외부에서 지원하는 클래스 : 자바 개발 업체, 오픈 소스에서 만든 것 -> mvnrepository.com/spring/lombok.jar/jsoup.jar
 *       3) 사용자 정의 클래스
 *---------------------------------------------------------------------------------------------------------------                        
 *주요 메소드
 *finalize() : 객체소멸 -> 자동호출 
 *clone() : 복제 -> 값이 있는 그대로 벅사 -> 새로운 메모리에 저장
 *equals() : 객체 비교
 *hashCode() : 객체마다 고유 식별자
 *getClass() : 리플렉션 -> 객체의 정보를 얻기 
 *-----------------------------------------------------------------------------------------------------------------       
 *    
 *  가장 많은 쓰는 라이브러리 : java.lang : 자바에서 많이 사용되는 클래스의 집합
 *                                    import 생략할 수 있다
 *                                    Object : 모든 클래스의 상속을 내리는 최상위 클래스
 *                                             모든 데이터형, 모든 클래스를 관리할 수 있다 -> extends Object
 *                                             예) Object o =10
 *                                                 o = 10.5
 *                                                 o = true
 *                                                 o = ""
 *                                                 o = 'A'
 *                                                 o = new A()
 *                                                 라이브러리에서 지원하는 메소드 
 *                                                 메소드:리턴형:Object -> 형변환
 *                                                 매개변수 :Object
 *                                    String : 문자열 관리 클래스
 *                                    StringBuffer / StringBuiler 
 *                                    Math : 수학관련
 *                                    System : 입출력 / 가비지 컬렉션
 *                                    Wrapper : 데이터형 쉽게 관리 -> 클래스
 *                                      int -> Integer
 *                                      double -> Double
 *                                   Thread : 동시성 -> 네트워크 -> 애플리케이션 개발
 *                                              웹 : Ajax -> vue / React    
 *                                                         
 *                        java.util : Date / Calender / Time
 *                                    StringTokenizer
 *                                    Scanner
 *                                    List / Set / Map
 *                                    
 *                        java.text : DecimalFormat -> 1,000
 *                                   SimpleDataFormat -> 2026-03-30
 *                                   ChoiceFormat -> Switch 대체
 *                                   MessageFOrmat -> 출력형식 -> 출력(SQL)
 *                                   
 *                        java.io : File 관련  
 *                        java.net : 네트워크
 *                                   URL / Socket / ServerSocket
 *                        java.sql : 데이터베이스
 *                                   Connection / Statement / ResultSet
 * ------------------------------------------------------------------------------------------------   
 * 웹과 관련 :람다,제네딕,어노테이션,리플랙션,정규식  -> 자세한 건 강사님 메모 참고
 * ------------------------------------------------------------------------------------------------
 * 파일 관련 : txt , csv , json(자바에서 데이터를 모아서 Vue나 React 보낸다)   
 * 
 *---------------------------------------------------------------------------------------------------
 *p.499
 * Object 클래스 : 모든 클래스의 상위 클래스
 *               extends Object (생략돼 있어 보이지 않을뿐) -> java.lang.Object 안에 있음
 *   1) 객체 생성과 소멸을 담당 : new(생성) / finalize(): 소멸자 메소드
 *                                                 메모리에서 해제
 *   2) 복제 및 비교를 나타낼때 사용
 *   3) 문자열을 바꿔줄때           
 */

// finalize()
class Sawon {
	private String name;
	private String dept;

	public Sawon(String name, String dept) {
		this.name = name;
		this.dept = dept;
		// this -> Sawon 클래스 자신의 객체
		// 구분 : 매개변수 / 인스턴스 변수 구분
		// this는 static -> 모든 클래스에 대입
		// this는 new를 이용해서 객체 생성시에 주소값을 대입
		// 변수 충돌이 없는 경우는 this 생략이 가능

	}

	/*
	 * this는 클래스 {}에서 사용이 가능 생성자, 인스턴스 메소드에서만 사용이 가능 인스턴스 초기화 블록이나 static{}, static
	 * 메소드에서는 사용이 불가능함
	 * 
	 */
	public void print() {
		System.out.println("이름 :" + name);
		System.out.println("부서 :" + dept);
	}

	// 소멸자 함수
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}
	/*
	 * class 제작 -> new 생성자() : 객체 생성 객체.메소드() : 객체 활용 -> 객체 = null : 객체 소멸 ->
	 * fianlize()-> GC()에 의해 해제
	 */

}

public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		Sawon sa = new Sawon("길동", "개발부");

		// 객체 활용
		sa.print();

		// 객체 소멸
		sa = null;

		// 자동으로 GC 수거
		// finalize가 호출

		// 바로 해제하려면 GC호출(자동 메모리 해제)
		System.gc(); // 메모리가 해제된 상태
		
		// Object : 객체 생성부터 소멸까지 
	}

}
