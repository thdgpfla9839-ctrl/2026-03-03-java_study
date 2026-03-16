/*
 * 1. 1~10까지의 합을 구해서 출력
 *   자체에서 출력할지(리턴형이 없는 경우, 매개변수도 없어 자체 내에서 처리하지 않음?) / 합을 넘겨줄지 (리턴형 상태) / 매개변수가 없는 상태
 *   
 *  2. n값을 받아서 1~n까지의 합
 *   -> 사용자가 매개변수를 갖고 있다
 */
public class 메소드_1 {
      
	// 메소드 선언 위치
	static void sum()
	{
		int hap=0;
		for(int i=1;i<=10;i++)
		{
			hap+=i;
		}
		System.out.println("1~10까지의 합:"+hap); // 1. 
		return; // 생략 가능
	}
	// 매개변수 / 리턴형 
	// 2.문제 n값을 받아서 1~n까지의 합 
	static int sum2(int n)
	{
		int hap=0;
		for(int i=1;i<=n;i++)
		{
			hap+=i;
		}
		return hap;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //메소드 호출 -> 사용자 정의는 자동호출이 없으므로 반드시 호출해야함
		 sum();
		 int a=sum2(20);  
		 System.out.println(a);
		 // return; // 생략시 자동추가
	}

}
