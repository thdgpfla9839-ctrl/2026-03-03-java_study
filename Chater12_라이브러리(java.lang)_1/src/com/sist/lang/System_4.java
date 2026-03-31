package com.sist.lang;
/*
 * 시간을 잴 때
 */
public class System_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          long start=System.currentTimeMillis(); // 1000분의 1초 단위
          for(int i=1; i<=10000;i++)
          {
        	  System.out.println(i);
          }
          long end=System.currentTimeMillis();
          System.out.println("걸린 시간: "+(end-start));
          //데이터베이스 SQL에서 데이터검색
        		  
	}

}
