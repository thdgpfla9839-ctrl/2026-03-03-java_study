package com.sist.lang;
/*
 * 복제 : clone()
 * 
 * 얉은 복사 : Call By Reference
 *           같은 메모리 주소를 사용
 *           별칭을 얻어서 양쪽이 바뀐다
 *           
 *           ex)
 *           class A
 *           A a=new A()
 *           A b=a;
 *           => 매개변수
 *           
 * 깊은 복사 : 새로운 메모리를 생성
 *           복사받은 애가 다른 메모리 영역이 되는 것
 */

class Member implements Cloneable
{
	String name="나";
	public void display()
	{
		System.out.println("이름 : "+name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
class CallByREference
{
	public void Change(Member m) // m=m1
	{
		m.name="유";
	}
}
public class Object_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
                   // 객체 생성
//		Member m1=new Member();
//		m1.display();
//		
//		//객체 주소를 복사
//		Member m2=m1; // 별칭 부여
//		// 매개변수에 주소를 넘겨주는 방식
//		// 주소가 같은 경우에는 m1,m2는 같은 메모리 주소 제어
//		
//		m2.name="너";
//		m2.display();
//		System.out.println("m1="+m1);
//		System.out.println("m2="+m2); // 얕은 복사
//		
//		
//		CallByREference c = new CallByREference();
//		c.Change(m1);
//		m1.display();
		
		
		Member m1=new Member();
		m1.name = "jane"; // 클론하기 전에 바꿔놓은 걸 그대로 카피 떠온다
		Member m2=(Member)m1.clone();
		System.out.println("m1 = "+m1);
		System.out.println("m2 = "+m2); // 주소가 달라짐, 새로운 메모리 생성
		
		System.out.println("m1.name = "+m1.name);
		System.out.println("m2.name = "+m2.name); // 메모리 자체를 통으로 카피

		// git clone
		/* :
		 * 기존에 있는 모든 데이터를 복사해서 새로운 메모리에 저장
		 */
	}

}
