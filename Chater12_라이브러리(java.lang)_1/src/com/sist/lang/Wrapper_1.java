package com.sist.lang;
/*
 * p.521
 * 
 * Wrapper :포장클래스
 *          데이터형을 쉽게 다루기 위해서 만들어짐
 *          제네릭에서 사용이 가능하게 만든 클래스 ->  <> : 데이터형 통일할 때 제네릭에서 씀 <>안에는 클래스와 integer만 들어간다, int 쓰면 에러남
 *-----------------------------------------------------------------------------------------------------------------------
 *기본형 : 클래스화
 *byte -> Byte
 *short -> Short
 *int -> Integer *
 *long -> Long
 *--------------------------------------
 *문자형
 *char -> Character
 *실수형
 *float -> FLoat
 *double -> Double
 *논리
 *boolean -> Booealn *
 *배열
 *char[] -> String *
 *
 *양쪽 호환성
 *AutoBoxing / UnBoxing
 *
 *Integer i =new Integer(10)
 *int ii = i.value() // 오토박싱 -> 클래스에 실제 값을 주입 
 *
 *int ii=i; // 언박싱 -> 기본형에 클래스 객체를 주입
 *
 *int와 Integer 둘은 호환이 된다
 *
 *
 *
 */
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                Integer i=10;
//                Integer j=20;
//                System.out.println(i+j);
//                
//                int k=10;
//                int m=20;
//                System.out.println(k+m);
             // int와 Integer 둘은 호환이 된다
                
            /* 주요 메소드
             * : 웹이나 윈도우에 넘어오는 값은 String
             * String page=request.getParameter("page") -> int로 받으면 안 돼
             * page++ -> 이건 불가능해 웹이나 윈도우는 무조건 문자열임
             * 그래서 정수형으로 변경
             * 네트워크는 정수 X , 문자열 전송
             * int page="1"; -> X 변환을 시키자
             * 
             * 
             * parseXxxx()
             * 정수형변환 : Integer.parseInt("10") -> 10 출력
             * 실수형변환 : Double.parseDouble("10.5") -> 10.5
             * 논리형변환 : Boolean.parseBoolean("true") -> true
             * 
             * 값을 전송하는 경우
             * String.valueOf()
             */
		
		
		
		int a =10;
		System.out.println(Integer.toBinaryString(a));
		//2진법 변경 **
		System.out.println(0b1010);// -> 1010을 출력하고 싶다면 앞에 0b쓰기
		
		System.out.println(Integer.toHexString(a));
		//16진법 변경
		// 0x 붙이기
		System.out.println(Integer.toOctalString(a));
		//8진법 변경
	    //0 붙이기
                
	}

}
