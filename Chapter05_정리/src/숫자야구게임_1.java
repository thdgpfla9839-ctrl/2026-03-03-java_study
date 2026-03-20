/*
 * Set: 중복이 없는 데이터 저장
 */
// 다시 만들기
import java.util.Arrays;

public class 숫자야구게임_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] com=new int[3];
		  for(int i=0;i<com.length;i++)
		  {
			  com[i]=(int)(Math.random()*9)+1; 
					  
					  // 중복 체크
			 for(int j=0;j<i;j++) // j<=i를 주면 검색됨	/ 첫번째는 검사하지 않는다
			 {
				 if(com[j]==com[i])
				 {
					 //com[j] ->기존의 저장된 데이터
					 //com[i] -> 지금 발생한 난수
					 i--; // 원상복귀 -> 해당 위치의 데이터 다시 저장
					 break;
				 }
			 }
		  }
		  System.out.println(Arrays.toString(com));
	}

}
