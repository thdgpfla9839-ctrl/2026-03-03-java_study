// main은 프로그램 시작점, 프로그램 안에는 반드시 main이 한개 이상
public class 선택조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String id="admin";
     String pwd="1234";
     
     // 아이디와 비번이 같은 경우는 if수행
     // hover 일때 if~else문장씀
     
     if(id.equals("admin")&& pwd.equals("1234"))
     {
    	 System.out.println("로그인 성공"); // if문에 조건 트루
     }
     else // 아이디와 비번이 다른 경우
     {
    	 System.out.println("로그인 실패"); // if문 조건이 펄스
     }
    		
	}

}
