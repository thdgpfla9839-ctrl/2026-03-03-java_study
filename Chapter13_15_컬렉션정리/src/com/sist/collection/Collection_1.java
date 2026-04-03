package com.sist.collection;
/*
 * 자바에서 지원하는 컬렉션프레임워크
 * 컬렉션: 다수의 데이터 모음
 * 프레임워크: 데이터 관리, 일정 기본틀이 만들어짐-> 표준화가 굿, 라이브러리가 있음
 * 
 * 구조)
 *     Collection --------------- interface
 *         |
 *  -----------------                독립적
 *  |              |                  Map
 *  |              |
 * List           Set  -----------------------------------------------------  인터페이스
 *  |
 *  --------------------------
 *  |           |             |
 *  ArratList  LinkedList     Vector  => 구현된 클래스
 *  
 *  -----------------------------------------------------------------------------------------------------------
 *   
 *  1. ArratList : 접근 속도가 빨라 웹 검색에 많이 사용
 *               자동 인덱스 부여
 *               수시로 변경 / 삭제 / 추가 가능 -> 대신 속도가 느림
 *   
 *  2. LinkedList : 접근 속도가 늦다
 *                삭제, 추가 시 속도가 빠름
 *                그래서 댓글이나 게시판에 사용됨
 *                
 *  3. Vector : ArrayList와 유사
 *           동기적인 프로그램 -> 저장하는 시간 때문에 속도가 늦다     
 *           신뢰성이 뛰어남 -> 네트워크에 사용됨       
 * 
 * ---------------------------------------------------------------------------------------------------------------
 * 1.2.3의 특징
 *  1) 데이터 중복을 허용 : 인덱스를 이용해서 데이터 제어
 *  2) 데이터 중복을 허용하므로 순서(인덱스)가 존재함
 *  
 *  활용)
 *     ArrayList : 데이터에서 값을 저장해서 브라우저로 전송
 *                 목록
 *     Vector : 네트워크 유저(접속자)관리
 *     
 *     LinkedList : 파일로 프로그램 제작   
 *     
 * => 얘네 활용하려면 제네릭을 사용해야함
 * 
 * 제네릭 : 반드시 클래스만 지원한다
 *        형식은 <클래스만 사용>
 *        기본형을 설정할 때는 Wrapper
 *        int - Integer
 *        double - Double
 *        booloean - Boolean
 *        long - Long -> 언박싱이나 오토박싱 지원
 *        사용자 정의 클래스도 가능
 *       
 *        예)
 *         ArrayList<Movie>
 *         Movie[]
 *         -> 가독성이 좋다 / 제어하는 데이터를 알 수 있다
 *         -> 라이브러리 -> Object -> 형변환 처리가 가능해 보완이 가능해짐
 *         -> 모든 Object로 된 내용은 한번 변경이 가능
 *         -> Object는 변수 / 매개변수 / 리턴형 -> 데이터형 통일화
 * ----------------------------------------------------------------------
 * Wrapper 클래스 사용  
 * ArrayList<Integer>
 * 
 *       Integer(10)  Integer(20) => 이렇게 값저장 되는 것이 오토박싱
 *          |             |
 *         int a =10      int a = 20    => 언박싱
 *--------------------------------------------------------------------------
 *총정리 
 *제네릭 : 데이터형을 통일시켜줌 -> 누구나 알아보기 쉽게 만든 데이터 구조형태
 *-------------------------------------------------------------
 *List(ArrayList,Vector,LinkedList -> 리스트 상속을 받음)
 *
 *List의 주요기능 : 고정 = 가변 => CRUD
 *              add() : 데이터 추가 -> INSERT (Create)
 *                      자동으로 메모리가 추가됨, 동적으로 생성 => 유연성
 *              get() : 데이터 읽기 -> SELECT (Read)
 *              set() : 데이터 수정 -> UPDATE (Update)
 *              remove() : 데이터 삭제 -> DELETE (Delete)
 *              size() : 개수 -> length()와 비슷
 *              isEmpty() : 데이터 존재여부
 *              clear() : 데이터 전체 삭제할 때 사용
 *            => 얘네들은 전부 java.util 패키지에 들어가 있다
 *               java.util은 유용하게 사용이 가능한 라이브러리임
 *               
 *             java.util에서 가장 많이 사용되는 것들
 *             =Date
 *             =Calendar
 *             =Random
 *             =Collection : ArrayList, HashSet, HashMap 이정도만 공부해
 *             =StringTokenizer  
 *                 
 *--------------------------------------------------------------------------------
 *       
 *         
 *   
 *   
 *   
 *   
 */
import java.util.*; // import 생략이 가능한 경우는 java.lang만 가능하다/ 만약 유틸 안에 있는 클래스 하나만 가져올 경우는 옆에 클래스 이름을 쓰자 Ex) import java.util.Scanner;
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String [] n= {"나","너","우리","852","12345","578"};
    ArrayList<String> names = new ArrayList<String>(Arrays.asList(n)); // 맨앞에 만약에 List를 붙이면 형변환도 필요없지 
    // add(Object o) => add(String s)
    // 데이터가 통일 -> 제네릭이 해주는 역할
    // 형변환해줌
    // 형변환 하기 싫으면 위에는 리스트 붙이고 
    // List<String> names= new Vector<String>(); 벡터자리는 아무거나 가능
                                  
    
//    names.add("나");
//    names.add("너");
//    names.add("ㄴ아ㅗ란");
//    names.add("ㄴ르ㅓㅏ;ㄴ");
//    names.add("ㄴ래ㅓㄹ;ㅣ");
//    names.add("커ㅏㅣㅓ");
// 애네를 출력하고 싶으면 for-each -> 실제데이터 긁어옴
    
    for(String name:names)
    {
    	System.out.println(name); 
    	
    }
    
    System.out.println("인원"+names.size());
    System.out.println("인원존재확인");
    names.clear();
    if(names.isEmpty())
    {
    	System.out.println("인원 노우");
    }
    else
    {
    	System.out.println("인원 예스"+names.size()+"명");
    }
  }

}
