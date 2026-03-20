/*
 * 생성자 선언
 *  모든 클래스에서 제작하는 것은 아님 
 *  필요한 경우에만
 */
class Student
{
	int hakbun;
	String name;
	int kor,eng,math; // 인스턴스 변수를 잡음 여러명 쓴다는 얘기
	
	// 변수값 다르게 저장하는 버전(초기값 다르게 생성)
	Student(int h, String n, int k, int e, int m)
	{
		hakbun=h;
		name=n;
		kor=k;
		eng=e;
		math=m;
		
	}
	Student(int hakbun,String name)
	{
		
		// 클래스 안에 있는 변수와 같으면 지역변수가 우선순위야 그래서 출력하면 1번라인들이 0과 null값으로 츨력돼 그래서 this라는 구분자를 준다
		this.hakbun=hakbun;
		this.name=name;
		// this는 자신의 객체명을 나타내는 객체
		// this는 static에서는 사용 불가능 
	}
	
	/*
	 * 변수 찾기
	 *  지역변수 
	 *  없으면 인스턴스 변수 순으로 찾는다
	 *  
	 * --------------------------
	 * 변수명이 같은데 왜 가능했냐
	 *  메모리가 다르다
	 *    Heap
	 *    Stack 에 따로 저장됐기 때문
	 */
	
}
public class 생성자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Student hong=new Student(1, "홍길동", 90, 90, 90);
                 Student shim=new Student(2, "심청", 90, 90, 90);
                 Student kim=new Student(3, "김민재", 95, 90, 90);
                 
                 System.out.println(hong.hakbun+" "+hong.name+" "+hong.kor+" "+hong.eng+" "+hong.math);
                 System.out.println(shim.hakbun+" "+shim.name+" "+shim.kor+" "+shim.eng+" "+shim.math);
                 System.out.println(kim.hakbun+" "+kim.name+" "+kim.kor+" "+kim.eng+" "+kim.math); // 이런거 이름 일일이 타이핑 치지 않고 해당 라인 드래그 - edit - 파인/리플레이스에서 입력하면 한번에 변경가능
                 
                 
                 Student lee=new Student(4,"이순신");
                 // lee가 갖고 있는 hakbun, name 
                 System.out.println("학번 :"+lee.hakbun); // 1번
                 System.out.println("이름 :"+lee.name); // 1번 
               
	}

}
