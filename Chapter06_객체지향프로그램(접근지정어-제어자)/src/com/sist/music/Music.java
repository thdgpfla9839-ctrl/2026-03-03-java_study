package com.sist.music;

import lombok.Getter;
import lombok.Setter; // 둘을 묶어서 import lombok.*;

// 뮤직과 관련된 데이터 모아서 관리
//MusicVO / MusicDTO(데이터를 묶어서 윈도우나 브라우저에 보낸다) / MusicEntity
// -> 데이터를 보호, 한번에  모아서 전송하려는 목적이다
//사용자 정의 데이터형 => 메모리 크기
@Getter // 읽기 -> 값 읽기
@Setter // 쓰기 -> 메모리에 저장
// 게터/세터 두개 한번에 쓰려면 @Data 
// 게터/세터 부분적으로 쓰려면 변수 위에 쓰면 해당 변수만 만들어짐 / 전체적용하려면 클래스 밖에 쓴다 
public class Music {

	  private int no;
	  private String title;
	  private String singer;
	  private String album;
	  private String state;
	  private int idcremnent;
	  private String poster;
	  

	}


