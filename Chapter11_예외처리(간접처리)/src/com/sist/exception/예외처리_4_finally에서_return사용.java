package com.sist.exception;
/*
 * finally 에서 return 사용
 */
public class 예외처리_4_finally에서_return사용 {
    
	public static int test()
	{
		try
		{
			int a=10/0;
			return 1;
		}
		catch(Exception e) // Exception e 대신에 Throwable ex로 쓸 수 있다 / Throwable ex-> 더 넓은 범위 에러처리 가능
		{
			return 2;
		}
		finally
		{
			return 3;
		} // 파이널리는 무조건 실행하기 때문에 리턴이나 결과값을 주면 안 돼/ 파일이나 db를 닫을때 사용하는 거임 / 무조건 닫아야 하는 문장에 쓴다
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(test());
	}

}
