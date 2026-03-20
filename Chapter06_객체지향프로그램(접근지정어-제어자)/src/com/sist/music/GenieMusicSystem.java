/*
 * 클래스는 선언만 가능, 파일 읽기/ 크롤링
 * -> 초기화 블록, 인스턴스 초기화, static 블록
 * 
 * 매소드 : 사용자가 데이터를 사용할 수 있게 기능을 부여
 *        모든 메소드는 public => 다른 클래스와 연결(상호작용)을 헤야하기 때문에
 *        
 * 
 */

package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 * 
 *  1. 패키지 만들기 : 보관
 *                 관련된 클래스끼리 어떻게 모을지
 *                 패키지 = 폴더
 *                 com(org).업체명.요약 -> 한글이나 키워드 X
 *                 ex) com.sist.server
 *                 *라이브러리
 *                 java.util -> 사용이 많은 클래스 모음
 *                 java.io -> 입출력 관련
 *                 java.net -> 네트워크 관련
 *                 java.awt -> 윈도우 관련 // ->jdx1.0
 *     => 찾기(유지/보수)가 쉬움
 *                 
 *  2. 패키지에 있는 클래스 가지기고 오기 : 다른 패키지에 있는 클래스는 인식을 못한다
 *                                 import 패키지.* : 패키지 안에 있는 모든 클래스 불러오기 
 *                                 => 패키지에 있는 클래스를 여러개 사용할 떄 쓴다
 *                                 import 패기지.클래스명 : 지정된 클래스 1개 가져오기
 *  3. 접근지정어 :
 *   1) private :데이터 보호 목적 (은닉화)
 *                  -> 변수 (노출 안 되는 데이터가 있는 경우)
 *                  -> 자신의 클래스에서만 사용이 가능
 *                  -> 제한 허용하는 경우 getter/setter -> 이걸 가능하게 하는 코딩이 캡슐화 
 *   2)default :같은 패키지까지 접근
 *                          윈도우 개발할 때(Button , TextFiled...)
 *  3) protected: 같은 패키지까지 접근 , 상속 받는 경우 다른 패키지에 접근 가능
 *  4) public :  모든 클래스에 접근이 가능하다-> 공개
 *  --------------------------------------------------------------------
 *  인스턴스 변수 : private(4개 사용 가능) -> 데이터 노출이 되면 안 되니
 *               POST방식과 GET방식
 *  클래스 : default, public
 *  메소드 : 가급적이면 public이다. 다른 클래스와 연결을 해야하기 때문에
 *  생성자 : public ,  다른 클래스와 연결해야 하기 떄문 값을 갖고 있는게 아니라 주소를 갖고 있는 것
 *  ----------------------------------------------------------------------------------            
 *                      
 *  4. 제어어 : static : 공통의
 *            final : 마지막 -> 더이상 바꿀 수가 없다
 *            abstract : 추상적인 -> 메소드가 선언만 된 상태, 실제 존재하지는 않은(구현이 되지 않은)
 *                       예) 윈도우에 버튼 / 텍스트 ...... => 추상클래스 혹은 인터페이스를 이용해서 만든다
 *  
 *  
 */
// 사용자 요청 => 기능 => 메소드
public class GenieMusicSystem {
   // 공개 =>  공유 
   public static Music[] music=new Music[50];
   // 초기화 => 객체 생성없이 초기화 
   static  // 자동으로 호출 => 상속 예외/ 인스턴스 변수는 들어갈 수 없다
   {
	   try
	   {
		   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		   Elements title=doc.select("table.list-wrap a.title");
		   Elements singer=doc.select("table.list-wrap a.artist");
		   Elements album=doc.select("table.list-wrap a.albumtitle");
		   //System.out.println(title);
		   Elements etc=doc.select("table.list-wrap span.rank");
		   
		   for(int i=0;i<title.size();i++)
		   {
			   Music m=new Music();
			   m.setNo(i+1);
			   m.setTitle(title.get(i).text());
			   m.setSinger(singer.get(i).text());
			   m.setAlbum(album.get(i).text());
			   System.out.println(i+1);
			   System.out.println(title.get(i).text());
			   System.out.println(singer.get(i).text());
			   System.out.println(album.get(i).text());
			   //System.out.println(etc.get(i).text());
			   String temp=etc.get(i).text();
			   String state="";
			   String id="";
			   if(temp.equals("유지"))
			   {
				   state="유지";
				   id="0";
			   }
			   else
			   {
				   state=temp.replaceAll("[^가-힣]", "");
				   id=temp.replaceAll("[^0-9]", "");
			   }
			   m.setState(state);
			   m.setIdcremnent(Integer.parseInt(id)); // 외부에서 불러오면 String이기 때문에 데이터형 바꿔준다
			   music[i]=m;
			   System.out.println("상태:"+state);
			   System.out.println("등폭:"+id);
			   System.out.println("============================");
		   }
	   }catch(Exception ex){}
   }
   
   // 기능 메소드  
   // 0.메뉴
   public int menu() 
   {
	 System.out.println("================메뉴===========");  
	 System.out.println("1. 뮤직 목록");
	 System.out.println("2.상세 보기");
	 System.out.println("3. 곡명 찾기");
	 System.out.println("4. 가수 찾기");
	 System.out.println("5. 종료");
	 System.out.println("==================================================");
	 
	 Scanner scan=new Scanner(System.in);
	 System.out.println("메뉴 선택");
	 int m=scan.nextInt();
	 return m;
   }
   // 1. 목록 출력 
   public void musicList()
   {
	   for(Music m:music)
	   {
		   System.out.println(m.getNo()+"."+m.getTitle());
	   }
   }
   
   // 2. 상세보기 
   public void musicDetail(int no) 
   {
	    for(Music m:music)
	    {
	    	if(m.getNo()==no)
	    	{
	    		System.out.println("순위:"+m.getNo());
	    		System.out.println("곡명:"+m.getTitle());
	    		System.out.println("가수명: "+m.getSinger());
	    		System.out.println("앨범 :"+m.getAlbum());
	    		System.out.println("상태: "+m.getState());
	    		String s=m.getState();
	    		if(s.equals("유지"))
	    		{
	    			System.out.println("등폭 : -");
	    			
	    		}
	    		else if (s.equals("상승"))
	    		{
	    			System.out.println("등폭 : ▲");
	    		}
	    		else if (s.equals("하강"))
	    		{
	    			System.out.println("등폭 :▽");
	    		}
	    		break;
	    				
	    	}
	    }
   }
   // 3. 검색 => 가수,곡명 
   public void titleFind(String fd)
   {
	   for(Music m:music)
	   {
		   if (m.getTitle().contains(fd))
		   {
			   System.out.println(m.getNo()+"."+m.getTitle()+" "+m.getSinger());
		   }
	   }
   }
   public void singerFind(String fd)
   {
	   for(Music m:music)
	   {
		   if (m.getSinger().contains(fd))
		   {
			   System.out.println(m.getNo()+"."+m.getTitle()+" "+m.getSinger());
		   }
	   }
   } 
   
   
}

