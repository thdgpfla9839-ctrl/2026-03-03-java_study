package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규식은 문자의 형태를 만드는 과정 -> 형태=패턴
 *        예) repalceAll / spilt에서 많이 적용됨
 *        기호)
 *         [] : 한개의 문자를 나타낼 때 씀
 *              예) [a]
 *                 [a|b|c]
 *                 [a-z] -> 이때는 범위를 지정하는데 사용됨
 *              ------------------------------------------
 *              [a-zA-Z] : contains -> 알파벳이 포함됐을 때
 *              ^[a-zA-Z] : startswith -> 알파벳으로 시작됐을 때
 *              [a-zA-Z]$ : ebdswith -> 알파벳으로 끝날 때
 *              --------------------------------------------
 *          ^ : 시작
 *          $ : 끝
 *          + : 1개 이상 반복(+앞 글자가)
 *          * : 0개 이상 반복
 *          . : 임의의 한글자 -> 오라클에서 .대신 __ 언더바 두번으로 대신 쓴다
 *          ? : 0개 이거나 1개
 *          | : or는 이중에 있냐는 선택
 *          {n} :n번 반복, 글자 개수
 *               예) a{3} -> aaa 
 *          {n,} : n번 이상 반복
 *                예) a{3,} -> aaa aaaa aaaaa aaaaaa ......
 *          {n,m} : n에서 m까지 반복
 *                  예) a{2,4} -> aa aaa aaaa
 *          (그룹) : (단어) 반복
 *-------------------------------------------------------------Mathers를 이용해서 true/ false 출력                  
 *     Matcher
 *            matchers() : 전체 문자열에서 패턴과 일치 여부 확인해서 값을 boolean으로
 *            find() : 부분 일치(패턴 일치)
 *            group() : 찾는 문자열
 *            start() : 시작 인덱스
 *            end() : 끝 인덱스
 *            replaceAll() : 변환            
 * 
 */
public class 정규식_총정리_전화번호추출 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//          01234567........
		String msg="번호는 010-5893-95645 이고" + "회사번호는 02-658-8945 이다 ";
		
		//전화번호만 추출
		String regex="\\d{2,3}-\\d{3,4}-\\d{4}"; // 번호는 두자리 일수도 있고 세자리 일수도 - 세자리 네자리 일수도 - 네자리 , 그룹괄호를 하려면 regex 코드에 괄호쳐서 나눠준다
		Pattern p=Pattern.compile(regex); // 문자형식이 어떤건지
		Matcher m=p.matcher(msg);
		
		while(m.find())
		{
			System.out.println("전화번호 : "+m.group()); // 예) (().().()) -> 이런식으로 돼있다면 출력할 때 group(1),group(2),group(3) 이런식으로 바꿔주면 된다
			System.out.println(m.start()+" "+m.end());
		}

	}

}
