package com.sist.io;

/*
 * 스트림: 데이터가 이동하는 통로
 * 버퍼 : 임시기억장소
 * p.782
 * 공부
 * 2장부터 예외처리는 전부
 * 라이브러리에서는
 * java.lang-> Object : toString()
 *                      clone()
 *                      equals()
 *                      hashCode()
 *             String : equals()
 *                      length()
 *                      trim()
 *                      substring()
 *                      split()
 *                      valueOf()
 *                      replace()
 *                      replaceAll()
 *                      indexOf()
 *                      lastIndexOf()
 *            Math :  ceil()
 *                    random()
 *            Wrapper : int -> Integer : parseInt()
 *                      double -> Double : parseDouble()
 *                      booelan -> Boolean : parseBoolean()
 *           StringBuffer/StringBuiler
 *            비동기             동기 -> 문자열 결합 : append()
 *          
 *  -----------------------------------------------------------
 *  
 *  java.util
 *           StringTokenizer : counterToken()
 *                             hasMoreToken()
 *                             nextToken()
 *           Date : 기능이 없다
 *                  데이터베이스와 호환
 *                  calendar : 설정 : set() , 값읽기 : get()
 *           List : add()
 *                 remove()
 *                 set()
 *                 isEmpty()
 *                 size()
 *                 clear()
 *                 
 *           Set : add()
 *                 remove()
 *                 set()
 *                 isEmpty()
 *                 size()
 *                 clear() 
 *                                               
 *           Map : put()
 *                 remove()
 *                 get()
 *             
 *          기타 : 
 *               Random : nextInt()           
 *               DecimalFormat : format()
 *               SimpleDateFormat : format() 
 *----------------------------------------------------------------------
 *  람다 : stream ()
 *        map()
 *        filter()
 *        forEach()
 *        collect()
 *---------------------------------------------------------------------
 * 자바 IO
 * 1. IO(Input/Output)
 *    입력: 인풋 -> 프로그램이 외부 데이터를 받는 것
 *         키보드, 파일, 네트워크와 같은 데이터를 가져올 때 사용
 *    출력 :아웃풋 -> 프로그램이 외부에 데이터를 보내는 것
 *         화면출력, 파일쓰기, 네트워크 전송, 데이터베이스에 전송을 할 때 사용
 *         
 *         
 *         
 * 2. 특징
 *       Stream기반 : 데이터를 운반하는 통로
 *                   단방향
 *                   1바이트 전송(알파벳, 숫자) => 바이트 스트림
 *                                           이미지나 동영상 파일 처리할 때
 *                   2바이트 전송(각국의 언어) => 문자 스트림
 *                                          문자 읽기나 문자 쓰기
 *                                          
 *      바이트 스트림 :
 *                InputStream                                              
 *                OutputStream
 *                파일관련 ->    FileInputStream                                              
 *                             FileOutputStream
 *                                                                      
 *      문자 스트림:
 *               Reader : FileReader
 *               Writer : fileWriter
 *    
 *      보조 스트림 : BufferInputStream
 *                BufferOutputStream
 *                BufferReader
 *                BufferWriter
 *               
 *     객체 스트림 : ObjectInputStream
 *               ObjectOutputStream
 *               
 * => 파일 쓰기, 파일 읽기, 다운로드, 업로드
 *              
 *---------------------------------------------------------------------------------------
 * File : file에 대한 정보
 *        file에는 file과 diretory가 있다
 *        
 *        new File("c:\\javaDev") -> 디렉토리 읽기
 *        new File("c:\\javaDev") -> 정보읽기
 *                    
 * 1. 목적 :                   
 *         메모리 저장 -> 프로그램 종료시 자동으로 데이터가 사라진다
 *                     램에 저장됐기 떄문에 휘발성
 *                           |
 *                         영구적인 저장장치
 *                     파일 / RDBMS(오라클) / 
 *                      
 *                              
 * 
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

// io는 CheckedException 반드시 예외처리 필수
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// File
		try {
			File file = new File("C:\\javaDev\\javaStudy\\Chapter18_입출력(IO)_2\\src\\com\\sist\\io\\IO_1.java");
			System.out.println("파일명: " + file.getName()); // *****파일명 가져오기
			System.out.println("경로+파일명: " + file.getPath()); // *****경로와 파일명
			System.out.println("경로명: " + file.getParent());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println("수정일: " + sdf.format(new Date(file.lastModified())));
			System.out.println("숨긴 파일" + file.isHidden());
			System.out.println("파일여부" + file.isFile()); // ********** 중요한 부분

			// is(isXXXXXX)가 앞에 있으면 리턴형은 무조건 boolean
			// set " -> void
			// get " -> 리턴형

			System.out.println("읽기 전용" + file.canRead());
			System.out.println("쓰기 전용" + file.canWrite());

		} catch (Exception ex) {
		}

	}

}
