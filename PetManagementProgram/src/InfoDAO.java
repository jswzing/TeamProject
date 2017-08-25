import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoDAO {//�ְ�����&��ȣ�� �Է� ���̺�
	private static Connection conn; // connection �������̽�
	private static Statement stmt; // statement �������̽�
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "net3";
	private String pw = "1234";
	private ResultSet rs;

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
	public void insertPetInfo(int regiNum, String name, int gender, String species, String form, int age, int weight, String comments) {
		//�� ������ DB�� Insert �ϱ�
				if (regiNum == 0) {
				} else {
					try { // ����ó�� �� �κ�

						Class.forName("oracle.jdbc.driver.OracleDriver");
						conn = DriverManager.getConnection(url, id, pw);
						String sql = "insert into login(regiNum,name,gender,species,form,age,weight,comments)" + "values(?,?,?,?,?,?,?,?)";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, regiNum);
						pstmt.setString(2, name);
						pstmt.setInt(3, gender);
						pstmt.setString(4, species);
						pstmt.setString(5, form);
						pstmt.setInt(6, age);
						pstmt.setInt(7, weight);
						pstmt.setString(8, comments);
						pstmt.executeUpdate();
					} catch (ClassNotFoundException e) { // ����ó�� ����ִ� �κ�
						e.printStackTrace(); // ���ܿ� ���� �ڼ��� ������ consolâ�� ���
					} catch (SQLException e) {// ���̵��ߺ�ó��
						System.out.println("���̵��ߺ�");
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
