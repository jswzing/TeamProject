import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.border.BevelBorder;

public class deleteGUI {

	private JFrame frame;
	private JTextField txtxx;
	private String searchName = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deleteGUI window = new deleteGUI();
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
	public deleteGUI() {
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
		panel.setBounds(140, 20, 390, 70);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 128, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 67, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 564, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel label = new JLabel("\uC218\uC815 \uBC0F \uC0AD\uC81C");
		label.setFont(new Font("���� ����", Font.BOLD, 28));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, "name_16114635649704");

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 98, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, 199, SpringLayout.WEST, frame.getContentPane());
		panel_1.setBounds(100, 20, 100, 30);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("\uAC80 \uC0C9");
		lblNewLabel.setFont(new Font("���� ����", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, "name_16116774043705");

		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 98, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 18, SpringLayout.EAST, panel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 0, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, -255, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		txtxx = new JTextField();
		txtxx.setFont(new Font("����", Font.PLAIN, 18));
		txtxx.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(txtxx, "name_16118567211599");
		txtxx.setColumns(10);


		JPanel panel_3 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_3, 153, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_3, 85, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_3, -387, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_3, -61, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, panel_3);
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -23, SpringLayout.NORTH, panel_3);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel_1 = new JLabel("\uC870 \uD68C \uBAA9 \uB85D");
		lblNewLabel_1.setFont(new Font("���� ����", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, "name_16122037017529");

		JScrollPane scrollPane = new JScrollPane();
		springLayout.putConstraint(SpringLayout.NORTH, scrollPane, 6, SpringLayout.SOUTH, panel_3);
		springLayout.putConstraint(SpringLayout.WEST, scrollPane, 61, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, scrollPane, -35, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, scrollPane, 546, SpringLayout.NORTH, frame.getContentPane());
		frame.getContentPane().add(scrollPane);

		JButton btnNewButton = new JButton("\uC218 \uC815");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 98, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 16, SpringLayout.EAST, panel_2);
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 130, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -154, SpringLayout.EAST, frame.getContentPane());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // ��ȸ�ϱ� ��ư �׼�
				SearchDAO searchD = new SearchDAO(); // DB�� �����ϱ����� ��ü ����
				searchName = txtxx.getText(); // �˻��ؽ�Ʈ �ʵ尪 ������ ����

				ArrayList<SearchVO> al = searchD.searchPetName(txtxx.getText().toString());

				String[] col = { "��Ϲ�ȣ", "�̸�", "����", "��", "ǰ��", "����", "����", "���", "�����̸�", "��ȭ��ȣ", "�ּ�" };
				String[][] row = new String[al.size()][col.length];
				int index = 0;
				for (SearchVO sv : al) {
					row[index][0] = sv.getNum() + "";
					row[index][1] = sv.getName() + "";
					row[index][2] = sv.getGender() + "";
					row[index][3] = sv.getSpec() + "";
					row[index][4] = sv.getDspec() + "";
					row[index][5] = sv.getAge() + "";
					row[index][6] = sv.getWeight() + "";
					row[index][7] = sv.getA() + "";
					row[index][8] = sv.getB() + "";
					row[index][9] = sv.getC() + "";
					row[index][10] = sv.getD() + "";
					index++;

				}

				DefaultTableModel model = new DefaultTableModel(row, col);
				JTable textArea = new JTable(model);
				scrollPane.setViewportView(textArea);

			}

		});
		btnNewButton.setFont(new Font("���� ����", Font.PLAIN, 18));
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uC0AD \uC81C");
		springLayout.putConstraint(SpringLayout.NORTH, button, 30, SpringLayout.SOUTH, panel);
		springLayout.putConstraint(SpringLayout.WEST, button, 6, SpringLayout.EAST, btnNewButton);
		springLayout.putConstraint(SpringLayout.SOUTH, button, 0, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, button, -63, SpringLayout.EAST, frame.getContentPane());
		button.setFont(new Font("���� ����", Font.PLAIN, 18));
		frame.getContentPane().add(button);
	}
}
