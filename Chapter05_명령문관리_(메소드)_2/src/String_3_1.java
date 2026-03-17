/*
 *   indexOf 
 *   앞에서 찾기 -> 문자 찾는 경우
 *   lastIndexOf 
 *   뒤에서 찾기 -> 파일 찾기
 */
public class String_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String msg="Hello Java";
      //           0123456789
       System.out.println("a의 위치: "+msg.indexOf("a")); // 일반적으로 찾는 경우 사용
       System.out.println("a의 위치: "+msg.lastIndexOf("a")); // 경로, 확장자를 찾을 때
       System.out.println("b의 위치: "+msg.indexOf("b"));
       System.out.println("b의 위치: "+msg.lastIndexOf("b"));
       String ext=msg.substring(msg.lastIndexOf("b")+1);
       System.out.println(ext); // 문자열을 사용해서 제어 -> 원본은 블변 
	}

}
