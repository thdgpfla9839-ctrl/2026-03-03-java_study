/*
 * 문자열 분리 p.162
 * 
 * split :문자열 분리
 * 원형)
 * String[] split(String regex);
 * 
 * 
 * 정규식 기호
 * |
 * .
 * ?
 * *
 * +
 * -> split에서 이런 기호가 있는 경우 \\를 해서 가져온다
 */
public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String color="red,green,yellow,black,pink";
        String[] colors=color.split(","); // ,별로 잘라라
        for(String c:colors)
        {
         System.out.println(c);
        }
        
        System.out.println();
        
        color="red|green|yellow|black|pink";
        String [] colors2=color.split("\\|"); // 정규식 기호가 있는데 \\를 안 해주면 한글자씩 잘려서 잘못 나온는 경우가 발생(꼭 두개해주기) 
        for(String c:colors2)
        {
        	System.out.println(c);
        }
        
       
        
	}

}
