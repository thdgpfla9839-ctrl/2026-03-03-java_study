package com.sist.lang;
/*StringBuffer : String과 동일, append를 사용해서 문자열과 결합
 *  
 * 
 */
import java.io.*;
public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
       {
    	   String foodData="";
    	   FileReader fr = new FileReader("C:\\javaDev\\food.txt");
    	  // FileReader : 문자 스트림 -> 한글이 포함된 파일 읽기
    	  // FileInputStream :바이트 스트림 -> 다운로드나 업로드할 때 
    	   
//    	  StringBuffer sb = new StringBuffer(); // 2번 버전
    	  StringBuilder sb = new StringBuilder(); // 3번 버전
    	  int i=0; // 한글자 씩 읽어온다 -> 정수형으로 읽어옴
    	  long start = System.currentTimeMillis();
    	  while ((i=fr.read())!=-1) // -1 EOF
    	  {
//    		  foodData+=(char)i; // 1번 버전
    		  sb.append((char)i);// 2번 3번 버전때
    	  }
    	  fr.close();
    	  long end=System.currentTimeMillis();
    	  
    	  
    	  // 데이터 출력
//    	  System.out.println(foodData); // 1번 버전
    	  System.out.println(sb.toString()); // 2번, 3번 버전 추가
    	  System.out.println("걸린시간"+(end-start)+"MS");	  
       }
       catch(Exception ex) {}
	}

}
