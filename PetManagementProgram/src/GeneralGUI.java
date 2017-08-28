import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GeneralGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeneralGUI window = new GeneralGUI();
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
	public GeneralGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 129, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 80, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 519, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel jlbGeneralSearchTitle = new JLabel("\uC77C\uBC18\uC0AC\uC6A9\uC790 \uC870\uD68C");
		jlbGeneralSearchTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		jlbGeneralSearchTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(jlbGeneralSearchTitle, "name_325087955569269");
		jlbGeneralSearchTitle.setOpaque(true);
		jlbGeneralSearchTitle.setBackground(SystemColor.inactiveCaptionBorder);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 82, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 129, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -329, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, panel);
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton jbGenerSearch = new JButton("\uC870 \uD68C");
		jbGenerSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchGUI_1 searG = new SearchGUI_1();
				searG.main(null);  // °Ë»öÃ¢ È°¼ºÈ­
			}
		});
		sl_panel_1.putConstraint(SpringLayout.EAST, jbGenerSearch, -40, SpringLayout.EAST, panel_1);
		jbGenerSearch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		panel_1.add(jbGenerSearch);
		
		JPanel panel_2 = new JPanel();
		sl_panel_1.putConstraint(SpringLayout.NORTH, jbGenerSearch, 0, SpringLayout.NORTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, jbGenerSearch, 21, SpringLayout.EAST, panel_2);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, jbGenerSearch, 0, SpringLayout.SOUTH, panel_2);
		sl_panel_1.putConstraint(SpringLayout.NORTH, panel_2, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, panel_2, 67, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, panel_2, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, panel_2, -282, SpringLayout.EAST, panel_1);
		panel_1.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel label = new JLabel("1.");
		label.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label, "name_326916481994731");
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 41, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 129, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -218, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 519, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JButton jbGenerEnd = new JButton("\uC885 \uB8CC");
		sl_panel_3.putConstraint(SpringLayout.NORTH, jbGenerEnd, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, jbGenerEnd, 129, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, jbGenerEnd, -10, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, jbGenerEnd, -37, SpringLayout.EAST, panel_3);
		jbGenerEnd.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		panel_3.add(jbGenerEnd);
		
		JLabel label_1 = new JLabel("2.");
		sl_panel_3.putConstraint(SpringLayout.EAST, label_1, -20, SpringLayout.WEST, jbGenerEnd);
		sl_panel_3.putConstraint(SpringLayout.WEST, label_1, 70, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, label_1, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, label_1, -10, SpringLayout.SOUTH, panel_3);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		panel_3.add(label_1);
		
		
	}
}
