package com.sist.exception;
/*
 * UnCheckedException 중
 * NumberFormatException
 * 웹이나 윈도우 모바일 -> 서버 데이터 전송 / 브라우저 전송 받기 => 모든 데이터는 문자열
 * 
 * NullPointterException
 * IllegalArgumentException :매개변수 값이 다른경우
 * 
 * => 이런 경우 필수적으로 합쳐라
 * 
 * 
 */
public class 예외처리_6 {
           // 이미 코드가 잔뜩 있을대 예외처리 문장이 들어가야 하는 경우는 main 뒤에 throws를 넣어 해결해버리자
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		String image=null;
		// IS NOT NULL
		try
		{
			System.out.println(image.length()); // catch. 이 라인이 있고 없고 출력 차이가 있다 
			System.out.println("image를 브라우저에 출력");
		}
		catch (NullPointerException e)
		{
			System.out.println("이미지 없음을 보내");
		}
		/*
		 * String page=request.getParameter("page");
		 * -> 문제 : 1페이지의(?page=1) 페이지가 null값이란 말
		 * 
		 * -> 해결 :    if(page==1) / if(page==null)
		 *               page="1"
		 */
	}

}
