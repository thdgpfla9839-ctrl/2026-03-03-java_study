package com.sist.inter;

/*
 * 다중상속
 * => 메소드명이 충돌되지 않게 만드는게 기본이다
 */
interface A
{
	public void aaa();
}

interface B
{
	public void bbb();
}

interface D
{
	public void aaa();// 메소드명 동일하면 안 된다 동일한 걸로 인식해 지금도 인터페이스 a의 매소드와 동일하게 인식됐기에 에러가 안남
}

class C implements A,B,D
{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() CALL");
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() CALL");
	}
	
}
public class 인터페이스_3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
