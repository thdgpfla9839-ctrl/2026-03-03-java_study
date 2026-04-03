package com.sist.collection;
/*
 * 객체단위 저장 시 중복을 제거할 수 있는지
 */
import java.util.*;
class Student
{
	private String name;
	private int age;
	
	// 프라이빗이라 게터/세터 줌
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	// 변수의 초기값을 다르게 설정할 시는 매개변수가 있는 생성자를 이용한다(우클릭 - 소스 - 유징필드)
	// 명시적 초기화 , 초기화 블록이 있으면 모든 객체가 동일한 값
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	//해쉬코드는 객체식별자 -> 동일하게 제작
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
	@Override
	//equals는 메모리 주소를 비교해준다
	//equals를 변수값으로 비교하도록 변형함
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		//instanceof : 객체 비교할 때 사용함
		// 매개변수로 들어온 객체가 Student의 객체냐라고 물어본거야
		if(obj instanceof Student)
		{
			Student s=(Student)obj;
			return name.equals(s.name) && age == s.age;
		}
		return false;
	}
	
	
	
}
public class Collection_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s1 = new Student("홍", 20);
     Student s2 = new Student("홍", 20);
     
    
     System.out.println("s1="+s1);
     System.out.println("s2="+s2);
     
     // equals는 값 비교
     // ==는 메모리 주소로 비교
     if(s1.equals(s2))
     {
    	 System.out.println("같은 객체");
     }
     else
     {
    	 System.out.println("다른 객체");
     }
     
     System.out.println("s1="+s1.hashCode());
     System.out.println("s2="+s2.hashCode());
     
     
     // Set에 저장
     Set<Student> set=new  HashSet<Student>();
     set.add(s1);
     set.add(s2);
     // 데이터 무결성
     // 이상현상 : 수정이나 삭제를 했을 시 원하지 않은 데이터가 문제가 생기는 현상
  
     
     for(Student ss:set)
     {
    	 System.out.println(ss.getName()+" "+ss.getAge());
     }
	}

}
