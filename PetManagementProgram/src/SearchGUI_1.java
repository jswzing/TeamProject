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

public class SearchGUI_1 {

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
					SearchGUI_1 window = new SearchGUI_1();
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
	public SearchGUI_1() {
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

		JPanel panel = new JPanel();
		panel.setBounds(128, 10, 436, 57);
		frame.getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		JLabel label = new JLabel("\uC804\uCCB4\uC870\uD68C");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 28));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label, "name_11531351470090");

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(85, 77, 114, 32);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JLabel lblNewLabel = new JLabel("\uAC80 \uC0C9");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, "name_11600508772367");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(211, 77, 222, 32);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		txtxx = new JTextField();
		txtxx.setFont(new Font("굴림", Font.PLAIN, 18));
		txtxx.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(txtxx, "name_11642339154267");
		txtxx.setColumns(10);


		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 125, 611, 32);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uC870\uD68C\uBAA9\uB85D");
		lblNewLabel_1.setBounds(0, 0, 666, 32);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 167, 666, 379);
		frame.getContentPane().add(scrollPane);

		JButton btnNewButton = new JButton("\uC870\uD68C\uD558\uAE30");
		btnNewButton.setBounds(445, 77, 119, 32);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 조회하기 버튼 액션
				SearchDAO searchD = new SearchDAO(); // DB랑 연동하기위한 객체 생성
				searchName = txtxx.getText(); // 검색텍스트 필드값 변수에 저장

				ArrayList<SearchVO> al = searchD.searchPetName(txtxx.getText().toString());

				String[] col = { "등록번호", "이름", "성별", "종", "품종", "나이", "무게", "비고", "주인이름", "전화번호", "주소" };
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
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 694, 572);
		frame.getContentPane().add(panel_4);
	}
}
