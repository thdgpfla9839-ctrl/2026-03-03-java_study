package com.sist.anno;
/*
 * RequstMapping: 스프링에서메소드를찾는구분자
 */
import java.lang.reflect.Method;
import java.util.Scanner;

class Controller_1
{
	@RequstMapping("1")
	public void main_page()
	{
		System.out.println("메인 이동");
	}
	@RequstMapping("2")
	public void member_join()
	{
		System.out.println("회원가입 이동");
	}
	@RequstMapping("3")
	public void login()
	{
		System.out.println(" 로그인 이동");
	}
	@RequstMapping("4")
	public void board_list()
	{
		System.out.println("게시판 이동");
	}
	@RequstMapping("5")
	public void food_list()
	{
		System.out.println("맛집 목록으로 이동");
	}
	@RequstMapping("6")
	public void food_detail()
	{
		System.out.println("맛집 상세보기로 이동");
	}
	@RequstMapping("7")
	public void food_jjim()
	{
		System.out.println("맛집 즐겨찾기로 이동");
	}
	@RequstMapping("8")
	public void food_like()
	{
		System.out.println("맛집 좋아요로 이동");
	}
	
}
public class 어노테이션_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner scan=new Scanner(System.in);
             System.out.println("메뉴");
             System.out.println("1.메인");
             System.out.println("2.회원가입");
             System.out.println("3.로그인");
             System.out.println("4.게시판");
             System.out.println("5.맛집 목록");
             System.out.println("6. 맛집 상세보기");
             System.out.println("7. 맛집 즐겨찾기");
             System.out.println("8. 맛집 좋아요");
            
             System.out.print("메뉴 입력: ");
             int menu=scan.nextInt();

             
             try
             {
            	 // 클래스 정보 얻기
            	 Class clsName=Class.forName("com.sist.anno.Controller_1");
            	 // 객체 생성
            	 Object oj=clsName.getDeclaredConstructor().newInstance();
            	 
            	 // 메소드 정보 가지고 오기
            	 Method[] methods=clsName.getDeclaredMethods();
            	 for(Method m:methods)
            	 {
            		 // 메소드 위에 있는 메소드 찾기
            		 RequstMapping rm=m.getAnnotation(RequstMapping.class);
            		 if(rm.value().equals(String.valueOf(menu)))
            		 {
            			 // 어노테이션에 있는 문자열과 사용자가 요청한 값과 같은 경우
            			 m.invoke(oj, null);// 해당 메소드를 호출해라 :invoke(객체명)
            			 
            			 
            		 }
            	 }
             }
             catch(Exception ex) {}
	}

} 
