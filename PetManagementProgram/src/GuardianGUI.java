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
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuardianGUI {

	private JFrame frame;
	private String Gname;
	private String Gphone;
	private String Gaddress;

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
		
		JPanel background = new JPanel();
		background.setBorder(new CompoundBorder());
		background.setBounds(10, 10, 712, 564);
		frame.getContentPane().add(background);
		background.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(140, 49, 390, 70);
		background.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel guardianInfo = new JLabel("\uBCF4\uD638\uC790 \uC815\uBCF4");
		panel.add(guardianInfo, "name_4988617370205");
		guardianInfo.setBackground(SystemColor.window);
		guardianInfo.setLabelFor(frame);
		guardianInfo.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		guardianInfo.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1_Name = new JPanel();
		panel_1_Name.setBounds(140, 190, 100, 30);
		background.add(panel_1_Name);
		panel_1_Name.setLayout(new CardLayout(0, 0));
		
		JLabel Name = new JLabel("\uC774\uB984");
		panel_1_Name.add(Name, "name_5382253871486");
		Name.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		Name.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_2_contact = new JPanel();
		panel_2_contact.setBounds(140, 252, 100, 30);
		background.add(panel_2_contact);
		panel_2_contact.setLayout(new CardLayout(0, 0));
		
		JLabel contactNo = new JLabel("\uC5F0\uB77D\uCC98");
		panel_2_contact.add(contactNo, "name_5004449119981");
		contactNo.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		contactNo.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_3_address = new JPanel();
		panel_3_address.setBounds(140, 318, 100, 30);
		background.add(panel_3_address);
		panel_3_address.setLayout(new CardLayout(0, 0));
		
		JLabel address = new JLabel("\uC8FC\uC18C");
		panel_3_address.add(address, "name_5008952993544");
		address.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		address.setHorizontalAlignment(SwingConstants.LEFT);
		
		JPanel panel_4_nameInput = new JPanel();
		panel_4_nameInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_nameInput.setBounds(261, 190, 269, 28);
		background.add(panel_4_nameInput);
		panel_4_nameInput.setLayout(new CardLayout(0, 0));
		
		JTextArea nameInput = new JTextArea();
		panel_4_nameInput.add(nameInput, "name_5017744949718");
		nameInput.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		JPanel panel_5_coontactInput = new JPanel();
		panel_5_coontactInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5_coontactInput.setBounds(261, 254, 269, 28);
		background.add(panel_5_coontactInput);
		panel_5_coontactInput.setLayout(new CardLayout(0, 0));
		
		JTextArea contactNoInput = new JTextArea();
		panel_5_coontactInput.add(contactNoInput, "name_5024528764197");
		contactNoInput.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		JPanel panel_6_addInput = new JPanel();
		panel_6_addInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6_addInput.setBounds(261, 318, 269, 78);
		background.add(panel_6_addInput);
		panel_6_addInput.setLayout(new CardLayout(0, 0));
		
		JTextArea addressInput = new JTextArea();
		panel_6_addInput.add(addressInput, "name_5030856650982");
		addressInput.setFont(new Font("Monospaced", Font.PLAIN, 15));
		
		JButton btnNewButton = new JButton("\uC644\uB8CC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gname = nameInput.getText().toString();
				Gphone= contactNoInput.getText().toString();
				Gaddress = addressInput.getText().toString();
				frame.dispose();	
			}
		});
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		btnNewButton.setBounds(433, 442, 100, 30);
		background.add(btnNewButton);
	}

	public String getGname() {
		return Gname;
	}

	public String getGphone() {
		return Gphone;
	}

	public String getGaddress() {
		return Gaddress;
	}
	
}
