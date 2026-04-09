package com.sist.files;
/*
 * files의 기능
 * 
 * 경로를 가져올 때
 * toAbsolutePath() -> 절대경로명으로 변경
 * getFIleName() -> 파일 이름만 추출
 * getParent() -> 경로명만 추출
 * getRoot() -> 루트디렉토리
 * 등의 메소드가 존재......
 * 
 * 파일을 복사시)
 *   파일이 없는 경우에는 자동생성이됨
 *   기존 파일이 있는 경우에는 덮어쓴다 
 *   
 *  File은 절대경로,
 *  FIles는 상대경로 사용가능   
 */
import java.nio.file.*;
public class Files_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 웹에서 업로드 / 다운로드할 시에 나옴
		/* 라이브러리 공부시에는
		 *      1. 기능 확인
		 *      2. 메소드명 확인
		 *      3. 매개변수 확인
		 *      4. 리턴형이 무엇인지 확인
		 *    => 라이브러리는 이해보다 암기하자
		 * 
		 */
   try
   {
	   Path file = Paths.get("C:\\javaDev\\고객.txt");
	   System.out.println(file.toAbsolutePath());
	   System.out.println(file.getFileName());
	   System.out.println(file.getParent());
	   System.out.println(file.getRoot());
	   
	   long size =Files.size(file); // 파일크기 불러오는 방법, 바이트 크기로 나온다
	   System.out.println(size);
	   
	   Path dir=Paths.get("C:\\javaDev"); 
	   Files.list(dir).forEach(p-> System.out.println(p.getFileName()));
	// 자바dev에 있는 모든 파일 목록을 가져옴
	   
	   
   }
   catch (Exception ex) {}
	}

}
