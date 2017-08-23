import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI {

	private JFrame frame;
	private JTextField textField;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel_5;
	private JPanel panel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI window = new LoginGUI();
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
	public LoginGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 63, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 541, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		textField = new JTextField();
		textField.setBackground(new Color(240, 255, 255));
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("\uC560\uC644\uB3D9\uBB3C\uAD00\uB9AC\uD504\uB85C\uADF8\uB7A8");
		panel.add(textField, "name_6251669400772");
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 58, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 36, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 94, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 147, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 22, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 58, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 0, SpringLayout.EAST, panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblPw, "name_6689315434097");
		
		panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 58, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 68, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, 94, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 297, SpringLayout.EAST, panel_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, "name_6672982059108");
		frame.getContentPane().add(panel_3);
		
		panel_4 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 22, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 0, SpringLayout.WEST, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, 58, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		textField_1 = new JTextField();
		panel_3.add(textField_1, "name_6488162938215");
		textField_1.setColumns(10);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		textField_2 = new JTextField();
		panel_4.add(textField_2, "name_6490402807929");
		textField_2.setColumns(10);
		
		panel_5 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_5, -88, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_5, 153, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_5, -48, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_5, 246, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_5);
		
		panel_6 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_6, 0, SpringLayout.NORTH, panel_5);
		springLayout.putConstraint(SpringLayout.WEST, panel_6, 61, SpringLayout.EAST, panel_5);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_6, 0, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.EAST, panel_6, 154, SpringLayout.EAST, panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("\uD655\uC778");		
		panel_5.add(btnNewButton, "name_6545830540329");
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("\uD68C\uC6D0\uAC00\uC785");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationGUI reGUI = new RegistrationGUI();
				reGUI.main(null);
			}
		});
		panel_6.add(btnNewButton_1, "name_6547678418600");
	}
}
