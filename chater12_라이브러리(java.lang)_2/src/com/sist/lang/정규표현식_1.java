package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식
 * : 원하는 패턴을 가지고 있는 문자열을 검색하거나 검사하는 클래스
 *   예) 문자열 패턴을 찾고 싶어
 *       -> 특정 규칙을 만들어야 해 이때 쓰는게 정규식
 */
public class 정규표현식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자가 포함됐는지 확인해보자
    String msg="abc123";
    
   boolean result=msg.matches(".*\\d+.*");// 문자여러개 중에 중간 혹은 \ 뒤에 숫자가 포함돼 있니?
   System.out.println(result);
    
   /*[] 한개의 문자 : [abc]-> abc 중 한개
    *              [^abc]-> abc 외의 다른 한문자
    *              [a-zA-Z]-> 알파벳 중 한개
    * ---------------------------------------------
    *  숫자가 있냐고 쓸때 참고할 것
    *  숫자 : [0-9]
    *        \d -> \\를 의미
    *-------------------------------------------
    *  \s : 공백
    *  \w : 한개 알파벳 ->[a-zA-Z] 알바펫 범위 중에 한글자
    *  \. : .은 임의의 한글자      
    *  ?  : 한개거나 없음
    *  *  : 0개 이상
    *  +  : 1개 이상
    * {n} : n개 
    * {n,m} : n부터 m까지 범위를 나타낼 때
    * a|b : a 이거나 b인 경우 -> 실제 문장을 가져올때는 \\|두개쓴다
    * ()  : 그룹
    *       예) 
    *       ((238.123.65).89)
    *       group(1)은 그룹 전체를 가져오는 것 
    * 
    *        
    */
   
   String res="맛있는,맛있고,맛있게,맛있소,맛있다,맛없다";
   Pattern p=Pattern.compile("맛있."); // 맛있으로 시작하는 모든 단어를 가져온다, 변경되는게 한글자면 . , 한글자 이상이면 +
   Matcher m=p.matcher(res);
   while(m.find())
   {
	   System.out.println(m.group()); // 실제 데이터
   }
   
   // 데이터 추출
   System.out.println("======================데이터 추출=======================");
   String won="가격: 30000원";
   String change=won.replaceAll("[^0-9]", "");
   System.out.println(change);
   
   /*
    * 알아두면 좋은 정규식 표현
    * ^ :시작
    * $ :끝
    * ^[]:대괄호 안에 적혀있는 것으로 시작
    * [^]:대괄호 안에 있는 것 제와
    */
	}

}
