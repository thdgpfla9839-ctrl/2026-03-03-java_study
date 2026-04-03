package com.sist.collection;
/*
 * Set: 1) HashSet -> 중복을 제거할 때
 *      2) TreeSet -> 검색할 때(속도가 빠름)
 *      
 *      특징: 중복을 허용하지 않음
 *           순서가 존재하지 않음
 *           사용처 (장르 / 카테고리 / 부서명 / 근무지.....) -> 오라클(PRIMARY KEY) 
 *                                                   -> 웹에서는 사용빈도 거의 X
 *     사용법 : 
 *           Set<> set new=HashSet()                                               
 *           Set<> set new=TreeSet()
 *           
 *  Set에서 많이 쓰는 메소드
 *      add() : 데이터 추가
 *      remove() : 데이터 삭제
 *      clear() : 데이터 전체 삭제
 *      List에서 중복을 제거
 *      데이터를 한번에 모아서 관리 -> iterator()                                                        
 *       
 *                                                          
 */
// 중복제거예제
import java.util.*;
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 중복이 없는 데이터를 저장하는 저장소
        Set<String> set = new HashSet<String>(); 
       
        set.add("사과");
        set.add("오렌지");
        set.add("망고");
        set.add("딸기");
        set.add("복숭아");
        set.add("망고");
        set.add("딸기");
        set.add("복숭아");
        
        System.out.println("과일 종류");
        // 인덱스 이용 안 하고 포위치 구문
        for(String f:set)
        {
        	System.out.println(f); 
        }
        System.out.println("중복 제거");
        set.remove("복숭아"); // 괄호에는 실제 저장된 데이터를 입력한다
        
        for(String f:set)
        {
        	System.out.println(f); 
        }
	}

} // 셋을 이용하면 중복제거
