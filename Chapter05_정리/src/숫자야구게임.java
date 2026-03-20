/*
 * 소스는 변경사항이 없다
 * 난수발생 -> 3개의 난수 -> 중복없는 난수
 * 사용자 입력 -> 유효성 검사
 * 난수 / 사용자 입력 비교
 * 힌트 제공
 * 종료
 * 
 */
// 다시 만들기
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1. 난수발생
		  int [] com=new int[3];
//		  for(int i=0;i<com.length;i++)
//		  {
//			  com[i]=(int)(Math.random()*9)+1; 
//					  
//					  // 중복 체크
//			 for(int j=0;j<i;j++) // j<=i를 주면 검색됨	
//			 {
//				 if(com[j]==com[i])
//				 {
//					 //com[j] ->기존의 저장된 데이터
//					 //com[i] -> 지금 발생한 난수
//					 i--;
//					 break;
//				 }
//			 }
//		  }
		
		int su=0;
		boolean bCheck=false;
		for(int i=0;i<com.length;i++)
		{
			bCheck=true;
			//중복체크-중복-> bCheck: true / bCheck:false
			while(bCheck)
			{
				su=(int)(Math.random()*9)+1;
				bCheck=false; // 여기에 써야됨 while문 종료할 준비
				for(int j=0;j<i;j++)
				{
					if (com[j]==su)
					{
						bCheck=true; // while문 수행
						break;
					}
//					else
//					{
//						bCheck=false; -> 무한루프 걸려버림
//						break;
//					}
				}
			}
		    com[i]=su;
		}
		System.out.println(Arrays.toString(com));
	}

}
