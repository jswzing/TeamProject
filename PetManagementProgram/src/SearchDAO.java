import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SearchDAO {
	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";
	private ResultSet rs;
	
	

}
