/*
 * 변수는 초기값이 없는 상태에서는 메모리에 저장이 안된다
 * 지역변수 : 명시적, 입력, 난수...
 *          예) int a;-> 이러게 하면 저장 안돼
 * 클래스에 선언된 변수는 자동 초기값을 가진다 -> 기본값 형태로  
 * 프로그램 구동 -> 초기값이 필요할 때가 있다
 *               예) String URL="오라클주소";
 *                  파일 읽기나 쿠키 읽을 때는 명시적 초기화가 안돼 그래서 초기화 블록이나 생성자를 이용한다 
 *                  
 * 초기값 -> 생성자
 * 생성자
 * 1.특징(일반 메소드와 다르다)
 *   :클래스명과 동일
 *   리턴형이 존재하지 않는다 -> void는 값이 없는 리턴형이다 그러니 주의할 것
 *   오버로딩(같은 이름의 메소드를 여러개 만드는 것)을 지원한다
 *   p.226
 *   오버로딩의 조건
 *    1) 메소드명이 동일해야함
 *    2) 리턴형은 관계없다(생성자는 리턴형이 없다)
 *       int a( ) -> a()
 *       double a(int a) ->a(int) 로 저장된다
 *    3) 매개변수의 개수가 틀리다/ 데이터형이 다른 경우
 *    4) 접근 지정어도 관계없다
 *    5) 같은 클래스안에서 생성
 * 2. 역할
 *    : 멤버변수의 초기화
 *      시작과 동시에 처리하는 기능(예: 네트워크 / 크롤링/ 데이터베이스 / 웹개발/ String AI)
 *      클래스를 메모리에 저장하는 경우-> new 생성자( );
 *      
 *      
 *       
 *    
 *                            
 */
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//class A
//{
////	A(){
////		System.out.println("생성자 호출");
////		}
//	
//	void A() // 없는 경우에만 디폴트 생성자가 생성됨
//
//
//{
//		System.out.println("호출");
//	}
//}
//@AllArgsConstructor
//@NoArgsConstructor
 class A
{
	int a,b;
}
	
	

public class 생성자_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           A a=new A(); 
           
	}

}
