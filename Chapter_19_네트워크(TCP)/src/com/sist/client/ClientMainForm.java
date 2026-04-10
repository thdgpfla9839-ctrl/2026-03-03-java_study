package com.sist.client;

// 메인창, 여기는 흐름만 파악하자
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.table.*;

import com.sist.commons.Function;

public class ClientMainForm extends JFrame implements ActionListener, Runnable
// 클라이언트에서 사용하는 쓰레드는 서버값만 읽어서 출력한다
{
	
	JTextArea ta;
	JTextField tf;
	JTable table;
	DefaultTableModel model;
	JButton b1, b2, b3;
	LoginForm login = new LoginForm();
	
	// 서버와 연결
	Socket s; // 전화기 -> 전화를 걸면 서버와 연결이됨
	// 전화를 걸려면 상대방 즉, 서버 전화번호가 필요하지
	// 서버 new Socket("서버IP",port)
	// 서버는 클라이언트의 아이피와 포트번호를 알아야해
	//  OutputStream  ->    BufferedReader
	
	// 클라이언트는 서버정보를 알아야해(서버 아이피와 서버 포트번호)
	// BufferedReader  ->   OutputStream
	
	OutputStream out; // 서버로 요청
	BufferedReader in; // 서버에서 응답한 값을 받는 곳

	public ClientMainForm() {
		ta = new JTextArea();
		JScrollPane jsl = new JScrollPane(ta);
		ta.setEditable(false);

		tf = new JTextField();
		b1 = new JButton("쪽지 보내기");
		b2 = new JButton("정보 보기");
		b3 = new JButton("나가기");

		String[] col = { "아이디", "이름", "성별" };
		String[][] row = new String[0][3];
		// 한번만 사용함, 재사용 불가
		model = new DefaultTableModel(row, col) 
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}

		};// 익명의 클래스 : 윈도우 / 빅데이터
		
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);

		// 배치
		setLayout(null);
		jsl.setBounds(10, 15, 500, 450);
		tf.setBounds(10, 470, 500, 30);

		// 테이블배치
		js2.setBounds(515, 15, 250, 300);
		
		// 버튼 하나로 모아
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(3, 1, 5, 5));
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.setBounds(515, 320, 250, 130);

		// 윈도우에 추가
		add(jsl);
		add(tf);
		add(js2);
		add(p);

		setSize(790, 550);
		setVisible(true); // 이거 지우면 로그인창이 먼저 뜸
		
		// 이벤트 발생하는 위치 => 서버로 값을 전송하는 위치
		// 전송하려면 서버와 연결
		login.b1.addActionListener(this); // 로그인 버튼
		login.b2.addActionListener(this); // 취소버튼
		
		tf.addActionListener(this); //채팅
		b3.addActionListener(this); //나가기버튼

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}
		catch (Exception ex) {} // 윈도우 스킨 입히기
		new ClientMainForm();
	}
	// 서버와 연결과 동시에 로그인 처리
	public void connect(String id ,String name, String sex)
	{
		try
		{
//			s = new Socket("192.168.0.41",3355); // 개인아이피(서버)
			// s는 서버정보
             s = new Socket("192.168.0.43",8088); // 팀프로젝트 서버와 포트번호
			out=s.getOutputStream(); 
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes()); // 클라이언트에서 아웃.write가 나오면 항상 \n까지 리드라인이 읽어주기 때문에 항상 적어야 해
			
		}
		catch (Exception ex) {}
			// 서버로 부터 값을 읽어와 송신을 시작해라 -> 쓰레드 하나 사용
			new Thread(this).start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			dispose(); // 윈도우 메모리 회수
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==login.b1)
		{
			// 로그인 요청
			String id = login.tf1.getText(); // 입력한 이름 들어옴
			if(id.trim().length()<1)
			{
				// 입력이 안된 상태
				login.tf1.requestFocus();
				return;
			}
			
			String name = login.tf2.getText(); // 입력한 이름 들어옴
			if(name.trim().length()<1)
			{
				// 입력이 안된 상태
				login.tf2.requestFocus();
				return;
			}
			String sex = ""; // 입력한 이름 들어옴
			if(login.rb1.isSelected())
			{
				sex ="남자";
			}
			else
			{
				sex ="여자";
			}
			 connect(id, name, sex);
			 
		}
		else if(e.getSource()==tf) // 채팅요청
		{
			String msg = tf.getText();
			if(msg.trim().length()<1) // 입력이 없는 상태
			{
				tf.requestFocus();
				return;
			}
			// 전송
			try
			{
				out.write((Function.CHAT+"|"+msg+"\n").getBytes()); // 서버로 보낸다
			}
			catch (Exception ex) {}
				// TODO: handle exception
				tf.setText("");// 지워야 한다
		}
			else if(e.getSource()==b3)
			{
				try
				{
					out.write((Function.EXIT+"|\n").getBytes());
				}
				catch (Exception ex) {}
					// TODO: handle exception
				
			}
		}
		
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				// 서버로부터 값 읽기
				String msg=in.readLine();
				
				//in -> 서버에서 보낸 값 가지고 오기
				
				StringTokenizer st = new StringTokenizer(msg,"|");
				int protocol = Integer.parseInt(st.nextToken());
				
				switch(protocol)
				{
				case Function.LOGIN ->{
					String [] data = { st.nextToken(),st.nextToken(),st.nextToken()};
					model.addRow(data);
				}
				
				   case Function.MYLOG ->{
					   String name = st.nextToken();
					   login.setVisible(false);
					   setVisible(true);
					   setTitle(name);
				   }
				   case Function.CHAT -> {ta.append(st.nextToken()+"\n");}
				   case  Function.MYEEXIT ->{
					   dispose();
					   System.exit(0);
				   }
				   case  Function.EXIT ->{
					   // 남아 있는 사람 -> 테이블에서 삭제
					   String mid=st.nextToken();
					   //서버에서 아이디를 보낸다
					   for(int i=0;i<model.getRowCount();i++)
					   {
						   String id=model.getValueAt(i, 0).toString();
						   if(mid.equals(id))
						   {
							   model.removeRow(i);
							   break;
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

}
