/*
 *  다시 비교 
 *    ===============================================
 *  1. 문자 1개 입력을 받아서 대문자 : 소문자 / 소문자 : 대문자로 변경하자
 *    
 *    리턴형 char
 *    매개변수 char 를 이용하면 됨
 *    ===================================================
 *   2. 5개의 정수 입력 후 가장 큰 값을 출력
 *    
 *    5개의 정수 -> int [ ] 
 *    큰값 -> int [ ] 
 *    =============================================
 *   3. 5개의 정수입력 후 정렬한 데이터 출력
 *    
 *    5개의 정수 -> int [ ]
 *    정렬한 데이터 -> int [ ] / void(자체 처리)
 *      
 */
import java.util.Arrays;
public class 메소드_7 {
// 메소드 문자 1개 입력 후 대문자 소문자 /소문자 대문자 변경
	// 'A' 65, 'a' 97  -> 대소문자 차이 32
	static char change (char c)
	{
		return c>='A' && c<='Z' ? (char)(c+32):(char)(c-32);   //앞이 소문자로 변환 : 뒤가 대문자로 변환
	}
	// 5개 정수 입력 -> 가장 큰값 출력
	// 3개 이상이면 보통 배열
	static int max(int[] arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		return max;
		
	}
	
	static int min(int[] arr)
	{
		int min=arr[0];
		for(int i=0;i>arr.length;i++)
		{
			if(min>arr[i])
				min=arr[i];
		}
		return min;
		
	}
	
	static void sort(int [] arr) // 3.문제
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]<arr[j]) // 부등호만 바꾸면 올림차순(<)/ 내림차순 가능(>)
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		} System.out.println("정렬 후 : ");
		 System.out.println(Arrays.toString(arr));
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1. 	char c='B'
//				char res =change(c);
//		System.out.print(res);
		
		
		int[] arr =new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		// 메소드 호출 후 결과값 받기
		int m=max(arr);
		
		//베열 -> 배열명 설정


         System.out.println(Arrays.toString(arr));
         System.out.println("최대값은 "+m+"입니다");
         
         
 		
 		// 메소드 호출 후 결과값 받기
 		 int n=min(arr); // n으로 바꾸지 않아도 m=min(arr); 후 출력은 그대로 복붙

 		
 		//베열 -> 배열명 설정


        //  System.out.println(Arrays.toString(arr)); 생략가능 
          System.out.println("최소값은 "+n+"입니다");
          
//          sort(arr);         


	}

}
