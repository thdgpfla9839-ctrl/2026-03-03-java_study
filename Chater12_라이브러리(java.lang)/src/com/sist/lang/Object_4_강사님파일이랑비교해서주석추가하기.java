package com.sist.lang;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * toString()활용
 */
public class Object_4_강사님파일이랑비교해서주석추가하기 extends JFrame implements ItemListener {
      JComboBox box = new JComboBox();
      JLabel la= new JLabel("", JLabel.CENTER);
      public Object_4_강사님파일이랑비교해서주석추가하기()
      {
    	  box.addItem("나");
    	  box.addItem("너");
    	  box.addItem("그");
    	  
    	  add("North",box);
    	  add("Center",la);
    	  
    	  setSize(300,350);
    	  setVisible(true);
    	  
    	  box.addItemListener(this);
    	  
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Object_4_강사님파일이랑비교해서주석추가하기();   
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name = box.getSelectedItem().toString(); // 형변환 보다 투스트링이 보기 깔끔함 코드작성에 있어서
			la.setText(name);
		}
	}
	

}
