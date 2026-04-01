package com.sist.regex;
/*
 *^ and $
 *: ^는 시작
 *  $는 끝
 */
public class 정규식_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("hello".matches("^ho$")); //h로 시작해서 o로 끝난 걸 가져와라 => false 나옴 두글자니까
      System.out.println("hello".matches("^h.*o$")); // 이렇게 글자수 맞춰줘
      System.out.println("hello".matches("^h.*")); 
      // -> hhhhhhh    hhhhsdfdg   hhswe 등 h로 시작하는 모든 글자들을 다 가져온다
      System.out.println("hello".matches(".*o$")); 
      // o자로 끝나는 모든 글자들 다 가져옴
      
      // 오라클, css에도 나오니 공부
      //5까지는 한글자씩 찾는 법이었음
	}

}
