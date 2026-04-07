package com.sist.io;
/*
 * 파일생성
 * 폴더(디렉토리) 만드는 방법 = 폴더 생성
 * 삭제 방법
 * ------------------------------------------
 * 파일제어 : 입출력
 *          FileInputStream
 *          FileOutputStream
 *          BufferedOutputStream
 *          BufferedInputStream
 *          FileReader
 *          FileWriter
 *          BufferedWriter
 *          BufferedReader
 *          ObjectInputStream
 *          ObjectOutputStream
 *          PrintWriter : 자바에서 브라우저에 전송 : Servlet
 *                         => JspWriter : JSP
 * 
 */
import java.io.*;
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
        {
    	  File dir = new File("c:\\upload");
//    	  if(!dir.exists()) // upload가 없다면
//    	  {
//    		  dir.mkdir(); // 없다면 생성
//    		  
//    	  }
//    	  else
//    	  {
//    		  System.out.println("이미 존재하는 폴더");
//    	  }
    	  
//    	  if(!dir.exists())
//    	  {
//    		   dir.createNewFile();
//    		   System.out.println("파일 생성");
//    	  }
//    	  else
//    	  {
//    		  System.out.println("이미 존재");
//    	  }
    	  
    	  
    	  if(dir.exists()) // 존재한다면
    	  {
    		  dir.delete(); // 폴더 지워라
    	  }
        }
         catch (Exception ex) {}
	}

}
