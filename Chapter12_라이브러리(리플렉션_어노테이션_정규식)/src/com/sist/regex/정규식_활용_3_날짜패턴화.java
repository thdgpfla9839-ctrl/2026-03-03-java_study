package com.sist.regex;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식_활용_3_날짜패턴화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Date date=new Date();
             SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
             String today=sdf.format(date);
             System.out.println(today);
             
             // yyyy-MM-dd 패턴화
             String regex="([0-9]{4})-([0-9]{1,2})-([0-9]{1,2})";
//             String regex="\\d{4}-\\d{1,2}-\\d{1,2}"; -> 이렇게도 쓸 수 있다
             Pattern p=Pattern.compile(regex);
             Matcher m=p.matcher(today);
             if(m.find())
             {
            	 System.out.println("오늘 날짜 : "+m.group());
            	 System.out.println("년도 : "+m.group(1));
            	 System.out.println("월 : "+m.group(2));
            	 System.out.println("일 : "+m.group(3));
             }
             
	}

}

/* 패턴
 *    Pattern.matchers -> equals 전체문장
 *    Matcher.find() -> contains
 *                      찾은 문자열 : group
 *                      replaceAll()
 *                      () : 그룹
 *----------------------------------------------------
 *-> 데이터셋에서 데이터 찾아오면 되는데 여기는 데이터사전이라고도 함                      
 * 
 */
