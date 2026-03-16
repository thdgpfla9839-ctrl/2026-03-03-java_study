/*
 *  정수만 갖고 사칙연산
 *  -> 한가지 기능만 수행
 *     메소드 총 4개 만들기
 *     
 *   =>  main()에서는 처리하지 않는다 / 시작점으로만 쓰자
 */
import java.util.Scanner;
public class 메소드_2 {
     // +
	// 사용자로부터 두개의 정수를 받아 더한값을 보내준다 (더한값/ 결과값을 보내준다 : return)
	// 더한 값을 달라 -> 리턴형 존재
	// 더한 값을 출력 -> 리턴형 없음
	static int plus(int a, int b)
	{
		int c=a+b;
		return c;
	}
	static int minus(int a, int b)
	{
		 int c =a-b;
		 return c;
	}
	static int gop(int a,int b)
	{
		int c = a*b;
		return c;
	}
	static String div(int a, int b) // 분모가 0인 경우를 대비해서 string으로 쓰자
	{
		String res="";
		if(b==0)
			res="0으로 나눌 수 없음";
		else
			res=a+"/"+b+"="+(a/(double)b);
		return res;
	}
	
	
	//메소드를 조립해서 계산기 완성
	static void process()
	{

        Scanner scan=new Scanner(System.in);
        System.out.print("첫번 째 정수 입력 : ");
        int a=scan.nextInt();
        
        System.out.print("연산자 입력 (+, -, *, / ): ");
        char op=scan.next().charAt(0);
        
        System.out.print("두번 째 정수 입력 : ");
        int b=scan.nextInt();
        
        switch(op)
        {
        case '+' -> {
       	 int result=plus(a,b);
       	 System.out.printf("%d+%d=%d\n",a,b,result);
        }
        case '-' -> {
       	 int result=minus(a,b);
       	 System.out.printf("%d-%d=%d\n",a,b,result);
        }
        case '*' -> {
       	 int result=gop(a,b);
       	 System.out.printf("%d*%d=%d\n",a,b,result);
       		 
	     } 
        case '/' -> {
       	 String result=div(a,b);
       	 System.out.println(result);
        }
        default -> System.err.println("없는 연산자");
        }
	}
	
	// 기능 여러개를 한개의 기능으로 묶어서 처리 -> 컴포넌트
	public static void main(String[] args) {
		// TODO Auto-generated method stub

          process(); // 호출하기
//
//         Scanner scan=new Scanner(System.in);
//         System.out.print("첫번 째 정수 입력 : ");
//         int a=scan.nextInt();
//         
//         System.out.print("연산자 입력 (+, -, *, / ): ");
//         char op=scan.next().charAt(0);
//         
//         System.out.print("두번 째 정수 입력 : ");
//         int b=scan.nextInt();
//         
//         switch(op)
//         {
//         case '+' -> {
//        	 int result=plus(a,b);
//        	 System.out.printf("%d+%d=%d\n",a,b,result);
//         }
//         case '-' -> {
//        	 int result=minus(a,b);
//        	 System.out.printf("%d-%d=%d\n",a,b,result);
//         }
//         case '*' -> {
//        	 int result=gop(a,b);
//        	 System.out.printf("%d*%d=%d\n",a,b,result);
//        		 
//	     } 
//         case '/' -> {
//        	 String result=div(a,b);
//        	 System.out.println(result);
//         }
//         default -> System.err.println("없는 연산자");
//         }
   }  
}
