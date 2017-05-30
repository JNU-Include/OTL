import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by voidbluelabtop on 17. 5. 29.
 */
public class Table_Reserve extends JFrame {
    private JPanel contentPane;
    boolean isReserved, isReserved2, isReserved3;

    public Table_Reserve() {
        isReserved = false;
        isReserved2 = false;
        isReserved3 = false;

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 616, 420);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JButton tableButton = new JButton();
        Color First_color = tableButton.getBackground();

        tableButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        tableButton.setText("좌석 1");
        tableButton.setBounds(32, 75, 146, 71);
        contentPane.add(tableButton);

        tableButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isReserved = !isReserved;
                if (!isReserved){
                    tableButton.setBackground(First_color);
                }
                else{
                    tableButton.setBackground(Color.gray);
                }
            }
        });

        JButton tableButton2 = new JButton();
        tableButton2.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        tableButton2.setText("좌석 2");
        tableButton2.setBounds(32, 175, 146, 71);
        contentPane.add(tableButton2);

        tableButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isReserved2 = !isReserved2;
                if (!isReserved2){
                    tableButton2.setBackground(First_color);
                }
                else{
                    tableButton2.setBackground(Color.gray);
                }
            }
        });

        JButton tableButton3 = new JButton();
        tableButton3.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        tableButton3.setText("좌석 3");
        tableButton3.setBounds(32, 275, 146, 71);
        contentPane.add(tableButton3);

        tableButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isReserved3 = !isReserved3;
                if (!isReserved3){
                    tableButton3.setBackground(First_color);
                }
                else{
                    tableButton3.setBackground(Color.gray);
                }
            }
        });

        JButton accept = new JButton();
        accept.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        accept.setText("확인");
        accept.setBounds(500, 270, 60, 40);
        contentPane.add(accept);
        accept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });

        JButton cancel = new JButton();
        cancel.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
        cancel.setText("취소");
        cancel.setBounds(500, 320, 60, 40);
        contentPane.add(cancel);
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
    }

    public void run(){
        this.setVisible(true);
    }
}
