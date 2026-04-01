package com.sist.regex;
/*
 * \d : 숫자를 나타냄 = [0-9]
 * \w : [a-zA-Z], 모든 문자
 * \s : 공백을 나타냄
 */
public class 정규식_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("12345".matches("\\d+")); // 자바에서 출력할 때 역슬러쉬는 두개를 입력해야된다
       
       System.out.println("abc123".matches("\\w+")); // 문자표현
       
       System.out.println(" ".matches("\\s"));
       
       System.out.println("1 2".matches("\\d\\s\\d"));
       
       System.out.println("a b".matches("\\w\\s\\w"));
	}

}
