/*
 * p.164
 * 목표
 * 메소드 이해
 * String 클래스 이해
 * 객체 지향 개념
 * 
 * java.util / java.lang -> String
 * java.io / java.net
 * java.sql
 * 
 * import java.lang.* -> 자주 사용이 되므로 생략이 가능(Math, String)
 * 
 * String의 주요 메소드
 *   -> 원하는 위치(인덱스 번호 찾기)
 *   
 *   indexOf 
 *   앞에서 찾기 -> 문자 찾는 경우
 *   lastIndexOf 
 *   뒤에서 찾기 -> 파일 찾기
 *   
 *  int indexOf(char c)
 *  int indexOf(String s)
 *  => -1일 경우는 없는 경우
 *  
 *  int lastIndexOf (char c)
 *  int lastIndexOf (String s)
 *  -> 없는 경우의 값 -> -1
 *  
 *  a.jpd -> lastIndexOf
 *  a.a.jpg -> indexOf
 *  
 */
import java.io.*;

public class String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            File dir=new File("C:\\javaDev");
            File[ ] files=dir.listFiles();
            
            for(File f:files)
            {
            	if(f.isFile()) // 파일이 경우에만 출력해라, 이 조건을 안 걸면 파일까지 전부 가져옴
            	{
            		String name=f.getName();
            		String ext=name.substring(name.lastIndexOf(".")+1); // +1을 주면 .다음부터 가져와라 그래서 .은 안옴
                	System.out.println(ext);
            	}
            }	
            	
	} 

}
