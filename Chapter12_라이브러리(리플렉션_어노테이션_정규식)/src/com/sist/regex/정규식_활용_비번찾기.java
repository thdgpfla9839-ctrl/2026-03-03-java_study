package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 정규식_활용_비번찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "비번: 1234, 또 다른 비번 : 7894";
		String regex = "\\d+";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(msg);
		while(m.find())
		{
			System.out.println("비번 :"+m.group());
		}
	}

}
