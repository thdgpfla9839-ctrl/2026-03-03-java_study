/*
 * 강사님 내용이랑 비교후 수정
 * 객체에 생명주기
 * 설계(변수/ 메소드) : class{} 부분 -----------------------------변수의 초기화(생성자/static{ }) ---------------------메모리 저장(new 생성자())-----------활용(객체.메소드 / 객체.변수명)--------소멸( )
 * 
 * 변수의 초기화
 * => 다른값 넣고 싶을 때 => 생성자를 사용하면 됨
 * 생성자의 특징
 * : 클래스명과 동일 / 리턴형 존재하지 않음
 * 
 * 1) 생성자 생성
 *   class A
 *   {
 *     A( ){} -> 기본 생성자
 *     A(int a){} // 오버로딩 -> 여러개 생성자 만들 수 있더
 *   }
 *   ---------------------------------------------
 *   class A
 *   {
 *     A(int a){} -> 1개만 만들 수도 있다
 *   }
 *   ---------------------------------------
 *   class A
 *   {
 *     /// 생략하면 자동으로 A(){ -> 기본형으로 자동 생성됨
 *   }
 *   -----------------------------------------------
 *   
 */
// 가급적이면 클래스 한개당 파일 하나만 쓰자
class Member 
{
	int a;
	Member() {
		a=100;
		System.out.println("Member 생성자 호출=a"+a);
		
	}
	void display()
	{
		System.out.println("객체 활용");
	}
	@Override // 마우스 우클릭 - 소스- 오버라이드/ 임플리먼드 메소드 
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	 System.out.println("객체 소멸");
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              // 생성
		Member m=new Member();
		
		// 활용
		m.display();
		
		//소멸
		m=null;
		System.gc(); // 바로 소멸시키는 법
	}

}
