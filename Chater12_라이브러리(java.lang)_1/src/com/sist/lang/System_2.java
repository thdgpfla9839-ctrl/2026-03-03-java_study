package com.sist.lang;
/*
 * System.in.read() -> 사용빈도 거의 X
 * Scanner / BufferedReader를 많이 씀
 */
public class System_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			 System.out.print("첫번째 정수입력: ");
             int num1=System.in.read(); // 무조건 예외처리 해야함, 키번호 '1'-> 49 / char -> int 처리
//             System.out.print("num="+(num-'0'));
             System.in.read(); // enter
             
             System.out.print("두번째 정수입력: ");
             int num2=System.in.read();
             System.in.read();// enter
//             System.out.println(num2);
             
//             System.out.println("연산자 입력(+ - * /): ");
//             int op=System.in.read();
//             System.in.read();
//             System.out.println(op);
             
		}
        catch(Exception ex) {}
             
             
	}

}
