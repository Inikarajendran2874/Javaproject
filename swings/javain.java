package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class javain extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javain frame = new javain();
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
	public javain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1347, 758);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduction to Java");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setBounds(509, 10, 271, 35);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrJavaJava = new JTextArea();
		txtrJavaJava.setEditable(false);
		txtrJavaJava.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		txtrJavaJava.setText("JAVA :\r\n  Java is a popular programming language.\r\n  Java is used to develop mobile apps, web apps, desktop apps, games and much more.\r\n\r\nExample :\r\npublic class Main {\r\n  public static void main(String[] args) {\r\n    System.out.println(\"Hello World\");\r\n\r\nJava Data Types\r\nA variable in Java must be a specified data type:\r\n\r\nExample:\r\nint myNum = 5;               // Integer (whole number)\r\nfloat myFloatNum = 5.99f;    // Floating point number\r\nchar myLetter = 'D';         // Character\r\nboolean myBool = true;       // Boolean\r\nString myText = \"Hello\";     //String\r\n  }\r\n}\r\nData types are divided into two groups:\r\n       1.Primitive data types - includes byte, short, int, long, float, double, boolean and char\r\n       2.Non-primitive data types - such as String, Arrays and Classes.\r\n");
		txtrJavaJava.setBounds(43, 55, 1263, 642);
		contentPane.add(txtrJavaJava);
	}

}
