package com.sist.stream;
/*
 * 문자스트림 :  2바이트씩 값을 읽는다 -> 파일읽기할 때 많이 사용, 한글이 안 깨짐
 *            자바는 한글 한글자당 2바이트
 *            오라클은 한글 한글자당 3바이트
 *            
 *  문자 스트림의 최상위 클래스 두가지
 *  
 *         1) Reader
 *              |
 *              FileReader
 *              BufferedReader
 *              
 *         2) Writer
 *               |
 *               FileWriter
 *               BufferedWriter
 *              
 *          => 파일 자체 제어 -> 글쓰기나 읽기는 가능하지만 수정이나 삭제는 어렵당
 *                           수정이나 삭제는 ObjectInputStream을 쓰자    
 *              
 * 
 * 
 * 
 * 
 */
// 파일 읽기
import java.io.*;
public class Reader_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null; // 클래스의 기본값은 null 주소가 없는 상태이다
    try
    
    {
    	in=new FileReader("c:\\java_data\\sawon.txt");
    	// read() 한글자 2바이트씩 읽는다
    	// 반드시 닫기를 해야하면 닫기를 할 떄는 close를 쓰는데 finally에 쓴다
    	// 파일 안에 있는 내용을 가져올 떄 사용
    	int i=0;
    	while((i=in.read())!=-1)
    	{
    		System.out.println((char)i);
    	}
    }
    catch (Exception ex) 
    {
    	
    }
    finally
    {
    	try
    	{
    		in.close();
    	}
    	catch (Exception ex) {}
    }
	}

}
