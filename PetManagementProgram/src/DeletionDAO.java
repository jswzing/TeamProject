import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletionDAO {
	private static Connection conn; // connection 인터페이스
	private static Statement stmt; // statement 인터페이스
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";
	public int deleteInfo(int serialNumber) {
	try { // 예외처리 할 부분
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		String sql = "select REGINUM from INFO where REGINUM=?"; // info테이블에 일련번호(reginum)값을 select함
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, serialNumber);
		rs = pstmt.executeQuery(); //실행
		if(rs.next()) { //select값이 있으면
			String sql2 ="delete from INFO where REGINUM = ?";//info 테이블에 일련번호값을 delete함
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, serialNumber);
			rs = pstmt.executeQuery(); //실행
			return 0; //0값 = GUI의 result에 성공값
		} else {//select값이 없으면
			return 1; //1값 = GUI의 result에 실패값
		}
				
	} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
		e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
	} catch (SQLException e) {
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
	}return 2; //2값 = GUI의 result에 예외값

}
}
