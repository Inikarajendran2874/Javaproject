package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Cstrings extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cstrings frame = new Cstrings();
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
	public Cstrings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1350, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STRINGS IN C\r\n");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(540, 21, 262, 32);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrStringsStringsAre = new JTextArea();
		txtrStringsStringsAre.setBackground(new Color(192, 192, 192));
		txtrStringsStringsAre.setEditable(false);
		txtrStringsStringsAre.setText("Strings\r\nStrings are used for storing text/characters.\r\n   For example, \"Hello World\" is a string of characters.\r\nUnlike many other programming languages, C does not have a String type to easily create string variables. Instead, you must use the char type and create an array of characters to make a string in C:\r\nchar greetings[] = \"Hello World!\";\r\nNote that you have to use double quotes (\"\").\r\nTo output the string, you can use the printf() function together with the format specifier %s to tell C that we are now working with strings:\r\n    Example\r\nchar greetings[] = \"Hello World!\";\r\nprintf(\"%s\", greetings);\r\n\r\nAccess Strings\r\nSince strings are actually arrays in C, you can access a string by referring to its index number inside square brackets [].\r\nThis example prints the first character (0) in greetings:\r\n\r\nExample\r\nchar greetings[] = \"Hello World!\";\r\nprintf(\"%c\", greetings[0]);\r\n\r\nExample\r\nchar carName[] = \"Volvo\";\r\nint length = sizeof(carName) / sizeof(carName[0]);\r\nint i;\r\nfor (i = 0; i < length; ++i) {\r\n  printf(\"%c\\n\", carName[i]);\r\n}");
		txtrStringsStringsAre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrStringsStringsAre.setBounds(45, 75, 1281, 647);
		contentPane.add(txtrStringsStringsAre);
	}
}
