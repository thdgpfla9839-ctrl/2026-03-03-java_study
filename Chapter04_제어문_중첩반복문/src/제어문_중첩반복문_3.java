/*
 * 1. 문제
 *  ★★★★★
 *  ★★★★★
 *  ★★★★★
 *  ★★★★★
 *  ★★★★★  -> 줄수 5개
 *          ->별  5개
 *          
 *          
 * 2. 알파벳 출력
 *    ABcD
 *    EFGH
 *    IJKL
 *    MNOP    줄수 4개
 *            출력 알파벳 4개
 *            
 *            
 *            
 *            
 *            
 * 3.  ABCD
 *     ABCD         
 *     ABCD       
 *     ABCD
 */
public class 제어문_중첩반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//             1.  for(int i=1;i<=5;i++)
//               {
//            	   for(int j=1;i<=5;j++)
//            	   {
//            		   System.out.print("★");
//            	   }
//            	   System.out.println();
//               }
//	2.	char c='A';
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
			
			for(int i=1;i<=4;i++)  // 3.문제
			{   
				 char c='A';   // 변수를 어디에 위치하는지에 따라 출력물이 다르다
				for(int j=1;j<=4;j++)
				{
					
					System.out.print(c++);
				}
				System.out.println();
			}
	}

}
