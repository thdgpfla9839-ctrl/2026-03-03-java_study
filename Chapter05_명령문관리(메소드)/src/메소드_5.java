import java.util.*;
public class 메소드_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                    Scanner scan=new Scanner(System.in);
                    System.out.print("단 입력 : ");
                    int dan=scan.nextInt();
 
                    for(int i=0;i<=9;i++)
                    {
                    	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
                    }
                    System.out.println("=========================================");
                    System.out.print("단 입력 : ");
                    dan=scan.nextInt();
 
                    for(int i=0;i<=9;i++)
                    {
                    	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
                    }
                    System.out.println("=========================================");
                    System.out.print("단 입력 : ");
                    dan=scan.nextInt();
 
                    for(int i=0;i<=9;i++)
                    {
                    	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
                    }
                    System.out.println("========================================="); // 1부터 곱하길 원하는데 0부터 나옴 근데 3번을 고쳐야함 -> 메소드를 쓰면 중복을 제거해주니 1번만 수정하면 됨
	}

}
