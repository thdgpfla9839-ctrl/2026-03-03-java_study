/*1.
 * *
 * **
 * ***
 * ****  ->여기까지가 1차 for문
 * 
 * ****  ->2차 for문     줄수i    별j
 * ***                   1       4
 * **                    2       3
 * *
 */
public class 제어문_중첩반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		for(int i=1;i<=4;i++)
		{
			//*출력
			for(int j=1;j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=1;i<=4;i++)
		{
			//*출력
			for(int j=1;j<=5-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
