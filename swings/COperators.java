package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class COperators extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					COperators frame = new COperators();
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
	public COperators() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1343, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Operators in C");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(539, 10, 191, 43);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(92, 488, 5, 22);
		contentPane.add(textArea);
		
		JTextArea txtrOperatorsOperatorsAre = new JTextArea();
		txtrOperatorsOperatorsAre.setEditable(false);
		txtrOperatorsOperatorsAre.setBackground(new Color(192, 192, 192));
		txtrOperatorsOperatorsAre.setText("Operators:\r\nOperators are used to perform operations on variables and values.\r\nIn the example below, we use the + operator to add together two values:\r\n\r\nExample\r\nint myNum = 100 + 50;\r\nExample\r\nint sum1 = 100 + 50;        // 150 (100 + 50)\r\nTypes of Operators:\r\n\r\n      Arithmetic operators\r\n      Assignment operators \r\n      Comparison operators\r\n      Logical operators\r\n      Bitwise operators\r\n      Arithmetic Operators\r\nArithmetic Operators\r\n             Arithmetic operators are used to perform common mathematical operations.\r\n                 example: +,-,*,/,%,++,--\r\nAssignment Operators\r\n            Assignment operators are used to assign values to variables.\r\n                example : =\r\nComparison Operators\r\n            Comparison operators are used to compare two values . This is important in programming, because it helps us to find answers and make decisions.\r\n          Example\r\n\r\n\r\n");
		txtrOperatorsOperatorsAre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrOperatorsOperatorsAre.setBounds(28, 63, 1291, 726);
		contentPane.add(txtrOperatorsOperatorsAre);
	}

}
