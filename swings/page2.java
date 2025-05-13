package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class page2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page2 frame = new page2();
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
	public page2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 915, 565);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 136, 157));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" LOGIN");
		lblNewLabel.setBounds(400, 97, 118, 32);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(277, 343, 154, 21);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("USER NAME");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(266, 218, 154, 24);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(481, 217, 227, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(481, 340, 227, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String u1 = textField.getText();
					String p1 = textField_1.getText();
					String str1 = ("select * from LOGIN");
					Class.forName("org.h2.Driver");
					Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
					Statement stmt = conn.createStatement();
					

					ResultSet rs = stmt.executeQuery(str1);					
					if(rs.next()) {
						String storedUsername = rs.getString("USERNAME");
						String storedPassword = rs.getString("PASSWORD");
						if(u1.equals(storedUsername) && p1.equals(storedPassword)) {
							JOptionPane.showMessageDialog(btnNewButton, "Login Success!!");
							new details().setVisible(true);
						}else {
							JOptionPane.showMessageDialog(btnNewButton, "Login Failed");
						}
					}
					conn.close();
					
				} catch (Exception e2) {
					System.out.println(e2);
				}
			
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton.setBounds(481, 468, 85, 21);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnNewButton_1.setBounds(333, 468, 85, 21);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\inika\\OneDrive\\Pictures\\solid bg java...jpg"));
		lblNewLabel_3.setBounds(10, 10, 890, 527);
		contentPane.add(lblNewLabel_3);
	}
}
