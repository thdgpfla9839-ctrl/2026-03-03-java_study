/*
 * 배열의 필요성
 * 데이터 여러개를 한개의 이름으로 처리 -> 배열/클래스
 * 명령문을 한개의 이름 통합해서 관리 -> 메소드
 * 클래스 여러개를 한번에 한개의 이름으로 관리 -> 인터페이스
 *  
 */
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan=new Scanner(System.in);
          
          // 변수 설정
          // 1.문제 학생 3명의 국영수 총합 평균 학점 구하기
          int kor1, kor2,kor3;
          int eng1, eng2, eng3;
          int math1, math2,math3;
          int total1, total2,total3;
          double avg1,avg2,avg3;
          
          
          System.out.print("첫번째 학생의 국어 점수: ");
          kor1=scan.nextInt();
          
          System.out.print("첫번째 학생의 영어 점수: ");
          eng1=scan.nextInt();
          
          System.out.print("첫번째 학생의 수학 점수: ");
          math1=scan.nextInt();
          
          total1=kor1+eng1+math1;
          avg1=total1/3.0;
          
          
          System.out.print("두번째 학생의 국어 점수: ");
          kor2=scan.nextInt();
          
          System.out.print("두번째 학생의 영어 점수: ");
          eng2=scan.nextInt();
          
          System.out.print("두번째 학생의 수학 점수: ");
          math2=scan.nextInt();
          
          total2=kor2+eng2+math2;
          avg2=total2/3.0;
          
          
          

          System.out.print("세번째 학생의 국어 점수: ");
          kor3=scan.nextInt();
          
          System.out.print("세번째 학생의 영어 점수: ");
          eng3=scan.nextInt();
          
          System.out.print("세번째 학생의 수학 점수: ");
          math3=scan.nextInt();
          
          total3=kor3+eng3+math3;
          avg2=total3/3.0;
          
          // 출력
          System.out.printf("%5d%5d%5d%5d%7.2f\n",kor1,eng1,math1,total1,avg1); //7은 공백포함 글자간격
          System.out.printf("%5d%5d%5d%5d%7.2f\n",kor2,eng2,math2,total2,avg1);
          System.out.printf("%5d%5d%5d%5d%7.2f\n",kor3,eng3,math3,total3,avg1);
                             
          
	}
}
//변수가 많을수록 출력할게 많아지니 번거로움
	 //  배열등장
	//   배열은 데이터를 모아 관리하는 기법
	//   같은 데이터형을 여러개 모아서 한개의 이름으로 관리
	//   
/*    장점 : 변수 여러개를 1개로 제어가능 -> 반복문을 이용해서
 *          연속적으로 메모리 저장
 *          => 인덱스 번호사용 (0부터)
 *          
 *    단점 : 고정적이라 추가 및 삭제 어려움
 *            => 가변형으로 바꾸면 단점들이 개선됨-> 이때 컬렉션을 이용한다     
 * 
 * 변수/클래스/배열은 RAM에 저장 -> 그래서 프로그램 종료시 삭제됨
 */



