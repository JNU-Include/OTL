import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MainView extends JFrame {

	private JPanel contentPane;
	private LoginView login;
	private MenuAdd menuAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 616, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("식당관리 프로그램");
		mnNewMenu.setFont(new Font("Serif", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("출근");
		menuItem.setFont(new Font("Serif", Font.PLAIN, 14));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login = new LoginView();
				login.run();
			}
		});
		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_2 = new JMenuItem("퇴근합니다");
		menuItem_2.setFont(new Font("Serif", Font.PLAIN, 14));
		mnNewMenu.add(menuItem_2);
		
		JMenuItem menuItem_6 = new JMenuItem("프로그램 종료");
		menuItem_6.setFont(new Font("Serif", Font.PLAIN, 14));
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(menuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("차림표 관리");
		mnNewMenu_1.setFont(new Font("Serif", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("차림표 경신");
		menuItem_1.setFont(new Font("Serif", Font.PLAIN, 14));
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuAdd = new MenuAdd();
				menuAdd.run();
				
			}
		});
		mnNewMenu_1.add(menuItem_1);
		
		JMenu menu = new JMenu("재고 관리");
		menu.setFont(new Font("Serif", Font.PLAIN, 14));
		menuBar.add(menu);
		
		JMenuItem menuItem_3 = new JMenuItem("재고 입력");
		menuItem_3.setFont(new Font("Serif", Font.PLAIN, 14));
		menu.add(menuItem_3);
		
		JMenu menu_1 = new JMenu("좌석 관리");
		menu_1.setFont(new Font("Serif", Font.PLAIN, 14));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("좌석 추가/삭제");
		menuItem_4.setFont(new Font("Serif", Font.PLAIN, 14));
		menu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("좌석 예약");
		menuItem_5.setFont(new Font("Serif", Font.PLAIN, 14));
		menu_1.add(menuItem_5);
		
		JMenu menu_2 = new JMenu("할인 관리");
		menu_2.setFont(new Font("Serif", Font.PLAIN, 14));
		menuBar.add(menu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("할인 경신");
		mntmNewMenuItem.setFont(new Font("Serif", Font.PLAIN, 14));
		menu_2.add(mntmNewMenuItem);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Serif", Font.PLAIN, 13));
		editorPane.setText("좌석 1");
		editorPane.setBounds(32, 125, 146, 71);
		contentPane.add(editorPane);
		
	}
}
