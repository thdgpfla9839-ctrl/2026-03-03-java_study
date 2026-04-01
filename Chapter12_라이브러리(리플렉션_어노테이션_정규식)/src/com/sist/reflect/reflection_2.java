package com.sist.reflect;

import java.lang.reflect.Field;

/*
 * 자바의 시점 : 컴파일 시점(javac)
 *            실행 시점(java)
 *            리플렉션 실행시점에 클래스의 모든 정보를 읽어서 조작이 가능
 *------------------------------------------------------------
 *리플렉션 : Spring / MyBatis / Hibernate
 *         -> 동적 객체 생성 / 어노테이션 처리
 *            메소드를 자동 호출하게 만드는 것을 함
 *            
 *            
 * 1. 주요 클래스와 메소드 :
 *                     1) Class : 클래스 자체 저장
 *                     2) 변수 : Field
 *                     3) 메소드 : Method
 *                     4) 생성자 : constructor
 * 2. Class 객체 얻기 :
 *                   1) Class cls = String.class
 *                   2) String str=""
 *                      Class cls=str.getClass()
 *                   3) Class cls=Class.forName("java.lang.String")
 * 3. 장점 :
 *         1) 프레임워크 개발시 사용
 *         2) 코드 재사용 / 유연성 굿
 *            -> 수시로 수정, 추가, 삭제 가능해
 * 4. 단점 :
 *         1) 직접 호출하는 것 보다 속도가 늦다
 *            -> 성능저하
 *         2) 보안 문제가 있음
 *            -> private에 접근이 가능함
 *         3) 코드 가독성이 떨어짐
 *            -> 자동으로 호출되기 때문에 언제 어떻게 호출하는지 공략순서를 몰라                                                    
 *               
 *        
 * 
 */
class Student
{
	private String name="나";
}
public class reflection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			Student std=new Student();
			Class cls=std.getClass();
			Field f=cls.getDeclaredField("name");
			f.setAccessible(true);// 프라이빗 변수에 접근이 가능하게 해준다
			System.out.println(f.get(std)); //std라는 변수값을 읽어서 출력
			f.set(std, "너너너"); // 변수 변경
			System.out.println(f.get(std));
					
		}
		catch(Exception ex) {}
	}

}
