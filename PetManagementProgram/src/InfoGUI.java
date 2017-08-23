

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
import javax.swing.JScrollPane;

public class InfoGUI {

	private JFrame frame;

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
		frame.setBounds(100, 100, 490, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(34, 21, 412, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC560\uC644\uB3D9\uBB3C \uC815\uBCF4");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, "name_10126113988224");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(34, 94, 98, 30);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("\uC774\uB984");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_7, "name_7411558898245");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(34, 166, 98, 30);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel label_1 = new JLabel("\uC885");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_1, "name_7381087228229");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(269, 166, 53, 30);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel label_2 = new JLabel("\uD488\uC885");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_2, "name_7333055743211");
		
		JLabel lblNewLabel_1 = new JLabel("");
		panel_3.add(lblNewLabel_1, "name_7330088385503");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(34, 202, 98, 30);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("\uB098\uC774");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_3, "name_7458198400508");
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(34, 238, 98, 30);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("\uCCB4\uC911");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(label, "name_7478238134829");
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(34, 274, 98, 30);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("\uBE44\uACE0");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_7.add(lblNewLabel_4, "name_7500653908715");
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(138, 94, 120, 30);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_1 = new JTextArea();
		panel_8.add(textArea_1, "name_7274280410622");
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(34, 130, 98, 30);
		frame.getContentPane().add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_6 = new JLabel("\uC131\uBCC4");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_6, "name_7432614689786");
		
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
		panel_10.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_2 = new JTextArea();
		panel_10.add(textArea_2, "name_7276584418678");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(138, 202, 120, 30);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_3 = new JTextArea();
		panel_4.add(textArea_3, "name_7279072332436");
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(260, 238, 37, 30);
		frame.getContentPane().add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Kg");
		panel_12.add(lblNewLabel_2, "name_7517021792237");
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(138, 238, 120, 30);
		frame.getContentPane().add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_4 = new JTextArea();
		panel_11.add(textArea_4, "name_7280800308933");
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(138, 274, 308, 114);
		frame.getContentPane().add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_13.add(scrollPane, "name_10465814044054");
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(334, 166, 112, 30);
		frame.getContentPane().add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));
		
		JTextArea textArea_5 = new JTextArea();
		panel_14.add(textArea_5, "name_7292336218022");
		
		JButton button = new JButton("\uD655\uC778");
		button.setBounds(205, 398, 97, 23);
		frame.getContentPane().add(button);
		
		JButton btnNewButton = new JButton("\uCDE8\uC18C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				
			}
		});
		btnNewButton.setBounds(326, 398, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBCF4\uD638\uC790 \uC815\uBCF4");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuardianGUI guardG = new GuardianGUI(); // 보호자 정보 객체 생성
						guardG.main(null);  // 보호자정보 클릭시 보호자정보창 활성화
			}
		});
		btnNewButton_1.setBounds(33, 398, 120, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
