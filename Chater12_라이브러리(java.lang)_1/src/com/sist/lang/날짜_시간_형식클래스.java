package com.sist.lang;
import java.util.*;
/*
 * Date : 본인 운영체제의 시간과 날짜를 가져온다, 기능은 따로 없고 읽기만 한다
 *        데이터베이스와 호환이 돼기 때문에 많이 사용되는 클래스이다.
 * Calendar : 
 * LocalDateTime : LocalDate -> 날짜와 관련
 *                 LocalTime -> 시간과 관련
 * SimpleDataFormat : 날짜 / 시간 출력 형식
 * DecimalFormat  : 숫자 출력 형식 -> 주로 웹 출력 시 사용             
 * MessageFormat  : 문자열 출력 형식 -> SQL문 만들 때 오라클에서 주로 사용
 *--------------------------------------------------------------
 *String id,name,sex,address,phone;
 *int age
 *
 * => String sql ="INSERT INTO member VALUED (' "+id+.............+age)" 이거 보다
 *    String sql ="INSERT INTO 	member 뒤에는 필기 추가하기
 *              
 */
public class 날짜_시간_형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date date = new Date(); // new를 사용했으니 일반 클래스
       System.out.println(date);
       
       Calendar cl = Calendar.getInstance(); // new 사용하지 않은 추상클래스
       int week =cl.get(Calendar.DAY_OF_WEEK); // 요일 읽기 -> but 단점이 1번부터 시작한다
       String[] strweek= {"","일","월","화","수","목","금","토"};
       System.out.println("오늘은 "+strweek[week]+"요일입니다");
       
       int last = cl.getActualMaximum(Calendar.DATE);
       System.out.println("이번달 마지막 날 "+last);
       
       int year = cl.get(Calendar.YEAR);
       int month = cl.get(Calendar.MONTH)+1; //month는 0번부터 시작하므로 +1을 해야한다/ 그러나 날짜를 받아서 저장할 때는 -1 해줘야한다
       int day = cl.get(Calendar.DATE);
       System.out.println(year+"년도 "+month+"월 "+day+"일 "); 
       
      
	}

}
