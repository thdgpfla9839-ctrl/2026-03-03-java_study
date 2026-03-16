/*
 *       *
 *      **
 *     ***
 *    ****             i   j  k
 *                    줄수 공백 별
 *    ****             1   3   1
 *     ***             2   2   2          i+j=4   k=i
 *      **             3   1    3
 *       *             4   0    4
 *    
 */
public class 제어문_중첩반복문_6 {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub

// 1. 로또 번호 추첨
//           for(int i=1;i<=6;i++)
//          {
//        	  int lotto =(int)(Math.random()*45)+1;
//        	  Thread.sleep(1000);
//        	  System.out.print(lotto+" "); //out 대신 err 쓸 수 있음
//          }
		for(int i=1; i<=4;i++)  // 2.문제
		{
			//공백 먼저 출력
			for(int j=1;j<=4;j++)
			{
				System.out.print(" ");
			}
			//별표 출력
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
