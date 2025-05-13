package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class csyntsx extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					csyntsx frame = new csyntsx();
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
	public csyntsx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1336, 749);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SYNTAX OF C");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(548, 36, 200, 30);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrSyntaxYouHave = new JTextArea();
		txtrSyntaxYouHave.setEditable(false);
		txtrSyntaxYouHave.setBackground(new Color(192, 192, 192));
		txtrSyntaxYouHave.setTabSize(9);
		txtrSyntaxYouHave.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrSyntaxYouHave.setText("SYNTAX :\r\n\r\n         You have already seen the following code a couple of times in the first chapters. Let's break it down to understand it better:\r\n\r\nEXAMPLE \r\n\r\n        #include <stdio.h>\r\n          int main() {\r\n           printf(\"Hello World!\");\r\n           return 0;\r\n  }\r\n      \r\nEXAMPLE EXPLAINED : \r\n\r\n          Line 1: #include <stdio.h> is a header file library that lets us work with input and output functions, such as printf().Header files add functionality to programs.\r\n          Line 2: A blank line. C ignores white space. But we use it to make the code more readable.\r\n          Line 3: Another thing that always appear in a C program, is main(). This is called a function. Any code inside its curly brackets {} will be executed.\r\n          Line 4: printf() is a function used to output/print text to the screen. In our example it will output \"Hello World!\".\r\n          Line 5: return 0 ends the main() function.\r\n          Line 6: Do not forget to add the closing curly bracket } to actually end the main function.\r\n\r\n");
		txtrSyntaxYouHave.setBounds(21, 76, 1295, 626);
		contentPane.add(txtrSyntaxYouHave);
	}

}
