import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationDAO {

	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "net3";
	private String pw = "1234";
	private ResultSet rs;

	public void insertMember(String regID, String regPW, int regInfo) {

		if (regInfo == 0) {
		} else {
			try { // ����ó�� �� �κ�

				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, id, pw);
				String sql = "insert into login(id,pw,m)" + "values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, regID);
				pstmt.setString(2, regPW);
				pstmt.setInt(3, regInfo);
				pstmt.executeUpdate();
			} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
				e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
			} catch (SQLException e) {//���̵��ߺ�ó��
				e.printStackTrace();
			} finally { // finally ����� try���� ���ܰ� �߻��ϵ� ���ϵ� ������ �����.
			}
			try {
				if (pstmt != null)
					pstmt.close(); // �ݴºκе� ���� ��Ȳ�� ���� ����.
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
