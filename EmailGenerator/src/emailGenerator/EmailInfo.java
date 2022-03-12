package emailGenerator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmailInfo {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailInfo window = new EmailInfo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 void insertValue(String mail, String pwd, int capacity) {
		textField.setText(mail);
		textField_1.setText(pwd);
		textField_2.setText(String.valueOf(capacity));
	}

	/**
	 * Create the application.
	 */
	public EmailInfo() {
		initialize();
	}
//	public EmailInfo(String mail,String pwd,int capacity) {
//		this.capacity=capacity;
//		this.mail=mail;
//		this.pwd=pwd;
//		System.out.println("Entered in new window");
//		initialize();
//		textField.setText(mail);
//		textField.setText(pwd);
//		textField.setText(String.valueOf(capacity));
//		EmailInfo window = new EmailInfo();
//		window.frame.setVisible(true);
//	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("YOUR EMAIL HAS BEEN SUCCESSFULLY GENERATED !!");
		lblNewLabel.setBounds(36, 36, 388, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Here are the Details.");
		lblNewLabel_1.setBounds(36, 61, 201, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel emailLbl = new JLabel("EMAIL");
		emailLbl.setBounds(39, 106, 46, 14);
		frame.getContentPane().add(emailLbl);
		
		JLabel pwdLbl = new JLabel("Password");
		pwdLbl.setBounds(39, 144, 66, 14);
		frame.getContentPane().add(pwdLbl);
		
		JLabel capacityLbl = new JLabel("Mail Capacity");
		capacityLbl.setBounds(39, 186, 89, 14);
		frame.getContentPane().add(capacityLbl);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(168, 103, 191, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(168, 141, 191, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(168, 183, 191, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JButton changePwdBtn = new JButton("Change Password");
		changePwdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePwd obj = new changePwd();
				obj.setVisible(true);
				frame.dispose();
			}
		});
		changePwdBtn.setBounds(49, 227, 159, 23);
		frame.getContentPane().add(changePwdBtn);
		
		JButton exitBtn = new JButton("EXIT");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBtn.setBounds(285, 227, 89, 23);
		frame.getContentPane().add(exitBtn);
	}

}
