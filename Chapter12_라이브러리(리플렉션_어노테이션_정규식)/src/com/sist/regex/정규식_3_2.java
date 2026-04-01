package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * 1번이상 반복 : +
 * +나 * 자체를 확인하려면 \\+ \\*을 해주면 된다
 * +나 ?등 한개만 쓰면 기호로 쓴게 아니야 기호 자체로 보게하려면 \\를 붙여준다
 */
public class 정규식_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

             System.out.println("he".matches(".."));
             System.out.println("he".matches("h*.")); 
             System.out.println("he".matches("he*"));
             System.out.println("he".matches("h+e+*"));
 
	}

}
