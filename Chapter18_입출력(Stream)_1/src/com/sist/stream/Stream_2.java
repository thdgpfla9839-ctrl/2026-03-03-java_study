package com.sist.stream;
/*
 * FileOutputStream : 파일 쓰기
 *        |
 *      close()
 *      write()
 * --------------------------------
 *  getBytes() 사용하는 경우
 *  
 *         클라이언트 ------------- 서버
 */
import java.io.*;
public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             FileInputStream fis=null;
             FileOutputStream fos=null;
             try
             {
            	 // 저장폴더 생성
            	 File dir=new File("c:\\java_data");
            	 if(!dir.exists()) // 자바데이터 폴더가 씨드라이브에 없냐
            	 {
            		dir.mkdir(); // 없으면 폴더 생성
            		 
            	 }
            	 File file = new File("c:\\java_data\\sawon.txt");
            	 if(!file.exists())
            	 {
            		 file.createNewFile();
            	 }
            	 fis=new FileInputStream(file);
            	 // 자바응용프로그램과 sawon.txt 파일과 연결시키는 통로 만들어둠 -> 읽기가 가능하게 됨
//            	 fos=new FileOutputStream(file,true); // 트루를 안 주면 데이터가 덮여써져/ true를 쓰면 append()모드가 됨
//            	 // 자바응용프로그램과 sawon.txt 파일과 연결시키는 통로 만들어둠 -> 쓰기가 가능하게 됨
////            	 fos.write('f');
////            	 fos.write('o');
////            	 fos.write('l');
////            	 fos.write('l');
////            	 fos.write('o');
////            	 fos.write('w');
//            	 // write는 한글자씩만 출력이 가능해
//            	 
//            	 String info="송혜림 | 여자 | 개발부 | 서울 | 대리 | 4000\n"; // \n을 줘야 밑으로 내용이 출력됨
//            	 fos.write(info.getBytes()); // String을 바이트 []로 바꿀거야 -> getBytes()이용
//            	                             // write는 한글자씩만 전송이 가능해 그래서 한번에 전송할 수 있는 방법을 만들어봄
//            	 
//            	 System.out.println("파일 저장 완료");
            	 int i=0;
            	 while((i=fis.read())!=-1)
                     {
	                        System.out.println((char)i);
                       }

             }
             catch (Exception ex) 
             {
            	 ex.printStackTrace();
             }
             finally
             {
            	 try
            	 {
            		 fis.close();
            		 fos.close();
            	 }
            	 catch (Exception ex) {}
             }
	}

}
