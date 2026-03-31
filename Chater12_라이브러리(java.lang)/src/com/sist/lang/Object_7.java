package com.sist.lang;

import java.lang.reflect.Method;

/*
 * p.512
 * 클래스 정보를 얻어오는 법
 * Class.forName() / .getClass / .class
 * : 리플렉션 : 클래스 정보를 얻어서 객체생성/ 생성자 호출 / 변수값
 * 스프링은 거의 리플랙션을 이용
 * 클래스를 넘겨주면(이름만 넘겨주면 됨) 생성되며 관리
 * 
 * 
 */
//getClass -> 클래스 정보를 확인할 때 => 솔루션 개발을 할 때 많이 쓴다

public class Object_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String str="Hello";
              Class clsName=str.getClass();
              System.out.println(clsName.getName());
              
              //데이터타입
              Object obj=new String("헬로우");
              System.out.println(obj.getClass());
              //객체타입의 데이터형이 어떤 클래스인지 물어보는
              
              clsName = String.class; // 클래스정보를 갖고 올때 사용
              System.out.println(clsName.getName());
              Method[] methods=clsName.getDeclaredMethods();
              for(Method m : methods)
              {
            	  System.out.println(m.getName()); //까지
              }
            		  
	}

}
