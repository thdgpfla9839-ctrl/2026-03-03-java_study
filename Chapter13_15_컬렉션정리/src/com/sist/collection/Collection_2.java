package com.sist.collection;
/*
 * 제네릭(챕터13)
 * 목적 : 코드 재사용, 타입의 안정성을 위한 도구
 * 방법 : 클래스 <클래스 타입> 안에는 클래스 타입만
 * 
 * 1. 제네릭을 사용하는 이유
 *  예)
 *  ArratList list =new ArrayList();
 *  -> 어레이 리스트 안에는 현재 모든 데이터가 저장가능 , 오프젝트인 상태
 *  
 *  list.add("자바");
 *  list.add(10);
 *  
 *  => String str = list.get(0); -> 오류나 겟이라는 메소드가 우리가 지정하는 이상은 괄호안에 인덱스가 들어가는 건 맞는데 오브젝트 겟 이러면 안 되고 (String)list.get(0);이렇게
 *  => int a = list.get(1); -> (Integer)list.get(1); 오브젝트를 쓰려면 ㄱㅖ속 형변환을 해줘야해
 *     어떤 데이터타입이 첨부됐는디 알 수없고
 *     데이터 읽기마다 형변환이 필요해
 *     그리고 잘못하면 ClassCastException 형변환이 잘못되면 나타나는 오류가 발생
 *     
 * 2. 프로그램에서는 데이터타입(데이터형)을 반드시 고정해야함 
 *    고정하는 것은 프로그램 언어에서는 가능한데, 자바스크립트에서는 안 된대
 *    
 * 3. 블필요한 형변환은 가급적이면 하지마
 * 
 *       2.3.의 역할을 수행하는게 제네릭이다
 *       
 * => 총정리 : 제네릭의 핵심은 데이터형이 고정돼, 데이터를 한가지만 설정이 가능해 => 가독성이 굿
 *           형변환을 안 하기 떄문에 컴파일시에 오류가 방지돼 
 *           형변환 없이 사용하니 소스가 간결해져
 *           
 *--------------------------------------------------------------------------
 *Class Box<T>
 *{
 *    T t;
 *    public void setT(T t)
 *    {
 *       this.t=t;
 *    } 
 *    public T getT()
 *    {
 *      return t;
 *    }
 *}   
 *
 *        
 *        Box box = new Box(); => T : Object 
 *        Box <String> box =new Box <String> (); T: String
 *        => 클래스에 있는 데이터를 한번 통일화
 *        
 * -----------------------------------------------------------
 * class pair<K,V>
 * {
 *     K key; -> 오브젝트
 *     V value; -> 오브젝트
 * }                
 * 
 * pair<String, Integer> p =new Pair<>();
 * 먼저 만들어 놓고 나중에 데이터형을 변경해서 사용
 * 
 * ------------------------------------------------------------
 * 제한된 제네릭 사용
 * 
 * class Box <T extends Number> -> 숫자만 사용해라 여기서 extends는 제한의 의미
 * {
 *    T value;
 * }
 * Box <Integer>
 * Box <Double>
 * Box <Float> .... 이렇게만 가능
 * Box <String> -> 이건 오류나지
 * --------------------------------------------------------------------
 * 데이터형을 모르는 경우 : 와일드 카드를 사용하자 => ?
 * ArrayList<?> -> 경고가 없다 
 * ArrayList -> 제네릭을 사용하지 않아서 경고받음
 * 와일드카드는 읽기 전용이라 add가 안 들어간다 -> get( ) 데이터를 받아올때는 겟만 사용이 가능
 * 
 * ----------------------------------------------------------------------------
   1) extends 제한된 제네릭  -> 꺼내기 전용
   2) ?   제네릭 -> 타입을 모르는 경우 오직 읽기만
     
 * 
 */
import java.util.*;
public class Collection_2 {
public static void print(List<?> list)
{
	for(Object ob:list)
	{
		System.out.println(ob);
	}
}
    public static double sum(List<? extends Number>list)
    {
    	// 숫자만 가능헤짐(인티져,더블,플롯,롱,바이트만 가능 애네는 number한테 상속받은 애들)
    	double total =0;
    	for(Number n:list)
    	{
    		total+=n.doubleValue();
    		
    	}
    	return total;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   ArrayList list =new ArrayList(); -> 제네릭을 사용하지 않아서 경고뜸
//     ArrayList<?> list =new ArrayList<>(); -> 경고 안나지 :와일드카드
		
          print(List.of("a","c","e"));
          print(List.of(1,2,3));
          //와일드카드는 어떤 데이터형이든 관계없고 읽기만 가능하기 때문에 주로 출력용으로 많이 쓴다
          // 또한 add는 불가능하다 추가 못해요
          // of를 이용하면 됨 add와 같은 효과
         System.out.println(sum(List.of(10,20,30)));
          System.out.println(sum(List.of(10.6,20.5,30.9)));
          
          
          /*
           * 출력을 할 때 : <?>
           * 계산 시 : extends  // 람다(스트림)에서 또 나옴
           * 추가 : super
           */
          
	}

}
