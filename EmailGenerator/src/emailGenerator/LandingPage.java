package emailGenerator;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LandingPage {

	private JFrame frame;
	private JTextField contactTF;
	private JTextField nameTF;
	String pwd;
	String mail;
	int capacity=100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LandingPage window = new LandingPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LandingPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setSize(100,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel heading = new JLabel("EMAIL GENERATOR");
		heading.setEnabled(false);
		heading.setBounds(160, 11, 147, 14);
		frame.getContentPane().add(heading);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sales", "Marketing", "Support", "IT", "Accounting", "HR"}));
		comboBox.setBounds(300, 51, 124, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel department = new JLabel("Department");
		department.setBounds(211, 55, 79, 14);
		frame.getContentPane().add(department);
		
		JLabel contact = new JLabel("Contact");
		contact.setBounds(21, 97, 46, 14);
		frame.getContentPane().add(contact);
		
		contactTF = new JTextField();
		contactTF.setBounds(94, 94, 86, 20);
		frame.getContentPane().add(contactTF);
		contactTF.setColumns(10);
		
		JLabel name = new JLabel("Name");
		name.setBounds(21, 55, 46, 14);
		frame.getContentPane().add(name);
		
		nameTF = new JTextField();
		nameTF.setBounds(94, 52, 86, 20);
		frame.getContentPane().add(nameTF);
		nameTF.setColumns(10);
		
		JButton createEmail = new JButton("Create EMAIL");
		createEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateEmailLogic obj = new CreateEmailLogic();
				mail =obj.generateMail(nameTF.getText(),comboBox.getSelectedItem().toString());
				pwd = obj.generatePwd(10);
				EmailInfo obj2 = new EmailInfo();
				obj2.frame.setVisible(true);
				obj2.insertValue(mail,pwd,capacity);
				//obj2.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				frame.dispose();
				
			}
		});
		createEmail.setBounds(61, 198, 133, 23);
		frame.getContentPane().add(createEmail);
		
		JButton exitBtn = new JButton("EXIT");
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			
			}
		});
		exitBtn.setBounds(261, 198, 89, 23);
		frame.getContentPane().add(exitBtn);
	}
}
