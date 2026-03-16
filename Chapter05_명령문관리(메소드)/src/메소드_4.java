/*
 *      1. 예제
 *      
 *      단을 사용자가 전송 => 매개변수
 *      해당 단을 출력
 *        1) 리턴
 *        2) 자체 출력  둘중 골라
 */    
import java.util.*;
public class 메소드_4 {
    static void gugudan(int dan)// 자체 출력
    {
    	// 다음에 다시 사용가능함
    	for(int i=1;i<=9;i++)
    	{
    		System.out.printf("%d * %d = %d\n",dan,i,dan*i);
    	} // 단락을 나누면 에러를 수정하기 편리
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan = new Scanner(System.in);
      System.out.print("단 입력 : ");
      int dan=scan.nextInt();
      
      // 구구단을 출력하는 메소드 호출
      gugudan(dan);
      
      System.out.println("===================================");
      System.out.print("단 입력 : ");
      dan=scan.nextInt();
      gugudan(dan); // 중복된 기능 제거
	}

}
