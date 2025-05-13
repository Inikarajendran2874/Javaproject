package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class cssin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cssin frame = new cssin();
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
	public cssin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1346, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CSS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 37));
		lblNewLabel.setBounds(584, 10, 84, 43);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrCsscss = new JTextArea();
		txtrCsscss.setBackground(new Color(192, 192, 192));
		txtrCsscss.setEditable(false);
		txtrCsscss.setText("CSS :\r\n       >CSS is the language we use to style an HTML document.\r\n       >CSS describes how HTML elements should be displayed.\r\n       >This tutorial will teach you CSS from basic to advanced.\r\n\r\nCSS Example :\r\n\r\nbody {\r\n  background-color: lightblue;\r\n}\r\n\r\nh1 {\r\n  color: white;\r\n  text-align: center;\r\n}\r\n\r\np {\r\n  font-family: verdana;\r\n  font-size: 20px;\r\n}\r\n");
		txtrCsscss.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtrCsscss.setBounds(30, 53, 1277, 668);
		contentPane.add(txtrCsscss);
	}

}
