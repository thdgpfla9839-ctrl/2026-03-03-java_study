/*
 * case : / break => case -> 로 바꿔 쓸 수 있다
 */
import java.util.Scanner;
public class 제어문_선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.println("월입력");
      int month=scan.nextInt(); //공백까지 포함하려면 nextLine()을 쓴다 -> 문장전체를 가져올때 쓴다.
//      switch(month)
//      {
//      // month==3 || month==4 || month==5로 쓸 수 있음
//      case 3:
//      case 4 :
//      case 5:
//    	  System.out.println(month+"는 봄");
//    	  break;
//      case 6:
//      case 7 :
//      case 8:
//    	  System.out.println(month+"는 여름");
//    	  break;
//      case 9:
//      case 10 :
//      case 11:
//    	  System.out.println(month+"는 가을");
//    	  break;
//      case 12:
//      case 1 :
//      case 2:
//    	  System.out.println(month+"는 여름");
//    	  break;
//      } // default 쓰지 않으면 13같은 거 쓰면 아무것도 출력 안 됨
      
      switch(month) 
      {
      case 3,4,5->System.out.println("봄");
      case 6,7,8->System.out.println("여름");
      case 9,10,11->System.out.println("가을");
      case 12,1,2->System.out.println("겨울");
      default -> System.out.println("없는 달");
      } // 3가지를 동시에 쓸 수 있음
	}

}
