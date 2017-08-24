import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class MenuGUI {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuGUI window = new MenuGUI();
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
	public MenuGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 453);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 91, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 64, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 471, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 250, 154));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 28));
		textField.setText("\uD504\uB85C\uADF8\uB7A8 \uAD00\uB9AC \uBA54\uB274");
		panel.add(textField, "name_5564498849522");
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		panel.add(label, "name_5469715892520");
		
		btnNewButton = new JButton("\uCD94 \uAC00");
		btnNewButton.addActionListener(new ActionListener() { // Ãß°¡¹öÆ° Å¬¸¯
			public void actionPerformed(ActionEvent e) {
				InfoGUI infoG = new InfoGUI();
				infoG.main(null);   // Ãß°¡ ¹öÆ° Æ²¸¯ ½Ã InfoGUIÃ¢ È°¼ºÈ­
			}
		});
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 218, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -254, SpringLayout.SOUTH, frame.getContentPane());
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("1.");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 41, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 160, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -10, SpringLayout.WEST, btnNewButton);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 2, SpringLayout.NORTH, lblNewLabel);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		label_1 = new JLabel("2.");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 165, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -6, SpringLayout.NORTH, label_1);
		springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, label_1, -197, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, label_1, 0, SpringLayout.EAST, lblNewLabel);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3.");
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 6, SpringLayout.SOUTH, label_1);
		springLayout.putConstraint(SpringLayout.WEST, label_2, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, label_2, -141, SpringLayout.SOUTH, frame.getContentPane());
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4.");
		springLayout.putConstraint(SpringLayout.NORTH, label_3, 6, SpringLayout.SOUTH, label_2);
		springLayout.putConstraint(SpringLayout.WEST, label_3, 0, SpringLayout.WEST, lblNewLabel);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5.");
		springLayout.putConstraint(SpringLayout.WEST, label_4, 0, SpringLayout.WEST, lblNewLabel);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		frame.getContentPane().add(label_4);
		
		button = new JButton("\uC218 \uC815");
		springLayout.putConstraint(SpringLayout.NORTH, button, 4, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, button, -203, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, button);
		springLayout.putConstraint(SpringLayout.WEST, button, 218, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button, -209, SpringLayout.EAST, frame.getContentPane());
		button.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		frame.getContentPane().add(button);
		
		button_1 = new JButton("\uC0AD \uC81C");
		springLayout.putConstraint(SpringLayout.NORTH, button_1, 224, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, button_1, -144, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, label_2, -10, SpringLayout.WEST, button_1);
		springLayout.putConstraint(SpringLayout.WEST, button_1, 218, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button_1, -209, SpringLayout.EAST, frame.getContentPane());
		button_1.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("\uC870 \uD68C");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Á¶È¸¹öÆ°
				SearchGUI_1 searG = new SearchGUI_1();
				searG.main(null);  // °Ë»öÃ¢ È°¼ºÈ­
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, label_3, 0, SpringLayout.SOUTH, button_2);
		springLayout.putConstraint(SpringLayout.EAST, label_3, -10, SpringLayout.WEST, button_2);
		springLayout.putConstraint(SpringLayout.WEST, button_2, 218, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button_2, -209, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, button_2, 68, SpringLayout.SOUTH, button);
		springLayout.putConstraint(SpringLayout.SOUTH, button_2, -88, SpringLayout.SOUTH, frame.getContentPane());
		button_2.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		springLayout.putConstraint(SpringLayout.NORTH, label_4, 0, SpringLayout.NORTH, button_3);
		springLayout.putConstraint(SpringLayout.SOUTH, label_4, 0, SpringLayout.SOUTH, button_3);
		springLayout.putConstraint(SpringLayout.EAST, label_4, -10, SpringLayout.WEST, button_3);
		springLayout.putConstraint(SpringLayout.WEST, button_3, 218, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, button_3, -209, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, button_3, 13, SpringLayout.SOUTH, button_2);
		springLayout.putConstraint(SpringLayout.SOUTH, button_3, -28, SpringLayout.SOUTH, frame.getContentPane());
		button_3.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		frame.getContentPane().add(button_3);
	}
}
