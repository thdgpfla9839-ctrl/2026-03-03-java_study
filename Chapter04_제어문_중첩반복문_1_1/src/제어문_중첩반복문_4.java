/*1.
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★
 * ★★☆★★  줄수 5개
 *         별 5개 
 *         
 *         
 *  2.  
 *  ☆★★★★     
 *  ★☆★★★
 *  ★★☆★★
 *  ★★★☆★
 *  ★★★★☆
 *  
 *  
 *  3.
 *  ☆★★★☆
    ★☆★☆★
    ★★☆★★
    ★☆★☆★
    ☆★★★☆
 *  ->
 *     i  1  2  3  4  5
 *     j  5  4  2  2  1
 *  
 *  i+j=6
 *  j의 값을 찾기위해 규칙 파악
 *  
 */
public class 제어문_중첩반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          
//	1.	 for(int i=1;i<=5;i++)
//		 {
//			 for( int j=1;j<=5;j++) 
//			 {
//				 if(j==3)
//				 {
//					 System.out.print("☆");
//				 }
//				 else
//				 {
//					 System.out.print("★");
//				 }
//			 }
//			 System.out.println();
//		 }
		
//	2.	     for(int i=1;i<=5;i++)
//			 {
//				 for( int j=1;j<=5;j++) 
//				 {
//					 if(i==j)
//					 {
//						 System.out.print("☆");
//					 }
//					 else
//					 {
//						 System.out.print("★");
//					 }
//				 }
//				 System.out.println();
//			 }
		
		 for(int i=1;i<=5;i++)   // 3. 문제
			 {
				 for( int j=1;j<=5;j++) 
				 {
					 if(i==j || j==6-i)
					 {
						 System.out.print("☆");
					 }
					 else
					 {
						 System.out.print("★");
					 }
				 }
				 System.out.println();
			 }
		 System.out.println("==================");
		 System.out.println("☆★★★☆");
		 System.out.println("★☆★☆★");
		 System.out.println("★★☆★★");
		 System.out.println("★☆★☆★");
		 System.out.println("☆★★★☆");  // 갖다붙이면 결과물은 가독성 좋지만 수정 불가능함, 이렇게 하지 말자
		 
		 
		 
	}


}
