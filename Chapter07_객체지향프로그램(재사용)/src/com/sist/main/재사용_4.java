// 추가 메모수정하기 라인32 
package com.sist.main;
class Human
{
	String name;
	String sex;
	public Human() // 상속에서 제외
	{
		name="심청이";
		sex="여자";
		System.out.println("Human() Call");
	}
	
	
}

//class Student extends Human
//{
//	// name과 sex 상속받아서 내려온 상태
//	public Student(String name, String sex)
//	{
//		this.name=name;
//		this.sex=sex;
//	}
//	public void display()
//	{
//		System.out.println("이름 :"+name);
//		System.out.println("성별 :"+sex);
//		
//	}
//}
//  *상속내린 클래스 -> 메모리 할당
//  상속받은 클래스 -> 메모리 할당

class  Sawon extends Human
{
	 // name(심청이) 과 sex 내려옴
	
	String name,sex; // 변수의 오버라이딩 상속을 받았지만 따로 저장 / 이 문장 지우면 둘다 길동으로 출력됨
	public Sawon()
	{   
//		* super(); // 없으면 자동으로 호출 -> 생략이 안 되는 슈퍼의 경우도 있다
//                  return/ 생성자 / super()
//                  import java.lang
//                  extends Object 생략하면 자동으로 호출된다		
		
		
		System.out.println("Sawon() CAll");
		this.name="길동";
		this.sex="남자";
		
	}
	public void display()
	{
		System.out.println("이름 :"+super.name); 
		System.out.println("성별 :"+super.sex);
		System.out.println("이름 :"+this.name);
		System.out.println("성별 :"+this.sex);
	}
	
}
public class 재사용_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	//	Student std=new Student("홍길동", "성별");
//		std.display();
		Sawon s=new Sawon();
		s.display();
	}

}
