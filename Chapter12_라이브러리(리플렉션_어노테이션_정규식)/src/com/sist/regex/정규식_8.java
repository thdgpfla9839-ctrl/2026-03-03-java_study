package com.sist.regex;
/*
 * 그룹 : ()로 표현
 *       단어를 포함할 때 사용
 *      예)  [(abc)] -> abc가 포함됐냐
 */
public class 정규식_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("abcabc".matches("(abc)+")); // abc가 + 여러번 반복됐냐 
        System.out.println("abc".matches("(abc)*")); // 0번이나 1번 이상 반복됐냐
        
        System.out.println("hahahahe".matches("(ha)+")); // e가 들어있어서 펄스
        System.out.println("hahahahe".matches("(ha)+he")); // ha가 반복을 하고 그 뒤에 he가 있다 
        
        System.out.println("aabb".matches("(a+b+)+"));//a가 한번이상 있고 b도 한번이상있고 그 그룹이 한번이상 있다
        
        System.out.println("123123".matches("(\\d+)+")); // \\d 숫자
        System.out.println("123123".matches("([0-9]+)+")); // 숫자 나타낼 때 
        
        System.out.println("a1b2c3".matches("(\\w\\d)+")); 
        System.out.println("a1b2c3".matches("([a-z][0-9])+")); // a-z 뒤에 숫자 0-9 이 그룹이 여러개가 있다 
        
	}

}
