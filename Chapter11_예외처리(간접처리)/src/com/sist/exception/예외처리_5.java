package com.sist.exception;
/*
 * try-catch 기본 구조
 * throw vs throws 차이점
 * finally 역할
 * try-with-resource
 * -------------------------------
 * 예외선언=예외회피 -> 다음 호출 시 예외처리 해야한다
 *                 갖다 쓰는 사람이 예외처리를 한다 = 예외 떠맡기기-> throws
 *                 
 * throws 
 * : 라이브러리에서 주로 사용
 * 
 * 형식 :
 *    [접근지정어][제어어]리턴형 메소드명(매개변수...) throws -> [접근지정어][제어어]리턴형 메소드명(매개변수...)를 처리하려면 throws를 이용해 에러를 처리해라는 뜻
 *    Exception, NumbermatException....
 *    --------------------------------------------------- -> 순서가 없다-> 호출 시 예외처리후 사용
 *    기본 : throws Exception
 *          throws Throwable  
 *          
 *   void div(int a, int b) throws AriethicException -> 나누기 시 0이 들어올 수 있다
 *   {
 *      System.out.print(a/b)
 *    }
 *    
 *    main()
 *    {
 *     div(10/0); -> 오류 안나/ 0으로 나눈 에러는 언체크인 선택사항인 에러라서 
 *                  예) AriethicException
 *    }
 *    ------------------------------------------------------------------
 *    CheckedException : 컴파일 시 검사를 한다 -> 예외처리가 됐는지 -> 필수사항
 *                       예) java.io / java.net 
 *    UnCheckedException : 컴파일 시 검사 X -> 예외처리 됐는지 몰라 -> 선택사항
 *                       예) java.sql
 *                       
 *   -> throws 뒤에는 보통 CheckedException이 온다                   
 *                       
 *    
 */
//public class 예외처리_5 {
//     public static void div(int a, int b) throws  Exception// ArithmeticException 
//     // 예상되는 에러 나열
//     {
//    	 int c=a/b;
//    	 System.out.println(c);
//     }
//     // 나열시 main 뒤에 throws Exception 이렇게만 적어도 위에 나열한 거 전부 받음
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 div(10,3);
//		// 직접처리 트라이캐치절
//		// 다음에 호출 시 처리 throws
//	}
//
//}



public class 예외처리_5 {
    public static void div(int a,int b) throws Exception,
    ClassNotFoundException,InterruptedException
    {
    	int c=a/b;
    	System.out.println(c);
    }
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        div(10,3);
		// 직접 처리 => try~catch
		// 다음에 호풀시 처리 => throws 
	}

}