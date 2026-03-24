package com.sist.main;
import java.util.*;
class AA
{
	 public void display()
	 {
		 System.out.println("AA:Display() Call");
	 }
}

class BB extends AA
{
	 public void display()
	 {
		 System.out.println("BB:Display() Call");
	 }
}

class CC extends AA
{
	 public void display()
	 {
		 System.out.println("CC:Display() Call");
	 }
}

class DD extends AA
{
	 public void display()
	 {
		 System.out.println("DD:Display() Call");
	 }
}

// 클래스 모아서 한번에 처리해주는 map
class Container
{
 // Map<Integer,AA>map new hashMap(); 이거 하면 형변환 안 해줘도 됨 이건 뒤에서 배울 내용
	Map map=new HashMap();
	public Container()
	{
		map.put(1, new AA());
		map.put(2, new BB());
		map.put(3, new CC());
		map.put(4, new DD());
		// 상속이 없는 경우에는 Object이용해라
	}
	public AA getBean(int key)
	{
		return (AA)map.get(key); // 형변환 시킴
	}
}

class EE
{
	public void display()
	{
		System.out.println("EE : display() Call");
	}
}

class MM extends EE
{
	public void display()
	{
		System.out.println("MM : display() Call");
	}
}

public class 다형성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan = new Scanner(System.in);
     System.out.println("메뉴를 입력(1,2,3,4):");
     int menu=scan.nextInt();
     
//     Container c= new Container(); // 모아서 한번에 처리해서 출력
//     AA aa=c.getBean(menu); 
//     aa.display(); 
     
//     if(menu==1)
//     {
//    	 AA aa=new AA();
//    	 aa.display();
//     }
//     else if(menu==2)
//     {
//    	 BB bb=new BB();
//    	 bb.display();
//     }
//     else if(menu==3)
//     {
//    	 CC cc=new CC();
//    	 cc.display();
//     }
//     else if(menu==4)
//     {
//    	 DD dd=new DD();
//    	 dd.display();
//     }
     
     
     // EE > MM
     MM mm=new MM();
     mm.display(); // 확장된 클래스
     
     EE ee=new EE(); // 자동형변환
     ee.display();
     
     EE ee1=new MM();
     ee1.display();
//     
//     MM mm1=new EE(); // 큰데이터가 작은데이터 안에 들어가서 오류남
       MM mm1=(MM)ee1; // 강제형변환을 해주면 된다
       mm1.display();  
	}

}
