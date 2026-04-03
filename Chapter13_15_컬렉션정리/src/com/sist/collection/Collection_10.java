package com.sist.collection;

/*
 * Map
 *    = Iterator : 단방향
 *    =ListIterator : 양방향
 * 
 *    => for-each 대신 사용
 * -----------------------------------------
 * 메소드 정리
 * 1. 데이터 추가 / 수정
 *    : put(키, 값) => 같은 키가 있는 경우에는 수정이 된다
 * 2. 값 읽기
 *    : get(키) => 키에 해당되는 값을 가져온다
 * 3. 삭제
 *    : remove(키) => Set:remove(실제 데이터)
 *                   *List:remove(int index)      
 * 4. 키 존재 확인
 *    : boolean containsKey(키) =>if에서 사용
 * 5. 값 존재 확인    
 *    : boolean containsValue(값)
 * 6. 전체 삭제
 *    : clear()
 * 7. 키 전체 가져오기
 *    : keySet() => 반복문
 * 8. 값 전체 가져오기
 *    : values()
 *    9. 키와 값 동시에 가져오기
 *    entrySet()                    
 */
import java.util.*;

public class Collection_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		// key: String
		// value : Integer
		
        //1. 값 주입 -> put(key,value)
		map.put("사과", 100);
		map.put("바나나", 200);
		map.put("복숭아", 300);
		
		//2. 값 읽기 -> get(key)
		System.out.println("사과 개수는? "+map.get("사과"));
		System.out.println("바나나 개수는? "+map.get("바나나"));
		System.out.println("복숭아 개수는? "+map.get("복숭아"));
		// 저장을 하고 키를 이용해 값을 가져오는 방식이다
		
		// 3. 전체 출력
		System.out.println("전체 데이터: "+map);
		
		//4. 키 존재여부 확인 contains(키) 여기에는 불린콘테인스
		if(map.containsKey("바나나"))
		{
			System.out.println("바나나가 O");
		}
		// 5. 값 수정 -> 키는 중복할 수 없다, 키가 중복되면 덮어써진다
		map.put("사과", 10000);
		System.out.println("전체 데이터: "+map); // Set이나 Map은 출력시 값의 순서가 없어서 매번 순서 바뀜/ List만 순서 있음
		
		// 6. 삭제
		map.remove("복숭아");
		System.out.println("전체 데이터: "+map);
		
		// 만약에 반복문을 사용해서 데이터 출력
		// 출력을 하려면 키가 있어야 하는데,,, 키가 없잖아 반복문은 
		// keySet()을 이용해서 값 불러오기
		for(String key:map.keySet()) // 키(=데이터) 불러온다
		{
			System.out.println(key+":"+map.get(key));
		}
		
//		8. 값 전체 읽기
		for(int i:map.values())
		{
			System.out.println(i);
		}
		
		// 9. 키와 값 동시에 가져오기
		for(Map.Entry<String, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		// HashMap : 가장 많이 사용
		/*키 : 중복 노우
		 * 값 : 중복 가능
		 * 순서는 없다 -> List ,LinkedHashMap 얘네는 순서 있다
		 * 
		 */
	}

}
