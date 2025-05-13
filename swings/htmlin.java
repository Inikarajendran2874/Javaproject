package swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;

public class htmlin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					htmlin frame = new htmlin();
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
	public htmlin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 752);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HTML ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		lblNewLabel.setBounds(588, 10, 135, 36);
		contentPane.add(lblNewLabel);
		
		JTextArea txtrHtmlHtml = new JTextArea();
		txtrHtmlHtml.setBackground(new Color(192, 192, 192));
		txtrHtmlHtml.setEditable(false);
		txtrHtmlHtml.setText("HTML :\r\n  HTML is the standard markup language for Web pages.\r\n  With HTML you can create your own Website.\r\n\r\nExample\r\n<!DOCTYPE html>\r\n<html>\r\n<head>\r\n<title>Page Title</title>\r\n</head>\r\n<body>\r\n<h1>This is a Heading</h1>\r\n<p>This is a paragraph.</p>\r\n</body>\r\n</html>\r\n\r\nHTML Documents:\r\n\r\nAll HTML documents must start with a document type declaration: <!DOCTYPE html>.\r\nThe HTML document itself begins with <html> and ends with </html>.\r\nThe visible part of the HTML document is between <body> and </body>.");
		txtrHtmlHtml.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		txtrHtmlHtml.setBounds(33, 54, 1271, 636);
		contentPane.add(txtrHtmlHtml);
	}
}
