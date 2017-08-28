import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SearchDAO {
	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";
	private ResultSet rs;

	public ArrayList<SearchVO> searchPetName(String searchName) {
		SearchVO sv = null;
		ArrayList<SearchVO> al = new ArrayList<SearchVO>();
		try { // ����ó�� �� �κ�

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "select * from info where name like ?"; // DB���� ���̺� �˻�
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + searchName + "%"); // �˻��ؽ�Ʈ�ʵ忡 �Էµ� �̸����� DB���� �˻�

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

		} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
			e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
		} catch (SQLException e) {
			System.out.println("����");
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
		return al;
	}
	////��ü��ȸ �޼ҵ�//////////////
	public ArrayList<SearchVO> searchPetNameAll() {
		SearchVO sv = null;
		ArrayList<SearchVO> al = new ArrayList<SearchVO>();
		try { // ����ó�� �� �κ�

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "select * from info "; // DB���� ���̺� �˻�
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

		} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
			e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
		} catch (SQLException e) {
			System.out.println("����");
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
		return al;
	}

}
