import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SearchDAO {
	private static Connection conn; // connection 인터페이스
	private static Statement stmt; // statement 인터페이스
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";
	private ResultSet rs;

	public ArrayList<SearchVO> searchPetName(String searchName) {
		SearchVO sv = null;
		ArrayList<SearchVO> al = new ArrayList<SearchVO>();
		try { // 예외처리 할 부분

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "select * from info where name like ?"; // DB에서 테이블값 검색
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchName + "%"); // 검색텍스트필드에 입력된 이름으로 DB에서 검색

			int num = pstmt.executeUpdate();

			rs = pstmt.executeQuery();

			while (rs.next()) {

				sv = new SearchVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				sv.setDspec(rs.getString(5));
				sv.setAge(rs.getInt(6));
				sv.setWeight(rs.getInt(7));
				sv.setA(rs.getString(8));
				sv.setB(rs.getString(9));
				sv.setC(rs.getString(10));
				sv.setD(rs.getString(11));

				al.add(sv);

			}

		} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
			e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
		} catch (SQLException e) {
			System.out.println("오류");
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
		return al;
	}
	////전체조회 메소드//////////////
	public ArrayList<SearchVO> searchPetNameAll() {
		SearchVO sv = null;
		ArrayList<SearchVO> al = new ArrayList<SearchVO>();
		try { // 예외처리 할 부분

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "select * from info "; // DB에서 테이블값 검색
			pstmt = conn.prepareStatement(sql);
			int num = pstmt.executeUpdate();
			rs = pstmt.executeQuery();

			while (rs.next()) {

				sv = new SearchVO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
				sv.setDspec(rs.getString(5));
				sv.setAge(rs.getInt(6));
				sv.setWeight(rs.getInt(7));
				sv.setA(rs.getString(8));
				sv.setB(rs.getString(9));
				sv.setC(rs.getString(10));
				sv.setD(rs.getString(11));

				al.add(sv);

			}

		} catch (ClassNotFoundException e) { // 예외처리 잡아주는 부분
			e.printStackTrace(); // 예외에 대한 자세한 사항을 consol창에 출력
		} catch (SQLException e) {
			System.out.println("오류");
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
		return al;
	}

}
