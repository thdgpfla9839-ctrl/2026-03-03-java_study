package com.sist.lang;
import java.text.SimpleDateFormat;
/*p.533
 * Date
 * : 현재 날짜를 읽어온다
 *   제어 -> Calender
 */
import java.util.*; // 유틸안에 데이트 들어있음
public class Date_Time_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date date = new Date();
       System.out.println(date);
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
       System.out.println(sdf.format(date));
       
       /*
        * 년도 : yy 혹은 yyyy -> 소문자 쓰는 거 명심
        * 월  : MM / M -> 예를들어 03 혹은 3으로 출력됨, 얘만 대문자를 쓴다 
        * 일  : dd / d -> 소문자로 쓰기
        * 
        * 시간 : hh / h
        * 분 : mm / m
        * 초 : s / ss
        */
	}

}
