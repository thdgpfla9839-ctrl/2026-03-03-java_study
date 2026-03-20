/*
 * 오라클 등록하는 법
 *                       
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class 메소드_분리 {
	// 0.드라이버 등록
	static void init() throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
   // 1.연결
	static Connection getConnection() throws Exception
	{
		final String URL="jdbc:oracle:thin:@211.238.142.22:1521";
		final String USER = "hr";
		final String PWD="happy";
		
		Connection conn=DriverManager.getConnection(URL,USER,PWD);
		return conn;
	}
	//2.해제
	static void disConnection(Connection conn,PreparedStatement ps) throws Exception
	{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	//3.기능 수행
	static void seoulTravel() throws Exception
	{
		init();
		Connection conn= getConnection();
		String sql="SELECT title,address FROM seoulTravel";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println("==========================================");
			
		}
		rs.close();
		disConnection(conn, ps);
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		seoulTravel();
	}

}
