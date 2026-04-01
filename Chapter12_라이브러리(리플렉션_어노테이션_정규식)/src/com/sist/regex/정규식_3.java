package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * 1번이상 반복 : +
 */
public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.out.println("hllo".matches(""));
             System.out.println("hllo".matches("he+llo")); // he+llo : e가 한번이상 반복을 하냐
           
             try
             {
            	 Document doc =Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get();
            	 Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+"); // 한글외에 단어가 여러개 있다
            	 Matcher m=p.matcher(doc.toString()); //doc안에 /watch?v=[가-힣]+ 이 패턴이 있냐
            	 while(m.find()) // 그 패턴을 찾았냐
            	 {
            		 String s=m.group();
            		 s=s.substring(s.indexOf("=")+1,s.indexOf("\""));// 맨뒤에 "가 끝날때까지 문장 불러와라
            		 System.out.println(s);
            	 }
            	 
             }
             catch (Exception ex) {}
             
	}

}
