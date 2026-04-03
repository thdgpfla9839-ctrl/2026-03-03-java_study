package com.sist.collection;

/*
 * 실제사용
 * 웹채팅이나 장바구니를 저장 시에는 Set을 쓴다
 * 네트워크 -> 벡터 -> 셋
 */
import java.util.*;

public class Collection_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "12", "34", "56", "78", "90", "44", "55", "66", "77", "44", "22" };
		// 이 데이터를 제어하려면 ArrayList를 쓰자

		List<String> list = Arrays.asList(names);
		System.out.println("------------전체사원 목록---------------");
		for (String name : list) {
			System.out.println(name); // 여기는 인덱스가 있어서 순서가 있다, list는 제어가 가능
		}

		// 중복 제거해보자
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		System.out.println("-----------중복제거-------------");

		for (String name : set)
		{
			System.out.println(name); // Set은 순서가 없어서 출력할 떄마다 순서가 매번 뒤바꾼다
		}

		System.out.println("------중복 제거 후 리스트로 전송-------------");
		List<String> list2 = new ArrayList<String>();
		list2.addAll(set);
		for (String name : list2) 
		{
			System.out.println(name);
		}
	}

}
