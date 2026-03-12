/*
 * 1. 몇줄 출력할지 -> 1차 for문
 * 2. 내용물 출력  -> 2차 for문
 * 
 * 
 *디버깅 할때 f6눌러서 확인 ->실행과정을 멈춰줌
 */
public class 제어문_중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          for(int i=1;i<=3;i++)
          {
        	  for(int j=1;j<=3;j++)
        	  {
        		  System.out.println("i= "+i+", j= "+j);
        	  }
          }
	}

}
