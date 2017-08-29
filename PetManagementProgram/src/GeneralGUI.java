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
import javax.swing.border.BevelBorder;
import java.awt.Color;

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
		springLayout.putConstraint(SpringLayout.NORTH, panel, 45, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 147, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 115, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -147, SpringLayout.EAST, frame.getContentPane());
		panel.setBounds(140, 20, 390, 70);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel jlbGeneralSearchTitle = new JLabel("\uD504\uB85C\uADF8\uB7A8\uAD00\uB9AC\uBA54\uB274");
		jlbGeneralSearchTitle.setBackground(new Color(240, 240, 240));
		jlbGeneralSearchTitle.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 28));
		jlbGeneralSearchTitle.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(jlbGeneralSearchTitle, "name_325087955569269");
		jlbGeneralSearchTitle.setOpaque(true);
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 45, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 129, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -165, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton jbGenerSearch = new JButton("\uC870 \uD68C");
		sl_panel_1.putConstraint(SpringLayout.NORTH, jbGenerSearch, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, jbGenerSearch, 98, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, jbGenerSearch, -10, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, jbGenerSearch, -71, SpringLayout.EAST, panel_1);
		jbGenerSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchGUI_1 searG = new SearchGUI_1();
				searG.main(null);  // °Ë»öÃ¢ È°¼ºÈ­
			}
		});
		jbGenerSearch.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		panel_1.add(jbGenerSearch);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -43, SpringLayout.NORTH, panel_3);
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 274, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -218, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 129, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 519, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_3);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JButton jbGenerEnd = new JButton("\uB85C\uADF8\uC544\uC6C3");
		jbGenerEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				LoginGUI logG = new LoginGUI();
				logG.main(null); //general¸ðµå ·Î±×¾Æ¿ô
				
			}
		});
		sl_panel_3.putConstraint(SpringLayout.NORTH, jbGenerEnd, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, jbGenerEnd, 95, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, jbGenerEnd, -10, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, jbGenerEnd, -71, SpringLayout.EAST, panel_3);
		jbGenerEnd.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 24));
		panel_3.add(jbGenerEnd);
		
		
	}
}
