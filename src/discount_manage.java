import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by voidbluelabtop on 17. 5. 29.
 */
public class discount_manage extends JFrame{
    private JPanel contentPane;
    private JScrollPane scrollpane;
    private DiscountData DiscountData;
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
    public discount_manage() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 554, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("00식당 할인 관리");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(18, 6, 202, 25);
        contentPane.add(label);

        JButton button_2 = new JButton("입력 완료");
        button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button_2.setBounds(431, 18, 117, 29);
        contentPane.add(button_2);
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });



        DiscountData = new DiscountData();
        DefaultTableModel model = new DefaultTableModel(DiscountData.contents,DiscountData.header);
        JTable mTable = new JTable(model);
        mTable.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        scrollpane = new JScrollPane(mTable);
        scrollpane.setLocation(18, 35);
        scrollpane.setSize(300, 300);
        contentPane.add(scrollpane);


    }

    public void run()
    {
        discount_manage frame = new discount_manage();
        frame.setVisible(true);
    }


}
