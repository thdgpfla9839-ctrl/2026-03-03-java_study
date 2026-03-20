/* 
 * 클래스에서는 초기값 따로 표시없으면 값이 0값인가? 이거 확인해보기
 * class A
 * {
 *    static int a;
 *    int b;
 *    String s;    -> 이때 초기값 따로 표기 없는데 0이라고 그러길래
 *    클래스 영역에서 선언하면 자동 초기화됨
 *    int -> 0
 *    long -> 01
 *    double -> 0.0
 *    boolean -> false
 *    String -> null
 * }
 * 
 * A aa= new A() => 인스턴트 저장  : 앞 A는 데이터형 / aa는 변수명 / new 메모리 생성 / A()는 생성자로서 초기값을 저장하는 역할 / 생성자는 특수함수라서 클래스 이름이랑 맞춰야함 / 인스턴트에 저장이라는 건 메모리 주소를 전송했다는 소리
 * A bb= new A()
 * 
 * 
 * 
 * 필기 참고
 * 클래스의 구성요소
 * 객체지향 프로그램의 특성
 * 클래스 안에 변수의 종류
 * 변수를 어떻게 활용할지
 * 
 * 
 * 객체지향의 장점
 * p.207
 * 1) 유지보수 굿/ 수정이나 추가 편리해
 * 2) 재사용성 향상/ 상속, 인터페이스에 관련
 * 3) 확장성 굿 -> 새로운 기능을 추가할 수 있다는 말
 * 4) 신뢰성 굿 -> 이미 사용하고 있는 걸 갖다 쓰니까 좋지
 * 5) 코드 가독성이 좋다
 * ----------------------------
 * 객체 생명주기
 * class : 설계  => 데이터 /기능
 * |
 * 메모리 저장 : new / 객체
 * |
 * 활용
 * |
 * 매모리 소멸
 * 
 * 
 * 객체 : 클래스 변수(일반 변수와 구분짓기)
 *       데이터형(사용자 정의)
 *       구분 : 일반 => 변수 , 클래스 => 객체
 *       
 */

import lombok.Getter;
import lombok.Setter;

//@Data 이거 지우면 주소값 확인이 되는 거고, 데이터를 주면 데이터값 뭐가 들어있는지 나옴
@Getter
@Setter // 이거 둘다해도 주소나옴
class Sawon{
	private String name;
	private String job;
	private String loc;
	private long pay; // 캡슐화
	
	
	
	
}
public class 객체지향프로그램_개념 {
 // 생성자는 자동으로 생성돼 있음
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           // Sawon sa=new Sawon(); // 저장 
           // sa. 이렇게 하면 만들어둔 getter,setter들이 자동으로 나옴 / .은 주소 접근 연산자
		Sawon sa1=new Sawon();
		Sawon sa2=new Sawon();
		Sawon sa3=new Sawon();
		
		System.out.println("sa1="+sa1); 
		System.out.println("sa2="+sa2);
		System.out.println("sa3="+sa3);
		
	}

}
