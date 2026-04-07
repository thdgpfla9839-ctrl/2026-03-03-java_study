package com.sist.io;
/*
 * 브라우저(HTML) === 자바 === 오라클(SQL언어)
 * 브라우저 === 오라클 -> 이렇게 넘어가는 기능은 없음
 * 
 * 브라우저에서는 HTML과 XML만 실행됨(자바는 일반 텍스트)
 *            처리는 자바스크립트
 *-------------------------------------------------
 *  자바프로젝트에 필수 포함될 내용
 *  
 *    1. CRUD : 회원가입/로그인/회원수정/회원탈퇴   OR 사원 ......../ 퇴사 
 *              사내게시판 OR 게시판/검색/상세보기 / 사원, 관리자 
 *    2. 네트워크 : 채팅
 *                 
 */
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try
 {
	 // 파일 목록 가져오기 
	 File dir = new File("c:\\javaDev");
	 File [] list = dir.listFiles(); // 디렉토리 안에 있는 파일 전부
	 for(File f:list)
	 {
		 // 파일 구분하려고 조건줄래
		 if(f.isFile()) // 파일이면
		 {
			 String len = f.length()/1024>0?(f.length()/1024)+"KB":f.length()+"Bytes";
			 System.out.println(f.getName()+" "+len);
		 }
		 if(f.isDirectory()) // 디렉토리(폴더)면 else 대신 if가능
		 {
			 System.out.println(f.getName()+" DIR");
		 }
		 
		 System.out.println(f.getName());
	 }
 }
 catch (Exception ex) {} // 파일 전체 불러오기
	}

}
