package com.sist.main;
/*
 *  p.286
 * 같은 파일에서 클래스 여러개를 만들 때 public class 한번만 사용한다
 * 부모영역 제어가 super
 * 자식영역 제어가 this
 * 
 *--------------------------------------------------------
 *생성자의 매개변수 여부 체크
 * class A
 * class B extends A
 * 
 * A a =new A()-> 이건 안써
 * B b=new B()
 * A c=new B() -> 변수관리/ 메소드관리
 * 
 */

class Saram
{
	String name; // super영역
	String sex;
	static int age;
	public Saram(String name, String sex) // 6~10에서 초기화 가능
	{
		this.name=name;
		this.sex=sex;
		age=20; 
	}  // 매개변수가 있는 생성자 영역 부분
	  // 인스턴스, static은 생성자 영역에서 초기화 가능 
}

class Member extends Saram {
	// 매개변수가 있는 생성자는 호출을 못해
	/*
	 * 생성자 => default 생성자는 자동호출
	 * 매개변수가 있는 경우에는 super()
	 */
	
	String name,sex; // 를 입력하면 길동, 남자가 출력되게 만듦
	public Member(String name, String sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
		this.name="name"; // 송혜림
		this.sex="sex";   // 여자로 입력하면 이대로 출력됨        
	} //여기서도 초기화 가능
	
	public void display()
	{
		System.out.println("이름 : "+name); // 송혜림을 출력하려면 super.을 붙이면 됨 p.291 읽어보면 슈퍼와 디스 구분이 이해하기 쉬울 같아
		System.out.println("성별 : "+sex);
		Member.age=25; // 변경이 가능, 상속은 예외/ 사용은 가능
		System.out.println("나이 : "+Member.age); 
	
	}
	
/*----------------------------------------------------------------------------
 * 
 *  상속 내리는 클래스면서 매개변수가 있는 생성자가 있는 경우
 *  : 상속받는 클래스에서 반드시 super(값)
 *  
 *  변수 상속시에는 super/ this 구분이 없다
 *   -> 구분은 상속받은 클래스에서 변수를 다시 설정한다
 *  
 * --------------------------------------------------------------------------
 */
	
}

public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Member m=new Member("길동", "남자");
           m.display();
	}

}
