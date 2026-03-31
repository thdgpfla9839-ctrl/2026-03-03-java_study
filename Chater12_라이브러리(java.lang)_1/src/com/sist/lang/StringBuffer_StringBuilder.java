package com.sist.lang;

import java.util.StringTokenizer;

/*p.521
 * 문자열 클래스
 *  1) StringBuilder : 문자를 모아서 관리(동기화 방식), 안정성 up을 목표
 *  
 *  2) StringBuffer* : 문자를 모아서 관리(비동기화 방식), 속도
 *  
 *  3) StringTokenizer* : Spilt()과 비교 -> Spilt는 데이터가 많거나 복잡한 문자가 있는 경우, String []
 *                        간단한 문자 분리
 *                        String
 *  
 *  *특히 외우기
 */
public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			long start=System.currentTimeMillis();
           String info="32,000원 | 2026년 3월 19일 발행 | 448쪽";
           String[] data = info.split("\\|");
           // 정규식  | 기호
           for(String s:data)
           {
        	   System.out.println(s);
           }
           long end=System.currentTimeMillis();
           System.out.println("데이터 개수"+data.length);
           System.out.println("걸린시간 "+(end-start));
           
           
           System.out.println("=======StringTokenizer========");
           start=System.currentTimeMillis();
           StringTokenizer st= new StringTokenizer(info, "|");
            while(st.hasMoreTokens())
            {
            	System.out.println(st.nextToken());
            }
            
            end=System.currentTimeMillis();
            System.out.println("걸린시간 "+(end-start));
	}

}
