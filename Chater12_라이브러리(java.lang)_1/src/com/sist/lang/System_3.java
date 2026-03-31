package com.sist.lang;
/*
 * GC
 * -> 멀티미디어 만들 때 많이 사용(스트리밍 서버)
 *    화상채팅 만들 때 사용
 *    객체 메모리 해제할 때
 *-------------------------------------------
 *
 *여기서는 흐름(Client / Server)을 파악하며 공부한다
 *클라이언트는 브라우저
 *서버는 톰캣, 레진........
 */
class Sawon
{
	public Sawon()
	{
		System.out.println("객체 생성");
	}
	public void print()
	{
		System.out.println("사원 정보 출력(객체 활용)");
	}
	
	// 소멸자 GC
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	
}
public class System_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Sawon s = new Sawon();
             s.print();
             s=null;
             System.gc(); // 바로 회수를 요청할 때 쓰는게 gc
             
	}

}
