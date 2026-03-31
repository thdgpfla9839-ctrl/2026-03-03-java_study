package com.sist.lang;
import java.util.*;
class Controller
{
	@RequestMapping("1")
	public void aaa()
	{
		System.out.println("Controller:aaa() Call");
	}
	@RequestMapping("2")
	public void bbb()
	{
		System.out.println("Controller:bbb() Call");
	}
	@RequestMapping("3")
	public void ccc()
	{
		System.out.println("Controller:ccc() Call");
	}
	@RequestMapping("4")
	public void ddd()
	{
		System.out.println("Controller:ddd() Call");
	}
	@RequestMapping("5")
	public void eee()
	{
		System.out.println("Controller:eee() Call");
	}
}
public class Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          List<Integer> list  = new ArrayList(); // <>에 Integer를 쓴다
          // 배열 대신 사용하는 저장공간
//          list.add(10);
//          list.add("aaa");
//          list.add(10.5);
//          list.add('A');
//          list.add(true);
//          list.add(false);
//          list.add("bbb");
//          list.add(10.5f); // 규칙이 없어서 포문 돌리기도 힘드네
		// -------------------------------------------------------------------------------- 내용은 여기서 끝
        
		// 다른 예제
          Scanner scan = new Scanner(System.in);
          Controller c = new Controller();
//          System.out.println("aaa(1), bbb(2), ccc(3), ddd(4), eee(5): ");
//          int no=scan.nextInt();
//          if(no==1)
//        	  c.aaa();
//          if(no==2)
//        	  c.bbb();
//          if(no==3)
//        	  c.ccc();
//          if(no==4)
//        	  c.ddd();
//          if(no==5)
//        	  c.eee();
//          

          try
          {
        	  Class clsName = Class.forName("com.sist.lang.Controller");
        	  Object obj = clsName.getDeclaredConstructors().newInstance 
        			  
              Method[] methods=clsName.getDeclaredMethods();			  
          }
          catch (Exception ex) {}
	}

}
