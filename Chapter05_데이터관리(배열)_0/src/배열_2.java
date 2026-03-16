/*
 *  배열 선언
 *  배열 초기화
 *  반복문을 이용한 데이터 출력
 *  배열 복사
 *  동적 생성
 *  
 *  1) 선언
 *  데이터형[] 배열명; 권장사항
 *  데이터형 배열명[]; c언어 호환
 *  
 *  
 *  -> 정수배열
 *    int[] arr
 *  -> 문자배열
 *  char[] arr
 *  -> 문자열
 *  String[] arr
 *  ->실수
 *  double[] arr
 *  ->논리
 *  boolean[] arr
 *  
 *  2) 몇개인지 -> 초기화하는 법
 *   10,20,30,40,50
 *   arr.length : 배열의 개수 표기법
 *   int[] arr={10,20,30,40,50}; // 선언 및 초기화
 *   ->arr[5] -> 오류 배열번호는 0부터 시작
 *    범위(배열번호)를 초과하면 오류생김 -> ArrayIndexOutOfBoundsExcetion
 *    
 *    
 *    
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr={10,20,30,40,50};
           System.out.println("arr="+arr); // -> 이거 출력하면 주소가 뜨는데 저장된 메모리 값을 주소임
//           System.out.println(arr[0]);
//           System.out.println(arr[1]);
//           System.out.println(arr[2]);
//           System.out.println(arr[3]);
//           System.out.println(arr[4]);
//           
//           arr[0]=100; -> 배열의 저장된 값을 바꾸고 싶을 때는 이런식으로 변경한다 
//           arr[1]=200; 
//           System.out.println(arr[0]);
//           System.out.println(arr[1]);
//           System.out.println(arr[2]);
//           System.out.println(arr[3]);
//           System.out.println(arr[4]);
        		   
           for (int i=arr.length;i<5;i++)
           {
        	   System.out.println(arr[i]); // 위에거 더 단순화 시킨버전
           }
           System.out.println("============================");
           
           //향상된 for문 -> 화면 출력할 때 많이 사용(웹 브라우저 같은)
           
           for(int a:arr) // arr로 부터 a를 가져온다(배열에 실제 저장된 값인 a를 가져온다,여기서 a는 인덱스 번호 아님, 여기서는 실제 저장된 값 고칠 수 없엉 
           {
        	   System.out.println(a);
           }
	}

}