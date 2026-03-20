/*
 * p.167 
 */
import java.util.Arrays;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               String hong="홍기돌";
               String shin="신라면";
               String kim="김구";
               String song="송혜림";
               String kang="강인";
               
               // 1. 반복문 사용이 안 됨 / 반복문은 변수명 1개일때 사용이 가능
               System.out.println(hong);
               System.out.println(shin);
               System.out.println(kim);
               System.out.println(song);
               System.out.println(kang);
              
               
               
               //2. 묶어서 사용 -> 제어하기 쉽게
               String [] names= {hong,shin,kim,song,kang};
               for(int i=0;i<names.length;i++)
               {
            	   System.out.println(names[i]);
               }
               
               // 3. 인덱스 보다 실제 데이터 읽기
               for(String name : names)
               {
            	   System.out.println(names);
               }
               
               //4. 라이브러리 이용해서 출력
               System.out.println(Arrays.toString(names));
               
               //5. 변경 -> 인덱스를 이용해서 변경
               names[0]="박문수";
               System.out.println(Arrays.toString(names));

               
               
	}

}
