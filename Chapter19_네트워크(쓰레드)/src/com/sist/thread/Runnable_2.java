package com.sist.thread;
// 비동기화 -> 동시에 출발, sleep()에 따라 멈추는게 다름
// 동시다발적으로 이용할 떄는 쓰레드를 쓰고 그떄 내부클래스를 사용하자
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class Runnable_2  extends JFrame 
implements ActionListener
{
	 JProgressBar[] bar=new JProgressBar[5];
	    JButton b1,b2;
	    static int rank=0; // 하나의 공간을 줘야 순위 볼 수 있음
	    BarThread[] bt = new BarThread[5];
	    
	    public Runnable_2()
	    {
	    	b1=new JButton("시작");
	    	b2=new JButton("종료");
	    	
	    	Color[] color={Color.yellow,Color.pink,
	    			Color.orange,Color.green,Color.cyan};
	    	JPanel p=new JPanel();
	    	p.setLayout(new GridLayout(5,1,5,5));
	    	for(int i=0;i<5;i++)
	    	{
	    		bar[i]=new JProgressBar();
	    		bar[i].setMaximum(100);
	    		bar[i].setMinimum(0);
	    		bar[i].setStringPainted(true);
	    		bar[i].setBackground(Color.white);
	    		bar[i].setForeground(color[i]);
	    		p.add(bar[i]);
	    	}
	    	JPanel p1=new JPanel();
	    	p1.add(b1);p1.add(b2);
	    	
	    	add("Center",p);
	    	add("South",p1);
	    	setSize(500, 450);
	    	setVisible(true);
	    	
	    	b1.addActionListener(this);
	    	b2.addActionListener(this);
	    	
	    	
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      new Runnable_2();
	}
    
	class BarThread extends Thread
	{
		int index;
		public BarThread(int index)
		{
			this.index=index;
			
		}
		
		public void run()
		{
			for(int i=0;i<=100;i++)
			{
				bar[index].setValue(i);
				int a=(int)(Math.random()*300);
				try
				{
					Thread.sleep(a);
				}
				catch (Exception ex) {}
				
				if(i==100)
				{
					rank++;
					interrupt();
				}
			}
			System.out.println((index+1)+"번쨰"+rank+"등");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==b1)
		 {
			 for(int i=0; i<5;i++)
			 {
				 bt[i]= new BarThread(i);
				 bt[i].start();
			 }
		 }
		 if(e.getSource()==b2)
		 {
			 System.exit(0);
		 }
	}
}
