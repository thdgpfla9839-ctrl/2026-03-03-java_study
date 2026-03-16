/*
 * 3개의 숫자를 난수 -> 난수발생
 * 사용자가 3개를 입력 -> 사용자 입력
 * 힌트부여  -> 힌트
 * 자리수+숫자가 맞으면 5(스트라이크)
 * 숫자만 맞으면 8                 => 정답확인 및 종료 (반복문)
 */
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner scan=new Scanner(System.in);
              //난수
              int[] com = new int[3]; // 컴퓨터가 난수값 저장
              int[] user = new int[3]; // 사용자 입력시
              
              //난수 발생 -> 초기화
              for(int i=0;i<3;i++)
              {
            	  com[i]=(int)(Math.random()*9)+1; // 1~9 사이의 정수
            	  for(int j=0;j<i;j++)
            	  {
            		  //j는 이미 배열에 저장된 값
            		  //i는 현재 발생한 난수값
            		  if(com[j]==com[i])
            		  {
            			  i--;
            			  break;
            		  }
            	  }
              }
            //사용자 입력받기
          	while(true) // 횟수 지정 안됨
          	{
          		System.out.print("세자리 정수를 입력해 : ");
          	    int input=scan.nextInt();
          	    //잘못된 입력인지
          	    if(input<100 || input>999)
          	    {
          	    	System.out.println("ㅠ.ㅠ 입력 잘못함");
          	    	// 처음으로 이동
          	    	continue; // while문은 조건식으로 이동/ for문은 증가식으로 이동 -> 지금은 while문이니 트루로 돌아갈듯
          	    }
          	    //배열에 저장
          	    user[0]=input/100;
          	    user[1]=(input%100)/10;
          	    user[2]=input%10;
          	    
          	    // 잘못된 입력(같은 수 입력 안 됨, 0을 입력해도 안 됨) -> 이 조건을 달아주자
          	    if(user[0]==user[1] ||user[0]== user[2] || user[1]==user[2])
          	    {
          	    	System.out.println("같은 수는 사용 못해!!!");
          	    	continue;
          	    }
          	    if(user[0]==0 || user[1]==0 || user[2]==0)
          	    {
          	    	System.out.println("0 사용 불가능");
          	    	continue;
          	    }
          	    //유효성 검사 -> 프로그램에 필요한 값이 입력이 됐는지 확인
          	    // 비교
          	    int s=0,b=0;
          	    for(int i=0; i<3;i++)
          	    {
          	    	for(int j=0;j<3;j++)
          	    	{
          	    		if (com[i] == user[j]) // 같은 수가 있는지 확인
          	    		{
          	    			if(i==j)
          	    				s++;
          	    			else
          	    				b++;
          	    		}
          	    	}
          	    }
          	    System.out.printf("Input Numer:%d, Result : %dS-%dB\n", input,s,b);
          	    if(s==3)
          	    {
          	    	System.out.println("게임오버"); 
          	    	break; // while 종료
          	    
          	    }
          	}
	}
	

}