// Label이 있는 break
public class Label_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//aaa:
     for(int i=1;i<=3;i++)
     {
    	 for(int j=1;j<=3;j++)
    	 {
    		 if(j==2) break; //aaa; j가 있는 for문 종료/ break 뒤에 라벨 붙이면 라벨이 붙어있는 for문까지 제어하고 종료
    		 System.out.println("i="+i+",j="+j);
    	 }
     }
	}

}