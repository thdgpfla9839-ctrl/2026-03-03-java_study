/*
 * 문자열 잘라내기
 * p.162
 * 
 * Hello Java
 * 0123456789
 * 
 * 1) 원하는 위치부터 뒤에 전체 가져오기
 * -> substring(6) -> 6번부터 끝까지 가져온다 
 * 2) 부분적으로 자르기
 * -> substring(2,5) -> 2부터 4까지 부분만 가져온다
 * 
 * 원형)
 * String substring(int start)
 * 
 * String substring(int start, int end)
 * -> end는 end-1을 해서 가져온다
 * 
 * 
 * 문자열을 자르는 경우
 *
 * 
 */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String msg="0123456789";
         
         //3번부터 전체를 가져온다
         System.out.println(msg.substring(3));
         
         // 1~5까지 부분만 가져온다
         System.out.println(msg.substring(1, 6));
         
         // 우편번호 자르기
         String post="100-111";
         System.out.println(post.substring(0,3));
         System.out.println(post.substring(4));
         
         String title="Hello Java,Oracle";
         String temp=title.substring(0,10)+"...";// 0~9까지 문자열 가져옴 
         System.out.println(temp);
         
         
	}

}
