package com.sist.collection;

import java.util.*;

public class Collection_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
//		set.add("apple");
//		set.add("banana");
//		set.add("peach");
//		System.out.println(set.ceiling("blue")); // 블루의 b로 비교된다 알파벳 순서로 비교함
//		System.out.println(set.floor("blue"));
		
		set.add("가나다");
		set.add("송혜림");
		set.add("김가윤");
		set.add("송경춘");
		set.add("뚱이");
		set.add("이산");
		
		for(String name : set)
		{
			System.out.println(name);
		}
		System.out.println("========================");
		System.out.println(set.ceiling("스폰지밥")); // 한글은 가나다 순으로 값을 비교
		//AI에서 근사치 값 찾을 떄 이런식으로 찾는다
		System.out.println("둘리");

	}

}
