/*
 *  1. 조건문 : if, if~else , if~ else if
 *  2. 선택문 : switch~case 
 *  
 *   코딩 간결화 이유
 *    가독성
 *    간결성 -> 중복 코딩(반복문, 메소드, 클래스(라이브러리)를 모아서 저장 => 공통 모듈 => Spring : AOP)을 어떻게 처리하는지
 *    최적화 -> 클래스를 잘 선택해야함
 *    
 *    
 *   반복문
 *    for문 : 화면처리(UI) , 알고리즘에 사용 -> 배열/클래스를 이용해 처리함
 *            반복횟수 지정됨
 *    while 문 : 파일, 데이터베이스, 네트워크에 사용
 *               간단한 게임 만들 수 있음
 *               반복횟수 지정 안됨
 *               시작 후 조건검색
 *    do~while믄 : 시작화면 출력
 *                 한번 이상 반드시 출력할 때 사용
 *                시작과 동시에 문장출력 후 조건검색
 *   
 *   제어
 *   break : 반복을 종료
 *   continue : 건너뛴다 -> 특정 부분에서 제외 // 여기까지가 반복문
 *   
 *   반복문의 형식
 *   
 *   시작값  int i=1
 *   끝값    i<=10
 *   몇번수행 (몇바퀴 돌리는지) i++ , i+=2 , i+=3
 *   
 *   
 *   for (시작값;끝값;증가값)
 *   
 *          실행문장
 *          
 *          
 *          
 *          
 *          false면 종료
 *          
 *          
 *          
 *       시작값
 *       while(끝값) -> 반드시 트루/펄스가 나오는 연산자 사용(부정,논리,비교연산자)
 *       {
 *         실행문장
 *         증가값
 *       } 
 *    --------------------------------------------------------------두 조건문은 선조건/후조건 순서차이임     
 *         시작값
 *         do
 *         {
 *            실행문장
 *            증가값
 *            
 *         }while(끝값);
 *          
 */
import java.io.*;
public class 제어문_반복문_while문 {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
//         File file=new File("C:\\javaDev\\movie.txt"); // 파일의 글자가 깨지면 유니코드 UT-8로 다시 저장하기
//         FileReader fr=new FileReader(file);
//         
//         // String movie="";
//         StringBuffer db=new StringBuffer(); // 몇개 추가 하면 실행결과가 보기 편해짐 / 기존 18번, 22번 삭제하고 
//         int i =0;
//         while((i=fr.read())!=-1) {
//        	 // movie+=(char)i;
//        	 db.append((char)i);
//         }
//         fr.close();
//         System.out.println(db.toString());
		
		System.out.println("===========for문==============");
		for(char c='A';c<='Z';c++)
		{
			System.out.print(c+" ");
		} // char c='A' -> 변수 사라진다
		System.out.println("\n========while========");
		char c='A';
		while(c<='Z')
		{
			System.out.print(c+" ");
			c++;
		}
		//c = z+1
		System.out.println("\n=========do~while=======");
		
		c='A'; //-> 와일문에서 c값이 지정됐어서 A~Z까지 쓰기위헤 다시 정의
		do
		{
			System.out.print(c+" ");
			
		} while(c<='Z');
		}
	// 강사님거랑 비교 후 다시 만들기

}
