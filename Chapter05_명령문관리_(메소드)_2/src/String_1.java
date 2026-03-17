/*
 * p.155
 * 
 * equals
 * equalsIgnoreCase
 * => 둘다 리턴형이 boolean
 * boolean equalsIgnoreCase (String s)
 * boolean equals (String s)
 * => 둘다 조건문에서 주로 사용
 * 
 *  
 * 
 * 
 */
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String hong="admin";
        String shin="admin";
        String park=new String("admin");
        String lee="Admin";
        
        // ==은 주소를 비교
        if (hong==shin)
        {
        	System.out.println("홍과 신은 같다");
        	
        }
        else
        {
        	System.out.println("홍과 신은 같지 않다");
        }
        
        
        
        //홍 주소 안에 있는 문자열과 박이 갖고 있는 문자열이 같은지 비교
        if (hong.equals(park))
        {
        	System.out.println("홍과 박은 같다");
        	
        }
        else
        {
        	System.out.println("홍과 박은 같지 않다");
        } //equals는 상세보기, 아이디찾기, 비번찾기, 로그인에 많이 사용
        
        
        
        if(hong.equals(lee))
        {
        	System.out.println("홍과 이는 같다");
        }
        else
        {
        	System.out.println("홍과 이는 같지 않다");
        }// equals는 대소문자를 구분함
        
        
        
        
        if(hong.equalsIgnoreCase(lee))
        {
        	System.out.println("홍과 이는 같다");
        }
        else
        {
        	System.out.println("홍과 이는 같지 않다");
        }//equalsIgnoreCase 대소문자 구분 안함
        
	}

}
