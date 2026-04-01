package com.sist.regex;
/*
 * 문자 집합 []
 * 예) [abc] -> a|b|c -> a가 포함됐거나 b가 포함됐거나 c가 포함됐거나
 *     [(abc)] ->abc가 포함됐냐
 *     
 *     
 *     [abdef] -> 그대로
 *     [abcdef] -> [a-f]
 *     
 *     => 알파벳 [A-Z] [a-z] [A-Za-z] 
 *     => 숫자 [0-9]
 *     => 한글 [가-힣] : 한글자만 나타내준다 그 한글자의 범위가 가-힣까지라고
 *                    글자수 늘리고 싶으면 뒤에 {}안에 숫자를 입력해
 *                    만약 글자수 몰라 {3,5} 두 수를 입력하고 사이에 ,를 찍어 -> 세글자에서 다섯글자 사이
 *                    
 *    예) 이름 찾는데 글자수 모르고 전부 가져오는 방법
 *       [가-힣]{2,17}                
 */
public class 정규식_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("cat".matches("[abc]at"));
         // aat bat cat 이렇게 가능해 
         System.out.println("aat".matches("[abc]at"));
         System.out.println("bat".matches("[abc]at"));
         System.out.println("dat".matches("[abc]at")); // 앞글자가 틀려서 펄스
         
         
         System.out.println("a".matches("[a-z]"));
         System.out.println("A".matches("[A-Z]"));
         System.out.println("1".matches("[0-9]"));
         System.out.println("김".matches("[가-힣]"));
         
         // "코메디" 찾기
         System.out.println("코메디".matches("[가-힣]")); // [가-힣] 이게 한글자라서 펄스임
         System.out.println("코메디".matches("[가-힣]+")); 
         System.out.println("코메디".matches("[가-힣]{3}")); //[가-힣]{3} 한글이 세글자가 있다 
         System.out.println("코메디".matches("[^코.*]")); // 코로 시작하는 글자가 여러개 있다 -> 특수문자가 포함될 수도 있어
         System.out.println("코메디".matches("[^코[가-힣]]")); // 코 뒤에 한글 여러개가 있다
         

	}

}
