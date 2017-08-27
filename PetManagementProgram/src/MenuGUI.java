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
import java.awt.SystemColor;

public class MenuGUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		panel.setBounds(140,50,390,70);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 22, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 160, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 76, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -154, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		textField.setText("\uD504\uB85C\uADF8\uB7A8 \uAD00\uB9AC \uBA54\uB274");
		panel.add(textField, "name_5564498849522");
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		panel.add(label, "name_5469715892520");
		
		JButton Button1 = new JButton("\uCD94 \uAC00");
	
		
		
		springLayout.putConstraint(SpringLayout.NORTH, Button1, 31, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.SOUTH, Button1, -413, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Button1, -200, SpringLayout.EAST, frame.getContentPane());
		Button1.addActionListener(new ActionListener() { // Ãß°¡¹öÆ° Å¬¸¯
			public void actionPerformed(ActionEvent e) {
				InfoGUI infoG = new InfoGUI();
				infoG.main(null);   // Ãß°¡ ¹öÆ° Æ²¸¯ ½Ã InfoGUIÃ¢ È°¼ºÈ­
			}
		});
		Button1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		frame.getContentPane().add(Button1);
		
		lblNewLabel = new JLabel("1.");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 171, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -470, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Button1, 1, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 11, SpringLayout.NORTH, Button1);
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel);
		
		label_1 = new JLabel("2.");
		springLayout.putConstraint(SpringLayout.NORTH, label_1, 35, SpringLayout.SOUTH, lblNewLabel);
		springLayout.putConstraint(SpringLayout.WEST, label_1, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, label_1, 0, SpringLayout.EAST, lblNewLabel);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		frame.getContentPane().add(label_1);
		
		label_2 = new JLabel("3.");
		springLayout.putConstraint(SpringLayout.NORTH, label_2, 264, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, label_2, 176, SpringLayout.WEST, frame.getContentPane());
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		frame.getContentPane().add(label_2);
		
		label_3 = new JLabel("4.");
		springLayout.putConstraint(SpringLayout.NORTH, label_3, 27, SpringLayout.SOUTH, label_2);
		springLayout.putConstraint(SpringLayout.WEST, label_3, 5, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, label_3, -475, SpringLayout.EAST, frame.getContentPane());
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		frame.getContentPane().add(label_3);
		
		label_4 = new JLabel("5.");
		springLayout.putConstraint(SpringLayout.SOUTH, label_3, -41, SpringLayout.NORTH, label_4);
		springLayout.putConstraint(SpringLayout.WEST, label_4, 10, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, label_4, -10, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, label_4, -123, SpringLayout.SOUTH, frame.getContentPane());
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 30));
		frame.getContentPane().add(label_4);
		
		Button2 = new JButton("\uC218 \uC815");
		springLayout.putConstraint(SpringLayout.WEST, Button2, 1, SpringLayout.EAST, label_1);
		springLayout.putConstraint(SpringLayout.EAST, Button2, -200, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, label_1, 0, SpringLayout.SOUTH, Button2);
		springLayout.putConstraint(SpringLayout.NORTH, Button2, 22, SpringLayout.SOUTH, Button1);
		Button2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		frame.getContentPane().add(Button2);
		
		Button3 = new JButton("\uC0AD \uC81C");
		springLayout.putConstraint(SpringLayout.SOUTH, label_2, 0, SpringLayout.SOUTH, Button3);
		springLayout.putConstraint(SpringLayout.EAST, label_2, -6, SpringLayout.WEST, Button3);
		springLayout.putConstraint(SpringLayout.NORTH, Button3, 255, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, Button2, -20, SpringLayout.NORTH, Button3);
		springLayout.putConstraint(SpringLayout.WEST, Button3, 0, SpringLayout.WEST, Button1);
		springLayout.putConstraint(SpringLayout.SOUTH, Button3, -265, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Button3, 0, SpringLayout.EAST, Button1);
		Button3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		frame.getContentPane().add(Button3);
		
		Button4 = new JButton("\uC870 \uD68C");
		springLayout.putConstraint(SpringLayout.NORTH, Button4, 18, SpringLayout.SOUTH, Button3);
		springLayout.putConstraint(SpringLayout.WEST, Button4, 0, SpringLayout.WEST, Button1);
		springLayout.putConstraint(SpringLayout.SOUTH, Button4, -193, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Button4, -200, SpringLayout.EAST, frame.getContentPane());
		Button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // Á¶È¸¹öÆ°
				SearchGUI_1 searG = new SearchGUI_1();
				searG.main(null);  // °Ë»öÃ¢ È°¼ºÈ­
			}
		});
		Button4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		frame.getContentPane().add(Button4);
		
		Button5 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		Button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginGUI loginG = new LoginGUI();
				loginG.main(null);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, label_4, 5, SpringLayout.NORTH, Button5);
		springLayout.putConstraint(SpringLayout.NORTH, Button5, 24, SpringLayout.SOUTH, Button4);
		springLayout.putConstraint(SpringLayout.WEST, Button5, 0, SpringLayout.WEST, Button1);
		springLayout.putConstraint(SpringLayout.SOUTH, Button5, -115, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Button5, -200, SpringLayout.EAST, frame.getContentPane());
		Button5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		frame.getContentPane().add(Button5);
	}
}
