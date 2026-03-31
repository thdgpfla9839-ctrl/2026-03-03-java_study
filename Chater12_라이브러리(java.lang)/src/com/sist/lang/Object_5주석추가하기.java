package com.sist.lang;
// p.498~503
import java.util.Objects;

/*
 * equals : 객체 비교 
 * hashCode : 객체 식별자
 * 
 * 필기 중 파이널라이즈는 잘 몰라도 됨 
 */
// equals : 객체 비교
class Human
{
	String  id,name;
	public Human(String id, String name)
	{
		this.id=id;
		this.name=name;
	}
	/*
	 * 문자열-> String은 Object의 equals를 재정의
	 * 값만 비교 -> 재정의(오버라이딩)
	 * => 재정의 해서 사용
	 */
	 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name); // 메모리 주소가 동일
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Human h=(Human)obj;
		
		return name.equals(h.name) && id.equals(h.id);
	}
	
}
public class Object_5주석추가하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Human h1=new Human("hinfd", "홍");
             Human h2=new Human("gkkjs", "린");
             
             //  오브젝트에서의 equals는 값을 비교한게 아니라 주소값을 비교한 것
             System.out.println("h1 ="+h1);
             System.out.println("h2 ="+h2);
             
             
             System.out.println("h1 ="+h1.hashCode());
             System.out.println("h2 ="+h2.hashCode());
             
             if(h1.equals(h2))
             {
            	 System.out.println("같은 사람");
            	
             }
             else
             {
            	 System.out.println("다른 사람");
             }
	}

}
