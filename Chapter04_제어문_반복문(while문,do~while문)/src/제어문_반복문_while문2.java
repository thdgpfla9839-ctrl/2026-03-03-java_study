/*
 * 1. while
 *    사용자가 구구단 단을 입력
 *    해당 단 출력
 *    
 *    => 변수 필요(사용자가 입력한 단이 필요)-> 하나의 변수 필요
 *          ->루프변수 1~9
 */
import java.util.Scanner;
public class 제어문_반복문_while문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan=new Scanner(System.in);
		System.out.print("원하는 단 입력?");
		int dan=scan.nextInt(); // 사용자 요청 변수
		// 1. 사용자 요구한 데이터 저장
		   // 2. 요구사항 출력 -> 처리
		int i=1; // 1~9까지 변경되는 변수 => 루프(반복문)
		// 출력
		while(i<=9) {
			
			System.out.printf("%d * %d = %d\n", dan,i,dan*i); // %2d\n-> 출력형식이 또 바뀜
			// 출력하는 형식을 만듦
			// 명령프롬프트 사용
			i++; // 9가 될때까지 수행
		}
	}

}
