package com.sist.regex;

/*
 * | : or 이 단어 중에 포함됐냐를 물어보는 기호
 */
public class 정규식_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dog".matches("dog|cat|rabbit"));// ()안 세 단어 중 하나가 포함됐냐
		
		System.out.println("gif".matches("gif|jpg|png"));// 확장자를 찾을 때 많이 쓰는 형태
		
		System.out.println("yes".matches("y(es)?")); // y뒤에 es라는 단어가 붙었냐 근데 ? 떄문에 그게 있을 수도 있고 없을 수도...
		System.out.println("ye".matches("y(es)?"));
		
		// 보너스
		/* REGEXP_LIKE(name,"[가-힣]+") -> 한글로 이루어진 파일 찾는 코드
		 * 
		 */
		
	}

}
