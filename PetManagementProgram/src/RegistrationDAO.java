import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationDAO {

	private static Connection conn; // connection 인터페이스
	private static Statement stmt; // statement 인터페이스
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";
	private ResultSet rs;

	public void insertMember(String regID, String regPW, int regInfo) {

		if (regInfo == 0) {
		} else {
			try { // 예외처리 할 부분

				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
				String sql = "insert into login(id,pw,m)" + "values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, regID);
				pstmt.setString(2, regPW);
				pstmt.setInt(3, regInfo);
				pstmt.executeUpdate();
			} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
				e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
			} catch (SQLException e) {// 아이디중복처리
				System.out.println("아이디중복");
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

	public boolean selectIdDuplication(String regID) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);

			String sql2 = "select * from login where id = ?"; // Id 검색

			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, regID);

			rs = pstmt.executeQuery(); // DB에서 셀렉트한 셀값 리턴
			
			if (rs.next()) {
				if (rs.getString(1).equals(regID)) {
					return true;
				}
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
			e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
		} catch (SQLException e) {
			System.out.println("오류");
			e.printStackTrace();
		} finally { // finally 블록은 try에서 예외가 발생하든 안하든 무조건 실행됨.
			try {
				if (pstmt != null)
					pstmt.close(); // 닫는부분도 앞의 상황에 따라 수정.
				if (conn != null)
					conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return false;
	}

}
