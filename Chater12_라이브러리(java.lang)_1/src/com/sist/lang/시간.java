package com.sist.lang;
/*p.534 ~ 540 date 클래스활용
 * 시간과 관련
 * LOcalDateTime : 날짜와 시간과 관련
 *                 1) LocalDate : 날짜만
 *                 2) LocalTime : 시간
 *  -> 현재 날짜와 시간을 갖고 온다               
 */
import java.time.*; //패키지가 타임안에 있다
import java.time.format.DateTimeFormatter;




public class 시간 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              // 1. 현재 시간과 날짜 출력
		LocalDateTime now = LocalDateTime.now();
		// final 클래스로 돼 있어서  상속은 불가능이다, 그래서 오버라이딩 안 되고 수정 불가능 있는 그대로 사용해야해
		/*
		 * 추가로 있는 그대로 사용해야 하는 클래스
		 * Math, String, StringBuffer, System..... 
		 */
		System.out.println(now);
		// 단점은 timezone이 없어서 어느 나라 시간대인지 몰라유
		System.out.println();
		
		// 2. 특정 날짜와 시간 출력해보기
		LocalDateTime dateTime = LocalDateTime.of(2026,3,30,14,30,30); // 날짜 뒤에는 시 분 초
		System.out.println(dateTime);
		System.out.println();
		
		// 3. 날짜와 시간 더하기
		   LocalDateTime f= now.plusDays(4).plusHours(3);
		   System.out.println(f);
		   
		   System.out.println();
		   
	  //  4. 빼기
		   LocalDateTime p =now.minusMonths(1);
		   System.out.println(p);
		   System.out.println();
		   
     // 5. 값 추출
		   int year=now.getYear();
		   int month=now.getMonthValue();
		   int day=now.getDayOfMonth();
		   int hour=now.getHour();
		   
		   System.out.println(year+"-"+month+"-"+day+"-"+hour); 
		   System.out.println();
		   
	// 6. 문자를 날짜형으로 변환
		   String str="2026-03-31 15:47:40"; // 예약등록한 날짜
		   DateTimeFormatter ff=DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
		   // MM :월
		   // mm :분
		   // hh(1~12)
		   // HH(1~24)
		  
		   LocalDateTime t=LocalDateTime.parse(str,ff);
		   
		   String fff=dateTime.format(ff);
		   System.out.println(fff);
		   
		   
		   
		   
				   
		   
	}

}
