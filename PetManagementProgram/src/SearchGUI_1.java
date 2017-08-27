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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(128, 10, 436, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel label = new JLabel("\uC870     \uD68C");
		label.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, "name_11531351470090");

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(85, 77, 114, 32);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("\uAC80 \uC0C9");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, "name_11600508772367");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(211, 77, 222, 32);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		txtxx = new JTextField();
		txtxx.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		txtxx.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(txtxx, "name_11642339154267");
		txtxx.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 125, 666, 32);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("\uC870\uD68C\uBAA9\uB85D");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 666, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
		);
		panel_3.setLayout(gl_panel_3);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 167, 666, 379);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton("\uC870\uD68C\uD558\uAE30");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 18));
		btnNewButton.setBounds(445, 77, 119, 32);
		frame.getContentPane().add(btnNewButton);
	}
}
