import java.awt.*;
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
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 540, 426);
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		jlabel2 = new JLabel();
		jlabel2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		jlabel2.setText("금액");
		jlabel2.setBounds(17, 300, 52, 16);
		contentPane.add(jlabel2);
		JLabel label = new JLabel("주문 입력");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label.setBounds(17, 21, 61, 16);
		contentPane.add(label);
		tableMake = new TableData();
		DefaultTableModel model = new DefaultTableModel(tableMake.contents,tableMake.header);
		JTable mTable = new JTable(model);
		mTable.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		scrollpane = new JScrollPane(mTable);
		scrollpane.setSize(300, 191);
		scrollpane.setLocation(17, 49);
		contentPane.add(scrollpane);
		
		JLabel lblNewLabel = new JLabel("수량 선택");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblNewLabel.setBounds(17, 257, 61, 16);
		contentPane.add(lblNewLabel);
		
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1,0,500,1);
		JSpinner spinner = new JSpinner(numberModel);
		spinner.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		spinner.addChangeListener(new ChangeListener() {
	         public void stateChanged(ChangeEvent e) {
	        	 jlabel2.setText("금액 : " 
	            + ((JSpinner)e.getSource()).getValue());
	         }
	      });
		spinner.setBounds(72, 252, 52, 26);
		contentPane.add(spinner);
		
		
		JButton button = new JButton("확인");
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button.setBounds(399, 16, 117, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("취소");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		button_1.setBounds(399, 57, 117, 29);
		contentPane.add(button_1);
	}
	
	public void run()
	{
		OrderView frame = new OrderView();
		frame.setVisible(true);
	}
}
