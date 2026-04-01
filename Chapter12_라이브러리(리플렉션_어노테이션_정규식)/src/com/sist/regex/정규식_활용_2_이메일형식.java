package com.sist.regex;

import java.util.regex.Pattern;

public class 정규식_활용_2_이메일형식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String email="test@emple.com";
   String regex="^[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]{2,}"; // +는 연산자가 아니야
   boolean res = Pattern.matches(regex, email);
   if(res==true)
   {
	 System.out.println("이메일 형식이다");  
   }
   else
   {
	   System.out.println("이메일 형식 아니다"); 
   }
}

}
