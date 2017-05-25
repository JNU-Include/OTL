import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					LoginView frame = new LoginView();
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
	public LoginView() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel idLabel = new JLabel("ID");
		contentPane.add(idLabel);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel passLabel = new JLabel("Password");
		contentPane.add(passLabel);
		
		passwordField = new JPasswordField();
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("로그인");
		contentPane.add(btnNewButton);
		
		
	}
	public void run()
	{
		LoginView frame = new LoginView();
		frame.setVisible(true);
		
	}
}
