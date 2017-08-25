import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Menu;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class LoginGUI {

	private JFrame frame;
	private JPanel panel_1_ID;
	private JPanel panel_2_PW;
	private JPanel panel_3_idInput;
	private JPanel panel_4_pwInput;
	private JTextField idInput;
	private JTextField pwInput;
	private JPanel panel;

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
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		panel = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 0, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 674, SpringLayout.WEST, frame.getContentPane());
		panel.setBounds(100, 100, 695, 595);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_title = new JPanel();
		panel_title.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_title.setBounds(140, 49, 390, 70);
		panel.add(panel_title);
		springLayout.putConstraint(SpringLayout.NORTH, panel_title, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_title, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_title, 63, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_title, 541, SpringLayout.WEST, frame.getContentPane());
		panel_title.setLayout(new CardLayout(0, 0));
		
		panel_1_ID = new JPanel();
		panel_1_ID.setBounds(140, 200, 100, 30);
		panel.add(panel_1_ID);
		springLayout.putConstraint(SpringLayout.WEST, panel_1_ID, 36, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1_ID, 147, SpringLayout.WEST, frame.getContentPane());
		panel_1_ID.setLayout(new CardLayout(0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, panel_1_ID, 58, SpringLayout.SOUTH, panel_title);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1_ID, 94, SpringLayout.SOUTH, panel_title);
		
		panel_2_PW = new JPanel();
		panel_2_PW.setBounds(140, 250, 100, 30);
		panel.add(panel_2_PW);
		panel_2_PW.setLayout(new CardLayout(0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, panel_2_PW, 22, SpringLayout.SOUTH, panel_1_ID);
		springLayout.putConstraint(SpringLayout.WEST, panel_2_PW, 0, SpringLayout.WEST, panel_1_ID);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2_PW, 58, SpringLayout.SOUTH, panel_1_ID);
		springLayout.putConstraint(SpringLayout.EAST, panel_2_PW, 0, SpringLayout.EAST, panel_1_ID);
		
		panel_3_idInput = new JPanel();
		panel_3_idInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_idInput.setBounds(260, 200, 255, 30);
		panel.add(panel_3_idInput);
		panel_3_idInput.setLayout(new CardLayout(0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, panel_3_idInput, 58, SpringLayout.SOUTH, panel_title);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3_idInput, 94, SpringLayout.SOUTH, panel_title);
		
		JLabel lblNewLabel_1 = new JLabel("\uC560\uC644\uB3D9\uBB3C \uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		panel_title.add(lblNewLabel_1, "name_10011164137277");
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		springLayout.putConstraint(SpringLayout.WEST, panel_3_idInput, 68, SpringLayout.EAST, panel_1_ID);
		springLayout.putConstraint(SpringLayout.EAST, panel_3_idInput, 297, SpringLayout.EAST, panel_1_ID);
		
		JLabel lblNewLabel = new JLabel("ID");
		panel_1_ID.add(lblNewLabel, "name_10014059659063");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_4_pwInput = new JPanel();
		panel_4_pwInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_pwInput.setBounds(260, 250, 255, 30);
		panel.add(panel_4_pwInput);
		panel_4_pwInput.setLayout(new CardLayout(0, 0));
		springLayout.putConstraint(SpringLayout.NORTH, panel_4_pwInput, 22, SpringLayout.SOUTH, panel_3_idInput);
		springLayout.putConstraint(SpringLayout.WEST, panel_4_pwInput, 0, SpringLayout.WEST, panel_3_idInput);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_4_pwInput, 58, SpringLayout.SOUTH, panel_3_idInput);
		springLayout.putConstraint(SpringLayout.EAST, panel_4_pwInput, 0, SpringLayout.EAST, panel_3_idInput);
		
		pwInput = new JTextField();
		panel_4_pwInput.add(pwInput, "name_10021724021754");
		pwInput.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		pwInput.setColumns(10);
		
		idInput = new JTextField();
		panel_3_idInput.add(idInput, "name_10019652002706");
		idInput.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 12));
		idInput.setColumns(10);
		
		JLabel lblPw = new JLabel("PW");
		panel_2_PW.add(lblPw, "name_10016788088652");
		lblPw.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblPw.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton newMember = new JButton("\uD68C\uC6D0\uAC00\uC785");
		newMember.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		newMember.setBounds(430, 350, 110, 30);
		panel.add(newMember);
		
		JButton login = new JButton("\uB85C\uADF8\uC778");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				LoginDAO login1 = new LoginDAO(); //loginDAO °´Ã¼ »ý¼º
				LoginVO vo=login1.selectLogin(idInput.getText(), pwInput.getText());//loginDAO¿¡ °ü¸®ÀÚ ÀÎÁö¾Æ´ÑÁö ±¸ºÐÇÏ´Â ¸Þ¼Òµå selectLogin±¸Çö
				//LoginVO°´Ã¼¸¦ »ý¼ºÇØ¼­ m°ªÀ» ¹ÞÀ½
				if(vo.getM()==1){
					MenuGUI manager = new MenuGUI();
					manager.main(null);
					frame.dispose();
				}
				else{
					MenuGUI general = new MenuGUI();
					general.main(null);
					frame.dispose();
				}
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, panel, -278, SpringLayout.SOUTH, login);
		login.setBounds(140, 350, 110, 30);
		panel.add(login);
		springLayout.putConstraint(SpringLayout.NORTH, login, 50, SpringLayout.SOUTH, panel_2_PW);
		springLayout.putConstraint(SpringLayout.WEST, login, 82, SpringLayout.WEST, frame.getContentPane());
		login.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		springLayout.putConstraint(SpringLayout.WEST, newMember, 75, SpringLayout.EAST, login);
		springLayout.putConstraint(SpringLayout.SOUTH, newMember, 0, SpringLayout.SOUTH, login);
	}
}
