package com.sist.regex;
// 0개 이상 반복 : *을 이용한다
public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("hello".matches("h*llo")); // h*llo : h가 여러번 반복한다는 의미
           System.out.println("hello".matches("h*.llo")); // h*.llo :h가 여러번 반복할 수 있고 h와l 사이에 한글자가 껴있다
           System.out.println("ho".matches("h.*o")); // h.*o : 임의의 한글자가 있을 수도 있고 없을 수도 있다
           
           System.out.println("hheeeeeee".matches("h*e*"));// h*e* :h가 반복할 수도 있고 아닐수도,e도 마찬가지
           System.out.println("hhsljghlshlka".matches("h*.*"));
           System.out.println("hello".matches(".*")); // 적어도 시작과 끝나는 문자는 알고 있어야 찾기 편하다
           System.out.println("".matches(".*")); // *0이상 반복이니 트루값
	}

}
