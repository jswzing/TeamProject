

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;

public class infoGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					infoGUI window = new infoGUI();
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
	public infoGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 21, 378, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC560\uC644\uB3D9\uBB3C \uC815\uBCF4");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_10126113988224");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(34, 94, 98, 30);
		frame.getContentPane().add(panel_1);
		
		JLabel label = new JLabel("\uC774\uB984");
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(34, 166, 98, 30);
		frame.getContentPane().add(panel_2);
		
		JLabel label_1 = new JLabel("\uC885");
		panel_2.add(label_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(269, 166, 98, 30);
		frame.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("\uD488\uC885");
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(34, 202, 98, 30);
		frame.getContentPane().add(panel_5);
		
		JLabel lblNewLabel_3 = new JLabel("\uB098\uC774");
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(34, 238, 98, 30);
		frame.getContentPane().add(panel_6);
		
		JLabel lblNewLabel_4 = new JLabel("\uBAB8\uBB34\uAC8C");
		panel_6.add(lblNewLabel_4);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(34, 274, 98, 30);
		frame.getContentPane().add(panel_7);
		
		JLabel lblNewLabel_5 = new JLabel("\uBE44\uACE0");
		panel_7.add(lblNewLabel_5);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(138, 94, 120, 30);
		frame.getContentPane().add(panel_8);
		
		textField = new JTextField();
		panel_8.add(textField);
		textField.setColumns(10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(34, 130, 98, 30);
		frame.getContentPane().add(panel_9);
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4");
		panel_9.add(lblNewLabel_6);
		
		ButtonGroup group = new ButtonGroup();
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC554");
		rdbtnNewRadioButton.setBounds(148, 130, 43, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC218");
		rdbtnNewRadioButton_1.setBounds(205, 130, 53, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(138, 166, 120, 30);
		frame.getContentPane().add(panel_10);
		
		textField_1 = new JTextField();
		panel_10.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(138, 202, 120, 30);
		frame.getContentPane().add(panel_4);
		
		textField_2 = new JTextField();
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(260, 238, 37, 30);
		frame.getContentPane().add(panel_12);
		
		JLabel lblNewLabel_2 = new JLabel("kg");
		panel_12.add(lblNewLabel_2);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(138, 238, 120, 30);
		frame.getContentPane().add(panel_11);
		
		textField_3 = new JTextField();
		panel_11.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(138, 274, 233, 114);
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		textField_4 = new JTextField();
		panel_13.add(textField_4, "name_11457114844890");
		textField_4.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(379, 173, 67, 23);
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		textField_5 = new JTextField();
		panel_14.add(textField_5, "name_1852124069118");
		textField_5.setColumns(10);
	}
}
