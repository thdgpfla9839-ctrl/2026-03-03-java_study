/*
 *  1~100 까지의 합 구하기  -> 합이 누적됨 ->sum을  사용, 이때 sum의 초기값은 반드시 0
 */
public class 제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 누적변수
       int sum=0;
       for(int i=1;i<=100;i++) { // i = 루프변수 (i는 1~100까지 변경되는 변수)
    	   
    	   	 // i는 지역변수 -> for문 안에서만 사용가능
    	   sum+=i; // sum=sum+i로 쓸수고 있음
    	   System.out.println("i="+i+",sum"+sum); // sum값 누적으로 반복하는 코드
    	   // 장바구니 총액 계산에 누적반복 사용됨
       }
       // 지역변수는 {}를 벗어나면 사라진다
       //         반드시 초기값이 존재
       //         같은 블록{}에서 같은 변수면 사용금지
       
       System.out.println("1~100의 총합:"+sum);
	}

}