package com.sist.regex;
/*
 * ? 기호 : 0회 아니면 1회가 있는 경우
 *         어떤 데이터가 있는지 없는지 모르겠는 경우 그 데이터 뒤에 ?를 붙여라
 * 예) color -> colou?r :u자가 있냐 없냐
 */
public class 정규식_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                System.out.println("color".matches("colou?r")); //u가 있을때도 찾고, 없을 떄도 찾는다
                System.out.println("colour".matches("colou?r")); //u가 있을때도 찾고, 없을 떄도 찾는다
                System.out.println();
                
                System.out.println("colouur".matches("colou?r")); //이건 또 못찾는다 이걸 해결하려면
                System.out.println("colouur".matches("colou?.r")); // 이렇게 작성, 글자수를 맞춰서 설정해야돼
                System.out.println();
               
                
                System.out.println("cat".matches("c?a?t?"));
                System.out.println("".matches("c?a?t?"));
                
                
	}

}
