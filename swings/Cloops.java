package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Cloops extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cloops frame = new Cloops();
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
	public Cloops() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1345, 747);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOOPS IN C");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(533, 0, 168, 50);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrThereAreDifferent = new JTextArea();
		txtrThereAreDifferent.setEditable(false);
		txtrThereAreDifferent.setBackground(new Color(192, 192, 192));
		txtrThereAreDifferent.setText("LOOPS :\r\nLoops can execute a block of code as long as a specified condition is reached.\r\nThere are different types of loops in C\r\nthey are :\r\n    For loop\r\n    while loop\r\n    Do while loop\r\n     Nested loop\r\n\r\nFor Loop :\r\nWhen you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:\r\n\r\nSyntax :\r\nfor (statement 1; statement 2; statement 3) {\r\n  // code block to be executed\r\n}\r\nWhile Loop :\r\nThe while loop loops through a block of code as long as a specified condition is true:\r\n\r\nSyntax :\r\nwhile (condition) {\r\n  // code block to be executed\r\n}");
		txtrThereAreDifferent.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		txtrThereAreDifferent.setBounds(22, 46, 1237, 643);
		contentPane.add(txtrThereAreDifferent);
	}
}
