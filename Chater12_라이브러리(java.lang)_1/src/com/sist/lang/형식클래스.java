package com.sist.lang;
/*p.544 아마도
 * 형식클래스 외울 거 세가지
 *  1. SimpleDateFormat : 날짜 변환
 *  2. DecomalFormat : 숫자 변환
 *  3. MessageFormat : 형식을 변경
 *  
 *  문자 : String
 *  숫자 : Math
 *  날짜 : Calendar
 *  변환 : Format
 *  기타 : switch,if
 */
import java.text.*; // 이안에 포맷 들어가 있음
import java.util.Date;
public class 형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 날짜 변환
		// 알아둘 정보
		// 월을 사용할 때 M과 MM 둘다 써도 되지만 M을 기본으로 쓰자 
		// 출력시 2026-9-26 이렇게 09월로 나오지 않게하기!!
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date)); // sdf형식으로 date를 바꿔라
		
		// 숫자관련
		DecimalFormat df=new DecimalFormat("#,###,###,###"); // 돈은 #으로 써야함
		int won = 1000000;
		System.out.println(df.format(won)+"원");
		
		int no=1;
		String name="나";
		String sex="남자";
		String address="서울";
		String phone="010-5659-9825";
		int age=30;
		String content="나 입니다";
		
		// 오라클에 데이터 추가할 때 MessagFormat을 이용한다
		String sql="INSERT INTO member VALUES("+no+","+name+","+sex+","+address+","+phone+","+age+","+content+"')";
		System.out.println(sql);
		
		sql = "INSERT INTO member VALUES("+"{0},''{1}'',''{2}'',''{3}'',''{4}'',''{5}'',''{6}'')";
		Object[] ob= {no,name,sex,address,phone,age,content};
		System.out.println(MessageFormat.format(sql, ob));
	}

}
