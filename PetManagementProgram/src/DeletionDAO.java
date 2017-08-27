import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeletionDAO {
	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";
	public int deleteInfo(int serialNumber) {
	try { // ����ó�� �� �κ�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pw);
		String sql = "select REGINUM from INFO where REGINUM=?"; // info���̺� �Ϸù�ȣ(reginum)���� select��
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, serialNumber);
		rs = pstmt.executeQuery(); //����
		if(rs.next()) { //select���� ������
			String sql2 ="delete from INFO where REGINUM = ?";//info ���̺� �Ϸù�ȣ���� delete��
			pstmt = conn.prepareStatement(sql2);
			pstmt.setInt(1, serialNumber);
			rs = pstmt.executeQuery(); //����
			return 0; //0�� = GUI�� result�� ������
		} else {//select���� ������
			return 1; //1�� = GUI�� result�� ���а�
		}
				
	} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
		e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
	} catch (SQLException e) {
		e.printStackTrace();
	} finally { // finally ����� try���� ���ܰ� �߻��ϵ� ���ϵ� ������ �����.
		try {
			if (pstmt != null)
				pstmt.close(); // �ݴºκе� ���� ��Ȳ�� ���� ����.
			if (conn != null)
				conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}return 2; //2�� = GUI�� result�� ���ܰ�

}
}
