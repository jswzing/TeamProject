import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModifyDAO {
	private static Connection conn; // connection 인터페이스
	private static Statement stmt; // statement 인터페이스
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";

	private ResultSet rs;

	public void updatePetInfo(int regiNum, String name, int gender, String species, String form, int age, int weight,
			String comments, String gName, String gPhone, String gAddress) {
		InfoVO infovo = null;
		// 펫 정보를 DB에 Insert 하기
		try { // 예외처리 할 부분

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "update info set name=?,gender=?,species=?,detailedspecies=?,age=?,weight=?,comments=?,guardianname=?,guardianmobile=?,guardianaddress=? where reginum =?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setInt(2, gender);
			pstmt.setString(3, species);
			pstmt.setString(4, form);
			pstmt.setInt(5, age);
			pstmt.setInt(6, weight);
			pstmt.setString(7, comments);
			pstmt.setString(8, gName);
			pstmt.setString(9, gPhone);
			pstmt.setString(10, gAddress);
			pstmt.setInt(11, regiNum);
			pstmt.executeUpdate();

		} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
			e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // finally 블록은 try에서 예외가 발생하든 안하든 무조건 실행됨.
		}
		try {
			if (pstmt != null)
				pstmt.close(); // 닫는부분도 앞의 상황에 따라 수정.
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
