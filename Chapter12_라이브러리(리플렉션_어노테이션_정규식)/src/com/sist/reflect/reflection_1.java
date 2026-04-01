package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
// p.549
/*
 * 리플렉션 : 현재 실행 중인 프로그램을 제어
 *          자바 프로그램은 클래스 안에 멤버변수/ 생성자 / 메소드가 있늕데 이것을 제어하는게 리플렉션
 *          반드시 패키지명 부터 설정해야한다 -> 반드시 클래스명을 이용
 *          메소드 제어(호출), 변수값을 변뎡 =>private 접근이 가능 but OOP가 깨진다
 *          메소드 호출이 가능하다면 객체 생성이 가능하다
 *          어노테이션 확인가능
 *-------------------------------------------------------------------------------
 *=> 리플렉션의 이러한 기능을 모아서 만든게 Spring(자동화) 
 *=> 리플렉션과 어노테이션을 이용해 프레임워크 개발
 *
 *---------------------------------------------------------------------
 *1. 클래스 정보 얻기 (멤버변수, 메소드, 생성자) p.551
 *   => 객체 생성 / 멤버변수 주입/ 메소드 호출 => 자동화 처리
 */
class Sawon 
{
	private String name;
	public Sawon() {} 
	public Sawon(String sawon)
	{
		this.name=name;
	}
	public void info()
	{
		System.out.println("Sawon : info() Call"+name);
	}
}
public class reflection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sawon sa=new Sawon(); // 결합성이 강한 프로그램
		//객체생성
		
         try
         {
        	 // 클래스 정보 읽기
        	 Class clName=Class.forName("com.sist.reflect.Sawon");
        	 
        	 // 클래스 정보에 생성자를 가지고 온다
        	 Constructor con=clName.getConstructor(); // 디폴트 생성자
        	 
        	 // 메모리할당
        	 Object oj=con.newInstance();
        	 
        	 // Method 읽기
        	 Method m=clName.getMethod("info"); // 메소드 정보
        	 m.invoke(oj); // 실제 메소드 호출
         }
         catch (Exception ex) {}
	}

}
