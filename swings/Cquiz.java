package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cquiz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cquiz frame = new Cquiz();
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
	public Cquiz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1348, 761);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("knowledge Check");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(524, 10, 303, 36);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrWhoIs = new JTextArea();
		txtrWhoIs.setEditable(false);
		txtrWhoIs.setBackground(new Color(192, 192, 192));
		txtrWhoIs.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		txtrWhoIs.setText("1. Who is the father of C language?\r\na) Steve Jobs        b) James Gosling\r\nc) Dennis Ritchie  d) Rasmus Lerdorf\r\n\r\n2.The C-preprocessors are specified with _________ symbol.\r\na) #   b) $   c) ” ”  d) &\r\n\r\n3.Which of the following return-type cannot be used for a function in C?\r\na) char *   b) struct\r\nc) void     d) none of the mentioned\r\n\r\n4.scanf() is a predefined function in______header file.\r\na) stdlib. h     b) ctype. h\r\nc) stdio. h      d) stdarg. h\r\n\r\n5.What will be the output of the following C code?\r\n    #include  <stdio.h>\r\n    int main()\r\n    {\r\n       signed char chr;\r\n       chr = 128;\r\n       printf(\"%d\\n\", chr);\r\n       return 0;\r\n    }\r\na) 128         b) -128\r\nc) Depends on the compiler   d) None of the mentioned");
		txtrWhoIs.setBounds(25, 44, 1096, 654);
		contentPane.add(txtrWhoIs);
		
		JButton btnNewButton = new JButton("END");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Languages().setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(1143, 693, 85, 21);
		contentPane.add(btnNewButton);
	}
}
