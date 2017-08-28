
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class ModifyGUI {

	private JFrame frame;
	private JTextField etcInput;
	private static int num = 0;
	ArrayList<SearchVO> al = new ArrayList<SearchVO>();
	SearchDAO sdao = new SearchDAO();
	static ArrayList<SearchVO> modial=null;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public static void main(int regiNum) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ModifyGUI window = new ModifyGUI(regiNum);
					if (num == 0) {
						ModifyStateGUI modyg = new ModifyStateGUI(num);
						modyg.main(num);
					} else {
						window.frame.setVisible(true);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public ModifyGUI(int regiNum) {
		num = initialize(regiNum);
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	private int initialize(int regiNum) {
		al = sdao.searchRegiNum(regiNum);
		if (al.size() == 0) {
			return 0;
		} else {
			frame = new JFrame();
			frame.setResizable(false);
			frame.setBounds(100, 100, 704, 643);
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame.getContentPane().setLayout(null);

			ButtonGroup group = new ButtonGroup();

			JPanel backGround = new JPanel();
			backGround.setBounds(0, 0, 700, 600);
			frame.getContentPane().add(backGround);
			backGround.setLayout(null);

			JPanel panel_1_name = new JPanel();
			panel_1_name.setBounds(100, 62, 100, 30);
			backGround.add(panel_1_name);
			panel_1_name.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_7 = new JLabel("\uC774\uB984");
			lblNewLabel_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1_name.add(lblNewLabel_7, "name_7411558898245");

			JPanel panel_Type = new JPanel();
			panel_Type.setBounds(100, 141, 100, 30);
			backGround.add(panel_Type);
			panel_Type.setLayout(new CardLayout(0, 0));

			JLabel label_1 = new JLabel("\uC885");
			label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			panel_Type.add(label_1, "name_7381087228229");

			JPanel panel_3_detailedType = new JPanel();
			panel_3_detailedType.setBounds(360, 141, 50, 30);
			backGround.add(panel_3_detailedType);
			panel_3_detailedType.setLayout(new CardLayout(0, 0));

			JLabel label_2 = new JLabel("\uD488\uC885");
			label_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			label_2.setHorizontalAlignment(SwingConstants.CENTER);
			panel_3_detailedType.add(label_2, "name_7333055743211");

			JPanel panel_5_age = new JPanel();
			panel_5_age.setBounds(100, 187, 100, 30);
			backGround.add(panel_5_age);
			panel_5_age.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_3 = new JLabel("\uB098\uC774");
			lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			panel_5_age.add(lblNewLabel_3, "name_7458198400508");

			JPanel panel_6_weight = new JPanel();
			panel_6_weight.setBounds(100, 238, 100, 30);
			backGround.add(panel_6_weight);
			panel_6_weight.setLayout(new CardLayout(0, 0));

			JLabel label = new JLabel("\uCCB4\uC911");
			label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			label.setHorizontalAlignment(SwingConstants.CENTER);
			panel_6_weight.add(label, "name_7478238134829");

			JPanel panel_7_comments = new JPanel();
			panel_7_comments.setBounds(100, 290, 100, 30);
			backGround.add(panel_7_comments);
			panel_7_comments.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_4 = new JLabel("\uBE44\uACE0");
			lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			panel_7_comments.add(lblNewLabel_4, "name_7500653908715");

			JPanel panel_8_nameInput = new JPanel();
			panel_8_nameInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_8_nameInput.setBounds(220, 62, 120, 30);
			backGround.add(panel_8_nameInput);
			panel_8_nameInput.setLayout(new CardLayout(0, 0));

			JTextArea petNameInput = new JTextArea();
			panel_8_nameInput.add(petNameInput, "name_7274280410622");

			JPanel panel_9_sex = new JPanel();
			panel_9_sex.setBounds(100, 102, 100, 30);
			backGround.add(panel_9_sex);
			panel_9_sex.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4");
			lblNewLabel_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
			panel_9_sex.add(lblNewLabel_6, "name_7432614689786");

			JRadioButton wRadioButton = new JRadioButton("\uC554");
			wRadioButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
			wRadioButton.setBounds(220, 98, 50, 30);
			backGround.add(wRadioButton);
			group.add(wRadioButton);

			JRadioButton mRadioButton = new JRadioButton("\uC218");
			mRadioButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
			mRadioButton.setBounds(268, 98, 53, 30);
			backGround.add(mRadioButton);
			group.add(mRadioButton);

			JPanel speciesText = new JPanel();
			speciesText.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			speciesText.setBounds(220, 141, 120, 30);
			backGround.add(speciesText);
			speciesText.setLayout(new CardLayout(0, 0));

			JTextArea speciesInput = new JTextArea();
			speciesText.add(speciesInput, "name_7276584418678");

			JPanel panel_4_ageInput = new JPanel();
			panel_4_ageInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_4_ageInput.setBounds(220, 187, 120, 30);
			backGround.add(panel_4_ageInput);
			panel_4_ageInput.setLayout(new CardLayout(0, 0));

			JTextArea ageInput = new JTextArea();
			panel_4_ageInput.add(ageInput, "name_7279072332436");

			JPanel panel_12_kg = new JPanel();
			panel_12_kg.setBounds(360, 238, 100, 30);
			backGround.add(panel_12_kg);
			panel_12_kg.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_2 = new JLabel("Kg");
			lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			panel_12_kg.add(lblNewLabel_2, "name_7517021792237");

			JPanel panel_11_weightInput = new JPanel();
			panel_11_weightInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_11_weightInput.setBounds(220, 238, 120, 30);
			backGround.add(panel_11_weightInput);
			panel_11_weightInput.setLayout(new CardLayout(0, 0));

			JTextArea kgInput = new JTextArea();
			panel_11_weightInput.add(kgInput, "name_7280800308933");

			JPanel panel_13_commentsInput = new JPanel();
			panel_13_commentsInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_13_commentsInput.setBounds(220, 287, 346, 114);
			backGround.add(panel_13_commentsInput);
			panel_13_commentsInput.setLayout(new CardLayout(0, 0));

			etcInput = new JTextField();
			panel_13_commentsInput.add(etcInput, "name_11457114844890");
			etcInput.setColumns(10);

			JPanel panel_14_detailedSpeInput = new JPanel();
			panel_14_detailedSpeInput.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_14_detailedSpeInput.setBounds(430, 141, 136, 30);
			backGround.add(panel_14_detailedSpeInput);
			panel_14_detailedSpeInput.setLayout(new CardLayout(0, 0));

			JTextArea detailedSpeciesInput = new JTextArea();
			panel_14_detailedSpeInput.add(detailedSpeciesInput, "name_7292336218022");

			JButton button = new JButton("\uC218\uC815");

			button.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
			button.setBounds(456, 549, 110, 30);
			backGround.add(button);

			JButton btnNewButton = new JButton("\uCDE8\uC18C");
			btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 13));
			btnNewButton.setBounds(578, 549, 110, 30);
			backGround.add(btnNewButton);

			JPanel panel_Title = new JPanel();
			panel_Title.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_Title.setBounds(140, 10, 390, 42);
			backGround.add(panel_Title);
			panel_Title.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel = new JLabel("\uC560\uC644\uB3D9\uBB3C \uC815\uBCF4");
			panel_Title.add(lblNewLabel, "name_6324243965374");
			lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

			JPanel idpanel = new JPanel();
			idpanel.setBounds(360, 62, 73, 30);
			backGround.add(idpanel);
			idpanel.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_1 = new JLabel("\uB4F1\uB85D\uBC88\uD638");
			lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			idpanel.add(lblNewLabel_1, "name_509624414968705");

			JPanel panel_1 = new JPanel();
			panel_1.setBounds(100, 415, 100, 30);
			backGround.add(panel_1);
			panel_1.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_5 = new JLabel("\uBCF4\uD638\uC790 \uC774\uB984");
			lblNewLabel_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			panel_1.add(lblNewLabel_5, "name_341306126706808");

			JPanel panel_2 = new JPanel();
			panel_2.setBounds(100, 455, 100, 30);
			backGround.add(panel_2);
			panel_2.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_8 = new JLabel("\uC5F0\uB77D\uCC98");
			lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			panel_2.add(lblNewLabel_8, "name_341313030601789");

			JPanel panel_3 = new JPanel();
			panel_3.setBounds(100, 495, 100, 30);
			backGround.add(panel_3);
			panel_3.setLayout(new CardLayout(0, 0));

			JLabel lblNewLabel_9 = new JLabel("\uC8FC\uC18C");
			lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 17));
			panel_3.add(lblNewLabel_9, "name_341318006622795");

			JPanel panel_4 = new JPanel();
			panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_4.setBounds(220, 411, 120, 34);
			backGround.add(panel_4);
			panel_4.setLayout(new CardLayout(0, 0));

			JTextArea taGuardianName = new JTextArea();
			panel_4.add(taGuardianName, "name_341227407124437");

			JPanel panel_5 = new JPanel();
			panel_5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_5.setBounds(220, 451, 190, 34);
			backGround.add(panel_5);
			panel_5.setLayout(new CardLayout(0, 0));

			JTextArea taGuardianPhone = new JTextArea();
			panel_5.add(taGuardianPhone, "name_341287062794055");

			JPanel panel_6 = new JPanel();
			panel_6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_6.setBounds(220, 491, 346, 34);
			backGround.add(panel_6);
			panel_6.setLayout(new CardLayout(0, 0));

			JTextArea taGaurdianAdr = new JTextArea();
			panel_6.add(taGaurdianAdr, "name_341292014801966");

			JPanel panel = new JPanel();
			panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel.setBounds(446, 62, 120, 30);
			backGround.add(panel);
			panel.setLayout(new CardLayout(0, 0));

			JLabel regiNumlabel = new JLabel("");
			regiNumlabel.setHorizontalAlignment(SwingConstants.CENTER);
			panel.add(regiNumlabel, "name_609036147697438");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
				}
			});
			//////////////////// µî·Ï¹øÈ£·Î Á¤º¸ °¡Á®¿À±â////////////////////////

			petNameInput.setText(al.get(0).getName());
			regiNumlabel.setText(al.get(0).getNum() + "");
			if (al.get(0).getGender() == 1) {
				mRadioButton.setSelected(true);
			} else if (al.get(0).getGender() == 2) {
				wRadioButton.setSelected(true);
				;
			}
			speciesInput.setText(al.get(0).getSpec());
			detailedSpeciesInput.setText(al.get(0).getDspec());
			ageInput.setText(al.get(0).getAge() + "");
			kgInput.setText(al.get(0).getWeight() + "");
			etcInput.setText(al.get(0).getA());
			taGuardianName.setText(al.get(0).getB());
			taGuardianPhone.setText(al.get(0).getC());
			taGaurdianAdr.setText(al.get(0).getD());

			//////////////////// ¼öÁ¤¹öÆ° Å¬¸¯½Ã Á¤º¸ÀÔ·Â///////////////////////
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int gender = 0;
					ModifyDAO info = new ModifyDAO();
					if (wRadioButton.isSelected()) {
						gender = 2;
					} else if (mRadioButton.isSelected()) {
						gender = 1;
					}
					ModifyStateGUI modyg = new ModifyStateGUI(1);
					modyg.main(1);
					info.updatePetInfo(regiNum, petNameInput.getText().toString(), gender,
							speciesInput.getText().toString(), detailedSpeciesInput.getText().toString(),
							Integer.parseInt(ageInput.getText()), Integer.parseInt(kgInput.getText()),
							etcInput.getText().toString(), taGuardianName.getText().toString(),
							taGuardianPhone.getText().toString(), taGaurdianAdr.getText().toString());
					frame.dispose();
				}
			});
		}
		return 1;
	}
}