package emailGenerator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class changePwd extends JFrame {

	private JPanel contentPane;
	private JPasswordField newPF;
	private JPasswordField confirmPF;
	private JPasswordField oldPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					changePwd frame = new changePwd();
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
	public changePwd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel oldPwdLbl = new JLabel("Old Password");
		oldPwdLbl.setBounds(53, 63, 83, 14);
		contentPane.add(oldPwdLbl);
		
		JLabel newPwdLbl = new JLabel("New Password");
		newPwdLbl.setBounds(53, 122, 114, 14);
		contentPane.add(newPwdLbl);
		
		newPF = new JPasswordField();
		newPF.setBounds(177, 119, 143, 20);
		contentPane.add(newPF);
		
		JLabel confirmPwdLbl = new JLabel("Confirm Password");
		confirmPwdLbl.setBounds(53, 175, 114, 14);
		contentPane.add(confirmPwdLbl);
		
		confirmPF = new JPasswordField();
		confirmPF.setBounds(177, 175, 143, 20);
		contentPane.add(confirmPF);
		
		oldPF = new JPasswordField();
		oldPF.setBounds(177, 60, 143, 20);
		contentPane.add(oldPF);
		
		JButton enterBTN = new JButton("CHANGE");
		enterBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a1 =newPF.getText().toString();
				String a2 =confirmPF.getText().toString();
				System.out.println(a1);
				System.out.println(a2);
				if(!a1.equals(a2)) {
					JOptionPane.showMessageDialog(null,"Password doesn't match","Change Password Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"Password changed Successfuly","Success",JOptionPane.PLAIN_MESSAGE);
					dispose();
				
				}
			}
		});
		enterBTN.setBounds(20, 227, 89, 23);
		contentPane.add(enterBTN);
		
		JButton cancelBTN = new JButton("CANCEL");
		cancelBTN.setBounds(162, 227, 89, 23);
		cancelBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(cancelBTN);
		
		JButton exitBTN = new JButton("EXIT");
		exitBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitBTN.setBounds(311, 227, 89, 23);
		contentPane.add(exitBTN);
	}
}
