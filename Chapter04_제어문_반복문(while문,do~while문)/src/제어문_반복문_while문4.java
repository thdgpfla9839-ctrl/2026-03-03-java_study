//메뉴
/*메뉴입력
 * 
 */
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 제어문_반복문_while문4 {
  // io 파일 입출력 / 네트워크 여결 / 데이터베이스 연동 시 오류가 날 수 있어서 미리 출력하고 들어가기 위해 io인 예외처리 해주고 들어감
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in); // 사용자가 키보드로 입력 후 값을 읽어서 메모리에 저장, 밑에 6가지 선택지 중 고를 수 있게 하기 위해 만드는 것
		  System.out.println("🎵지니뮤직🎵");
          while(true)// 무한 루프-> 종료조건
          {
        	  System.out.println("============메뉴========");
        	  System.out.println("1.가요");
        	  System.out.println("2.트로트");
        	  System.out.println("3.ost");
        	  System.out.println("4.pop");
        	  System.out.println("5.jazz");
        	  System.out.println("6.classic");
        	  System.out.println("7.종료"); //-> 프로그램 종료
        	  System.out.println("=====================");
        	  System.out.print("메뉴 선택:");
        	  
        	  int menu =scan.nextInt();
        	  
        	  // 에러처리 -> 입력이 잘못된 경우
        	  if(menu <1 || menu>7)
        	  {
        		  System.out.println("없는 메뉴임 다시 입력");
        		  // while문 처음으로 다시 돌아감
        		  continue;
        		  
        		 //continue : 
        		  //   while -> 조건식으로 이동
        		  //   for -> 증가식으로 이동
        		  //break :
        		  //    종료로 돌아감
        	  }
        	  //7개의 조건을 써야함 -> 다중조건문 혹은 선택문 중 고민
        	  // 다중조건문
        	  if (menu==7) 
        	  {
        		  //종료
        		  //종료 방법
        		 //1. system.exit(0) -> 프로그램 자체 종료
        		 //2. while을 종료
        		 //   break
        		  
        		  System.out.println("프로그램 종료");
        		  break;
        		 
        	  }
        	  else if(menu==1)
        	  { 
        		  // 노래출력
        		  System.out.println("==============가요=============");
        		  //Jsoup은 라이브러리인데 데이터추출해서 읽어주는 역할
        		  Document doc = Jsoup.connect("https://www.genie.co.kr/chart/genre?ditc=D&ymd=20260309&genrecode=M0100").get(); //사이트 주소를 붙여서 해당 데이터 긁어오기
        		  Elements title=doc.select(".title");
        		  for(int i=0;i<title.size();i++)
        		  {
        			  String s=title.get(i).text();
        			  System.out.println((i+1)+"."+s);
        		  }
        	  }
        	  else if(menu==2)
        	  {
        		  // 노래출력
        		  System.out.println("==============트로트=============");
        	  }
        	  else if(menu==3)
        	  {
        		  // 노래출력
        		  System.out.println("==============ost=============");
        	  }
        	  else if(menu==4)
        	  {
        		  // 노래출력
        		  System.out.println("==============pop=============");
        	  }
        	  else if(menu==5)
        	  {
        		  // 노래출력
        		  System.out.println("==============jazz=============");
        	  }
        	  else if(menu==6)
        	  {
        		  // 노래출력
        		  System.out.println("==============classic=============");
        	  }
        	  
        	  
          }
	}

}
