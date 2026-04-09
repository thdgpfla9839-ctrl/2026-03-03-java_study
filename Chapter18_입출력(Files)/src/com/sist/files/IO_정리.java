package com.sist.files;
/* 18장
 * IO : 데이터의 흐름을 관리 (통로)
 *      데이터 이동을 해야하기 때문에 -> 데이터 이동 공간이 필요 (stream)
 *      단방향인데 입력과 출력을 동시에 하려면 스레드를 이용
 *      
 *      예) 카톡
 *         1. 서버로 메시지 전송 => 엔터키(Output)
 *         2. 출력 => 쓰레드 (Input)
 *         
 *      사용처 : 주로 파일 읽기 / 쓰기
 *             파일 이동
 *             텍스트 변경 : Json / XML 파일들
 *             설정 파일
 *             네트워크 통신(주고 받기) : 서버와 클라이언트 통신시
 *             사용자 입력 : 콘솔
 *                        InputStream -> HttpSerletRequest
 *                        OutputStream -> HttpSerletReponse
 *                                  
 *                                   
 *        핵심
 *           Stream : 데이터를 보내는 통로
 *                    단방향 통신 -> 읽기와 쓰기
 *           Buffered : 여러개 데이터를 동시에 보냄 -> 효율적
 *-----------------------------------------------------------------------
 * IO 주요 클래스
 *   InputStream : 읽기
 *       |
 *       FileInputStream
 *       : 1바이트씩 전송
 *         업로드와 다운로드 시 사용
 *         
 *       BufferedInputStream
 *       
 *                                              
 *    OutputStream : 쓰기
 *        |
 *        FileOutputStream
 *        : 1바이트씩 전송
 *          파일 쓰기
 *        BufferedOutputStream    
 *        
 *      Reader : 읽기
 *        |
 *        FileReader
 *        :2바이트씩 전송
 *         파일을 제어(쓰기)
 *         
 *        BUfferedReader
 *        
 *                                                 
 *     Writer : 쓰기
 *       |
 *       FileWriter
 *       : 2바이트씩 전송
 *         파일을 제어(쓰기)
 *       BufferedWriter                                            
 *         
 * --------------------------------------------------------
 *  p.819
 *  Files -> java.nio.*에 들어가 있음
 *  -------------------------------------------------------
 *  대부분이 static메소드로 돼 있음
 *  Files.을 찍고 코딩해야함
 *  주요기능)
 *         exists(경로명) -> 파일 존재 여부 확인할 때   **    
 *         createFiles(경로명) -> 새 파일을 생성
 *         createDirectory(경로명) -> 폴더 생성
 *         delete(경로명) -> 파일 삭제 **
 *         readAllLines(경로명) -> 모든 줄을 List<String>으로 읽어온다 **
 *         write(경로명,content) -> 파일 쓰기
 *         copy(source,target) **
 *         move() -> 파일 이동 **
 *         size() -> 파일 크기를 나타냄 **
 *         list() -> 파일 목록 출력
 *         
 *         -> 경로명은 Paths는 반드시 Path 객체 생성 후에 사용
 *            Paths :파일이나 폴더를 찾기 위한 정보를 가지고 있는 클래스 
 * ---------------------------------------------------------------------
 *  copy -> 원본은 그대로 유지
 *  move -> 원본을 이동시키는 것이라 기존 폴더에서는 파일원본이 사라져 있음 p.820
 *  StandardCopyOption.REPLACE_EXISTING -> 복사나 이동시에 파일이 존재하면 덮어쓰기, 없으면 자동생성하는 옵션
 *  -------------------------------------------------------------------
 *  Files : 파일과 디렉토리(폴더)를 제어하는 모든 기능을 갖고 있음
 *          제어한다는 것은 -> 파일에는 존재하지 않은 이동/ 복사/ 읽기/ 쓰기 + 파일 정보
 *          반드시 파일정보를 갖고 오려면 Path객체를 사용해야 한다
 *          CheckExcepction을 가지고 있기 떄문에 -> 반드시 예외처리!!
 *          파일 이동이나 복사를 할 떄는 StandardCopyOption.REPLACE_EXISTING 옵션을 사용해야 한다
 *          
 *  Path 객체 : 파일 혹은 디렉토리의 위치를 나타내는 객체 -> 파일정보를 나타냄
 *             java.nio.file.*안에 있다
 *             사용법) Paths.get(경로명)
 *             절대경로와 상대경로를 줄 수 있다
 *             Paths.get(C:\javaDev\javaStudy\Chapter18_입출력(Files)\src\com\sist\files\IO_정리.java) 
 *             Paths.get("./IO정리.java") -> 상대경로
 *             Paths.get("IO_정리.java")
 *                     
 */
// 파일 존재 여부 확인
import java.nio.file.*;
import java.io.*;
import java.util.*;
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                // 1. Path 생성
		    Path filePath = Paths.get("c:\\javaDev\\고객2.txt");
		    Path dirPath = Paths.get("c:\\javaDev2");
		    
		    try
		    {
		    	// 1. 파일 생성
		    	if(!Files.exists(filePath))
		    	{
		    		Files.createFile(filePath);
		    		System.out.println("파일 생성 완료");
		    	}
		    	// 2. 폴더 생성
		    	if(!Files.exists(dirPath))
		    	{
		    		Files.createDirectory(dirPath);
		    		System.out.println("폴더 생성 완료");
		    	}
		    	// 3. 파일 쓰기
		    	String content = "안녕하시오 파일스클래스는 파일관련 제어,파일 클래스를 확장시키는 역할을 수행이래요";
		    	Files.write(filePath, content.getBytes()); // write는 바이트라 스트링이 못들어가 그래서 getBytes()를 해준다 
		    	System.out.println("파일 쓰기 완료");
		    	
		    	// 4. 파일 읽기 : FileInputStream
		    	Path custFile=Paths.get("c:\\javaDev\\고객.txt");
		    	List<String> data=Files.readAllLines(custFile); //한번에 모아줌
		    	data.stream().forEach(s->System.out.println(s));
		    	
		    	// 5. 파일 복사
		    	Path copyPath=Paths.get("c:\\javaDev\\고객2.txt");
		    	Files.copy(custFile, copyPath,StandardCopyOption.REPLACE_EXISTING);
		    	System.out.println("파일 복사 완료");
		    	
		    	// 6. 파일 이동 / 이름 변경 -> move는 잘라내기 후에 이동한거라 고객2 파일이 없어짐
		    	Path movePath=Paths.get("c:\\javaDev2\\고객3.txt");
		    	Files.move(copyPath, movePath, StandardCopyOption.REPLACE_EXISTING);
		    	System.out.println("파일 이동 완료 / 파일명 변경 완료");
		    	
		    	// 7. 파일 삭제
		    	Path delDir = Paths.get("c:\\javaDev2");
		    	Files.delete(movePath); // 폴더를 삭제하려면 폴더 안에 파일이 있으면 안 돼 그래서 파일 먼저 지운거야
		    	Files.delete(delDir);
		    	System.out.println("폴더 삭제 완료");
		    	
		    }
		    catch (Exception ex)
		    {
		    	ex.printStackTrace();
		    }
		             
	}

}
