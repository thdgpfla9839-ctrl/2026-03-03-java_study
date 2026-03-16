/*
 *  do~while문 형식
 *      
 *      초기값->1
 *      do
 *      {
 *          실행문장->2 => 한번은 반드식 실행되는 문장
 *          증가식->3
 *      }while(조건식);->4
 *   ---------------------------------------------------   
 *      
 *      int i=1
 *      do
 *      {
 *       System.out.println(i) 1 2 3 ...... 5
 *       i++;    => i=2 i=3 ..... i=6 => 종료
 *      }while(i<=5); -> 증가식 후에 조건 검색
 *      
 *      
 *      
 * continue : 조건식으로 이동함  => while문이나 do~while문에서 무한루프에 빠진다
 *    ->
 *      int i=1;
 *      while(i<=10)
 *      {
 *        if(i==2)
 *         continue;
 *         System.out.print(i);               
 *         i++;
 *      }   => 1은 그대로 출력될텐데 2부터는 컨티뉴에 걸려서 i가 하나 증가되지 못하고 계속 와일문으로만 왔다갔다 반복하는 일이 생김
 *      
 */

import javax.swing.JOptionPane;

public class 제어문_반복문_dowhile문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                //1~10까지 출력
		int i=1; // 초기값이 외부에 위치함 (do~while문도 마찬가지)
		do 
		{
			 System.out.print(i+" "); //반복문장
			 i++; // 증가식
				
		}while(i<=10); //조건식


System.out.println();
		
		char c='A';
		do 
		{
			System.out.print(c+" ");
			c++;
		}while(c<='Z');
		System.out.println();
		
		c='0';
		do 
		{
			System.out.print(c+" ");
			c++;
		}while(c<='9');
		System.out.println();
		
		String s=JOptionPane.showInputDialog("문자열 입력");
		// 글자수가 몇글자인지
	    System.out.println("글자수:"+s.length());
	    //A,a가 몇개인지 확인
	    int count=0;
	    i=0; // int i로 주면 맨 위(41번)에 만들어 놓은 i와 겹치므로 int 안쓰고 바로 정의
	    do 
	    {
	    	char d=s.charAt(i);
	    	if(d=='A' || d=='a')
	    		count++;
	    	
	    	i++;
	    }while(i<s.length());
	    
	    System.out.println("A,a는 총객수:"+count);
	}

}