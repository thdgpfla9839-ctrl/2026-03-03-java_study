package com.sist.regex;
/*
 * 이스케이프 문자 : 이미 기호로 사용되는 문자
 *               예) . + * | ? ....
 */
public class 정규식_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("1+2".matches("1\\+2"));
            System.out.println("a\\b".matches("a\\\\b"));
            
            System.out.println("^abc$".matches("\\^abc\\$"));
            System.out.println("c++".matches("c\\+\\+"));
            
            System.out.println("211.238.456.1)".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")); // \\d 대신 [0-9]
	}

}
