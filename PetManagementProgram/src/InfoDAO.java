import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoDAO {//애견정보&보호자 입력 테이블
	private static Connection conn; // connection 인터페이스
	private static Statement stmt; // statement 인터페이스
	private static PreparedStatement pstmt;

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private String id = "net3";
	private String pw = "1234";
	private ResultSet rs;

	public void createTable() {

		int num = 0;

		try { // 예외처리 할 부분
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			String sql1 = "create table Info(regiNum number primary key not null, name varchar2(20) not null, gender number not null,species varchar2(20) not null, detailedSpecies varchar2(20), age number, weight number, comments varchar2(50),guardianName varchar2(20), guardianMobile varchar2(20), guardianAddress varchar2(50))";
			pstmt = conn.prepareStatement(sql1);
			num = pstmt.executeUpdate(); // DB에서 변경된 로우 수 리턴. int형

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
		}

	}
	public void insertPetInfo(int regiNum, String name, int gender, String species, String form, int age, int weight, String comments) {
		//펫 정보를 DB에 Insert 하기
				if (regiNum == 0) {
				} else {
					try { // 예외처리 할 부분

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

}
