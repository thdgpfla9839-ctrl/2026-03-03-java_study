/*
 * String은 변경할 수가 없어 있는 그대로 사용
 *          단점 : final(변경해서 쓸 수 없다는 의미) => 표준어다
 * 
 * 검색과 관련
 * starswitch : 첫글자가 동일
 * endwith : 끝문자열이 같은 경우
 * --------------- -> 서제스트(자동완성기)
 * contains -> 검색할 때 / 문자 포함된 경우
 * 
 */
import java.util.Scanner;
public class String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String [ ] subject={
        	"혼자 배우는 자바",
        	"자바 AND Spring",
        	"기본 자바",
        	"이것이 자바",
        	"JAVA ANd ASP",
        	"Oracle AND Java",
        	"자바로 시작하는 JSP",
        	"JSP AND 자바"
        };
        // 크롤링 해서 노래검색, 맛집검색, 명소찾기
        
          Scanner scan=new Scanner(System.in);
          System.out.print("검색어 입력: ");
          String fd=scan.next();
          
          for(String data:subject)
          {
        	  if(data.startsWith(fd))
        	  {        		 
        		  System.out.println(data);
        	  }//검색어로 시작하는 교재를 읽어온다
    		  // =>웹의 쿠키 읽기
        	  
        	  
          }
          
          System.out.println("끝나는 문자 찾기: ");
          for(String data:subject)
          {
        	  if(data.endsWith(fd))
        	  {        		 
        		  System.out.println(data);
        	  }
          }
          
          System.out.println("포함된 문자열 찾기: ");
          for(String data:subject)
          {
        	  if(data.contains(fd))
        	  {        		 
        		  System.out.println(data);
        	  }
          }
          
	}

}
