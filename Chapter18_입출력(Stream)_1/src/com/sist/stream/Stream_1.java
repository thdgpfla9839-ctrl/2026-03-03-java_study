package com.sist.stream;
/*
 * IO : Input(입력) / Output(출력)
 *      System.in : 키보드로부터 입력을 받음
 *      System.out : 명령프롬프트에 출력
 *    => 표준 입출력 
 *    => 역할) 프로그램 외부소스를 목적지의 데이터 정보교환을 할 떄 쓰는 형식 
 *-------------------------------------------------------------
 * 외부소스 : 입력 -> 키보드나 파일, 네트워크에서 들어오는 데이터
 * 목적지 : 프로그램에서 화면이나 파일에 나가는 데이터 위치
 * 
 * 출발지 : 
 *        키보드                   통로: 입력스트림                    통로 : 출력스트림
 *        파일           ----------------------------프로그램-------------------------------도착지 : 모니터
 *        다른 프로그램(윈도우창)                                                                     파일
 *                                                                                              프로그램, 브라우저
 *                                     -> 입력스트림 역할 : 데이터를 읽어오는 객체
 *                                     -> 출력스트림의 역할 : 데이터를 써서 보내는 객체
 *-----------------------------------------------------------------------------------------------------------------
 * 스트림 : 응용프로그램(개발자)과 I/O객체를 연결해서 데이터를 이동하는 통로 
 *        단방향으로만 연결이 된다
 *       
 * 스트림과 관련된 클래스 :   1byte씩 전송 -> 바이트 스트림
 *                   1) 입력 스트림 : InputStream : Interface => 최상위클래스, 구현된 클래스
 *                                     |
 *                            파일관련)FileInputStream
 *                                   BufferedInputStream
 *                                     |
 *                            객체관련)ObjectInputStream                
 *                            
 *                            2byte씩 전송 -> 문자스트림
 *                            Reader : Interface 
 *                                |
 *                          파일읽기관련) FileReader
 *                                     BufferedReader (메모리 -> 키보드 입력)
 *                                     => 한줄씩 파일 읽기 / 외부소스 읽기     
 *                 
 *                                                   
 *                   2) 출력 스트림 : 1byte : 바이트스트림
 *                                 OutputStream : Interface
 *                                      |
 *                                  FileOutputStream (파일)
 *                                  BufferedOutputStream (메모리)
 *                                  ObjectOutputStream       
 *                                   
 *                                                             
 *                                 2byte씩 전송 -> 문자스트림
 *                                   Writer : Interface
 *                                     |
 *                                  FileWriter(파일쓰기)
 *                                  BufferedWriter(메모리에 저장) 
 *                                  PrintWriter
 * ---------------------------------------------------------------------------------
 *  1. 파일인풋스트림 : 파일읽기할 떄 사용
 *                  다운로드 시
 *                  파일 이동시킬 때
 *                  이미지 파일, 동영상 파일을 쓸 때
 *                  변환) InputStreamReader -> 1바이트를 2바이트로 변환할 떄
 *                                            바이트스트림을 문자스트림으로 변환할 때   
 *                  기능) read() : 읽기
 *                       close() : 닫기
 *                      -> 쓰기는 못함
 *                         한글자씩 읽기
 *                         바이트 단위로 읽음
 *                         반드시 CheckedException 예외처리 해야함
 *                         
 *                                                                                                        
 *      
 */
import java.io.*;
public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                FileInputStream fis=null;
                try
                {
//                	File file = new File(""); 
                	fis=new FileInputStream("C:\\Users\\sist-19\\git\\Java_study\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java"); // 파일명 혹은 경로명을 쓴다
                	BufferedReader br= new BufferedReader(new InputStreamReader(fis)); // 한글 안 꺠지게, 인풋스트림을 버퍼드리더로 변환할거야
                	// 파일읽기 시작
//                	int i=0; // 한글자씩 읽어오기 -> 정수로 읽어오기
//                	while((i=fis.read())!=-1) //-1은 파일의 끝(EOF)
//                	{
//                		System.out.print((char)i);// 한글자씩 읽어오기 떄문에 print를 줌
//                		// 한글이 2바이트라 한글이 꺠지네 -> 한글파일을 읽는 용도는 아니구나
//                		// 읽어서 파일 이동할 때 쓰자
//                	}
                	while(true)
                	{
                		String s=br.readLine();
                		if(s==null)
                		
                			break;
                			System.out.println(s);
                			// 읽어온 값 출력
                		
                	}
                	
                }
                catch (Exception ex) 
                {
                	System.out.println(ex.getMessage());
                	// getMessage() : 파일을 찾을 수 없다는 에러 발생
                   //  printStackTrace() : 실행하는 과정을 보여주고 해당위치에서 종료 에러발생
                }
                finally
                {
                	try
                	{
                		fis.close();
                	}
                	catch (Exception ex) {}
                }
	}

}
