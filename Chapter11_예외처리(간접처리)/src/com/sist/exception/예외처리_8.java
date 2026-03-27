package com.sist.exception;
/*
 * 사용자 정의 예외처리
 * 
 */
class MyException extends Exception
{
	private String msg;
	public MyException(String msg)
	{
//		this.msg
		super(msg);
	}
}
public class 예외처리_8 {
// 생성자는 반드시 앞에 new 붙이기
// catch 는 throw 꼭 쓰기
// 우선시 되는 것 : if~else 먼저쓰고 정규식 처리, 그래도 안 되면 예외처리를 쓴다
// 정규식 :[0-9] [가-힣]......
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        try
        {
        	if(c>='A' && c<='Z')
        	{
        		throw new MyException("소문자만 입력");
        	}
        }
        catch(MyException e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
