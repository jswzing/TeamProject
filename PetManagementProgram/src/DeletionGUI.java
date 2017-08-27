import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletionGUI {

	private JFrame frame;
	private JTextField tfInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletionGUI window = new DeletionGUI();
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
	public DeletionGUI() {
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
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 20, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 238, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 83, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, -239, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JLabel lbTitle = new JLabel("\uC815\uBCF4 \uC0AD\uC81C\uCC3D");
		lbTitle.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setBackground(Color.WHITE);
		panel.add(lbTitle, "name_19716356160384");
		
		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 32, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 161, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 64, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 533, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel lbPrint1 = new JLabel("\u25BC \uC0AD\uC81C\uD560 \uC815\uBCF4\uC758 \uB4F1\uB85D\uBC88\uD638 \uC785\uB825 \u25BC");
		lbPrint1.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		lbPrint1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lbPrint1, "name_19723782860762");
		
		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 161, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 76, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 533, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		tfInput = new JTextField();
		tfInput.setHorizontalAlignment(SwingConstants.CENTER);
		tfInput.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		panel_2.add(tfInput, "name_19730081949250");
		tfInput.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 110, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -43, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, 51, SpringLayout.EAST, panel_1);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 6, SpringLayout.SOUTH, btnDelete);
		springLayout.putConstraint(SpringLayout.NORTH, btnDelete, 218, SpringLayout.SOUTH, panel_2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnDelete, -81, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnDelete, 298, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnDelete, -299, SpringLayout.EAST, frame.getContentPane());
		
		JLabel lbResult = new JLabel("");
		lbResult.setForeground(Color.RED);
		lbResult.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		lbResult.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lbResult, "name_20619223397983");
		btnDelete.setFont(new Font("맑은 고딕", Font.PLAIN, 17));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int serialNumber = Integer.parseInt(tfInput.getText());
				DeletionDAO deleD = new DeletionDAO();//deletionDAO 객체 생성
				int result = deleD.deleteInfo(serialNumber);
				if(result == 0) {
				lbResult.setText("삭제성공");
				} else if(result == 1) {
					lbResult.setText("일련번호를 잘못 입력했거나 삭제할 정보가 없습니다.");
				} else {
					lbResult.setText("시스템 오류입니다.");
				}
			}
		});
		frame.getContentPane().add(btnDelete);
	}
}
