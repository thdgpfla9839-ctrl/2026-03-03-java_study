package com.sist.commons;

import com.sist.vo.FoodVO;
/*
 * 인터페이스 
 *  주요목적 : 서로 다른 클래스를 연결해서 사용한다 -> 결합성이 낮은 프로그램 구현하는 형태
 *  역할:     공통으로 사용되는 기능을 모아서 재사용 가능하게 함 . 확장도 가능
 *           독립적으로 사용이 가능
 *  구성요소 : 
 *  public interface Interface명
 *  {
 *     변수 설정 : 상수형 변수 형태
 *        1) 변수를 설정하면 반드시 초기값 부여
 *           예)  (public / static / final 생략 가능 -> 생략시 자동으로 초기화)  int a=10;
 *           
 *        2) 선언만 된 메소드 : 상속을 내려서 구현 후에 사용
 *           (public abstract 생략) void display(); -> 강제성 지님
 *           => 구현이 불가능한 경우 개발자가 상황에 맞게 구현
 *           
 *        3) 구현된 메소드 : default 메소드 -> 공통으로 사용되는 내용이 있는 경우 사용
 *                                        있는 그대로 사용
 *                                        변경해서 사용 : 오버라이딩
 *                                        강제성 X
 *                                형식)    dafault 리턴형 메소드명(매개변수)
 *                                 
 *        4) 구현 안 된 메소드 : static메소드 -> 메모리 할당 없이 접근이 가능 -> 사용 빈도 거의 X
 *                                형식)   static 리턴형 메소드명(매개변수)
 *                                {
 *                                  구현
 *                                }
 *                                
 *        5) 자체 처리 : 공통으로 사용하는 부분 -> 메소드화
 *                     형식)    private 리턴형 메소드명(매개변수)  
 *    --------------------------------------------------------------------------------
 *    only public에서 public을 쓰지 않는 경우 자동추가됨
 *                                           
 *   }
 *   
 *   
 *  [ 상속 ]
 *   
 * 1)  interface A
 *        
 *          |
 *        
 *        interface B exteds A -> 단일 상속
 *        
 *        
 *   2)    interface A  interface B
 *            |              |
 *             --------------
 *                   |
 *                   interface C exteds A,B -> 다중 상속
 *                   
 *   3)  class A   interface B  interface C
 *         |            |            |
 *          --------------------------
 *                      |
 *                      clss D extends A implements B,c      
 *   => 기존의 기능을 재사용
 *      필요시에는 변경해서 사용가능: 오버라이딩
 *--------------------------------------------------------------     
 *   클래스
 *         변경                        추가
 *         오버라이딩                   오버로딩
 *         매소드명이 동일               메소드명이 동일
 *         매개변수 동일                매개변수 개수, 데이터형이 다르다
 *         리턴형 동일                 리턴형 관계 X
 *         접근지정어 -> 확대만 가능      접근지정어 관계 X
 *-----------------------------------------------------------------
 *[구성요소]
 *  클래스 : 다른 클래스와 연결 -> public / default
 *  멤버변수 :데이터 보호 ->private, 접근 시(=수정이나 읽기) 기능 메소드화 :getter/setter
 *  메소드 : 다른 클래스와 연결(통신 담당) -> public
 *  생성자 :다른 클래스 객체 생성 -> public
 *                               
 */
public interface Manager {
    //목록 출력
	public FoodVO[] food_list(int page);
	public int food_total();
	// 상새보기
	public FoodVO food_detail(int no);
	// 검색
	public FoodVO[] food_find(String type,String fd);
	// 주소, 음식종류, 맛잡명을 찾을 수 있다
	
	// 필터링 -> 한식 / 중식 / 양식 / 일식 / 분식 : 버튼 5개
	public FoodVO[] food_filter(String type); // int page 대신 스트링 타입 줌
	
	
}
