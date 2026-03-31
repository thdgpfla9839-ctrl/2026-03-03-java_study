package com.sist.lang;
/*
 * Math 클래스
 * : 수학 연산과 관련된 클래스
 * 
 * ceil () : 올림함수 -> 총페이지 구할 때 사용
 * random() : 더븛형 리턴을 할 때 double -> 0.0 ~ 0.99
 * round() : 반올림할 때 
 * 
 * -> 오라클에도 존재한대요
 * 
 * Math 클래스는 only static이다
 * 
 * 라이브러리 공부는 메소드(기능)를 공부하는 것 -> 원형과 예외처리, 리턴형 메소드명(매개변수)를  공부
 * ex)
 * double random() -> Math.random()
 * 
 * 
 */
public class Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  String [] names = {
                		  "skgkk","kshlkh","사노냐ㅜㄴ쟈","넣ㅅㅈ햐",
                		  "뉴ㅏㅠ나ㅓ","너놔ㅗㅠ너ㅠㅣㄹ","노ㅓ튜ㅓㅜ넘","투퓨푸ㅝ",
                		  "너라뉴하ㅓㄹㅈ3","178365ㅓㅗㄹ","2364녛ㄴ","1246983"
                  };
                  
                  // 5개씩 나눠서 출력 -> 총페이지
                  System.out.println((int)Math.ceil(names.length/5.0));
                  // 원형 : double ceil(double a) -> 리턴형은 더블이다
                  
                  
                  int rand=(int)(Math.random()*100); // 0~99
                  System.out.println(rand);
                  
                  double d = Math.round(10.5); // 반올림
                  System.out.println(d);
                  
	}

}
