/*
 * 
 */
class Member{
	int mno; // 회원번호는 각자 가져가니 인스턴스변수라 따로 저장
	String name;
	static String company="Daum"; // 공통으로 쓰는 변수다(한 사이트에서의 회원정보이니 같은 사이트를 쓰잖아) 
	//회원과 관련된 데이터를 모아서 저장하는 것 이런게 클래스
	// 클래스는 한명에 대한 데이터임
}
public class 클래스변수_설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 회원저장
		Member m1=new Member();
		System.out.println("m1="+m1);
		m1.mno=100;
		m1.name="길동";
		Member m2=new Member();
		System.out.println("m2="+m2);
		m2.mno=200;
		m2.name="둘리";
		Member m3=new Member();
		System.out.println("m3="+m3);
		m3.mno=300;
		m3.name="도우너";
		
		System.out.println();
		
		//  stack
		//   m1
	//     1f32e575                    heap
		//                          1f32e575 
		//                             mno 
		//                          100 -> m1.mno
		//                            name 
		//                             길동       
		//  -> 여기까지는 따로 쓰니 인스턴스
		// 
		//  MethodArea
		/*     company
		 *      daum -> m1,m2,m3 가 접근이 가능/ 공동으로 사용하는 메모리 공간 = static
		 * 
		 *      -----------------------------------------------------------------------------
		 */
		System.out.println("회원 1 회원번호: "+m1.mno);
		System.out.println("회원 1 이름: "+m1.name);
		System.out.println();
		System.out.println("회원 2 회원번호: "+m2.mno);
		System.out.println("회원 2 이름: "+m2.name);
		System.out.println();
		System.out.println("회원 3 회원번호: "+m3.mno);
		System.out.println("회원 3 이름: "+m3.name);
		System.out.println();
		
		//변경
		m1.name="딸기"; // 이름은 m1만 바뀐다 
		System.out.println("회원 1 이름: "+m1.name);
		System.out.println("회원 2 이름: "+m2.name);
		System.out.println("회원 3 이름: "+m3.name);
		System.out.println();
		
		m1.company="Arenal";
		System.out.println("회원 1 회사명: "+m1.company);
		System.out.println("회원 2 회사명: "+m2.company);
		System.out.println("회원 3 회사명: "+m3.company);
		System.out.println();
		
		// 인스턴스 변수
	/*       객체.변수명  -> 객체변수/ new가 사용될 때 마다 따로 저장
	 *    정적변수 : static
	 *      객체.변수명 -> 클래스변수 / 자동저장
	 * 
	 */
		
		
		
	}

}
