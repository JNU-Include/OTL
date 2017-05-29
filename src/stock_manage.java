import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by voidbluelabtop on 17. 5. 29.
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.EmptyBorder;



public class stock_manage extends JFrame{

    private JPanel contentPane;
    private JScrollPane scrollpane;
    private StockData StockData;
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
    public stock_manage() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 554, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("00식당 재고 관리");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(18, 6, 202, 25);
        contentPane.add(label);

        JButton button_2 = new JButton("입력 완");
        button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button_2.setBounds(431, 18, 117, 29);
        contentPane.add(button_2);

        JButton button = new JButton("추가");
        button.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button.setBounds(431, 65, 117, 29);
        contentPane.add(button);

        JButton button_1 = new JButton("삭제");
        button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button_1.setIcon(null);
        button_1.setSelectedIcon(null);
        button_1.setBackground(Color.red);
        button_1.setBounds(431, 109, 117, 29);
        contentPane.add(button_1);


        StockData = new StockData();
        DefaultTableModel model = new DefaultTableModel(StockData.contents,StockData.header);
        JTable mTable = new JTable(model);
        mTable.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        scrollpane = new JScrollPane(mTable);
        scrollpane.setLocation(18, 35);
        scrollpane.setSize(300, 300);
        contentPane.add(scrollpane);


    }

    public void run()
    {
        stock_manage frame = new stock_manage();
        frame.setVisible(true);
    }


}
