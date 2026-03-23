package com.sist.music;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//  상속 언제 쓰는지, 생성자는 확인하기 

// 상속을 이용해서 재사용
public class MusicMain extends JFrame {
	
      // 포함클래스  
	CardLayout card=new CardLayout();
	JMenuBar bar=new JMenuBar();
	JMenuItem genieItem =new JMenuItem("지니뮤직");
	JMenuItem melonItem =new JMenuItem("멜론뮤직");
	JMenuItem exitItem =new JMenuItem("종료"); 
	
	// 윈도우 화면 ui
	MusicList mList=new MusicList();
	public MusicMain()
	{
		JMenu menu=new JMenu("파일");
		menu.add(genieItem);
		menu.add(melonItem);
		menu.addSeparator(); // 메뉴바-메뉴아이템들 구분해주는 선이 separator
		menu.add(exitItem);
		
		bar.add(menu);
		setJMenuBar(bar);
		
		setLayout(card);
		add("myList", mList);
		
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		}
		catch (Exception ex) {} // 윈도우 스킨 입힐때(jtattoo에서 스킨 다운받은 후 - 빌드페스에서 추가하고 하면 스킨 바꿀 수 있다)
		
        new MusicMain();
        
	}

}
