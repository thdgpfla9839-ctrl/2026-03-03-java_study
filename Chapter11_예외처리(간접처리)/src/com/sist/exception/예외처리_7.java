package com.sist.exception;
/*
 * throws :에외를 피해가는 상태
 *         예측 후 선언만 해준다
 *         컴파일러에 에러가 있으니 통과해달라 알려주는 것
 *         
 *  사용법 : 메소드 뒤에 throws 예산된 예외클래스
 *         
 *  단점 : 복구할 수 X
 *        정상 종료가 불가능 ->why? 시스템 자체 처리를 하기 때문
 *        라이브러리가 처리하지 않고 사용시에 처리해서 사용
 *  장점 : 어떤 예외(에러)가 발생할지 바로 알 수 있다
 *  ------------------------------------------------
 *  라이브러리: java.io / java. net/ java.sql 에서 많이 등장
 *  사용자 정의 시 : throws Exception /throws Throwable 정도 쓸 거 같아
 *  --------------------------------------------------------------
 *  throw : 임의로 발생한다
 *  사용자 정의 : 자바에서 지원하지 않는 예외가 있는 경우
 *             예)  입력을 해야하는데 입력을 하지 않은 경우       
 * ---------------------------------------------------------------------
 * throw 쓰는 방법 :
 * throw new 예외처리클래스("Message") =>catch절로 이동!!!
 * ->throw를 쓴다음에는 sysout 쓸 수 없다, 이 밑에는 어떤 코딩도 들어오면 안 도ㅐ, 왜냐 예외가 발생해서 catch문장으로 돌아가요              
 */
import java.util.*;
public class 예외처리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //짝수냐 홀수냐 문제
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=scan.nextInt();
		
		try
		{
			if (num%2!=0)
			{
				throw new Exception("짝수만");
				//System.out.println(); 코딩할 수 없다
				// catch (Exception ex) 로 이동해서 처리된다
				// throw는 임의로 예외 발생을 시켜줘 -> 해당 catch절로 이동시켜줌
				// throw는 사용자 정의 예외처리 시 많이 써
			}
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
