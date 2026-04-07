package com.sist.lambda;
/*
 * null 대신 optional사용
 * orElse("이미지 없음.jpg") / isPresent
 * Optional + stream(데이터가 여러개인 경우)
 */
import java.util.*;
import javax.swing.*;

public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog("이름 입력: ");
//		System.out.println(input);
		// 확인버튼과 취소버튼
		// 확인버튼 : 공백
		// 취소버튼 : null
		
		String res=Optional.ofNullable(input).filter(s->s.length()>3).map(s->s.toUpperCase()).orElse("입력값 없음");
		//조건: 세글자 이상이라면, 대문자로 변경해라, 값이 없는 경우면 입력값없음을 출력해라
		System.out.println(res);
	}

}
