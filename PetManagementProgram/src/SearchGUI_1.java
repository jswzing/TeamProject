import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchGUI_1 {

	private JFrame frame;
	private JTextField txtxx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchGUI_1 window = new SearchGUI_1();
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
	public SearchGUI_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 706, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(110, 46, 348, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("\uC870 \uD68C");
		label.setFont(new Font("±¼¸²", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, "name_11531351470090");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(110, 163, 114, 32);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uAC80\uC0C9 XX :");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel, "name_11600508772367");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(236, 163, 222, 32);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		txtxx = new JTextField();
		txtxx.setText("\uAC80\uC0C9\uC5B4xx");
		txtxx.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		txtxx.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(txtxx, "name_11642339154267");
		txtxx.setColumns(10);
		
		Button button = new Button("\uC870\uD68C\uD558\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(321, 236, 137, 32);
		frame.getContentPane().add(button);
		button.setFont(new Font("Dialog", Font.BOLD, 18));
	}

}
