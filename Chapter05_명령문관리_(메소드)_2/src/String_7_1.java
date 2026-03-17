/*
 * trim() => 좌우 공백 제거
 * 
 * 아이디입력, 비번입력에 주로 사용
 */
import java.util.Scanner;

public class String_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String msg="Hello Java ";
            System.out.println("문자 개수 :"+msg.length());
            System.out.println("문자 개수 :"+msg.trim().length());//좌우공백만 제거가능
            
            // 공백도 문자 1개
            //가운데 공백은 제거 X
            //좌우에 있는 공백만 제거 O 



                    String id="admin";
            		Scanner scan=new Scanner(System.in);
                    System.out.println("아이디 입력 :");
                    String mid=scan.nextLine();
                    if(id.equals(mid.trim()))
                    {
                    	System.out.println("로그인 성공");
                    }
                    else
                    {
                    	System.out.println("로그인 실패");
                    }
	}

}
