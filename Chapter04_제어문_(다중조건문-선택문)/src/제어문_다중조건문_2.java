/*
 * 1. 경우의 수를 생각한다
 *  예) 정수 입력받음 -> 음수 양수 확인해라 -> 2가지 경우의 수임 이런 경우는 if~else 사용
 *  
 *     문자입력 -> 대소문자 확인 -> 이경우도 동일
 *     
 *     문자 입력 -> 대문자 소문자 한글 숫자 -> 4가지 경우의수 -> 다중조건문이나 스위치~케이스를 쓸지 선택/ 범위가 있는 다중조건문을 쓰는게 나음
 *     
 *     메뉴 선택 -> 처리  -> switch 사용
 *     
 *     로그인  
 *        아이디 없는 경우
 *        비번 틀린 경우
 *        로그인 시
 *           -> 경우의수가 세개 이상이면 다중조건문이나 스위치~케이스 중 선택해라
 *           
 *  2. 문법 사항         
 *     조건문
 *         { 
 *         }     
 *  3. 어떤 조건인지 보고 -> 비교, 논리 , 부정연산자를 쓴다 => 모든 연산이 트루/펄스로 나옴       
 *  
 *  4. 가장 대표적으로 사용되는 것이 성적계산
 *           조건이 너무 많을때 (case 너무 많이 나열 시) case /10 을 한다 성적계산할 때
 */
import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("점수 입력(0~100):");
		int score=scan.nextInt();
		
		//처리 -> 학점
		char c='A';
//		if(score>=90)
//			c='A';
//		else if(score>=80)
//			c='B';
//		else if(score>=70)
//			c='C';
//		else if(score>=60)
//			c='D';
//		else 
//			c='F';
		
//		switch(score/10) // 정수/정수=정수
//		{
//		case 10:
//		case 9:
//			c ='A';
//			break;
//		case 8:
//			c='B';
//			break;
//		case 7:
//			c='C';
//			break;
//		case 6:
//			c='D';
//			break;
//	   default:   // else 대신 쓰여짐
//		   c='F';
//			
//			
//		}
		String s=switch(score/10) {
		case 10,9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
	   }; // 문장이 끝나니까 ;찍는다
		System.out.println("학점:"+s);
		

	}

}
