/*
 * int total=kor+eng+math -> 매개변수 3개
 * 
 * 
 * -> 메소드화 
 * 
 * static int totalScore(int kor, int eng, int math)
 * {
 * return kor+eng+math;
 * }
 * 
 * => int total=totalScore(90,90,90)
 * 
 * 
 * 리턴형이 void가 아닐 경우-> return 값
 * 리턴형이 void일 경우 -> 메소드 자체 저리
 * 
 * 
 * 메소드 목적
 * 1) 재사용 : 다른 클래스와 연결시키는 것
 * 2) 반복 제거 : 공통모듈
 * 3) 간결화 : 유지/ 보수가 편리 -> 수정이나 추가 
 * 4) 구조화 : 기능별로 나눠있기 때문에 분리하기 편함 -> 여러명 동시 작업 가능 = 분업화 
 * 5) 가독성 아주 굿 -> 에러처리 쉬워져요
 * 
 */
public class 메소드_3 {
    static void display()
    {
    	System.out.println("display() 진입");
    	System.out.println("기능처리");
    	System.out.println("display() 종료");
    }
    static void increment()
    {
    	int a=10; // 호출할때마다 새롭게 생성
    	System.out.println("a="+a);
    	a++;
    	
    } // a는 메모리에서 사라진다
    // 결과값 increment() a= 10 이렇게 계속 출력됨
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           display();
           display();
           display();
           display();
           display();
           display();
           display();
           // 메소드는 호출시 마다 처음부터 실행
           // 선언된 변수가 있는 경우에는 종료하면 사라진다
           
	}

}
