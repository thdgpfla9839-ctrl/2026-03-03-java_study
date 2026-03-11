/*
 *  1~100까지 정수 중 3의 배수 / 5의 배수 / 7의 배수 갯수 구하기
 *  -> 단일 조건문을 사용하며 중복처리 가능하게함
 */
public class 제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a3=0,a5=0,a7=0;
          // 유형이 같은 변수(데이터형이 동일) -> int a=0,b=0,c=0; / int a,b,c; / a=b=c=0 이렇게 나란히 쓸 수 있다
          
          for(int i=1;i<=100;i++){
        	if(i%3==0)
        		a3++;
        	if(i%5==0)
        		a5++;
        	if(i%7==0)
        		a7++;
          }
          //갯수 확인 ++, 누적+=
          System.out.println("1~100 사이의 3의 배수 갯수:"+a3);
          System.out.println("1~100 사이의 5의 배수 갯수:"+a5);
          System.out.println("1~100 사이의 7의 배수 갯수:"+a7);
          
          //  변수 - 반복문 - 결과값 순으로 코드 작성
          int even=0, odd=0; // 짝수합과 홀수합 변수
          // 1~ 100 사이의 짝수합/ 홀수합
          for(int i=1;i<=100;i++) {
        	  if(i%2==0) // i를 2로 나누고 나머지가 0 이라는 의미
        		  even+=i;
        	  else 
        		  odd+=i; // 한줄만 쓰면 if든 else든 괄호 필요없다
        		  
        	  
          }
          System.out.println("1~100 사이의 짝수 합:"+even);
          System.out.println("1~100 사이의 홀수 합:"+odd);
          
          // 배수 구하기 -> %3 이렇게 하고 나머지는 0이다로 표현하면 됨 => %는 배수 구할 때 많이 사용
	}

}
