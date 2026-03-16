/*
 * 3명의 학생
 * 국영수 점수입력
 * 총점 평균 학점 등수 구하기
 */
import java.util.Scanner;
public class 등수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //데이터를 저장할 공간 만들기
		//기능별로 데이터를 나눠야함
		int[] kor=new int[3]; //3명이니까 []안에는 3
		int[] eng=new int[3];
		int[] math=new int[3];
		
		int[] total=new int[3];
		int[] rank=new int[3];
		
		
		char[] score=new char[3];
		double[] avg=new double[3];
		
		String[] name=new String[3]; // 여기까지를 클래스형으로 대체 가능
		
		
		//초기화
		Scanner scan =new Scanner(System.in);
		for(int i=0;i<3;i++)
		{   
			System.out.print((i+1)+"이름 : ");
			name[i]=scan.next();
			
			System.out.print((i+1)+"번째 국어 점수 : ");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어 점수 : ");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학 점수 : ");
			math[i]=scan.nextInt();
			
			
			total[i]=kor[i]+eng[i]+math[i];
			avg[i]=total[i]/3.0;
			
			String s=switch((int)(avg[i]/10))
           {
        	   case 10 , 9-> "A";
        	   case 8-> "B";
        	   case 7 ->"C";
        	   case 6 -> "D";
        	   default -> "F";
            };
            score[i]=s.charAt(0);
		}
		
		//연산처리 -> 등수
		for(int i=0;i<3;i++)
		{
			rank[i]=1;
			for(int j=0;j<3;j++)
			{
				if(total[i]<total[j])
				{
					rank[i]++;
				}
			}
		}
		//결과값
		for(int i=0;i<3;i++)
		{
			System.out.printf("%7s%5d%5d%5d%7d%7.2f%3c%3d\n",
					name[i],kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
		
	}

}
