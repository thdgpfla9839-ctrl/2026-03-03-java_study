/*
 * 실제 데이터 값을 나중에 대입
 * 배열은 기능별로 묶어야 함
 * 
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int [] arr=new int[5];
               // new 사용하면 자동초기화됨
               // int -> 0
               // double -> 0.0
               // boolean -> false
               // String -> null
               // char -> '\0' 으로 초기화 되며 반드시 초기화 해주고 시작해야함
               
               //
             //프로그램에 필요한 데이터 초기화
               for(int i =0; i<arr.length;i++)
               {
            	   arr[i]=(int)(Math.random()*100)+1;
               }
               // 출력
               for(int a:arr)
               {
            	   System.out.println(a);
            	   // 혹은 for문 대신 System.out.println(Arrays.toString(arr); / Arrays.sort(arr) System.out.println(Arrays.toString(arr) 이거 하면 정렬이 됨 sort가 정렬
               }
            		   
	}

}