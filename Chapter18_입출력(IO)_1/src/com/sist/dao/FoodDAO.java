package com.sist.dao;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.sist.vo.FoodVO;

// 실제로 값을 채우는 경우는 게터/세터 모두 필요
// 이미 데이터가 고정이 된 상태는 게터만 필요 -> 코드 변경 불가능해짐
public class FoodDAO {
/*
 * 파일이나 데이터베이스에 연동하는 클래스
 */
	
   private static List<FoodVO> fList=new ArrayList<FoodVO>(); // 다른 패키지에 접근 불가능
   static
   {
	  try
	  {
		  // 여기서 값을 채움
		  
		  FileReader fr=
					new FileReader("C:\\javaDev\\food.txt");
				StringBuffer sb=new StringBuffer();
				// => 파일읽는 경우 => 1글자 
				// => 한줄씩 읽을 수 있다 
				// BufferedReader => IO
				int i=0; // 읽은 char 
				while((i=fr.read())!=-1)
				{
					sb.append((char)i);
				}
				fr.close(); // => try~with~resource 
				// 맛집별로 나눠서 저장 
				String[] datas=sb.toString().split("\n");
				// 변수로 나눠서 저장 
				for(String food:datas)
				{
					FoodVO f=new FoodVO();
					StringTokenizer st=
							new StringTokenizer(food,"|");
					f.setNo(Integer.parseInt(st.nextToken()));
					f.setName(st.nextToken());
					f.setType(st.nextToken());
					f.setPhone(st.nextToken());
					f.setAddress(st.nextToken());
					f.setScore(Double.parseDouble(st.nextToken()));
					f.setParking(st.nextToken());
					f.setPoster(st.nextToken());
					f.setTime(st.nextToken());
					f.setContent(st.nextToken());
					f.setTheme(st.nextToken());
					f.setPrice(st.nextToken());
					
					fList.add(f);
	  }
	 
   }
	  catch (Exception ex) {}
	  
  }
   public static List<FoodVO> getfList() {
	return fList;
   }
   public static void setfList(List<FoodVO> fList) {
	FoodDAO.fList = fList;
   }
}