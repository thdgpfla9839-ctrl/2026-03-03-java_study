package com.sist.network;
import java.net.*;
import java.io.*;
import java.util.*;
/*
 * URL :검증 X
 * URI : 검증 O
 * => 둘다 웹에 연결해서 데이터를 수집하는데 사용됨
 * 
 * URLEncoder :바이트를 배열형식으로 바꿔서 보내준다
 * Socket : 연결기기 -> 다른 사람과 통신
 *          클라이언트용
 *          ip(전화번호) / port (연결선)
 *                        -> 가변
 * ServerSocket : 서버 연결 기기 -> 기지국 -> 접속자 받기
 *                                예) 휴대폰 -> 고정적   
 *                                
 *                                https://www.10000recipe.com/recipe/list.html?q=%EB%B0%80%EA%B0%80%EB%A3%A8 
*/
public class URL_1 {
// URL : 데이터 수집용으로 많이 쓰인다
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            try
            {
            	Scanner scan = new Scanner(System.in);
            	System.out.println("검색어 입력: ");
            	String fd = scan.next();
            	System.out.println(URLEncoder.encode(fd,"UTF-8"));
            	String u ="https://www.10000recipe.com/recipe/list.html?q="+URLEncoder.encode(fd,"UTF-8");
//            	URL url = new URL("https://www.10000recipe.com/index.html");
            	URI uri = new URI(u); // 검증된 방식으로 사용하자, 이 방식으로 쓰자 
            	URL url =uri.toURL();
            	HttpURLConnection conn =(HttpURLConnection)url.openConnection();
            			if(conn!=null) // 사이트에 연결이 됐다면
            			{
            				BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            				while(true)
            				{
            					String line = in.readLine();
            					if(line==null) break;
            					System.out.println(line);
            				}
            			}
            }
            catch (Exception ex) {}
            
	}

}
