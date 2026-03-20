
// 데이터수집
/*
 * class Music
 * {
 *    String title;
 *    String singer;
 *    String album;
 * }
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class GenieMusic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //       1. 기능
		/*    목록 읽기 -> 노래명
		 *    가수읽기
		 *    앨범 읽기
		 *    
	*/
	     }
	        static String[] getTitle() throws Exception
		    {
		    	String[] title=new String[200];
		    	int index=0;
		    	for(int i=1;i<=4;i++)
		    	{
		    		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=15&rtm=Y&pg="+i).get();
		    		Elements t=doc.select("table.list-wrap a.title");
		    		for(int j=0;j<t.size();j++)
		    		{
		    			String s=t.get(j).text();
		    			title[index]=s;
		    			index++;
		    		}
		    	}
		    	return title;
		    }
	        
	       static String[] getSinger() throws Exception
          {
	    	   
    	       String[] title=new String[200];
    	       int index=0;
    	        for(int i=1;i<=4;i++)
    	         {
    	        	
    		         Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=15&rtm=Y&pg="+i).get();
    		         Elements t=doc.select("table.list-wrap a.artist");
    		         for(int j=0;j<t.size();j++)
    		         {
    		        	 
    			        String s=t.get(j).text();
    			        title[index]=s;
    			        index++;
    		         }
    		         
    	           }
    	            return title;
          }
	       
	      static String[] getAlbum() throws Exception
         {
	    	  
    	     String[] title=new String[200];
    	     int index=0;
    	     for(int i=1;i<=4;i++)
    	      {
    		    Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=15&rtm=Y&pg="+i).get();
    		     Elements t=doc.select("table.list-wrap a.albumtitle");
    		     for(int j=0;j<t.size();j++)
    		     {
    			   String s=t.get(j).text();
    			   title[index]=s;
    			   index++;
    		     }
    	      }
    	       return title;
         }
	         static String[] getFind(String fd) throws Exception
	         {
		    	  
	    	    
	    	     int count=0;
	    	     for(int i=1;i<=4;i++)
	    	      {
	    		    Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=15&rtm=Y&pg="+i).get();
	    		     Elements t=doc.select("table.list-wrap a.title");
	    		     for(int j=0;j<t.size();j++)
	    		     {
	                   if(t.get(j).text().contains(fd))
	    			   {
	                	   count++;
	    			   }
	    			 }
	    		  }
	    	      
	    	     String[] title=new String[count];
	    	     int index=0;
	    	     for(int i=1;i<=4;i++)
	    	      {
	    		    Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20260317&hh=15&rtm=Y&pg="+i).get();
	    		     Elements t=doc.select("table.list-wrap a.title");
	    		     for(int j=0;j<t.size();j++)
	    		     {
	                   if(t.get(j).text().contains(fd))
	    			   {
	                	   title[index] = t.get(j).text();
	                	   index++;
	    			   }
	    			 }
	    		   }
	    	      
	    	     return title;
		    
	           }
}
