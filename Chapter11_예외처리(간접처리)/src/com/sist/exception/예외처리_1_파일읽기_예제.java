package com.sist.exception;
/*// 파일읽기 예제
 * 예외처리
 * : 프로그램 실행 중 발생하는 오류(=예외)를 처리하는 과정
 * -> 회피(내가 처리하지 않고 다른 사람에게 보낼지)
 *    복구(내가 해결할 것인지)
 *    
 *  예외복구 : try~catch -> 직접처리
 *  예외회피 : throws -> 간접처리
 *  -------------------------------------------- 
 *  예외처리가 안된 상태 : 에러위치에서 종료 -> 이것을 방지하기 위해 예외처리를 함
 *  예외처리 목적: 강제종료방지, 정상수행 유지
 *  
 *  웹의 단점 : 에러가 나면 무조건 데이터 전송해야한다
 *  에러  예시: 0으로 나눈 경우, 배열 범위 초과, 정수 변환, 파일을 못찾는 경우, IP가 틀려 네트워크 오류, URL주소 오류
 *  finally : 서버나 파일이 나올 때 닫기를 하기 위해 사용한다 -> 생략이 가능함, but try나 catch와 관련없이 무조건 수행한다
 *  --------------------------------------------------------------
 *  try
 *  {
 *     정상 수행문장 -> 예측
 *     -----------------
 *     => 전송 
 *  }
 *  catch(Exception e)
 *  {
 *     예측된 에러 -> 확인만할지/ 복구할지
 *     ---------------------------
 *     => 전송 => 팝업창
 *  }
 *  
 *  --------------------------------------------------------------------------------------------------
 *  throws
 *  위치 : 메소드 뒤에
 *  예)
 *   void display() throws Exception -> 디스플레이를 호출 시 괄호안 에러가 발생할 것 같으니 사용시 반드시 예외처리를 해라는 의미
 *   {
 *   
 *   }
 *   -> try~catch나 throws를 사용할 수 있다
 *   
 */
// try~catch : 자동으로 닫기 / 멀티 catch
// 1. 자동으로 닫기 
import java.io.*;
public class 예외처리_1_파일읽기_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 번 파일읽기
//        FileReader in=null;
//        try
//        {    
//        	// FileReader in=null;  이블록에서만 쓸 수 있어 in은 68번 라인에서도 사용해야 해서 변수를 아예 밖에다 뺀거야 
//        	in =new FileReader("C:\\Users\\sist-19\\git\\Java_study\\Chapter07_객체지향프로그램(재사용)\\src\\com\\sist\\main\\재사용_2.java");
//        	int i=0; // 문자읽기
//        	while((i=in.read())!=-1)
//        	{
//        		System.out.print((char)i);
//        	}
//        }
//        catch (Exception ex) {
//			// TODO: handle exception
//        	ex.printStackTrace();
//		}
//        finally
//        {
//        	try
//        	{
//        		in.close();
//        	}
//        	catch (Exception ex) {}
//        }
		
		// try-with-resource => Auto Close
		//close가 자동으로 호출 -> 파일에서 주로 사용
		// 2번 파일 읽기
		try(FileReader in =new FileReader("C:\\Users\\sist-19\\git\\Java_study\\Chapter07_객체지향프로그램(재사용)\\src\\com\\sist\\main\\재사용_2.java"))
		{   
			int i=0;
			while (( i=in.read())!=-1)
			{
			  System.out.print((char)i);
			}
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
		}
	}

}
