import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class MenuAdd extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollpane;
	private TableData tableMake;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MenuAdd frame = new MenuAdd();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MenuAdd() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 554, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("00식당 차림표 관리");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		label.setBounds(18, 6, 202, 25);
		contentPane.add(label);
		
		JButton button_2 = new JButton("확인");
		button_2.setBounds(431, 18, 117, 29);
		contentPane.add(button_2);
		
		JButton button = new JButton("추가");
		button.setBounds(431, 65, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("삭제");
		button_1.setIcon(null);
		button_1.setSelectedIcon(null);
		button_1.setBackground(Color.red);
		button_1.setBounds(431, 109, 117, 29);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("취소");
		button_3.setBounds(431, 150, 117, 29);
		contentPane.add(button_3);
		
		tableMake = new TableData();
		DefaultTableModel model = new DefaultTableModel(tableMake.contents,tableMake.header);
		JTable mTable = new JTable(model);
		scrollpane = new JScrollPane(mTable);
		scrollpane.setLocation(18, 35);
		scrollpane.setSize(300, 300);
		contentPane.add(scrollpane);
		
			
	}
	
	public void run()
	{
		MenuAdd frame = new MenuAdd();
		frame.setVisible(true);
	}
	public JPanel getContentPane() {
		return contentPane;
	}
}
