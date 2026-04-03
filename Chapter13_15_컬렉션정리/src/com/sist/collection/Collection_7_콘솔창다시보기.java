package com.sist.collection;
/*
 * TreeSet: 검색 속도가 빠르다 -> 보통 코딩테스트에서 사용
 * -----------------------------------------------
 * tailSet() : 이상
 * headSet() : 이하
 */
import java.util.*;
public class Collection_7_콘솔창다시보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Set<Integer> set = new HashSet<Integer>();
            Random r=new Random();
            for(int i=0;i<10;i++)
            {
            	int k=r.nextInt(100)+1;// 원래 0~99까지  +1해서 1~100까지 난수저장
            	
            	set.add(k);// 오토박싱 Integer i =10
//            	System.out.println(k+" ");
            }
            System.out.println("실제 저장된 개수는: "+set.size());
            for(Integer i :set)
            {
            	System.out.print(i+" ");
            	
            }
            System.out.println();
            
            //TreeSet에 저장 -> 출력시 정렬됨
            TreeSet<Integer> set2 = new TreeSet<Integer>();
            set2.addAll(set2);
            
            for(Integer i :set2)
            {
            	System.out.print(i+" ");
            	
            }
            System.out.println();
            
            System.out.println("== 50 이상인 숫자 ==");
//            for(Integer i : set2)
//            {
//            	if(i>=50)
//            		System.out.print(i+" ");// 검색이 시작되는 부분
//            }
            System.out.println(set2.tailSet(50)); // 이러면 50이상인 거 들고온다 
            
            System.out.println("== 50 이하인 숫자 ==");
            System.out.println(set2.headSet(50));
            
            System.out.println("== 바로 위의 값 ==");
            System.out.println(set2.higher(30));
            
            System.out.println("== 같거나 큰 ==");
            System.out.println(set2.ceiling(50));
            
            System.out.println("== 바로 아래의 값 ==");
            System.out.println(set2.lower(50));
            
            System.out.println("== 같거나 작은 값 ==");
            System.out.println(set2.floor(30));
            
            System.out.println(set2.first());
            System.out.println(set2.last());
	}

}
