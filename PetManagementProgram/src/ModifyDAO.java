import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ModifyDAO {
	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";

	private ResultSet rs;

	public void updatePetInfo(int regiNum, String name, int gender, String species, String form, int age, int weight,
			String comments, String gName, String gPhone, String gAddress) {
		InfoVO infovo = null;
		// �� ������ DB�� Insert �ϱ�
		try { // ����ó�� �� �κ�

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

		} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
			e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
		} catch (SQLException e) {
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
