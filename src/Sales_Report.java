import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by voidbluelabtop on 17. 5. 29.
 */
public class Sales_Report extends JFrame {
    private JPanel contentPane;
    private JScrollPane scrollpane;
    private REPORT REPORT;
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
    public Sales_Report() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 554, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("00식당 판매 보고서");
        label.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        label.setBounds(18, 6, 202, 25);
        contentPane.add(label);

        JButton button_2 = new JButton("출력");
        button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button_2.setBounds(431, 18, 117, 29);
        contentPane.add(button_2);
        button_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });

        REPORT = new REPORT();
        DefaultTableModel model = new DefaultTableModel(REPORT.contents,REPORT.header){
            public boolean isCellEditable(int rowIndex, int MColIndex){
                return false;
            }
        };
        JTable mTable = new JTable(model);
        mTable.getTableHeader().setReorderingAllowed(false);
        mTable.getTableHeader().setResizingAllowed(false);
        mTable.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
        scrollpane = new JScrollPane(mTable);
        scrollpane.setLocation(18, 35);
        scrollpane.setSize(400, 250);
        contentPane.add(scrollpane);

    }

    public void run()
    {
        this.setVisible(true);
    }


}
