package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class pythonin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pythonin frame = new pythonin();
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
	public pythonin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1326, 736);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduction to Python");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(534, 22, 317, 30);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrWhatIsPython = new JTextArea();
		txtrWhatIsPython.setBackground(new Color(192, 192, 192));
		txtrWhatIsPython.setEditable(false);
		txtrWhatIsPython.setText("What is Python?\r\n   Python is a popular programming language. It was created by Guido van Rossum, and released in 1991.\r\n   It is used for:\r\n\r\n     >web development (server-side),\r\n     >software development,\r\n     >mathematics,\r\n      >system scripting\r\nSyntax :\r\n>>> print(\"Hello, World!\")\r\nHello, World!\r\n\r\nIdentation in python :\r\n  Python uses indentation to indicate a block of code.\r\n\r\nExampleGet your own Python Server\r\nif 5 > 2:\r\n  print(\"Five is greater than two!\")\r\n\r\nVariables in python :\r\n     Variables are containers for storing data values.\r\n\r\n");
		txtrWhatIsPython.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		txtrWhatIsPython.setBounds(23, 73, 1265, 584);
		contentPane.add(txtrWhatIsPython);
	}
}
