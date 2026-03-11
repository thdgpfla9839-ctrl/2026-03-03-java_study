/*
 * break : switch~case, 반복문 안에서 주로 사용
 *         해당 제어문을 종료할 때 사용
 *         if문 안에 사용 시 오류발생(반복문 없이 단독if문 안에는 사용불가능)
 *         
 * continue : 반복문 안에서만 사용가능
 *            for문 -> 특정부분 제외
 *            while,do~while믄 -> 처음으로 돌아가서 다시 시작
 *            
 *  
 * => 자신의 반복문(자신이 포함되어 있는 반복문)만 제어할 수 있다
 */
public class 제어문_반복제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int i =1;i<=10;i++) {
    	   
    	   if(i==5) break; // for 종료
    	   System.out.print(i+" ");
       }
       System.out.println();
       for(int i=1;i<=10;i++)
       {
    	   if(i==5) continue; // for 종료
    	   System.out.print(i+" ");
       }
	}

}
