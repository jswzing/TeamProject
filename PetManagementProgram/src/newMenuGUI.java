import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newMenuGUI {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newMenuGUI window = new newMenuGUI();
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
	public newMenuGUI() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(140, 40, 390, 70);
		panel.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JLabel label_5 = new JLabel("\uD504\uB85C\uADF8\uB7A8\uAD00\uB9AC\uBA54\uB274");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		panel_1.add(label_5, "name_18724085798838");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(147, 128, 390, 80);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JButton addButton = new JButton("\uCD94 \uAC00");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InfoGUI infoG = new InfoGUI();
				infoG.main(null);
			}
		});
		addButton.setBounds(100, 10, 220, 60);
		panel_2.add(addButton);
		addButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBounds(147, 218, 390, 89);
		panel.add(panel_3);

		JButton modifyButton = new JButton("\uC218\uC815 \uBC0F \uC0AD\uC81C");
		modifyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteGUI delete = new DeleteGUI();
				delete.main(null);
			}
		});
		modifyButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		modifyButton.setBounds(100, 10, 220, 60);
		panel_3.add(modifyButton);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBounds(147, 317, 390, 89);
		panel.add(panel_4);

		JButton searchButton = new JButton("\uC804 \uCCB4 \uC870 \uD68C");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchGUI_1 search = new SearchGUI_1();
				search.main(null);
			}
		});
		searchButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		searchButton.setBounds(100, 10, 220, 60);
		panel_4.add(searchButton);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(147, 416, 390, 89);
		panel.add(panel_5);

		JButton logoutButton = new JButton("\uB85C \uADF8 \uC544 \uC6C3");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				LoginGUI login = new LoginGUI();
				login.main(null);
			}
		});
		logoutButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 24));
		logoutButton.setBounds(100, 10, 220, 60);
		panel_5.add(logoutButton);
	}
}
