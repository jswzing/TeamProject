import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;

public class ResultDeletionGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(int result) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResultDeletionGUI window = new ResultDeletionGUI(result);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ResultDeletionGUI(int result) {
		initialize(result);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int result) {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 500, 100);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 62, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 484, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbResult = new JLabel("");
		lbResult.setFont(new Font("���� ���", Font.PLAIN, 17));
		lbResult.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbResult, "name_21392681325050");
		//DeletionDAO deleD = new DeletionDAO();//deletionDAO ��ü ����
		//DeleteGUI deleG = new DeleteGUI(); //deleteGUI ��ü ����
		//int result = deleG.getSerialNumber();
		if(result == 0) {
			lbResult.setText("���������� �Ϸ�ƽ��ϴ�.");
		} else if(result == 1) {
			lbResult.setText("��ϵ� ������ ���ų� �Ϸù�ȣ�� �߸��Է��߽��ϴ�.");
		} else {

		}
	}
}
