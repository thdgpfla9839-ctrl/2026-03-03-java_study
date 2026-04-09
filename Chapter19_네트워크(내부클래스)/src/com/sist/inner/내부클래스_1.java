package com.sist.inner;
/*
 * 내부클래스 -> 윈도우창, 빅데이터, Spring AI에서 많이 사용
 * 내부 클래스의 종류와 형식
 * 
 * 종류) 멤버클래스 : 공통으로 사용되는 변수나 메소드가 있는 경우에 사용
 *                형식)
 *                class A
 *                {
 *                   A,B,C
 *                  class B
 *                  {
 *                     A,B,C
 *                  }
 *                } 
 *                주로 네트워크 서버, 쓰레드를 만들때 사용
 *                class Server
 *                {
 *                   -> 사용자 정보 저장하는 위치 : 사용자 정보 공유함 / 공유하기 때문에 이너클래스를 사용해야함 하기 싫으면 static 쓰면 이너클래스 안 써도 됨
 *                   class 통신
 *                   {
 *                      
 *                   }
 *                }
 *                
 *                class MyWIndow
 *                {
 *                  -> 버튼,,,
 *                class Thread
 *                {
 *                  버튼 어떻게 동작할지,,,,,
 *                }
 *                }
 *---------------------------------------------------------------------                
 *      익명클래스 : 상속이 없는 상태, extends를 사용하지 않고 오버라이딩을 하는 경우
 *                윈도우에서 버튼을 클릭하고 싶을 때 -> 버튼 extends Jrame 이미 버튼 상속받았어, 또 상속 못해
 *                
 *                class A
 *                {
 *                B b= new B()
 *                {
 *                   void disp()
 *                }
 *                }
 *                class B
 *                {
 *                   void disp() {}
 *                }
 *                
 *                
 *----------------------------------------------------------------------      
 *      지역클래스 : 메소드 안에 클래스 정의 -> 사용빈도 거의 X
 *                class A
 *                {
 *                 public void disp()
 *                 {
 *                   class B
 *                   {
 *                    
 *                   }
 *                 }
 *                }
 *                
 *-----------------------------------------------------------------------    
 * => 멤버클래스나 익명의 클래스는 윈도우 개발이나 AI에서 사용한다
 *    Ai에서 데이터 수집을 하고 분석하고 예측하고 학습하는 이 과정을 메소드가 아닌 클래스로 한번에 돌려야 하기 때문에 클래스 하나에 이너클래스 여러개 넣어서 만든다
 *    
 *      class A
 *      {
 *      class B
 *      class C
 *      class D
 *      }
 *       -> 여러개 사용가능한 이너클래스
 */
class Outer
{
	private String name ="하늘";
	class Inner
	{
		int a=10;
		public void print()
		{
			Outer out = new Outer();
			System.out.println("Inner:Call....:name=");
		}
	}
	public void dis()
	{
		Inner in= new Inner();
		in.print();
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}	
	
}
//class Inner
//{
//	int a=10;
//	public void print()
//	{
//		Outer out = new Outer();
//		System.out.println("Inner:Call....:name="+out.getName());
//	}
//}

// static
class Outer2{
	  static class Inner
	  {
		  public void print()
		  {
			  System.out.println("Inner : print() Call...");
		  }
	  }
	  public void dis()
	  {
		  Inner in = new Inner();
		  in.print();
	  }
}

// 익명 클래스 -> 한번만 쓰고 버린다, 재사용이 불가능
class Outer3{
	Inner in = new Inner() {
		 public void print()
		 {
			 System.out.println("Outer3에서 Inner : print() 오버라이딩...");
		 }
	};
}
class Inner
{
	 public void print()
	 {
		 System.out.println("Inner : print() Call...");
	 }
}
// 지역클래스
class Outer4{
	public void print()
	{
		class Innner
		{
			public void print()
			{
				System.out.println("지역클래스 : Inner.print() Call");
			}
		}
		Innner i = new Innner();
		i.print();
	}
}
public class 내부클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//            Inner in = new Inner();
//            in.print();
		System.out.println("=========멤버클래스=============");
		Outer p = new Outer();
//		Outer.Inner c = p.new Inner();
//		c.print();
		p.dis();
		System.out.println("==========static클래스================");
		Outer2.Inner c1 = new Outer2.Inner();
		c1.print();
		System.out.println("================지역클래스==================");
		Outer4 c2 = new Outer4();
		c2.print(); // 클래스 캡슐화
		System.out.println("=============익명클래스========================");
		Inner i1 = new Inner();
		i1.print(); // 본인 익명클래스 출력
		Outer3 i2= new Outer3();
		i2.in.print(); // 익명클래스 내부클래스 출력
	}

}
