/*
 * if(조건문)
 * {실행문장 => 조건이 트루일때 수행문장
 * }
 * 
 * 난수 => 3개 
 * 컴퓨터에서 임의로 추출하는 값
 * 최소값과 최대값
 * 
 * 
 * 난수 
 * Math.random() => 0.0 ~ 0.99
 * *100 ->  곱하기 100해주면
 *             정수변환(0~99 +1) 1~100로 변환됨
 *             
 *             
 */
import java.util.Random; // 이미 만들어진 클래스를 가지고 올때 import 사용
// 자바에서 제공하는 클래스 / 사용자 정의 클래스
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Random r=new Random();
      // 클래스를 가져올 떈 new를 이용해야함 
      // new는 동적메모리 할당 => heap영역에 저장 => 클래스를 저장할때 사용
      // 객체지향
    
      
      int num1=r.nextInt(100+1);
   // 0~99  ==> +1 ==> 1~100
      int num2=r.nextInt(100+1);
      int num3=r.nextInt(100+1);
      // {} 같은 블록에서 변수명이 동일하면 안됨
      /*
       * 변수 => 반드시 초기값 설정해야함
       * 초기값
       *   명시적 초기값
       *     int a=10;
       *   입력받아 저장 Scanner
       *   컴퓨터가 임의의 설정 random
       *   파일 읽기/ 오라클 읽기  
       */
      System.out.println(num1+","+num2+","+num3);
      
      // 요청처리 => 사용자의 요청을 이해해야함
      int max=num1;
      if(max<num2)
    	  max=num2;
      if(max<num3)
    	  max=num3;
      
      System.out.println("최대값:"+max);
      
      int min=num1;
      if(min>num2)
    	  min=num2;
      if(min>num3)
    	  min=num3;
      System.out.println("최소값:"+min);
      
      // 중간값 출력
      int middle=num1+num2+num3-max-min;
      System.out.println("중간값"+middle);
      
      // 최소값이나 최대값을 구할 때는 비교하는 데이터를 입력
      //  100(초기값을 입력해주는데 가장 큰값을 입력한다)       0(최대값의 초기값은 그 반대로 입력)
      // -> 단일 조건문
      
	}

}
