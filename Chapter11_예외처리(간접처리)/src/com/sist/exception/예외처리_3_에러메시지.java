package com.sist.exception;
/*
 * 에러 메시지 처리
 * 
 * public class ArithmeticException extends Exception
 * {
 *   private String message"/ by zero";
 *   public ArithmeticException(String message)
 *   {
 *      this.message;
 *   }
 *   public String getMessage()
 *   {
 *    return message;
 *   }
 * }
 */
public class 예외처리_3_에러메시지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           // printStackTrace
		   //getMessage
		try
		{
//			int a=10/0; // 에러 시 캐치로 이동
			int a=10; // 이동 x
			int b=0;
			if(b==0)
			{
				throw new ArithmeticException("0으로 나눌 수 없다"); // throw를 이용하면 에러 메시지도 내가 바꿀 수 있다
			}
			else
			{
				System.out.println(a/b);
			}
//			System.out.println(a);
		}
		catch(ArithmeticException ex) // 나누기할때 0으로 나오는 에러
		{
			System.out.println(ex.getMessage());
			System.out.println("타입:"+ex.getClass());
			ex.printStackTrace();
		}
	}

}
