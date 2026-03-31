package com.sist.lang;
/*
 * toString() : 객체를 문자열화 시키는 경우 사용 
 *              오버라이딩 시 가장 많이 사용되는 클래스
 *              변수 값 출력시 사용
 *              toString은 생략이 가능함
 *              
 *              
 * 형변환
 * 
 *              class A
 *              {
 *              
 *                 O  X
 *              }
 *              class B extends A
 *              {
 *                    O  X -> 눈에 보이지 않지만 있음
 *                    P  H  K
 *              }
 *              
 *          A a =new A();  -> O X  
 *              -> A가 가지고 있는 메소드
 *          B b =new B();  -> O X P H K
 *             -> B가 가지고 있는 메소드
 *          A c =new B();  -> O X
 *            -> B가 가지고 있는 메소드
 *          
 *          
 *    -> 메소드는 생성자   
 *       상속을 내리는 클래스는 상속받은 클래스를 제어할 수 없다  
 */
class Student
{
	private String name="나";
	private String sex ="남자";
	private int age=20;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String info="이름: "+name
				    +"\n성별: "+sex
				    +"\n나이: "+age;
		return info;
	}
	
	
}
public class Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
          Student std=new Student(); 
           // 주소 -> new 생성시 생성자에 생성된 메모리에 인스턴스 변수값 주입을 생성자가 하는 일
           
          // 객체 주소 확인
            System.out.println("std 주소 :"+std);
            System.out.println("std 주소 :"+std.toString());
    
	}

}
