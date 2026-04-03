package com.sist.collection;
import java.util.*;
import java.io.*;
class Data
{
	static Map<String, String> fData= new HashMap<String, String>();
	static
	{
		try
		{
			FileReader fr =new FileReader("C:\\javaDev\\string.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			fr.close();
//			System.out.println(data);
			String [] datas=data.split("\n");
			for(String s:datas)
			{
				StringTokenizer st = new StringTokenizer(s,":");
				fData.put(st.nextToken(), st.nextToken());
			}
		}catch (Exception ex) {}
	}
}
public class Collection_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data d =new Data();
        Scanner sc=new Scanner(System.in);
        System.out.print("과일명 입력: ");
        String key=sc.next();
        if(d.fData.containsKey(key))
        {
        	String en=d.fData.get(key);
        	System.out.println(key+"에 대한 영어는 "+en);
        }
        else
        {
        	System.out.println("영어 존재 안 함");
        }
       
	}

}
