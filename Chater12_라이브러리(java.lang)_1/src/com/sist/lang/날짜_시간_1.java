package com.sist.lang;
import java.util.*;
public class 날짜_시간_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*
    * 년도 / 몇월 / 며칠 입력 받아서 요일 확인
    */
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력: ");
		int year=sc.nextInt();
		
		System.out.println("월 입력: ");
		int month=sc.nextInt();
		
		System.out.println("일 입력: ");
		int day=sc.nextInt();
		
		// 입력받은 날짜로 세팅
		Calendar cl = Calendar.getInstance();
		cl.set(Calendar.YEAR, year);
		cl.set(Calendar.MONTH , month-1);//-1 꼭 해줘야해 0부터 시작한다고!!!!
		cl.set(Calendar.DATE, day);
		
		String[] strweek= {"","일","월","화","수","목","금","토"};
		int week = cl.get(Calendar.DAY_OF_WEEK);
		System.out.println(strweek[week]+"요일");
		
	}

}
