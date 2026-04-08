package com.sist.stream;
/*
 * 파일 쓰기
 * FileWriter
 * 
 *    write ( ) -> 매개변수가 String
 *    close ()
 */
import java.io.*;
import java.util.Scanner;
public class Writer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw=null;
     try
     {
    	 fw = new FileWriter("c:\\java_data\\member.txt",true); // 파일이 없는 경우에도 자동으로 생성된다
    	 Scanner scan= new Scanner(System.in);
    	 System.out.print("이름 입력: ");
    	 String name = scan.next();
    	 System.out.print("성별 입력: ");
    	 String sex = scan.next();
    	 System.out.print("전화번호 입력: ");
    	 String phone = scan.next();
    	 
    	 // 파일은 구분자가 없어, 한명의 것이라는 것과 어떤 데이터인지 구분이 안가
    	 // 한명의 것이라는 것을 나타내기 위해서는 \n을 준다
    	 // 어떤 데이터인지 구분하는 것은 | , 를 사용한다
    	 
    	 String data=name+","+sex+","+phone+"\n";
    	 fw.write(data);
    	 System.out.println("회원가입 완료");
    	 
    	 FileReader fr=new FileReader("c:\\\\java_data\\\\member.txt");
    	 int i=0;
    	 while((i=fr.read())!=-1)
    	 {
    		 System.out.print((char)i);
    	 }
    	 
    	 // 윈도우 창에서 입력받아서 파일을 읽어오는 방식을 만들거야
     }
     catch (Exception ex) 
     {
    	 ex.printStackTrace();
     }
     finally
     {
    	 try
         {
        	fw.close(); 
         }
         catch (Exception ex) {}
        

     }
	}

}
