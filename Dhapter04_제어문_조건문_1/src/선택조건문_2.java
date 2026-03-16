/*
 *  윤년 처리 -> 년도 입력 -> 윤년 O / 윤년 X
 *   윤년조건
 *  1. 4년마다
 *  2. 100년 마다
 *  3. 400년 마다
 *  
 *  (year%4==0)&&(year%100!=0) || (year%400==0)
 *    4년마다      100년맞다 제외        400년 마다
 */
import java.util.Scanner; // 키보드 입력을 받는 경우 사용
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         // 키보드 입력값을 받아서 메모리(변수)에 저장
         // System.in -> 입력한 키보드 값 -> 저장시점은 엔터칠대
         System.out.print("년도 입력");
         int year=scan.nextInt(); // 정수값을 읽어와라 명령내림
         System.out.println("입력된 년도:"+year);	
         // 밑줄부턴 윤년 여부 조건
         
         if((year%4==0)&&(year%100!=0) || (year%400==0))
         {
        	 System.out.println(year+"년도는 윤년입니다");
         }
         else
         {
        	 System.out.println(year+"년도는 윤년이 아닙니다");
         }
	}

}