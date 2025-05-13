package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Cplus extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cplus frame = new Cplus();
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
	public Cplus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1297, 759);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduction to C++");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(456, 24, 289, 32);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrWhatIsC = new JTextArea();
		txtrWhatIsC.setBackground(new Color(192, 192, 192));
		txtrWhatIsC.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrWhatIsC.setEditable(false);
		txtrWhatIsC.setText("What is C++?\r\n\r\n        C++ is a cross-platform language that can be used to create high-performance applications.\r\n        C++ was developed by Bjarne Stroustrup, as an extension to the C language.\r\n        C++ gives programmers a high level of control over system resources and memory.\r\n        The language was updated 4 major times in 2011, 2014, 2017, and 2020 to C++11, C++14, C++17, C++20.\r\n\r\nC++ Syntax\r\n         Example :\r\n\r\n#include <iostream>\r\nusing namespace std;\r\nint main() {\r\n  cout << \"Hello World!\";\r\n  return 0;\r\n}\r\n\r\nC++ Output (Print Text)\r\nThe cout object, together with the << operator, is used to output values/print text:\r\nExample :\r\n#include <iostream>\r\nusing namespace std;\r\nint main() {\r\n  cout << \"Hello World!\";\r\n  return 0;\r\n}\r\n");
		txtrWhatIsC.setBounds(39, 68, 1192, 641);
		contentPane.add(txtrWhatIsC);
	}
}
