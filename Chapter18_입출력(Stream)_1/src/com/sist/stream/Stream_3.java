package com.sist.stream;
/* p.782~793
 * Input / Output :파일 이동, 다운로드, 업로드 하는 역할
 *  한글 -> 파일 제어(읽기나 쓰기)를 하고 싶다 => Read / Writer
 */
import java.io.*;
public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           FileInputStream fis = null;
           FileOutputStream fos = null;
           try
           {
        	   fis=new FileInputStream("c:\\javaDev\\lombok-1.18.40.jar");
        	   fos=new FileOutputStream("c:\\java_data\\lombok.jar");
        	   int i=0; // 버퍼를 썼을 때 i는 읽은 바이트 수만큼, 받은 개수만큼 보내기
        	   // 큰파일은 이렇게 쓰면 속도가 느려서 read()는 한글자씩 받아오는 거라서 그래 
        	   // read(byte[]) 여러개를 한번에 모아서 저장하는 방법
        	   byte[] buffer = new byte[1024]; // 파일 복사의 기본형태/ 웹에서는 다운로드하는 방법
        	   while((i=fis.read(buffer,0,1024))!=-1)
        	   {
        		   fos.write(buffer,0,i);
        	   }
        	   System.out.println("파일 복사 완료"); // 웹에서 이 코드 작성하면 다운로드가 될 거야
           }
           catch (Exception ex) 
           {
        	   
           }
           finally
           {
        	   try
        	   {
        		   if(fis!=null) fis.close(); // close가 예외처리를 하는 메소드라 트라이 캐치절을 쓰는 거야, 파이널리절에서는 예외처리와 관련이 없어, 캐치절도 관련없어, 얘네가 체크드어쩌구라서 
        		   if(fos!=null) fos.close();
        	   }
        	   catch (Exception ex) {}
           }
	}

}
