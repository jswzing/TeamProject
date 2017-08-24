import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		LoginDAO login = new LoginDAO();
		//login.createTable();
		LoginGUI loginGUI = new LoginGUI();
		loginGUI.main(null);
		
		InfoDAO info = new InfoDAO();
		//info.createTable();
		
	}
}
