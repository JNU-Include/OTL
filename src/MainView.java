import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private LoginView login;
	private MenuAdd menuAdd;
	private OrderView orderView;

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
		mnNewMenu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("출근");
		menuItem.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login = new LoginView();
				login.run();
			}
		});
		mnNewMenu.add(menuItem);
		
		JMenuItem menuItem_2 = new JMenuItem("퇴근합니다");
		menuItem_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		mnNewMenu.add(menuItem_2);
		
		JMenuItem menuItem_6 = new JMenuItem("프로그램 종료");
		menuItem_6.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnNewMenu.add(menuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("차림표 관리");
		mnNewMenu_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem menuItem_1 = new JMenuItem("차림표 경신");
		menuItem_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuAdd = new MenuAdd();
				menuAdd.run();
				
			}
		});
		mnNewMenu_1.add(menuItem_1);
		
		JMenu menu = new JMenu("재고 관리");
		menu.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuBar.add(menu);
		
		JMenuItem menuItem_3 = new JMenuItem("재고 입력");
		menuItem_3.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menu.add(menuItem_3);
		menuItem_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				stock_manage sm = new stock_manage();
				sm.run();
			}
		});
		
		JMenu menu_1 = new JMenu("좌석 관리");
		menu_1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuBar.add(menu_1);
		
		JMenuItem menuItem_4 = new JMenuItem("좌석 추가/삭제");
		menuItem_4.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menu_1.add(menuItem_4);
		
		JMenuItem menuItem_5 = new JMenuItem("좌석 예약");
		menuItem_5.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menu_1.add(menuItem_5);
		menuItem_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				Table_Reserve TR = new Table_Reserve();
				TR.run();
			}
		});
		
		JMenu menu_2 = new JMenu("할인 관리");
		menu_2.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuBar.add(menu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("할인 경신");
		mntmNewMenuItem.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menu_2.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				discount_manage dm = new discount_manage();
				dm.run();
			}
		});

		JMenu menu_sales_manage = new JMenu("매출 관리");
		menu_sales_manage.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menuBar.add(menu_sales_manage);

		JMenuItem MI_expense_manage = new JMenuItem("지출 관리");
		MI_expense_manage.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menu_sales_manage.add(MI_expense_manage);
		MI_expense_manage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				Expense_manage EM = new Expense_manage();
				EM.run();
			}
		});

		JMenuItem MI_sales_report = new JMenuItem("판매 보고서");
		MI_sales_report.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		menu_sales_manage.add(MI_sales_report);
		MI_sales_report.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				Sales_Report SR = new Sales_Report();
				SR.run();
			}
		});


		JButton tableButton = new JButton();
		tableButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		tableButton.setText("좌석 1");
		tableButton.setBounds(32, 75, 146, 71);
		contentPane.add(tableButton);

		tableButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderView = new OrderView();
				orderView.run();
				
			}
		});

		JButton tableButton2 = new JButton();
		tableButton2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		tableButton2.setText("좌석 2");
		tableButton2.setBounds(32, 175, 146, 71);
		contentPane.add(tableButton2);

		tableButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderView = new OrderView();
				orderView.run();

			}
		});

		JButton tableButton3 = new JButton();
		tableButton3.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		tableButton3.setText("좌석 3");
		tableButton3.setBounds(32, 275, 146, 71);
		contentPane.add(tableButton3);

		tableButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderView = new OrderView();
				orderView.run();

			}
		});
		
	}
}
