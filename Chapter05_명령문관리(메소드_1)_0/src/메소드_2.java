// 국어 영어 수학 총점 평균 학점 구하기
/*
 * 입력
 * 총점처리
 * 평균처리 
 * 학점처리
 * 결과값 출력
 * 
 * -> 5개 메소드
 */
import java.util.Scanner;
public class 메소드_2 {
   // 반복 제거
	static int input(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+"입력 : ");
		return scan.nextInt();
	}
	static int total(int kor,int eng, int math)
	{
		return kor+eng+math;
	}
	static double avg(int total)
	{
		return total/3.0;
	}
	static String score(int avg)
	{
		String score=switch(avg)
				{
				case 10, 9 -> "A";
				case 8 -> "B";
				case 7 -> "c";
				case 6 -> "D";
				default -> "F";
				}; 
				return score;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학"); // iuput으로 입력값 간결하게 
		
//		int total=kor+eng+math;
//		double avg=total/3.0;
//		
//		
//		String score = switch((int)(avg/10))
//		{
//		case 10, 9 -> "A";
//		case 8 -> "B";
//		case 7 -> "c";
//		case 6 -> "D";
//		default -> "F";
//		};
//		
//		System.out.println("총점: "+ total);
//		System.out.println("평균: "+avg);
//		System.out.println("학점 : "+score);
		
		int t=total(kor,eng,math);
		double a=avg(t);
		
		String s = score((int)(a/10));
		
		System.out.println("총점"+t);
		System.out.println("평균"+a);
		System.out.println("학점"+s);  // 간결화
//		
//       Scanner scan=new Scanner(System.in);
//       
//       System.out.print("국어 : ");
//       int kor=scan.nextInt();
//       
//       System.out.print("국어 : ");
//       int eng=scan.nextInt();
//       
//       System.out.print("국어 : ");
//       int math=scan.nextInt();
//       
      
       
       
	}

}
