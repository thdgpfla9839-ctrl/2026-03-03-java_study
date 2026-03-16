/*
 * 선택문 : 다중 조건문을 단순화 => 복잡한 소스코딩에서 주로 사용(게임 / 네트워크)
 * 
 * 형식)
 *   switch(정수/문자/문자열) ->boolean, double은 사용 x
 *      {
 *        case "+" :
 *             처리문장
 *             break; -> 종료
 *        case "-" :
 *             처리문장
 *             break; -> 종료
 *             
 *             
 *             
 *        default: 처리 -> else     
 *             
 *      }
 */

import java.util.Scanner;
public class 제어문_선택문 {

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
			
			// 처리 -> 다중조건문 => 조건문
//			switch(op)
//			{
//			case "+" : 
//				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
//				break; // 스위치 종료
//			case "-" : 
//				System.out.printf("%d-%d=%d\n",num1,num2,num1+num2);
//				break; // 스위치 종료
//			case "*" : 
//				System.out.printf("%d*%d=%d\n",num1,num2,num1+num2);
//				break; // 스위치 종료
//			case "/" : 
//				System.out.printf("%d/%d=%d\n",num1,num2,num1+num2);
//				break; // 스위치 종료
//			default : System.out.println("없는 연산자 입니다");
//			}
			switch(op)
			{
			case "+" ->  // : 과 break 대신 ->로 대체된 버전 / 시스아웃 두개 적으려면 {}를 추가로 적어서 그 안에 시스아웃 두문장 적어야 한다
				System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
				 // 스위치 종료
			case "-" -> 
				System.out.printf("%d-%d=%d\n",num1,num2,num1+num2);
				 // 스위치 종료
			case "*" ->
				System.out.printf("%d*%d=%d\n",num1,num2,num1+num2);
				 // 스위치 종료
			case "/" -> 
				System.out.printf("%d/%d=%d\n",num1,num2,num1+num2);
				 // 스위치 종료
			default -> System.out.println("없는 연산자 입니다");
			}
}
}