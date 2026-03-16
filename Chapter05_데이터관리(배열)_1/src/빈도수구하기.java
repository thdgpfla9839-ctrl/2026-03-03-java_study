//
// 0~9까지 난수발생 -> 총 100개 발생
//    
/* 
 * 
 */
import java.util.Arrays;
public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[] arr=new int[10]; //0~9까지 10개임
		
		//초기화
		for(int i=1;i<=100;i++)
		{
			int rand=(int)(Math.random()*10); // 0~9
            arr[rand]++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		//실제 출력
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(i+"-->"+arr[i]);
		}
	}

}
