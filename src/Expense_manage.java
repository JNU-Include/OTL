import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by voidbluelabtop on 17. 5. 29.
 */
public class Expense_manage extends JFrame{
    private JPanel contentPane;
    private JScrollPane scrollpane;
    private ExpenseDATA ExpenseDATA;
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
    public Expense_manage() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 554, 384);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("00식당 지출 관리");
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

        JButton button = new JButton("추가");
        button.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button.setBounds(431, 315, 117, 29);
        contentPane.add(button);

        JButton button_1 = new JButton("삭제");
        button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        button_1.setIcon(null);
        button_1.setSelectedIcon(null);
        button_1.setBackground(Color.red);
        button_1.setBounds(431, 65, 117, 29);
        contentPane.add(button_1);


        ExpenseDATA = new ExpenseDATA();
        DefaultTableModel model = new DefaultTableModel(ExpenseDATA.contents,ExpenseDATA.header){
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

        Label lb_Expense = new Label("지출 금액");
        lb_Expense.setAlignment(1);  // 가운데정렬
        lb_Expense.setBounds(18, 285, 100, 30);
        add(lb_Expense);

        Label lb_reason = new Label("사유");
        lb_reason.setAlignment(1);
        lb_reason.setBounds(118, 285, 300, 30);
        add(lb_reason);

        TextField tf_Expense = new TextField();
        tf_Expense.setBounds(18, 315, 100, 30);
        add(tf_Expense);

        TextField tf_reason = new TextField();
        tf_reason.setBounds(118, 315, 300, 30);
        add(tf_reason);

    }

    public void run()
    {
        Expense_manage frame = new Expense_manage();
        frame.setVisible(true);
    }


}
