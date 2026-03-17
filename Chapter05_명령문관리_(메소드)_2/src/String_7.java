/*
 * trim(): 좌우(맨앞과 맨뒤) 공백제거 -> 유효성 검사에서 주로 쓰임
 * 
 * valueOf(): 모든 데이터형을 문자열로 변경
 * valueOf(100)=> "100" -> 큰따옴표는 문자열 
 * 
 * format() : 형식을 변경
 *            printf와 동일
 */
import javax.swing.*;
public class String_7 extends JFrame  {
         
	JTextField tf=new JTextField();
    public String_7()
    {
    	
   	 add("North",tf);
   	 tf.setText(String.valueOf(10));
   	 // valueOf은 static임 => 매모리에 저장하지 않고 사용
   	 // = Math.random()
   	 setSize(300,350);
   	 setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new String_7();
	}

}
