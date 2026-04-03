package com.sist.collection;
/*
 *                            Map : 독립적이므로 호환이 안 돼
 *                             |  
 *                     ----------------
 *                     |               | 구현된 클래스
 *                HashMap             Hashtable -> 단점을 보완한게 HashMap
 *                 비동기                  동기
 *                     
 *                 -> 비동기가 동기 보다 속도가 빠르다, 잊어버릴 가능성 있지만 사용자가 뭘 잊어버린 지 몰라서 괜찮아
 *-----------------------------------------------------------------------------------------------
 *Map의 특징:
 *         1) 두개를 동시에 저장해야함(key, value)
 *          -> 키는 중복허용 불가능
 *             같은 키가 들어가면 덮어쓴다 
 *             value(=값) 자체는 중복 가능
 *         2) Spring이나 MyBatis, 웹 라이브러리에 응용해서 쓴다
 *            스프링 : 클래스 찾기 (id, 클래스 주소)를 저장
 *            마이바티스 : sql(id, "sql문장")을 저장
 *            
 *         3) 사용처 : 주로 클래스관리에 사용함
 *                   클래스관리: 메모리 할당 후 관리 -> 메모리를 어떻게 찾을건데
 *                   map.put("a", newA()) 이걸로 관리하라고
 *                   -> 한번만 메모리할당을 함 : 싱글턴 
 *                      메모리 주소 하나가지고 재사용하는 것      
 *                              
 *                 
 */
import java.util.*;
class AA
{
	public void dis()
	{
		System.out.println("AA:dis() Call");
	}
}
public class Collection_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String,AA> map = new HashMap<String,AA>();
       map.put("aa", new AA());
       
//       AA a=map.get("aa");// 객체생성
//       AA b=map.get("aa");// 객체생성
//       AA c=map.get("aa");// 객체생성
       // 출력하니 주소값 같아
       
       AA a=new AA();
       AA b=new AA();
       AA c=new AA();
       
       System.out.println("a="+a);
       System.out.println("b="+b);
       System.out.println("c="+c);
       
       
	}

}
