package com.sist.lang;
/*
 * clone / toStirng / hashCode / equals -> 필수로 암기
 * 
 * 아직은 안 배우는 부분
 * record
 * class record Sawon
 * {
 *     변수설정 -> getter만 갖고 있다 : Spring AI -> 전송
 * }
 * -----------------------------------------
 * 
 */
// 보안이 요구되는 경우나 데이터를 모아서 브라우저에 전송할 때 사용한다
record Person(String name, int age)
{
	
}
public class Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   Person p =new Person("길동", 28);
                   System.out.println("이름 : "+p.name()); //getter
                   System.out.println("나이 : "+p.age());
	}

}
