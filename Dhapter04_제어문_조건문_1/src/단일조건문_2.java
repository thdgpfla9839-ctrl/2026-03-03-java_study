/*
 * 메뉴 처리 
 */
import java.util.Scanner;
public class 단일조건문_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub



System.out.println("=========메뉴=========");
       System.out.println("1.영화 목록");
       System.out.println("2.뮤직 목록");
       System.out.println("3.맛집 목록");
       System.out.println("4.레시피 목록");
       System.out.println("==================");
       System.out.print("메뉴선택");
       Scanner scan=new Scanner(System.in);
       int menu=scan.nextInt();
       // 버전이 상승되면 경고가 뜸 exec에 밑줄그어짐 기존 17버전 에서 21버전을 깔아놓음
       if(menu==1)
       {
    	  Runtime.getRuntime().exec("C:\\Users\\sist-19\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe http:\\cgv.co.kr");
       }
       if(menu==2)
       {
    	   Runtime.getRuntime().exec("C:\\Users\\sist-19\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe http:\\genie.co.kr");
       }
	}

}