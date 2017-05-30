import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

public class OrderView extends JFrame {
	private JPanel contentPane;
	private TableData tableMake;
	private JScrollPane scrollpane;
	private JLabel jlabel2;
	private ArrayList orderlist;
	DefaultTableModel order_model;
	int order_num;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderView frame = new OrderView();
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
	public OrderView() {
		orderlist = new ArrayList();
		order_num = 1;

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 540, 426);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);


		JLabel label = new JLabel("주문 입력");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label.setBounds(17, 21, 61, 16);
		contentPane.add(label);
		tableMake = new TableData();
		DefaultTableModel model = new DefaultTableModel(tableMake.contents,tableMake.header);
		JTable mTable = new JTable(model);
		mTable.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		scrollpane = new JScrollPane(mTable);
		scrollpane.setSize(300, 150);
		scrollpane.setLocation(17, 49);
		contentPane.add(scrollpane);
		
		JLabel lblNewLabel = new JLabel("수량 선택");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel.setBounds(17, 217, 61, 16);
		contentPane.add(lblNewLabel);

		Button add_order = new Button("추가");
		add_order.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		add_order.setBounds(130, 210,40,30);
		add(add_order);
		add_order.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				int row = mTable.getSelectedRow();
				tableMake.order[0] = tableMake.contents[row][0];
				tableMake.order[1] = Integer.toString(order_num);
				tableMake.order[2] =  Integer.toString(Integer.parseInt(tableMake.contents[row][1]) *order_num);

				tableMake.ordered_contents.add(tableMake.order.clone());
				tableMake.list_init();
				renew();
			}
		});

		Button delete_order = new Button("삭제");
		delete_order.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		delete_order.setBounds(180, 210,40,30);
		add(delete_order);

		SpinnerNumberModel numberModel = new SpinnerNumberModel(1,0,500,1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		spinner.addChangeListener(new ChangeListener() {
	         public void stateChanged(ChangeEvent e) {
	        	 jlabel2.setText("금액 : " + ((JSpinner)e.getSource()).getValue());
	        	 order_num = (int)((JSpinner)e.getSource()).getValue();

			 }
	      });
		spinner.setBounds(72, 212, 52, 26);
		contentPane.add(spinner);
		
		
		JButton button = new JButton("확인");
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button.setBounds(399, 16, 117, 29);
		contentPane.add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent actionEvent) {
				dispose();
			}
		});
		
		JButton button_1 = new JButton("취소");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_1.setBounds(399, 57, 117, 29);

		contentPane.add(button_1);
		contentPane.add(label);
		DefaultTableModel order_model = new DefaultTableModel(tableMake.orderlist, tableMake.order_header);
		JTable order_table = new JTable(order_model);
		order_table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		scrollpane = new JScrollPane(order_table);
		scrollpane.setSize(300, 150);
		scrollpane.setLocation(17, 260);
		contentPane.add(scrollpane);


		jlabel2 = new JLabel();
		jlabel2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		jlabel2.setText("금액");
		jlabel2.setBounds(17, 260, 52, 16);
		contentPane.add(jlabel2);
		for (int i = 0 ; i < tableMake.contents.length ; i++){
			Label ordered_food = new Label(tableMake.contents[i][0] + " : " + tableMake.contents[i][1]);
			ordered_food.setBounds(17, 340 + 20 * i , 200 , 16);
			add(ordered_food);
		}


	}
	private void renew(){
		DefaultTableModel order_model = new DefaultTableModel(tableMake.orderlist, tableMake.order_header);
		JTable order_table = new JTable(order_model);
		order_table.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		scrollpane = new JScrollPane(order_table);
		scrollpane.setSize(300, 150);
		scrollpane.setLocation(17, 260);
		contentPane.add(scrollpane);

	}
	
	public void run()
	{
		OrderView frame = new OrderView();
		frame.setVisible(true);
	}
}
