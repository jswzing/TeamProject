import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Button;

public class GuardianGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuardianGUI window = new GuardianGUI();
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
	public GuardianGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 741, 613);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(55, 31, 383, 73);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uBCF4\uD638\uC790 \uC815\uBCF4");
		lblNewLabel.setBackground(new Color(153, 180, 209));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_10134951827494");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(55, 175, 94, 28);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(55, 221, 94, 22);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1, "name_10410950743880");
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(55, 265, 94, 22);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_2, "name_10427619988567");
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblNewLabel_3, "name_10445331306559");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(169, 175, 269, 28);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel_4.add(textField, "name_10478129927613");
		textField.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(169, 221, 269, 28);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(textField_1, "name_10524848071242");
		textField_1.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(169, 265, 269, 50);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_6.add(textField_2, "name_10564294454991");
		textField_2.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(326, 371, 112, 28);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		Button button = new Button("\uC644\uB8CC");
		button.setFont(new Font("Dialog", Font.PLAIN, 17));
		panel_7.add(button, "name_10848459115272");
		
		JLabel lblNewLabel_4 = new JLabel("\uC644\uB8CC");
		lblNewLabel_4.setLabelFor(lblNewLabel_4);
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_4, "name_10669186233266");
	}
}
