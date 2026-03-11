/*
 * 자바 기본문법 : 변수, 데이터형,연산자,제어문
 * 프로그램제어 : 관련된 명령문 묶기 -> 메소드 / 변수 묵기 -> 배열, 클래스
 * 데이터 보호 -> 캡슐화 / 재사용 -> 상속, 포함 /수정 쉽게 -> 오버라이딩 / 추가기능 -> 오버로딩
 * 설계 : 인터페이스
 * => 위 전부를 객체지향이라고 함
 * 
 * 예외처리 : 프로그램이 비정상 종료 방지 / 미리 에러에 대한 처리 
 * 라이브러리 (자바제공)
 * 
 * 최종 : 네트워크 / 데이터베이스
 * 
 * 
 * 제어문 중 다중조건문(범위가 있는 경우에 주로 사용됨/ 예를들어 웹) : 일반 프로그램에서 많이 사용
 *                   웹에선는 가끔
 *                   화면에서 메뉴 클릭시 (메뉴처리- 부메뉴)
 *                   성적 처리
 *                   계산기, 금융계산기
 *                   => 저런 세가지 같은 경우에 많이 다중 조건문 쓰임
 *                  
 * 1. 형식
 *       if(조건문)
 *       {
 *          조건이 트루면 실행하는 명령문을 적는다 -> 종료됨
 *          조건이 펄스면 다음 조건문인 else if 조건문으로 넘어간다 
 *       }
 *       else if(조건문)
 *       {
 *           조건이 트루이면 실행하는 명령문
 *       }
 *       else  필요시에만 사용  =, -, *, / 
 *       { 
 *          조건이 없는 경우(위 조건문에 해당되는 경우가 없으면 else를 실행함)
 *       }
 *   -> 1개의 해당 조건만 수행 
 *   
 *2.  동작
 *    처음부터 시작 -> 해당 조건 찾기 -> 해당 조건 찾으면 문장 실행하고 종료
 *    
 * 3. 처리     
 *   경우의 수가 여러개인 경우 
 *   =, -, *, /
 *   enter / space 와 같은 키보드 값 처리
 *   메뉴가 여러개 일때 처리            
 *                   
 *  위 세가지를 단순화 한 경우가 switch~case -> 한개의 값 처리       
 *  
 *            
 */
/*
 * 사칙연산처리 
 * + - * / -> 4가지 외의 다른 연산처리는 else
 * 입력 - > Scanner 
 */
import java.util.Scanner;
public class 제어문_다중조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 입력받을 준비 스캐너~ 
		Scanner scan=new Scanner(System.in);
		//System.in에 키보드 값 입력 -> 받아서 메모리에 저장하는 역할
		//API 자바에서 제공
        // 1.첫번째 숫자 입력
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		// 2.연산자 입력
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next(); // 연산자를 op로 설정
		// 자바에서 입력하는 모든 장치는 char(x) -> Srtring
		//Scanner 단점은 엔터/공백
		// aaa bbb ccc -> 엔터 -> 결과값은 aaa => next()
		// nextLine()
		//=> 웹/window -> 입력창
		// 3.두번째 숫자 입력 -> 저장 -> 결과값 출력시 읽기
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		// 연산처리
		if(op.equals("+"))
		{
			System.out.printf("%d+%d=%d\n:",num1,num2,num1+num2);
		} // +면 수행하고 종료
		else if(op.equals("-"))
		{
			System.out.printf("%d-%d=%d\n:",num1,num2,num1-num2);
		}
		// 위 세가지를 입력했다가 결과값 출력할 떄 읽기
		else if(op.equals("*"))
		{
			System.out.printf("%d*%d=%d\n:",num1,num2,num1*num2);
		}
		else if(op.equals("/"))
		{
			//에러발생 가능성있음 -> 0을 입력했을 때 분모가 0이면 안되니까
			if(num2==0)
				System.out.println("0으로 나눌 수 없다");
			else
				System.out.printf("%d/%d=%d\n:",num1,num2,num1/num2);
			
		}
		else
		{
			System.out.println("연산자 입력이 잘못되었습니다");
		}
	}

}
