/*
 * 지역변수 : {}안에서만 사용이 가능 -> 자동 메모리 해제
 *          초기화를 반드시 하고 사용
 * 전역변수 : 다른 클래스에서 사용 가능 
 * 
 * 멤버변수 -> 사용자가 삭제, 
 */
public class 지역변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // for문을 이용해서 
		//  ABCDE
		
		char c='A';
		for(int i=0;i<5;i++)
		{
			System.out.print(c++);
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			char d='A';
			System.out.print(d++);
		} // 지역변수
		System.out.println();
		//상수 선언방법 -> 대문자
		final double PIE=3.14;  // final 주는 경우 배열 / 오라클주소 / 사이트 주소에 사용
		//PIE=2.00;
	}
	
	

}