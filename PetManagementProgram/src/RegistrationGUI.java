import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrationGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationGUI window = new RegistrationGUI();
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
	public RegistrationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 337, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 78, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 311, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_7534282729791");
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 13, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 53, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 105, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 30, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 70, SpringLayout.SOUTH, panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblId = new JLabel("ID");
		panel_1.add(lblId, "name_7596613482305");
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 105, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		panel_2.add(lblNewLabel_1, "name_7612460036501");
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 13, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, -192, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, 53, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_3, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_4, 0, SpringLayout.NORTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_4, 0, SpringLayout.WEST, panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		textField = new JTextField();
		panel_3.add(textField, "name_7676223184560");
		textField.setColumns(10);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4, 0, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_4, 0, SpringLayout.EAST, panel);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		textField_1 = new JTextField();
		panel_4.add(textField_1, "name_7679719026202");
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_5, 23, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.WEST, panel_5, 28, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_5, 100, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.EAST, panel_5, 292, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_5);
		SpringLayout sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);
		
		JRadioButton managerButton = new JRadioButton("\uAD00\uB9AC\uC790");
		sl_panel_5.putConstraint(SpringLayout.NORTH, managerButton, 27, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.WEST, managerButton, 53, SpringLayout.WEST, panel_5);
		panel_5.add(managerButton);
		
		JRadioButton memberButton = new JRadioButton("\uC77C\uBC18\uD68C\uC6D0");
		sl_panel_5.putConstraint(SpringLayout.NORTH, memberButton, 0, SpringLayout.NORTH, managerButton);
		sl_panel_5.putConstraint(SpringLayout.WEST, memberButton, 36, SpringLayout.EAST, managerButton);
		panel_5.add(memberButton);
		
		ButtonGroup group = new ButtonGroup();
		group.add(memberButton);
		group.add(managerButton);
		
		JButton btnNewButton = new JButton("\uD655\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 17, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, -221, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 57, SpringLayout.SOUTH, panel_5);
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -99, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
	
	}
}
