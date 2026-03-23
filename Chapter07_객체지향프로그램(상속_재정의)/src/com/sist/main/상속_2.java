package com.sist.main;
/*
 * 상속 : 다른 클래스의 변수나 메소드는 사용이 가능
 *        but  프로그램이 맞지 않다 -> 변경해서 사용하자(오버라이딩)
 *        
 * 오버라이딩 : 변경해서 덮어쓴다
 *  조건 1) 상속이 존재
 *  조건 2) 메소드명이 동일해야함
 *  조건 3) 매개변수 동일
 *  조건 4) 리턴형이 동일
 *  조건 5) 접근지정어 : 확대 O , 축소 X     
 *   
 *                       <------ 확대
 *         public > protected  >  default > private
 //                      -------> 축소
//   void aaa()
/*     |
 *  private void aaa()
 *     
 *     
 *  void aaa()
 *     |
 * protected void aaa()
 * public void aaa()
 * void aaa()  
 *--------------------------------------------------------------         
 */
class Animal
{
	 public void run() {
		  System.out.println("두발로 걷는다");
	 }
	 public void eat() {
		 System.out.println("수저로 먹는다");
	 }
	 
}

class Dog extends Animal 
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}

	@Override // 내용 변경해서 사용하는 것
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다");
	}
	
}

class Pig extends Animal
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}

	@Override // 우클릭-소스-오버라이드/임플리먼트-메소드 클릭
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("돼지가 먹는다");
	}
	
}

class Super
{
	 int a, b; // super
	 public void display()
	 {
		 System.out.println("a="+this.a);
		 System.out.println("b="+this.b); // 상속받지 않아서 상위클래스가 없기에 슈퍼 못쓴다
		 
	 }
}
class Sub extends Super
{
	int c;
	// 초기화
	int a,b; // this -> 변수 오버라이딩 => this와 super를 따로 제어할 때 쓴다
	public Sub()
	{
		super.a=100;
		super.b=200;
		
	}
	public void print()
	{
		super.display();
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
	
}

public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//                Dog dog=new Dog();
//                dog.run();
//                dog.eat();
//                
//                Pig pig=new Pig();
//                pig.run();
//                pig.eat();
     
		Sub sub=new Sub();
		sub.print();
	}

}

/*
 * ------------------------------------------------------------------------------------------   
 *                             오버로딩                             오버라이딩
 *       메소드명                 동일                                 동일
 *        상태                같은 클래스 내                       상속이 된 상태
 *        매개변수           개수, 데이터형 다르다                       " 동일 
 *        리턴형                 관계 X                                동일
 *        접근지정어              관계 X                       확대만 가능 / 동일 / 축소 X
 *         
 *      => 오버로딩 : 같은 메소드를 이용해서 새로운 기능을 생성
 *      => 오버라이딩 : 상속해서 받은 기능 변경하는 역할
 *      
 * * 상속 => 오버라이딩(변경해서 사용이 가능함)   
 * ----------------------------------------------------------------------------------------------
 * 
*/ 