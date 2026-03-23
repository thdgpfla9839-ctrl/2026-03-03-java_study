package com.sist.main;
/*
 * 필요한 부분 받아서 쓴다, 변경 가능 
 */
class 사람
{
	String 이름;
	 String 주소;
	 String 나이;
	 String 전화;
	 
	 // 상속을 내릴 때는 반드시 중복되는 변수나 메소드에서 공통점을 저장해서 상속을 받는다 -> 반복제거
}

class 교직원 extends 사람{
{ 
	 int 사번;
	 
	 String 입사일;
	 String 부서;
                      } 
}

class 학생   extends 사람{
{
	int 학번;
	 
	 String 학년;
	 String 학과;
                       }
}

class 교수   extends 사람{
{
	int 교번;
	 
	 String 입사일;
	 String 학과;
                      }
}

public class 재사용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
