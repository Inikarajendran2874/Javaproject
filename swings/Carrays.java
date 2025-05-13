package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Carrays extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Carrays frame = new Carrays();
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
	public Carrays() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1345, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAYS IN C");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(530, 32, 191, 33);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrArraysArraysAre = new JTextArea();
		txtrArraysArraysAre.setEditable(false);
		txtrArraysArraysAre.setBackground(new Color(192, 192, 192));
		txtrArraysArraysAre.setText("Arrays\r\nArrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.\r\n\r\nTo create an array, define the data type (like int) and specify the name of the array followed by square brackets [].\r\nTo insert values to it, use a comma-separated list, inside curly braces:\r\nint myNumbers[] = {25, 50, 75, 100};\r\nAccess the Elements of an Array :\r\n\r\nTo access an array element, refer to its index number.\r\nArray indexes start with 0: [0] is the first element. [1] is the second element, etc.\r\nThis statement accesses the value of the first element [0] in myNumbers:\r\n\r\nExample\r\nint myNumbers[] = {25, 50, 75, 100};\r\nprintf(\"%d\", myNumbers[0]);\r\n// Outputs 25\r\n\r\nLoop Through an Array\r\nYou can loop through the array elements with the for loop.\r\nThe following example outputs all elements in the myNumbers array:\r\nExample\r\nint myNumbers[] = {25, 50, 75, 100};\r\nint i;\r\nfor (i = 0; i < 4; i++) {\r\n  printf(\"%d\\n\", myNumbers[i]);\r\n}");
		txtrArraysArraysAre.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrArraysArraysAre.setBounds(34, 75, 1287, 622);
		contentPane.add(txtrArraysArraysAre);
	}

}
