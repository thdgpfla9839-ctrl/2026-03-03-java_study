// 난수 1~100 사이의 수 임의로 추출 => 맞추는 게임 만들기
/*
 * 힌트(up/down)를 이용
 */
//
import java.util.*; // random과 scanner 둘다 이용해야하니 *을 써줌 즉, 두개이상 쓸때는 *로 대체한다
public class 제어문_반복문_dowhile문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 컴퓨터 난수 발생
		Random r=new Random();
		int com=r.nextInt(100)+1; // 언어를 해당 프로그램에 맞추기 위해 오버라이딩 사용됨
		//        100 -> 0~99 -> 1~100
		// 1,5 -> 1 2 3 4 
		Scanner scan=new Scanner(System.in);
		do 
		{
			
			System.out.print("1~100 사이의 정수를 입력:");
			int user=scan.nextInt();
			
			//사용자가 정의해준 사이의 수를 입력하지 않는 경우를 고려해야함(에러처리방지) ->if 사용
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력");
				continue; //  처음으로 다시 돌아감
			}
			// 결과비교	
			if(com>user)
				System.out.println("입력값 보다 큰 값 입력");
			else if(com<user)
				System.out.println("입력값 보다 작은 값 입력");
			else
			{
				System.out.println("게임오버");
				break;
				//break, continue 밑에 코딩하면 오류
				
			}
				
			
		} while(true);
	}

}
