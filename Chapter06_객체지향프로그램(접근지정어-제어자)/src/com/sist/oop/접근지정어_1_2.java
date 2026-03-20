/*
 * 한명, 한개에 대한 정보 설계 => new
 */
package com.sist.oop;

// 모든 변수에 private 사용 X
// Button -> public 사용
class Sawon
{
	private int sabun; // 은익화
	private String name; // 이름이나 사번은 본인만이 갖고 있어야지
	String dept; 
	protected String job; // 다른 회사로 이동할 수도 잇잖아(직위)
	public String loc;
	private long pay; //(연봉)
	
	// 읽기 쓰기 기능(캡슐화) :메소드와 변수를 하나의 방식으로 묶어서 사용한 것은 캡슐화
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
	// private은 우클릭-게터/세터로 들어가서-빨간 아이콘만 바꿔준다 대신 사원클래스 안에다가 만든다
}
public class 접근지정어_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sawon hong=new Sawon();
     hong.dept="개발부";
     hong.job="사원";
     hong.loc="제주";
     //-----------------------// 메소들을 이용해서 접근
     hong.setSabun(1);
     hong.setPay(3000);
     // 변수를 저장할 때는 세터를 이용/ 변수에서 값을 이용할 때는 게터를 이용
     
     System.out.println("이름 : "+hong.getName());
     System.out.println("사번 : "+hong.getSabun());
     System.out.println("연봉 : "+hong.getPay());
     System.out.println("부서: "+hong.dept);
     System.out.println("직위: "+hong.job);
     System.out.println("근무지: "+hong.loc); 
     
        
	}

}
