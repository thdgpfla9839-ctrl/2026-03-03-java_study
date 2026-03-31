package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*p.534
 *   java.lang : 기본 클래스가 저장돼 있다
 *               라이브러리는 메소드라고 생각하기
 *               
 *     1. java.lang 안에 있는 클래스
 *             1) Object : java.lang 안에 있는 최상위 클래스, 모든 클래스의 상위에 있다, 가장 큰 데이터형에 해당됨
 *                      데이터가 여러개 있는 경우는 배열[]
 *                      예) Object [] obj ={10,10.5,"aaa",'A',new A()};
 *                          = String toString() -> 객체 메모리 주소를 문자열로 리턴
 *                                   toString()-> 이부분은 오버라이딩 후 변수값 출력, 생략이 가능한 부분
 *                                   
 *                            A a = new A()
 *                            System.out.println(a);
 *                            System.out.println(a.toString());
 *                            
 *                      boolean equals(Object o) : 객체비교 -> 주소값 비교
 *                      Object clone() : 복제 -> 같은 값을 가지고 새로운 메모리 생성
 *                                      예) spring : prototype
 *                                          Git Clone : 그대로 저장
 *                      int hashCode() : 구분자(객체)                               
 *            2) String : 문자열
 *                      int length()
 *                      boolean equals(String s)
 *                      boolean startsWith(String s) : 시작문자열이 같은 경우 
 *                                                     예) 쿠키찾기, 
 *                      boolean contains(String s) : 포함된 문자열 검색
 *                      int indexOf(문자,문자열) : 앞에서부터 문자 찾기
 *                      int lastindexOf(문자,문자열) : 뒤에서부터 문자 찾기
 *                      String replace(문자,문자열) : 변환
 *                                    -> 문자: old / 문자열 : new
 *                      String replaceAll(문자,변경될 문자열)
 *                                        -> 문자,변경될 문자열 : 여기 부분이 정규식 패턴
 *                      String valueOf(Object o) : 모든 데이터형을 문자열화
 *                      String substring()                                 
 *                      String substring(int b)                                 
 *                      String substring(int b, int e) : 자르기
 *                      String [] split(String rex) : 문자 분리                                 
 *            3) StringBuffer
 *            4) StringBuilder
 *            5) Wrapper :1) Integer : parseInt()
 *                        2) Double : parseDouble()
 *                        3) Boolean : parseBoolean()
 *                        4) Long : parseLong()
 *            6) Math : ceil() 
 *                      random()
 *            7) System : gc()
 *                        currentTimeMills()
 *                        exit()         
 *            
 *            
 */
public class 중간점검_필수암기 {

	public static void main(String[] args) {
		
				String s= 
						"""
						211.238.142.21, 
						211.238.142.22""";
//			System.out.println(s);			  
		// [A-Za-z]+ :
		// [0-9]*	 :	
				
		Pattern p= Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{2}"); // d를 쓰는 다른 버전도 있음,{}안에는 글자수 몇개인지 넣을 숫자
		Matcher m=p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group());
		}
	}
}
