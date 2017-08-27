import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoDAO {// �ְ�����&��ȣ�� �Է� ���̺�
	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "team";
	private String pw = "1234";

	private ResultSet rs;
	int regiNum = 1;

	public void createTable() {

		int num = 0;

		try { // ����ó�� �� �κ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql1 = "create table Info(regiNum number primary key not null, name varchar2(20) not null, gender number not null,species varchar2(20) not null, detailedSpecies varchar2(20), age number, weight number, comments varchar2(50),guardianName varchar2(20), guardianMobile varchar2(20), guardianAddress varchar2(50))";
			pstmt = conn.prepareStatement(sql1);
			num = pstmt.executeUpdate(); // DB���� ����� �ο� �� ����. int��

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
		}

	}

	public void insertPetInfo(int regiNum, String name, int gender, String species, String form, int age, int weight,
			String comments) {
		InfoVO infovo = null;
		// �� ������ DB�� Insert �ϱ�
		try { // ����ó�� �� �κ�
			System.out.println(name);
			System.out.println(gender);
			System.out.println(species);
			System.out.println(form);
			System.out.println(age);
			System.out.println(weight);
			System.out.println(comments);

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql = "insert into info(regiNum,name,gender,species,detailedspecies,age,weight,comments,guardianname,guardianmobile,guardianaddress)"
					+ "values(?,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, regiNum);
			pstmt.setString(2, name);
			pstmt.setInt(3, gender);
			pstmt.setString(4, species);
			pstmt.setString(5, form);
			pstmt.setInt(6, age);
			pstmt.setInt(7, weight);
			pstmt.setString(8, comments);
			pstmt.setString(9, null);
			pstmt.setString(10, null);
			pstmt.setString(11, null);
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
