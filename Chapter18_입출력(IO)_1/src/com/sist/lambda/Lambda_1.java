package com.sist.lambda;

/*
 * 람다식 : 이름없는 함수 
 *        이름이 없어 선언을 하지 X -> 소스가 간결해짐
 *        형식)
 *        ( ) ->  { } 
 *        함수    구현부
 *        함수자리에는 매개변수, 매개변수가 없을 수도
 *        
 *        메소드 참조할 때가 있음 -> 클래스 ::
 *        예) System.out::println -> 프린트를 참조해라
 *        
 *        처리할 때 : 스트림, 중간처리, 최종처리
 *                  중간처리 : filter -> if
 *                           map -> 변환 format
 *                           sorted -> 정렬
 *                           groupby
 *                           
 *                  NUll 처리 : Optional
 *                            소스가 간결해 유지보스가 편리함
 *                            재사용 / 복잡한 코딩이 있는 경우 사용하지 않음
 *                            람다 -> 즉석처리
 *                                     
 *                  최종처리 : 출력 -> forEach
 *                           데이터를 모아서 전송 -> collect() -> toList()
 *                           max, min, count 
 *---------------------------------------------------------------------
 *주요 메소드
 *filter()
 *map()
 *sorted() -> ASC만 가능(올림차순), 내림차순(DESC)은 노!
 *----------------------------------------------------------------------
 *객체지향 프로그램 : 객체들이 협력해서 상호작용 기준 -> 조립식, 코드의 재사용, 유지보수, 확장, 신뢰성 모두 뛰어남
 *함수형 프로그램(람다) : 결과값이 오직 입력값에 따라 영향이 있다 -> 검증이 쉬움, 성능의 최적화, 캐쉬 메모리(임시메모리)를 사용해 속도가 빠르다, 메모리 리소스를 아낄 수 있음
 *                   임시메모리에서 데이터를 가지고 온다 -> 스트림
 *                   스트림: 데이터 처리
 *                         조건, 출력만 필요할 때도 있고, 데이터 모아서 사용
 *                   -> 람다는 코드를 짧게 쓴다, 함수를 한줄로 줄여서 사용한다
 *                   핵심)
 *                    (매개변수) -> {실행코드}      
 *=> ** 두가지가 면접에 많이 나옴           
 *
 *                        
 */
import java.util.*;

public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
//		numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
		
//		String name=null; // 문자열이 없는데 개수를 달라고 요청해서 오류남
//		System.out.println(name.length()); //오류 발생으로 종료하지 않음
//		System.out.println("종료");
		
		//null값 방지하는 클래스 -> Optional
		Optional<String> name=Optional.ofNullable(null);
		System.out.println(name.orElse("이름 없음"));
		//값이 없는 경우가 많은 검색을 할 때나 데이터베이스 프로그램에서 사용
		// 데이터베이스 : isNotNull() / isNull
		
		Optional<String> userName=Optional.of("나나나");
		// 값이 있는 경우 실행해라
		userName.ifPresent(n->System.out.println("이름: "+n));
		
		/*null 주의
		 * 
		 * odElse("기본값") -> 값이 없는 경우(null) 대신 사용
		 * ifPresent() -> 값이 있는 경우에만 수행
		 * isPresent() -> 값이 있는지 확인
		 * 
		 * 람다 : 코드를 줄일 때 사용
		 * 스트림 : 임시메모리인 캐쉬에서 데이터를 한개씩 읽는 방식
		 * OPtional :null값을 안전하게 처리해주는 프로그램
		 * 
		 * OPtional 쓰는 방식
		 * 
		 * Optional<Striing> a=Optional.of("asdf") => null값이 아니다 값이 존재
		 * Optional<Striing> b=Optional.ofNullable("asdf") -> null값인 가능성이 있다
		 * Optional<Striing> b=Optional.empty( ) -> 빈값 , 아예 값자체가 없는 상태
		 */
		
		
		// 값 변경하는 상태 -> map
		Optional<String> opt=Optional.of("sdfg");
		Optional<Integer> len=opt.map(s->s.length()); // 총개수
		System.out.println(len.get());
		
		// Optional 안에 Optional 첨부
		Optional<String> opt2=Optional.of("sfwtrwg");
		Optional<Integer> res=opt2.flatMap(s->Optional.of(s.length()));
		// flatMap -> optional 하나씩 제거할 때
		
		System.out.println(res.get());
		
		// 핕터링
		Optional<Integer> opt3=Optional.of(10);
		opt3.filter(n-> n>5).ifPresent(n->System.out.println("5보다 큼")); // if(n>5) => true/false로 받음
		// 필터의 조건이 트루일 떄만 실행
		
		// null은 주소가 배정이 안된 상태임 
		Optional<String> opt4=Optional.of(null);
		System.out.println(opt4.isPresent()); // 널 있냐없냐 -> 값이 있으면 true, 없으면 false
		System.out.println(opt4.isEmpty()); // 값이 비어있는지 확인 => 장바구니 비어있나 확인할 때 많이 사용
		
		
	}

}
