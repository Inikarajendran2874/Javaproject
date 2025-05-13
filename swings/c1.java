package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class c1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					c1 frame = new c1();
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
	public c1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 589);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(94, 162, 162));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C PROGRAMMING");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(186, 31, 150, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton(" INTRODUCTION TO C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cintro().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(155, 117, 217, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SYNTAX");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new csyntsx().setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(155, 153, 219, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("DATA TYPES");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cdatatype().setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBounds(155, 190, 217, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("OPERATORS");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new COperators().setVisible(true);
			}
		});
		btnNewButton_3.setBounds(155, 228, 217, 21);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LOOPS");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cloops().setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_4.setBounds(155, 266, 217, 21);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("ARRAYS");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Carrays().setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_5.setBounds(155, 308, 217, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("STRINGS");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cstrings().setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_6.setBounds(155, 346, 217, 21);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("POINTERS");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cpointers().setVisible(true);
			}
		});
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_7.setBounds(155, 383, 217, 21);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Quiz");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Cquiz().setVisible(true);
			}
		});
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_8.setBounds(221, 452, 85, 21);
		contentPane.add(btnNewButton_8);
	}
}
