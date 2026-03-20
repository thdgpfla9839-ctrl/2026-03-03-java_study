/* 다른 거 끼리 묶는 것 : 클래스
 * 같은 거 끼리 묶는 것 : 배열

 * 저장 => 메모리 저장 구조
 *   메모리 구조:
 *      MethodArea or  : 정적변수(=static) , 메소드 정보가 저장됨
 *                       생성시점은 컴파일에 의해 자동 메모리 저장
 *                       new없이 사용이 가능 / 프로그램 종료시까지 유지
 *                       접근할 때: 클래스명.변수명,클래스명.메소드 이렇게 쓴다
 *      Stack : 지역변수, 매개변수가 저장됨
 *              생성/소멸시점: 메소드 호출하면 생성, 메소드 종료하면 메모리에 의해 자동해제
 *              사용자가 직접 초기화를 한 후에 사용해야함
 *              사용은 블록안에서만 {} 사용이 가능
 *              객체에 주소값을 저장해서 Heap에서 데이터 읽기
 *      Heap : 객체에 실제 데이터, 실제 배열데이터가 저장됨
 *             생성과 소멸: new를 사용할때마다 생성됨-> 새로운 공간이 만들어서 저장, 사용하지 않거나 null값인 경우 가비지컬렉션(GC)에 의해 해제
 *             프로그래머가 직접 메모리 크기를 할당해서 저장 공간 크기를 만들어야함 => new를 사용하면 됨 -> 장점: 자동초기화가 됨(기본값)       
 * 멤버변수 
 *     1) 정적변수 : static(공유변수)-> 메모리 공간 1개
 *     2) 인스턴스 변수 : new 사용시 마다 메모리가 따로 생성
 * 4대 특성 이론(면접용으로 알아둬야할 이론!)
 *    캡슐화 : 보안(데이터 보호하는 목족으로 사용) -> 변수를 감춰주는 것(private 사용해서 읽기/쓰기(getter/setter 사용) 부여)
 *    상속 : 재사용 -> 상속확장(extend)
 *    다형성 : 오버라이딩 (상속 받아서 메소드의 기능변경/ 기능추가)
 *    추상화 : 공통 득징만 정의-> 인터페이스/ 추상클래스 
 *    포함(재사용)
 *    수정(오버라이딩)
 * 
 * 상속/클래스의 종류
 *    추상클래스
 *    인터페이스
 *  => 오버라이딩- 기능설계-직접구현
 *     서로다른 클래스를 모아서 한번에 관리
 *     다른 클래스에 영향이 없게 만드는 프로그램 
 *     스프링(인터페이스 기반)  
 * 예외처리 : 만든 프로그램이 견고하지 못해 에러생기는 걸 사전에 방지하기 위해 사용
 * --------------------------------------------------// 기초문법에 해당
 * 라이브러리
 *   1) java.lang : Object , String , StringBuffer , Wrapper , Math
 *   2) java.util : StringTokenizer, Collection => ArraysList , Map, Set
 *   3) java.io : 메모리, 파일 , 네트워크
 *   4) java.net : 네트워크
 *   5) java.sql : 데이터베이스      
 *   
 *         
 *  변수가 나오면 초기값을 잡는다
 *  초기값 : 프로그램에서 처음부터 필요한 값
 *  
 *         기본값 
 *            int a; -> 0
 *         명시적 초기값 
 *          int a=100;
 *          연산처리/제어문/파일/크롤링은 클래스 안에서는 사용이 불가능해 -> 생성자 or {}블록을 사용해서 그 안에 구현한다
 *         static 블록 : 인스턴스 변수는 사용 불가능/ static 변수만 사용가능함     
 *         static
 *         {
 *            구현 자리
 *         }
 *         인스턴스 블록 :  인스턴스 변수의 초기화를 줄때 / static변수 가능
 *         
 *         {
 *           구현 자리
 *         }
 *         생성자 : 인스턴스 변수의 초기화/ static변수 가능 
 *         
 * Sawon s1 =new Sawon(); -> 메모리에 저장
 *           new는 뒤에 오는 생성자의 메모리를 생성해줌 - 메모리 주소값을 s1에 대입한다
 * => 모든 클래스는 메모리 크기가 4byte
 *    new는 단독 사용 불가
 *    생성자도 단독으로 사용 불가
 *    반드시 new 생성자()  
 *    ----------------------------------------
 *       s1의
 *    메모리 주소(예를들어 0x100번이다 )                    sabun -> s1.sabun
 *                                                    메모리 주소 :0x100
 *                                                    기본값 : 0 
 *                                                   name
 *                                                    메모리 주소 동일
 *                                                    기본값 : null
 *                                                   dept
 *                                                    메모리 주소 동일
 *                                                    null
 *                                                   job
 *                                                    메모리 주소 동일
 *                                                    null
 *                                                   loc
 *                                                    메모리 주소 동일 
 *                                                    null   
 *    초기화 블록은 1번만 수행가능
 *    생성자는 사용자의 값을 받아서 초기화 -> 시작과 동시에 처리하는 기능(데이터베이스 드라이버 등록/)                                                                
 */
import java.io.*;
 class Sawon{
	 // 변수생성 -> 명시적 초기화 해보자
	 int sabun=100;
	 String name="길동이";
	 String dept="개발부";
	 String job="사원";
	 String loc="서울"; // 클래스영역에는 파일읽기가 안돼 값만 선언과 동시에 값 지정만 가능
//=============================================================================여기까지 Heap영역에 저장
	 static String company="SIST"; // -> 메소드 영역에 저장됨
	 
//-----------------------------------------------------------------------------	 
// 초기화 블록(데이터베이스에 있는걸 불러올때 사용한다)=> 파일에서 읽어와야함
//	 {
//		 sabun=200;
//		 name="가나다";
//		 dept="총무";
//		 job="대리";
//		 loc="부산";
//	 }
// --------------------------------

// 직접에러처리(try~catch)
// throws -> 간접처리 / 에러 선언 (다음 번 사용시에 예외처리를 하라)
	 
	 // 초기화 블록생성/ 지금은 인스턴스변수로 만듦(이 블록안에는 인스턴스 변수와 정적변수만 올 수 있다.) 
	// 2번 순서(static블록이 먼저 읽히고 그다음 인스턴스 블록이 읽히기 떄문에 출력이 인스턴스 블록이 된다)
	 { 
	try
	{
	 FileReader in = new FileReader("c:\\javaDev\\sawon.txt");
	 int i=0;
	 String result="";
	 while((i=in.read())!=-1)
	 {
		 result+=(char)i;
	 }
	 in.close();
	 String[] info=result.split("\\|");
	 sabun=Integer.parseInt(info[0]); // 문자열을 다른 데이터형으로 변경 p.67
	 
	 name=info[1];
	 dept=info[2];
	 job=info[3];
	 loc=info[4];
	 
	}catch(Exception ex) {}
	 
	 company="쌍용 강북";
	 } // 인스턴스블록
	 
	 // 이제는 static 블록만들거임 1번 순서
	 static {
		     company="SIST 쌍용";   
	        }
	 // 동작순서 : 기본값 - 명시적 초기화 -static{} - {}- 생성자
	 // static 변수 초기화는 static {} 에서
	// instance 변수 초기화는 생성자에서  
// 명시적 초기화가 가능하면 명시적 초기화를 우선시하고 안 되면 static 변수 초기화/ 인스턴스 초기화 한다	 
 }
public class 생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 // 기본값 출력
		Sawon s1=new Sawon();
		// 다른 영역에는 침범 불가능 -> 지정된 주소에 있는 데이터만 사용가능 -> 여기서는 s1에 있는 저장된 데이터들만
		System.out.println("저장된 위치: "+s1);
		//Sawon@1f32e575 출력했더니 이 주소가 나옴 이 주소에 저장된 데이터들만 사용가능하다
		System.out.println("name: "+s1.name);
		System.out.println("dept: "+s1.dept);
		System.out.println("job: "+s1.job);
		System.out.println("loc: "+s1.loc);
		System.out.println("회사명:"+Sawon.company); // -> 공유가 된 거기 떄문에 클래스명.company로 받아온것이다
		
		
		Sawon s2=new Sawon();
		System.out.println("저장된 위치: "+s1);
		System.out.println("name: "+s2.name);
		System.out.println("dept: "+s2.dept);
		System.out.println("job: "+s2.job);
		System.out.println("loc: "+s2.loc);
		System.out.println("회사명:"+Sawon.company);
		
		
	}

 }

