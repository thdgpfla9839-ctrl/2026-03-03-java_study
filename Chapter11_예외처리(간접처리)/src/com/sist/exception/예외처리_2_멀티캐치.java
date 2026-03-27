package com.sist.exception;
// 멀티 catch = 다중 예외처리
// 기본은 catch(Exception e)로 작성한다
public class 예외처리_2_멀티캐치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          try
          {
        	  String n1="10";
        	  String n2="3"; // 공백에러 발생 할 수 있다 -> 에러 1
        	  int [] arr= {
        			  Integer.parseInt(n1),
        			  Integer.parseInt(n2),
        			  
        	  };
        	  int res=arr[0]/arr[2]; //  -> 에러2 배열범위 오류
        	  System.out.println(res); // else if 한개만 수행
          } 
          // 종류별로 가져올 때 쓰는 법 2번 -> 좀더 간결하게 작성버전 : 멀티캐치절
          catch(NumberFormatException 
        		  |ArrayIndexOutOfBoundsException 
        		  |ArithmeticException e) // |로 모아서 한번에 처리가능함
                                          // e같이 객체는 마지막 하나만 쓴다
          {
        	  e.printStackTrace();
          }
          
          // 1번 버전 길게쓴 캐치절
//          catch(NumberFormatException e) // 정수변환이 안 됐을 때만 처리 가능
//          {
//        	  e.printStackTrace();
//          }
//          catch(ArrayIndexOutOfBoundsException e) // 배열범위 초과했을 때
//          {
//        	  e.printStackTrace();
//          }
//          catch(ArithmeticException e) //0으로 나눴을 경우 3번 에러경우
//          {
//        	  e.printStackTrace();
//          }
//          catch(Exception e) // 그외에 나머지 생각못한 에러
//          {
//        	  e.printStackTrace(); // 31라인 부터 34를 맨위로 올리면 모든 에러를 처리하는 능력이 있으니까 위에 에러잡는 거쓰면 쓰는 의미가 없어져서 에러가 또 나와
//          }                        // 에러처리 범위가 넓은 것일수록 아래로 내려온다
	}

}
