package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * 
 */
class Member
{
	private int mno=1;
	private String name="유재석";
	private String address="서울";
	
	public Member() {}
	public Member(int mno, String name, String address)
	{
		this.mno=mno;
		this.name=name;
		this.address=address;
	}
	 //CRED
	public void selsct() // read
	{
		
	}
	public void insert() // create
	{
		
	}
	public void update()
	{
		
	}
	public void delete()
	{
		
	}
}
public class reflection_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              try
              {
            	  // 클래스 객체 생성
            	  // 정보를 얻어오는 getClass()
                  // new한 다음 사용하는 Class.forName
            	  Member mn=new Member();
            	  Class cls =mn.getClass(); // 이거 대신 Class.forName 이것도 가능
            	  System.out.println("메소드");
            	  Method[] methods=cls.getDeclaredMethods(); // getDeclaredMethods() 안에 선언돼 있는 모든 메소드 가져와라
            	  for(Method m:methods)
            	  {
            		  System.out.println(m.getName());
            		 
            	  }  // 메소드는 빈공백에 저장하기 때문에 출력하면 순서가 매번 달라진다
            	 
            	  
            	  System.out.println("멤버변수");
            	  Field[] fields=cls.getDeclaredFields();
            	  for(Field f:fields)
            	  {
            		  System.out.println(f.getName());
            	  }
            	  
            	  System.out.println("생성자");
            	  Constructor[] con=cls.getDeclaredConstructors();
            	  for(Constructor c:con)
            	  {
            		  System.out.println(c.getName());
            	  }
              }
              catch(Exception ex) {}
              
	}

}
