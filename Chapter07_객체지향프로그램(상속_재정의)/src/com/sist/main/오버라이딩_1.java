package com.sist.main;
/*
 * 객체가 생성이 되면 객채에는 사용할 메모리 주소가 설정이 된다
 * 이 객체는 자신의 메모리 주소만 접근이 가능
 * 공통으로 사용할 수 있는 메모리가 필요 -> static
 * 다른 메모리에 접근 시에는 메소드를 이용한다 -> but 어려웅 그래서 상속을 사용해요
 * 
 * 객체. -> .은 메모리 주소 접근 연산자
 * 
 * 액터(ACtor): 동작하는 
 *    예) 자판기 = 사람
 * 
 */

class Parent
{
	int a=10;
	public void display()
	{
		System.out.println("Parent : display() Call");
	}
}

class Child extends Parent
{
	int a=100;
	public void display()
	{
		System.out.println("Child : display() Call");
	}
	
}

public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Parent p=new Parent();
         System.out.println("p.a="+p.a);
         p.display();
         
         Child c=new Child();
         System.out.println("c.a="+c.a);
         c.display();
         
         Parent pp=new Child(); // 변수는 패런츠, 메소드는 차일드로 섞었다
         
         System.out.println("pp.a="+pp.a); // parent 따라간다
         
         pp.display(); // 메소드는 차일드의 메소드를 갖고온다
        // 변수는 클래스가 갖고 있는 거(클래스에 존재하는 변수)
        // 메소드는 생성자를 따라간다
        // 상속의 기본목적 : 객체 한개를 생성해서 여러개의 클래스를 모아서 관리해주는 역할을 한다
         // 모든 클래스를 하나의 객체로 모아서 관리해줄 때는 Object 이용
	}

}
