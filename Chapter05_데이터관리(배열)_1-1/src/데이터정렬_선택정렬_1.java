// => 문자정렬
import java.util.Arrays;
public class 데이터정렬_선택정렬_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              char[] alpha=new char[5];
              //초기화
              for(int i=0;i<alpha.length;i++)
              {
            	  alpha[i]=(char)((int)(Math.random()*26)+'A');
            	  for(int j=0; j<i;j++)
            	  {
            		  //alpha[i] -> 현재발생
            		  //alpha[j] -> 이전에 저장된 데이터
            		  if(alpha[i]==alpha[j])
            		  {
            			 
            			  i--;   // for문을 원상상태 유지하기 위함 -> 현재값 변경
            			  break;   // 13~17번을  추가하면 i와j의 알파벳이 중복되지 않게 가져오기 위함 / 다시 난수 발생
            		  }
            	  }// 중복 없는 난수 발생
              }
              System.out.println("정렬 전 : ");
              for(char c:alpha) // 출력하는 상태 
              {
            	  System.out.print(c+" ");
              }
              // 정렬
              System.out.println();


               System.out.println("정렬 후: ");
              for( int i=0;i<alpha.length-1;i++)
              {
            	  for(int j=i+1;j<alpha.length;j++)
            	  {
            		  if(alpha[i]>alpha[j])
            		  {
            			  char temp=alpha[i];
            			  alpha[i]=alpha[j];
            			  alpha[j]=temp;
            		  }
            	  }
            	  System.out.println(Arrays.toString(alpha));
              }
              //정렬된 데이터 출력
              for(char c:alpha)
              {
             	 System.out.print(c+" ");
              }
	}
	               
}