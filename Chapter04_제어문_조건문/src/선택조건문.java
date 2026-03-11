/*
 * 프로그램에서 가장 많이 사용되는 조건문
 * 
 * 조건을 걸면 트루와 펄스가 출력됨
 * 단일 조건문은 트루일떄 수행/ 펄스일때 건너뜀 수행하지 않음 
 * 
 * 선택조건문은 트루일대 처리
 * 펄스일 때 처리
 * 
 * 형식) 
 *    if(조건문)
 *    {
 *     조건 트루일 때 => 짝수냐, 로그인이 되냐, 아이디가 중복인지
 *     }
 *     else
 *     {
 *      조건 펄스일 때 => 홀수냐, 로그아웃이냐, 아이디 중복없음
 *     }
 *     
 *     출력 : println 한줄씩 세로 출력
 *           print   옆으로 가로 출력
 *           
 */   
import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Random r=new Random();
      int i=r.nextInt(100)+1; // 1~100 사이의 정수 추출
      // 1~99
      System.out.println("정수값"+i);
      
      if(i%2==0) // 트루일때 밑에가 출력
    	  System.out.println(i+"는 짝수입니다");
      else // 펄스면 밑에가 출력
    	  System.out.println(i+"는 홀수입니다");
      
      char c='A';
      if(c>='A' && c<='Z') //A~Z 사이에 있는 문자냐  &&는 포함, ll 미포함
    	  System.out.println(c+"는 대문자입니다");
      else
    	  System.out.println(c+"는 소문자입니다");
      
      // 실행 시 웹에서 로그인이냐 아니냐
    	  
	}

}
