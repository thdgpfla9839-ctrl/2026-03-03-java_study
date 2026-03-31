package com.sist.lang;
/*
 * System
 * 1) 프로그램 종료
 *     System.exit(0) : 0은 정상종료 / 비정상 종료
 *     -> 윈도운 종료
 * 2) 입출력
 * System.in
 * System.out 
 * => 자바 표준 입출력
 * System.in.read() -> 한글자만 입력이 가능하다 그래서 전체를 받으려면 스캐너를 쓴다
 * => 키보드 입력값을 받은 경우 
 *    반드시 예외처리
 *    in:InputStream
 *    리턴형 int
 * System.out.print()
 * => 화면출력
 *    out:OutputStream
 * 3) 메모리 회수
 *    System.gc()
 * => 가비지 컬렉션
 * 4) 시간 측정
 *    System.currentTimeMillis()
 *    => 웹에서 로그파일
 * -----------------------------------
 * System은 대부분이  static으로 만들어짐          
 */
public class System_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             // 종료
		int a=5;
		for(int i=1; i<=10;i++)
		{
			if(i==a)
			{
				System.out.println("종료");
				System.exit(0); // main종료
//				 break;              // break는 for문 종료
			}
			System.out.println("i="+i);
		}
		System.out.println("시작");
		System.out.println("go"); // break ; 살려서 출력하면 나옴
	}

}
