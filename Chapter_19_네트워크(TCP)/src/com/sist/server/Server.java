package com.sist.server;
import java.util.*; // 접속자의 정보를 저장해야함(아이피랑 포트)

import com.sist.commons.Function;

// 어레이리스트 보다 Vector를 쓰자 벡터는 동기화 프로그램
import java.io.*; // 클라이언트와 동신을 하기 위해서
/*
 * 데이터 송신(전송) : OutputStream을 이용, 전송할 때는 1바이트 씩
 * 데이터 수신 : BuffredReader를 사용, 1바이트를 받아서 2바이트로 변경해야 한글이 안 꺠짐 그때 쓰는게 InputStream
 */
import java.net.*;
/*
 * ServerSocket : 고정 포트를 갖고 있음 -> 대기소켓이라고도함
 *                 접속을 받는 경우
 * Socket : 클라이언트와 통신
 *          IP와 PORT
 *          클라이언트 소캣은 포터가 고정이 아니라 유동이다      
 * 을 이용할거야
 * ---------------------------------------------------------
 *   1. 서버구동을 먼저한다
 *   2. 접속자를 받아서 벡터에 저장한다
 *   3. 접속을 받으면 통신을 따로할 수 있게 연결시킨다(쓰레드 이용) -> 접속자마다 통신을 따로따로 하게
 *       예) 서버
 *             A -------------A
 *             B----------------B
 *             c--------------------C만 통신을 받을 수 있게끔
 *             => 멀티 쓰레드
 *  4. 통신이 종료가 되면(=나가기 버튼을 누르면) 쓰레드를 종료시킨다           
 *              
 */
public class Server implements Runnable {
	// 네트워크에 필요한 클래스 선언
	private Vector<Client> waitVc= new Vector<Client>();
	
    // 접속자 정보 저장
	private ServerSocket ss;
	
	// 서버구동
	private final int PORT=8088;
	
	public Server()
	{
		try
		{
			ss = new ServerSocket(PORT); // ,100은 백명까지 받겠다, 숫자를 안쓰면 디폴트 50명까지 받는다
			// 첫번 쨰 동작 bind -> 휴대폰 개통할 때 전화번호,전화선을 묶어서 유심으로 만들어줌인데 이런 상태와 비슷, 아이피와 포트를 연결시킨 상태
			// 아이피는 자동 인식
			// 두번 쨰 동작 listen -> 접속자를 기다리고 있는중, 대기상태
			
			System.out.println("서버 스타트"); // 서버 개통완료
		}
		catch (Exception ex) {}
	}
	

	public static void main(String[] args) {
		
   Server server = new Server(); // 서버 구동
   new Thread(server).start(); // run()
	}
// 접속자를 받아서 정보를 저장하는 부분 -> 접속을 하자마자 쓰레드를 한개 배정해야한다
	// new 쓰레드 하나주면 생성됨 -> 교환소켓이라고도 함
	@Override
	public void run() {
		try
		{
			while(true)
			{
				// 접속이 되면 accept() 호출 -> 특수 메소드
				Socket s = ss.accept(); // 접속이 됐다,예를 들면 폰 개통되고 전화통화가 가능해짐
				
				// s는 클라이언트
				// 전화가 걸려오면 발신자 정보가 필요해
				// 여기서는 아이피번호와 포트번호가 필요하지
				
				System.out.println("접속자의 연결번호: "+s.getPort());
				System.out.println("어떤아이피에서 들어왔냐: "+s.getInetAddress().getHostAddress());
				
				// 통신할 쓰레드 배정
				Client client = new Client(s);
				// 소켓은 각자마다 다르기 때문에 소캣주인과 통신할 수 있게 연결, 무조건 본인것만 연결
				// new 할 때마다 따로 생성
				client.start(); // 통신을 시작해라 명령을 내림 -> run()을 호출한다
				
				
			}
		}
		catch (Exception ex) {}
		
	}
	// 사용자의 요청으로 처리 후 결과값 응답하는 곳
	// 통신만 담당
	class Client extends Thread
	{
		String id,name,sex;
		Socket s; // 클라이언트 정보
		
		// 통신 준비 -> 읽기 쓰기가 가능해야함
		BufferedReader in; //요청 받기
		OutputStream out; // 응답 하기
		
		public Client(Socket s)
		{
			this.s=s;
			try
			{
				
				// 위치 확인 , 어디에 보냈고 어디에 읽을지
				out=s.getOutputStream(); // 저장소로부터 값을 읽어와라
				in = new BufferedReader(new InputStreamReader(s.getInputStream())); // in은 요청을 받는다 / 클라이언트가 요청 보낸 값을 가져온다
				
			}
			catch (Exception ex) {}
		}
		// 통신하는 부분
		public void run()
		{
			try
			{
				while(true)
				{
					// 접속자 요청을 받는다
					String msg=in.readLine(); //사용자가 보냈다
					// 리드라인은 \n까지 읽는다
					System.out.println("클라리런트 요청"+msg);
					StringTokenizer st = new StringTokenizer(msg,"|");
					int protocol = Integer.parseInt(st.nextToken());
					// 100|id|name|sex\n -> 100번이면 서버는 로그인 처리를 해야한다.......... 100이 있기 때문에 로그인 처리를 해야한다고 아는 거야
					// 펑션번호를 넣어야 안다고요, 서버한테 뭘 하는지(예: 쪽지를 보내라 등,,,) 알려주기 위한 번호야
					
					switch(protocol)
					{
					  case Function.LOGIN ->{
						  // 로그인 처리
						  name = st.nextToken();
						  id = st.nextToken();
						  sex=st.nextToken();
						  // 사용자가 보내준 데이터를 받는다
						  // 이미 접속자에게 메시지를 보낸다
						  messageAll(Function.CHAT+"|[알림 🔔]"+name+"님이 입장");
						  messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
						  
						  // 로그인 된 사람 처리
						  // 한명한테
						  messageTo(Function.MYLOG+"|"+name);
						  // 마이로그가 들어가면 로그인창 종료, 대기실창을 보여준다
						  
						  // 저장
						  waitVc.add(this); // 접속자명단에 저장
						  
						  // 이미 접속된 사람의 정보를 한번에 전송
						  for(Client c :waitVc)
						  {
							  messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.sex);
						  }
						  
						  
					  }
					  case Function.CHAT ->
						{
							String data = st.nextToken();
							messageAll(Function.CHAT+"|["+name+"]"+data);
						}
					  case Function.EXIT -> {
						  // 나가기를 눌렀을때 처리하는 과정
						  messageAll(Function.EXIT+"|"+id);// 아이디 삭제햐
						  for(int i=0;i<waitVc.size();i++)
						  {
							  Client c = waitVc.get(i);
							  if(c.id.equals(id))
							  {
								  messageTo(Function.MYEEXIT+"|");
								  waitVc.remove(i);
								  try
								  {
									  in.close();
									  out.close();
									  // 전화선 끊음
								  }
								  catch (Exception ex) {
									// TODO: handle exception
								}
							  }
						  }
					  }
						
					}
				}
			}
			catch (Exception ex) {
				// TODO: handle exception
			}
		}
		
		// 공통 사용하는 부분
		// synchronized -> 원래 쓰레드는 비동기인데 동기로 바꾸려고 synchronized을 사용한다
		// 개인적으로 보내는 부분(개인적 쪽지보네기와 같은)
		public synchronized void messageTo (String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}
			catch (Exception ex) {
				// TODO: handle exception
			}
		}
		
		// 전체적으로 보내는 부분(전체메시지같은)
		public synchronized void messageAll (String msg)
		{
			try
			{
				for(Client c:waitVc)
				{
					c.messageTo(msg);
				}
			}
		
			
			catch (Exception ex) {
				// TODO: handle exception
			}
		}
		
		
		
	}

}
