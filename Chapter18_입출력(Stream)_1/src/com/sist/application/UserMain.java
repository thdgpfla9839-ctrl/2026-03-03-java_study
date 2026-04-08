package com.sist.application;
import java.util.*;
public class UserMain {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           MemberManager mgr=new MemberManager();
           Scanner scan = new Scanner(System.in);
           while(true)
           {
        	   System.out.println("==============메뉴==========");
        	   System.out.println("1. 등록");
        	   System.out.println("2. 조회");
        	   System.out.println("3. 수정");
        	   System.out.println("4. 삭제");
        	   System.out.println("5. 종료");
        	   System.out.println("=============================");
        	   
        	   System.out.print("메뉴선택");
        	   int menu=scan.nextInt();
        	   switch(menu)
        	   {
        	   case 1 ->
        	   {
        		    mgr.create(scan);
        	   }
        	   case 5 -> 
        	   {
        		   System.out.println("종료");
        		   System.exit(0);
        	   }
        	   case 2 -> 
        	   {
        		   List<MemberVO> list=mgr.read();
        		   list.stream().forEach(m->System.out.println(m.getName()+" "+m.getSex()+" "+m.getAddress())); // 한번을 쓸 떄나 파일에서 읽어서 출력할 때는 간단하게 람다가 편하당
        		  
        	   }
        	   case 4 ->
        	   {
        		   List<MemberVO> list = mgr.read();
        		   System.out.print("삭제할 번호 선택(1~"+list.size()+"):");
        		   int no=scan.nextInt();
        		   mgr.delete(no);
        		   
        		   	
        	   }
        	   case 3 ->
        	   {
        		   System.out.println("수정할 회원번호:");
        		   int no=scan.nextInt();
        		   
        		    System.out.print("이름 입력: ");
        	    	String name = scan.next();
        	    	System.out.print("성별: ");
        	    	String sex = scan.next();
        	    	System.out.print("주소: ");
        	    	String address = scan.next();
        	    	
        	    	MemberVO vo=new MemberVO();
        	    	vo.setName(name);
        	    	vo.setSex(sex);
        	    	vo.setAddress(address);
        	    	
        	    	mgr.update(vo, no);
        	    	
        	   }
        	   default ->
        	   {
        		   System.out.println("없는 메뉴");
        	   }
        	   }
           }
	}

}
