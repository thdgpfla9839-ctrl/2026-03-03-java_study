/* 교재 p.131~132
 * 
 * 1~100 사이의 총합 / 짝수 합 / 홀수 합 구하기
 * 
 *   변수 총 4개 필요
 *   1~100까지 변경 => 루프변수  이용
 *   총합 / 홀수합/짝수합
 */
public class 제어문_반복문_while문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0,even=0,odd=0;
     
     int i=1;
     while(i<=100)
     {
    	 //처리문장
    	 sum+=i; // sum=sum+i
    	 if(i%2==0)
    		 even+=i; // even=even+i
    	 else 
    		 odd+=i; // odd=odd+i
    	 // i ->100일때까지 증가
    	 i++;
    	 
     }
      //출력 
     System.out.println("1~100 총합 : "+sum);
     System.out.println("1~100 짝수합 : "+even);
     System.out.println("1~100 홀수합 : "+odd);
	}

}
