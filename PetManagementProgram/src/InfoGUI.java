

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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class InfoGUI {

	private JFrame frame;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoGUI window = new InfoGUI();
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
	public InfoGUI() {
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
		
		ButtonGroup group = new ButtonGroup();
		
		JPanel backGround = new JPanel();
		backGround.setBounds(0, 0, 682, 562);
		frame.getContentPane().add(backGround);
		backGround.setLayout(null);
		
		JPanel panel_1_name = new JPanel();
		panel_1_name.setBounds(140, 139, 100, 30);
		backGround.add(panel_1_name);
		panel_1_name.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("\uC774\uB984");
		lblNewLabel_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1_name.add(lblNewLabel_7, "name_7411558898245");
		
		JPanel panel_Type = new JPanel();
		panel_Type.setBounds(140, 218, 100, 30);
		backGround.add(panel_Type);
		panel_Type.setLayout(new CardLayout(0, 0));
		
		JLabel label_1 = new JLabel("\uC885");
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_Type.add(label_1, "name_7381087228229");
		
		JPanel panel_3_detailedType = new JPanel();
		panel_3_detailedType.setBounds(400, 218, 50, 30);
		backGround.add(panel_3_detailedType);
		panel_3_detailedType.setLayout(new CardLayout(0, 0));
		
		JLabel label_2 = new JLabel("\uD488\uC885");
		label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3_detailedType.add(label_2, "name_7333055743211");
		
		JPanel panel_5_age = new JPanel();
		panel_5_age.setBounds(140, 264, 100, 30);
		backGround.add(panel_5_age);
		panel_5_age.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uB098\uC774");
		lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5_age.add(lblNewLabel_3, "name_7458198400508");
		
		JPanel panel_6_weight = new JPanel();
		panel_6_weight.setBounds(140, 315, 100, 30);
		backGround.add(panel_6_weight);
		panel_6_weight.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("\uCCB4\uC911");
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6_weight.add(label, "name_7478238134829");
		
		JPanel panel_7_comments = new JPanel();
		panel_7_comments.setBounds(140, 367, 100, 30);
		backGround.add(panel_7_comments);
		panel_7_comments.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uBE44\uACE0");
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7_comments.add(lblNewLabel_4, "name_7500653908715");
		
		JPanel panel_8_nameInput = new JPanel();
		panel_8_nameInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_8_nameInput.setBounds(260, 139, 120, 30);
		backGround.add(panel_8_nameInput);
		panel_8_nameInput.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		panel_8_nameInput.add(textArea_1, "name_7274280410622");
		
		JPanel panel_9_sex = new JPanel();
		panel_9_sex.setBounds(140, 179, 100, 30);
		backGround.add(panel_9_sex);
		panel_9_sex.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4");
		lblNewLabel_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9_sex.add(lblNewLabel_6, "name_7432614689786");
		
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uC554");
		rdbtnNewRadioButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		rdbtnNewRadioButton.setBounds(260, 175, 43, 30);
		backGround.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC218");
		rdbtnNewRadioButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		rdbtnNewRadioButton_1.setBounds(308, 175, 53, 30);
		backGround.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_1);
		
		JPanel panel_10_speciesInput = new JPanel();
		panel_10_speciesInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_10_speciesInput.setBounds(260, 218, 120, 30);
		backGround.add(panel_10_speciesInput);
		panel_10_speciesInput.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_2 = new JTextArea();
		panel_10_speciesInput.add(textArea_2, "name_7276584418678");
		
		JPanel panel_4_ageInput = new JPanel();
		panel_4_ageInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4_ageInput.setBounds(260, 264, 120, 30);
		backGround.add(panel_4_ageInput);
		panel_4_ageInput.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_3 = new JTextArea();
		panel_4_ageInput.add(textArea_3, "name_7279072332436");
		
		JPanel panel_12_kg = new JPanel();
		panel_12_kg.setBounds(400, 315, 100, 30);
		backGround.add(panel_12_kg);
		panel_12_kg.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Kg");
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
		panel_12_kg.add(lblNewLabel_2, "name_7517021792237");
		
		JPanel panel_11_weightInput = new JPanel();
		panel_11_weightInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_11_weightInput.setBounds(260, 315, 120, 30);
		backGround.add(panel_11_weightInput);
		panel_11_weightInput.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_4 = new JTextArea();
		panel_11_weightInput.add(textArea_4, "name_7280800308933");
		
		JPanel panel_13_commentsInput = new JPanel();
		panel_13_commentsInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_13_commentsInput.setBounds(260, 364, 308, 114);
		backGround.add(panel_13_commentsInput);
		panel_13_commentsInput.setLayout(new CardLayout(0, 0));
		
		textField_4 = new JTextField();
		panel_13_commentsInput.add(textField_4, "name_11457114844890");
		textField_4.setColumns(10);
		
		JPanel panel_14_detailedSpeInput = new JPanel();
		panel_14_detailedSpeInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14_detailedSpeInput.setBounds(470, 218, 112, 30);
		backGround.add(panel_14_detailedSpeInput);
		panel_14_detailedSpeInput.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_5_detailedSpeciesInput = new JTextArea();
		panel_14_detailedSpeInput.add(textArea_5_detailedSpeciesInput, "name_7292336218022");
		
		JButton button = new JButton("\uD655\uC778");
		button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		button.setBounds(460, 499, 110, 30);
		backGround.add(button);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		btnNewButton.setBounds(300, 499, 110, 30);
		backGround.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBCF4\uD638\uC790 \uC815\uBCF4");
		btnNewButton_1.setBounds(140, 499, 110, 30);
		backGround.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
		
		JPanel panel_Title = new JPanel();
		panel_Title.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_Title.setBounds(140, 49, 390, 70);
		backGround.add(panel_Title);
		panel_Title.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC560\uC644\uB3D9\uBB3C \uC815\uBCF4");
		panel_Title.add(lblNewLabel, "name_6324243965374");
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardianGUI guardG = new GuardianGUI(); // º¸È£ÀÚ Á¤º¸ °´Ã¼ »ý¼º
						guardG.main(null);  // º¸È£ÀÚÁ¤º¸ Å¬¸¯½Ã º¸È£ÀÚÁ¤º¸Ã¢ È°¼ºÈ­
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			}
		});
	}
}
