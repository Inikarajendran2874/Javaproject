package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class Cintro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cintro frame = new Cintro();
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
	public Cintro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1341, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrInikaIsA = new JTextArea();
		txtrInikaIsA.setEditable(false);
		txtrInikaIsA.setBackground(new Color(192, 192, 192));
		txtrInikaIsA.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrInikaIsA.setText("What is C?\r\n\r\n           >C is a general-purpose programming language created by Dennis Ritchie at the Bell Laboratories in 1972.\r\n           >It is a very popular language, despite being old. The main reason for its popularity is because it is a fundamental language in the field of computer science.\r\n           >C is strongly associated with UNIX, as it was developed to write the UNIX operating system.\r\n\r\nDifference between C and C++\r\n\r\n           >C++ was developed as an extension of C, and both languages have almost the same syntax\r\n           >The main difference between C and C++ is that C++ support classes and objects, while C does not\r\n\r\n\r\nWhy Learn C?\r\n\r\n          >It is one of the most popular programming language in the world\r\n          >If you know C, you will have no problem learning other popular programming languages such as Java, Python, C++, C#, etc, as the syntax is similar\r\n          >C is very fast, compared to other programming languages, like Java and Python\r\n          >C is very versatile; it can be used in both applications and technologies\r\n\r\nABOUT C\r\n          >It is a general-purpose computer programming language. It was created in the 1970s by Dennis Ritchie, and remains very widely used and influential. \r\n         >Designed by: Dennis Ritchie\r\n         >First appeared: 1972; 51 years ago\r\n         >Paradigm: Multi-paradigm: imperative (procedural), structured\r\n         >Preview release: C23 (N3096) / April 2, 2023; 8 months ago\r\n         >Stable release: C17 / June 2018; 5 years ago\r\n         >Typing discipline: Static, weak, manifest, nominal\r\n\r\n");
		txtrInikaIsA.setBounds(21, 34, 1296, 666);
		contentPane.add(txtrInikaIsA);
	}
}
