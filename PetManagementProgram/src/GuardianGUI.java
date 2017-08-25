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
import javax.swing.JTextArea;

public class GuardianGUI {

	private JFrame frame;

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
		frame.setResizable(false);
		frame.setBounds(100, 100, 741, 613);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(147, 31, 383, 73);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uBCF4\uD638\uC790 \uC815\uBCF4");
		lblNewLabel.setBackground(new Color(153, 180, 209));
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_10134951827494");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(147, 171, 94, 28);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(147, 217, 94, 22);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1, "name_10410950743880");
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(147, 261, 94, 22);
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
		panel_4.setBounds(261, 171, 269, 28);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		panel_4.add(textArea_1, "name_9502280390988");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(261, 217, 269, 28);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		panel_5.add(textArea_2, "name_9505344412199");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(261, 261, 269, 50);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		panel_6.add(textArea, "name_9493520574929");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(418, 367, 112, 28);
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
