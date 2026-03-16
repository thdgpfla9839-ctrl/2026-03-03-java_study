/*
 *  up / down 게임
 *  컴퓨터에서 1부터 100까지 임의로 숫자 추출 => 난수(random)
 *  
 *  사용자 입력 -> 횟수 제한이 없음 for문이나 while믄 사용가능하나 while문이 더 많이 활용 
 *    난수 > 입력값 -> 난수가 입력값 보다 크면 -> up(높은 숫자 입력하라는 의미)
 *    난수 < 입력값 -> down
 *    난수 = 입력값 -> 종료 -> for(;;)이용 -> 종료 시 System.exit(0)
 */
import java.util.Random;
import java.util.Scanner;
public class 제어문_반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         
         Random r= new Random();
         int com=r.nextInt(100)+1; // 1부터 100 사이의 임의 값 추출 com은 변수명 바로 윗줄을 의미
         
         for(;;) // 무한루프(횟수 지정X )를 쓰면 반드시 종료시점을 지정
         {
        	 
        	 System.out.print("1~100사이의 정수 입력 :");
        	 int user=scan.nextInt();
//        	 System.out.println("USER Input:"+user);
        	 
        	 if(com>user)
        		 System.out.println("입력값 보다 큰 수 입력(up)");
        	 else if(com<user)
        		 System.out.println("입력값 보다 작은 수 입력(down)"); 
        	 else 
        	 { 
        		 // 값이 같은 경우 종료
        		 System.out.println("게임오버");
        		 System.exit(0); // ->0을 넣어야 정상종료됨
        	 }
         }
        	 
	}

}