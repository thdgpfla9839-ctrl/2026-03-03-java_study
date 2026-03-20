package com.sist.oop2;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 매개변수가 알 수 없는 경우(매개변수가 몇개가 들어올지 모르는 경우) => 가변 매개변수
 *  예) 웹에서 필털를 만들때
 *      printf("%d",10)
 *      printf("%d%d",10,20)
 *  
 *  String ...str => 가변매개변수 형태 
 *  p.236
 *  
 */
class Temp
{
	public void sum(int... value)
	{
		int s=0;
		for(int i=0;i<value.length;i++)
		{
			s+=value[i]; // 값 읽을 때는 배열형식으로 
		}
		System.out.println("sum="+s);
	}
	// 값이 섞어서 들어갈때는 Object...
	public String change(int num)
	{
		DecimalFormat d= new DecimalFormat("###,###,###");
		return d.format(num);
	}
	public String dataChange(Date data)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh :mm:ss");
		return sdf.format(data);
	}
}
public class 메소드_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Temp t=new Temp();
     t.sum(10);
     t.sum(10,20,30,40,50,60,70); //데이터 내 맘대로 넣을 수 있음 (int... value) 이거 했잖아 
     int a=100000000;
     String res=t.change(a);
     System.out.println(res+"원");
     System.out.println(new Date());
     System.out.println(res);
	}

}
