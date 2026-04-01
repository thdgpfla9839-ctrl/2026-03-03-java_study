package com.sist.anno;

import java.util.Scanner;

class Controller
{
	public void main_page()
	{
		System.out.println("메인 이동");
	}
	public void member_join()
	{
		System.out.println("회원가입 이동");
	}
	public void login()
	{
		System.out.println(" 로그인 이동");
	}
	public void board_list()
	{
		System.out.println("게시판 이동");
	}
	public void food_list()
	{
		System.out.println("맛집 목록으로 이동");
	}
	public void food_detail()
	{
		System.out.println("맛집 상세보기로 이동");
	}
}
public class 어노테이션_2 {

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
             System.out.print("메뉴 입력: ");
             int menu=scan.nextInt();
             
             
             Controller c=new Controller();
             if(menu==1)
            	 c.main_page();
             else if(menu==2)
            	 c.member_join();
             else if(menu==3)
            	 c.login();
             else if(menu==4)
            	 c.board_list();
             else if(menu==5)
            	 c.food_list();
             else if(menu==6)
            	 c.food_detail(); // -> 너므 길잖아 간단하게 바꾸자
          // 추가하든 삭제하든 고정을 시키면 편하겠찌, if문을 계속 추가할 수 없잖아 -> 자동화 그러면 서버를 건들지 않고 기능 변경이 가능해져 그건 2_1에서

	}

} 