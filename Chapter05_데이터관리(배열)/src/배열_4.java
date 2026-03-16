
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String[] names= {"홍","이","강","박","김"};
           
           String[] address= {"서울","경기","제주","강원","대구"};
           //두개 동시 출력은 인덱스를 쓴다, 하나의 배열만 출력은 forwitch? 이건 다시 찾아보기
           
           for(int i=0;i<names.length;i++)
           {
        	   System.out.println(names[i]+"("+address[i]+")");
           }
	}

}
