/* 공통으로 적용되는 메소드나 변수가 있다-> static 쓰면 어떨지 -> 두개를 동시에 쓰면 메모리 공간이 1개라 데이터가 통합될 거야 -> static 사용이 안 되겠넹 => "상속"을 쓰자
 * 
 * 상속
 * 코딩을 줄일 수 있어
 * 필요시 변경해서 사용이 가능해 이게 오버라이딩~~~
 * 추상클래스나 인터페이스 -> 상속과 오버라이딩의 개념이 있다 , 쟤네는 메모리에 저장 안 해
 * 
 */
package com.sist.manager;


public class GenieMusicManager {
  public static Music[] musics=new Music[100]; // 초기화 부분, 사용은 가능하지만 상속은 노
  
  // 상속의 예외조건으로 상속이 안 되니까 메소드로 어쩌고 해보려고
  public void init() // 크롤링 후 배열에 저장할 변수 (멜론으로 바꿀 때 이부분만 다름)
  {
	  
  }
  // 목록 출력 -> 윈도우에 보내는 출력이야
  public Music [] musicAllData()
  {
	  return musics;
  }
  
  // 상세보기
  public Music musicDetail(int mno)
  {
	  Music m= new Music();
	  for(Music mm:musics)
	  {
		  if(mm.getMno()==mno)
		  {
			 m=mm;
			 break;
		  }
	  }
	  return m;
  }
  
  // 검색하기
  
  public Music [] musicFind(String type,String fd)
  {
	  return musics;
  }
  
  // 동영상 재생
  public String musicKey(String title)
  {
	  String key="";
	  return key;
  }

}
