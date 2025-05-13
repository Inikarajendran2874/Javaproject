package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Cdatatype extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cdatatype frame = new Cdatatype();
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
	public Cdatatype() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1349, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DATA TYPES IN C");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(536, 20, 182, 35);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrAVariableIn = new JTextArea();
		txtrAVariableIn.setEditable(false);
		txtrAVariableIn.setBackground(new Color(192, 192, 192));
		txtrAVariableIn.setText("A variable in C must be a specified data type, and you must use a format specifier inside the printf() function to display it:\r\n\r\nBasic Data Types :\r\n\r\n      The data type specifies the size and type of information the variable will store.\r\n\r\n      In this tutorial, we will focus on the most basic ones:\r\n\r\n               Data        TypeSize\t     Description\r\n                int\t     2 or 4bytes    Stores whole numbers, without decimals\r\n               float\t        4 bytes\t  Stores fractional numbers, containing one or more decimals. Sufficient for storing 6-7 decimal digits\r\n               double\t      8 bytes\t   Stores fractional numbers, containing one or more decimals. Sufficient for storing 15 decimal digits\r\n               char\t        1 byte\t  Stores a single character/letter/number, or ASCII values\r\nBasic Format Specifiers:\r\n\r\n           There are different format specifiers for each data type. Here are some of them:\r\n\r\nFormat Specifier\tData Type\t\r\n   %d or %i\t                  int\t\r\n   %f or %F\t                  float\t\r\n   %lf\t                  double\t\r\n   %c\t                  char\t\r\n   %s              \tUsed for strings (text), which you will learn more about in a later chapter");
		txtrAVariableIn.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrAVariableIn.setBounds(58, 65, 1241, 633);
		contentPane.add(txtrAVariableIn);
	}
}
