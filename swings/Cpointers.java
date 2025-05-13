package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class Cpointers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cpointers frame = new Cpointers();
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
	public Cpointers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1348, 765);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" POINTERS IN C");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(556, 29, 214, 33);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrCreatingPointersYou = new JTextArea();
		txtrCreatingPointersYou.setEditable(false);
		txtrCreatingPointersYou.setBackground(new Color(192, 192, 192));
		txtrCreatingPointersYou.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrCreatingPointersYou.setText("A pointer is a variable that stores the memory address of another variable as its value.\r\nA pointer variable points to a data type (like int) of the same type, and is created with the * operator.\r\nThe address of the variable you are working with is assigned to the pointer:\r\n\r\nCreating Pointers\r\nYou learned from the previous chapter, that we can get the memory address of a variable with the reference operator &:\r\n\r\nExample\r\nint myAge = 43; // an int variable\r\nprintf(\"%d\", myAge);  // Outputs the value of myAge (43)\r\nprintf(\"%p\", &myAge); // Outputs the memory address of myAge (0x7ffe5367e044)\r\n\r\nint myAge = 43;     // An int variable\r\nint* ptr = &myAge;  // A pointer variable, with the name ptr, that stores the address of myAge\r\n\r\n// Output the value of myAge (43)\r\nprintf(\"%d\\n\", myAge);\r\n\r\n// Output the memory address of myAge (0x7ffe5367e044)\r\nprintf(\"%p\\n\", &myAge);\r\n\r\n// Output the memory address of myAge with the pointer (0x7ffe5367e044)\r\nprintf(\"%p\\n\", ptr);\r\n");
		txtrCreatingPointersYou.setBounds(22, 72, 1312, 646);
		contentPane.add(txtrCreatingPointersYou);
	}

}
