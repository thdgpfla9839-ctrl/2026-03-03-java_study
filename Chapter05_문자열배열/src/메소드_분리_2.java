import java.util.*;
/*
 * 메소드 만들기
 *  1. 메뉴
 *     Top 200 목록 출력
 *     유튜브연결 -> 동영상 가져와서 실행 -> 상세보기에서 처리
 *     검색
 *     종료
 *  2. 데이터 읽기
 */
public class 메소드_분리_2 {
  
	static void menu() {
		System.out.println("==========================");
		System.out.println("1. 노래명");
		System.out.println("2. 가수명");
		System.out.println("3. 앨범명");
		System.out.println("4. 상세보기");
		System.out.println("5. 종료");
		System.out.println("==========================");
		
		
	}
	static void process() throws Exception
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			menu();
			System.out.println("메뉴 선택");
			int m=scan.nextInt();
			
			if(m==5)
			{
				System.out.println("프로그램 종료");
				break;
			}
			else if(m==1)
			{
				String[] title=GenieMusic.getTitle();
				for(int i=0;i<title.length;i++)
				{
					System.out.println((i+1)+"."+title[i]);
				}
				
			}
			else if(m==2)
			{
				String[] title=GenieMusic.getTitle();
				for(int i=0;i<title.length;i++)
				{
					System.out.println((i+1)+"."+title[i]);
		         }
				
			
	       }
			else if(m==3)
			{
				String[] title=GenieMusic.getTitle();
				for(int i=0;i<title.length;i++)
				{
					System.out.println((i+1)+"."+title[i]);
		         }
				
			
		   }
			else if(m==4)
			{   
				System.out.print("검색어");
				String fd=scan.next();
				String[] title=GenieMusic.getFind(fd);
				
				for(int i=0;i<title.length;i++)
				{
					System.out.println((i+1)+"."+title[i]);
		         }
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
      process();
	}

}
