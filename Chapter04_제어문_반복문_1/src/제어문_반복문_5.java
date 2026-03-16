/*
 * 1-2+3-4+5-6+7-8+9-10
 * -> 수끼리 규칙(수열) 파악 후 반복문 작성
 *    짝수는 앞 부호가 -, 홀수는 + 라는 것을 파악 
 */
public class 제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int sum=0; // 짝수든 홀수든 한개만 변수 정해도 됨 나는 짝수로 잡음
		for(int i=1;i<=10;i++){
			
			if(i%2==0) // 짝수일때
				sum-=i; // 그 합을 빼라
			else
				sum+=i; // 나머지는 전체에서 더해라
		}
	     System.out.println(sum);
		
	     // 1~10까지 3의 배수 제외하고 출력
	     
	     for(int i=1;i<=10;i++) {
	    	 if(i%3!=0) // 3의 배수를 표현할 때 %3=0 
	    	System.out.print(i+" ");
	     }
	       System.out.println();
	     // 1~10까지 2의 배수이고 3의 배수
	     for(int i=1;i<=10;i++) {
	    	 
	    	 // 화면출력
	    	 if(i%2==0 && i%3==0) // && ->2의 배수, 3의배수 ||
	    		 System.out.print(i+" ");	 
	     } 
	}

}