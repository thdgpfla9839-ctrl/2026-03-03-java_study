/*
 * 정렬 
 * 
 * 40   20   50   10   30 
 * 40 과 20 선택함
 * 
 * 20   40   순서로 비교
 * 20      50  비교
 * 10       20  비교
 * 10   30  비교
 * -----> for문 1바퀴 돌아감
 * 10  40  50  20   30 으로 정렬됨
 * ........> for문은 length-1
 */
import java.util.Arrays;
public class 데이터정렬_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  int[] arr =new int[5];
                  //초기화
                  for(int i=0;i<arr.length;i++)
                  {
                	  arr[i]=(int)(Math.random()*100)+1; // 1~100
                	  
                  }
                  System.out.print("정렬 전 : ");
                  for(int a:arr)
                  {
                	  System.out.print(a+" ");
                  }
                  System.out.print("\n정렬 후 : ");
                  
                	  for(int i=0;i<arr.length-1;i++)
                	  {
                		  for(int j=i+1;j<arr.length;j++)
                		  {
                			  // DESC 내림차순
                			  if(arr[i]<arr[j]) 
                			  {
                				  // 둘을 비교 후 j가 더 작아서 j 앞으로 옮기는 순서 변경
                				  int temp=arr[i]; // 값 교환 -> 임시변수 저장을 해야 교환가능해짐
                                  arr[i]=arr[j];
                				  arr[j]=temp;
                			  }
                		  }
                		  System.out.println(Arrays.toString(arr));
                	  }
                	  for(int i:arr)
                	  {
                		  System.out.print(i+" ");
                	  }
                  }
	

}