import java.sql.Connection;
	import java.sql.Date;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	
	
public class LoginDAO {


		private static Connection conn; // connection �������̽�
		private static Statement stmt; // statement �������̽�
		private static PreparedStatement pstmt;

		private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		private String id = "net3";
		private String pw = "1234";
		private ResultSet rs;
		
		public void createTable(){
			
			int num = 0;
			
			try { // ����ó�� �� �κ�
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
				String sql1 = "create table Login(ID varchar2(20) primary key, PW varchar2(20) not null,m number)";
				pstmt = conn.prepareStatement(sql1);	
				num = pstmt.executeUpdate();  // DB���� ����� �ο� �� ����. int��

			} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
				e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {     //finally ����� try���� ���ܰ� �߻��ϵ� ���ϵ� ������ �����.
					try {
						if(pstmt != null) pstmt.close(); // �ݴºκе� ���� ��Ȳ�� ���� ����.
						if(conn != null) conn.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
			}
	
		}

}
