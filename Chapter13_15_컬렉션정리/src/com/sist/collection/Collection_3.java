package com.sist.collection;

/*                        오라클 명령어
 * retainAll : 교집합 -->   INTERSECT
 * addAll() : 전체집합 -->   UNION ALL
 * removeAll() : 차집합 -->  MINUS
 * 
 * 지니뮤직 - 멜론
 *        |
 *        같은곡 50곡
 *        |
 *        크롤링
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Collection_3 {
	public List<String> genineData() {
		List<String> list = new ArrayList<String>();
		try {
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// 곡명
			Elements title = doc.select("table.list-wrap a.title");
			for (int i = 0; i < title.size(); i++) {
				list.add(title.get(i).text());
			}
		} catch (Exception ex) {
		}
		return list;
	}

	public List<String> melonData() {
		List<String> list = new ArrayList<String>();
		/*
		 * <div class="wrap_song_info">
		  <div class="ellipsis rank01"><span>									
		  <a href="javascript:melon.play.playSong('1000002721',601555642);" title="SWIM 재생">SWIM</a>
		 */
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// 곡명
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for (int i = 0; i < title.size(); i++) {
				list.add(title.get(i).text());
			}
		} catch (Exception ex) {
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Collection_3 co= new Collection_3();
    List<String> genie=co.genineData();
    System.out.println("지니");
    
    for(int i=0;i<genie.size();i++)
    {
    	System.out.println((i+1)+"."+genie.get(i));
    }
    List<String> melon=co.melonData();
    		System.out.println("멜론");
    		
    		for(int i=0;i<melon.size();i++)
    		{
    			System.out.println((i+1)+"."+melon.get(i));
    		}
    		
//    		// 지니에만 있는 노래
//    		System.out.println("지니에만");
////    		genie.removeAll(melon);
//    		//ex) removeAll() 했을 시[1,2,3,4,5] - [1,2,3,6,7] -> 4,5
//    		for(int i=0;i<genie.size();i++)
//    	    {
//    	    	System.out.println((i+1)+"."+genie.get(i));
//    	    }
//    		
//    		System.out.println();
////    		// 멜로에만
//    		System.out.println("멜론에만");
//    		melon.removeAll(genie); // 이때는 지니쪽 같은 줄 주석 , 지니의 전체 곡에서 비교하고 가져와야하는데 위에 줄을 안 지우면 12곡인가 거기서만 비교되서 오류나 
//    		for(int i=0;i<melon.size();i++)
//    		{
//    			System.out.println((i+1)+"."+melon.get(i));
//    		}
    		
//    		System.out.println();
//    		// 공통으로 가지고 있는 곡명
//    		System.out.println("공통으로");
//    		genie.retainAll(melon); // 같은 곡 추출해라 -> 지니에 저장된 데이터가 변경됨
//    		System.out.println("공통부분 몇개: "+genie.size());
//    		for(int i=0;i<genie.size();i++)
//    	    {
//    	    	System.out.println((i+1)+"."+genie.get(i));
//    	    }
    	
//    		System.out.println();
    		// 지니뮤직과 멜론 합체 -> 중복제거 안 한 상태
    		List<String> list = new ArrayList<String>();
    		list.addAll(genie); // addAll 값 합침
    		list.addAll(melon);
    		for(int i=0;i<list.size();i++)
    		{
    			System.out.println((i+1)+"."+list.get(i));
    		}
    		
    		System.out.println();
    		// 전체에서 중복된 곡 제거 -> Set
    		System.out.println("멜론과 지니의 중복 곡 제거");
    		Set<String> set=new HashSet<String>();
    		set.addAll(genie);
    		set.addAll(melon);
    		
    		int k=1;
    		for(String s:set) // 인덱스 번호가 없어
    		{
    			System.out.println(k+"."+s);
    		}
  }
	
}


