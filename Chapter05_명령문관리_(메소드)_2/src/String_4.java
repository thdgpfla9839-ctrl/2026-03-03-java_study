/*
 * p.161
 * 변환하는 메소드
 * 
 * toUpperCase : 대문자 변환
 * => 원형 String toUpperCase()
 * 
 * toLowerCase : 소문자 변환
 * => 원형 String toLowerCase()
 * 
 * replace : 지정된 단어/문자열로 변환
 * => 원형 String replace(char c1, char c2) 
 *    char c1 : 찾는 문자 / char c2 :  변경할 문자가 온다
 *    원형 String replace(String c1, String c2)
 *    
 * replaceAll : 정규식을 이용하는 방식
 * => 원형 replaceAll(regex,"변경할 문자")
 *    [A-Z] : 대문자 전체
 *    [a-z] : 소문자 전체
 *    [0-9] : 숫자전체
 *    ^[A-Z] : 대문자 시작
 *    [^A-Z] : 대문자 제외
 *    [가-힣] : 한글 전체
 *     . : 임의의 한글자
 * 
 * 
 * replacaAll -> 크롤링, 어려운 문자가 있는 경우 많이 사용
 *               한번에 바꿀 수 있다
 */
public class String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            // toUpperCase, toLowerCase 오라클은 대소문자 구분이 없는데 실제 저장된 데이터를 구분하는 경우에 사용됨
		String msg="Hello Javb Javc Javn";
		System.out.println("대문자로 변환: "+msg.toUpperCase());
		System.out.println("소문자로 변환: "+msg.toLowerCase()); // msg 뒤에 있는 .은 메모리 주소 접근 연산자
		System.out.println("실제 데이터: "+msg);
		
		// replace: 문자열이나 문자변경 
		String s=msg.replace('l','k');
		System.out.println(s);
		
		s=msg.replace("Java", "Spring");
		System.out.println(s);
		
		//replcaeAll 여러개 한번에 변경할 때 
		s=msg.replaceAll("JAv+", "Orar");
		System.out.println(s);
	}

}
