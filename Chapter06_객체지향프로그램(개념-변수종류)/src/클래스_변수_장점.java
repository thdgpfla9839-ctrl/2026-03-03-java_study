/*
 * 학생 클래스
 *     한명에 대한 모든 정보를 통합된 메모리에 저징이 된다 -> 객체(메모리 주소)
 *  맛집 클래스
 *     맛집 한개에 대한 정보저장
 *     
 *     100번 쓰고 싶으면 new만 붙여서 메모리 공간 만들어 주면됨
 *     ------------------------------------------------
 *  학생
 *  국 영 수 총점 평균 학점 이름 
 *  설계 : 
 *  class Student
 *  {
 *    int kor,eng,math,total;
 *    double avg;
 *    char score;
 *    String name;
 *  }
 */
import java.util.*;
class Student
{ 
	int kor,eng,math,total;
	    double avg;
	    char score;
	    String name; //데이터형
}
public class 클래스_변수_장점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student[] std=new Student[3];
       
       Scanner scan =new Scanner(System.in);
       for(int i=0;i<3;i++)
       {
    	   Student s=new Student();
    	   System.out.print("이름: ");
    	   s.name=scan.next();
    	   
    	   System.out.print((i+1)+"번째 국어점수: ");
    	   s.kor=scan.nextInt();
    	   
    	   System.out.print((i+1)+"번째 영어점수: ");
    	   s.kor=scan.nextInt();
    	   
    	   System.out.print((i+1)+"번째 수학점수: ");
    	   s.kor=scan.nextInt();
    	   
    	   s.total=s.kor+s.eng+s.math;
    	   s.avg=s.total/3.0;
    	   
    	   
    	   std[i]=s;
       } 
       // 출력
       for(Student ss:std)
       {
    	   System.out.printf("%5s%5d%5d%5d%7d%7.2f\n",ss.name,ss.kor,ss.eng,ss.math,ss.total,ss.avg); // s는 문자를 넣고, f는 더블형, d는 정수 , %는 공백
    	   // %7.2f -> 자동 반올림됨
    	   
       }
	}

}

/*
 * 여러명에 대한 정보저장 -> 인스턴스 변수
 * 한개 -> 정적변수 (한번에 변경되게 만드는 것)
 * 
 * class ClassName
 * {
 *    변수 -> 멤버변수 이거 맨 마지막에 써도 상관은 없지만 보기 편하게 윗줄에 쓰자
 *    초기화 -> 생성자(클래스 이름과 동일), 생성자는 단독으로 호출 X, new를 동반
 *    기능설정 -> 메소드
 * }
*/