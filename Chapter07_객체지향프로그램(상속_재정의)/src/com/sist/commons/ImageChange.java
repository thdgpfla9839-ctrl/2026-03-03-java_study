package com.sist.commons;

/*
 * 1. class에 멤버변수 사용
 *     -> 데이터형 : 기본형(일반 데이터형)/ 클래스형, 배열(참조 데이터형) 
 *     
 * 2. class
 *    데이터형 사용 : 필요한 변수를 모아서 저장
 *        ~VO / ~DTO / ~Bean / ~ Entity 이렇게 있으면 데이터 모아서 저장하는 유형이구나 알아먹으면 됩니다
 *        => 캡슐화 : private 변수에 getter/setter 이런 방식을 사용해야  한다고 생각해
 *    액션 클래스 : 메소드만 모아서 저장하는 클래스
 *        ~DAO 데이터베이스와 연결 / ~MAnager 크롤링할 때 / ~Service 웹이나 윈도우에 값을 전송할 때 쓰는 클래스
 * ---------------------------------------------------------------------------------------------
 * => 공통으로 사용 static을 써준다       
 *      
 */
import java.awt.*;
import javax.swing.*;
public class ImageChange {

	// 모든 곳에서 갖다쓰겠따
	// 축소/ 확대
	//리턴형 -> 클래스
	public static  Image getImage(ImageIcon icon, int w, int h)
	{
		return icon.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	}

}


