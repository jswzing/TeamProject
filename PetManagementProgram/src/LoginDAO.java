import java.sql.Connection;
	import java.sql.Date;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	
	
public class LoginDAO {


		private static Connection conn; // connection 인터페이스
		private static Statement stmt; // statement 인터페이스
		private static PreparedStatement pstmt;

		private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		private String id = "net3";
		private String pw = "1234";
		private ResultSet rs;
		
		public void createTable(){
			
			int num = 0;
			
			try { // 예외처리 할 부분
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
				String sql1 = "create table Login(ID varchar2(20) primary key, PW varchar2(20) not null,m number)";
				pstmt = conn.prepareStatement(sql1);	
				num = pstmt.executeUpdate();  // DB에서 변경된 로우 수 리턴. int형

			} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
				e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {     //finally 블록은 try에서 예외가 발생하든 안하든 무조건 실행됨.
					try {
						if(pstmt != null) pstmt.close(); // 닫는부분도 앞의 상황에 따라 수정.
						if(conn != null) conn.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
			}
	
		}

}
