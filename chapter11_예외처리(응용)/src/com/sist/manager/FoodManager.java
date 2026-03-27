package com.sist.manager;

import java.io.*;

import com.sist.commons.Manager;
import com.sist.vo.*;

public class FoodManager implements Manager {

	// TODO Auto-generated method stub
	// 맛집 데이터 저장
	public static FoodVO[] foods = new FoodVO[482];
	/*
	 * 1. 데이터형
	 * 
	 * 1) 기본형 : 정수(int)..... 2) 참조형 : 클래스, 배열 -> 주소를 이용한 방식 클래스 예) 자바 라이브러리 클래스, 사용자
	 * 정의 클래스 1개는 1개의 맛집에 대한 정보만 갖고 있다
	 * 
	 * 2. 데이터 공유 : 모든 사용자가 같은 데이터를 보려면 공유를 해야함 ->static 이용 예) 오라클(데이터베이스 -> 공유된 데이터)
	 * 
	 * 3. 모든 클래스에서 접근이 가능하게 하려면 -> public 모든 변수는 private이 아니다
	 * 
	 * 4. 값을 저장 시 초기화를 해야함 명시적 초기화 :int a=10;과 같이 값을 지정하고 가는 것 초기화 블록 : 인스턴스, 정적
	 * static{}, 생성자 클래스{}블록은 선언만 가능, 파일 읽기 X 인스턴스는 생성자()에서 static 변수는 static{}에서 =>
	 * 상속은 예외 ---------------------------------------------------------
	 * 
	 */
	// 초기화 - 배열값 저장
	static {
		// 구현해서 초기화 가능 -> 자동 호출
		// 파일읽기 -> CheckException ->예외처리
		// 초기화 블록은 throws를 사용할 수 X
		try {
			StringBuffer sb = new StringBuffer();
			// StringBuffer 문자열을 모을 수 있는 임시 저장 장소를 갖고 있다 -> 문자열 결합에 속도가 빠르다
			int i = 0;
			FileReader in = new FileReader("c:\\javaDev\\food.txt");
			while ((i = in.read()) != -1) // -1은 EOF : 파일의 끝
			{
				sb.append((char) i);
				// int read() -> char 변환해야한다
				// 한글자씩 읽어온다는 단점
			}
			in.close();

//			System.out.println(sb.toString());
			// foods에 값 채우기
			String[] datas = sb.toString().split("\n");
			i = 0;
			for (String data : datas) {
			//	System.out.println(data);
				String[] s = data.split("\\|");
				FoodVO vo = new FoodVO();
				vo.setNo(Integer.parseInt(s[0]));
				vo.setName(s[1]);
				vo.setType(s[2]);
				vo.setPhone(s[3]);
				vo.setAddress(s[4]);
				vo.setScore(Double.parseDouble(s[5]));
				vo.setParking(s[6]);
				vo.setPoster(s[7]);
				vo.setTime(s[8]);
				vo.setContent(s[9]);
				vo.setTheme(s[10]);
				vo.setPrice(s[11]);
				foods[i] = vo;
				i++;
			}

		} catch (Exception ex) {
		}

	}

	// 기능
	@Override
	public FoodVO[] food_list(int page) {
		// TODO Auto-generated method stub

		int j = 0;

		// pagecnt: 시작점
		int pagecnt = (page * 10) - 10; // 10번부터 잘라서 10개라는 의미, 페이지별 배열의 시작점
		/*
		 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13...
		 */
		// 배열 크기 계산
		int row = 10;
		int total = food_total();
//		if(foods.length%10>0) // 맨마지막 페이지가 0보다 크면 row=foods.length%10;  이만큼의 값을 바꿔

		// 토탈페이지랑 같으면 맨마지막 페이지만 row=foods.length%10
		if (total == page)
			row = foods.length % 10;
		
		FoodVO[] food = new FoodVO[row];
		
		for (int i = 0; i < foods.length; i++)
		{
			// i>=pagecnt 배열의 시작위치
			if (j < 10 && i >= pagecnt) {

				food[j] = foods[i]; // i는 출력 시작위치
				j++; // 10개씩 나누는 변수+

			}
		}
		return food;

	}

	@Override
	public FoodVO food_detail(int no) {
		// TODO Auto-generated method stub
		
		return foods[no-1];
//		return null;
	}

	@Override
	public FoodVO[] food_find(String type, String fd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	// int page 대신 String type
	public FoodVO[] food_filter(String type) {
		// TODO Auto-generated method stub
		int row =0;
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				row++;
			}
		}
		FoodVO[] food=new FoodVO[row];
		int i=0;
		for(FoodVO vo:foods)
		{
			if(vo.getType().contains(type))
			{
				food[i]=vo;
				i++;
			}
		}
		return null;
	}

	@Override
	public int food_total() {
		return (int) (Math.ceil(foods.length / 10.0));
	}
}
