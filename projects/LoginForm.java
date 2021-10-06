package projects;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {

	public static boolean credentials(String userName, String password) {

		if (userName.equals("Java") && password.equals("@8521")) {
			return true;
		}
		return false;
	}

	public static void addcomptopanel(JPanel panel) {
		JLabel userLabel = new JLabel("Username");
		JTextField userText = new JTextField();
		JLabel passwordLabel = new JLabel("Password");
		JPasswordField passwordText = new JPasswordField();

		JButton cancelButton = new JButton("Cancel");
		JButton loginButton = new JButton("Login");

		panel.add(userLabel);
		panel.add(userText);
		panel.add(passwordLabel);
		panel.add(passwordText);
		panel.add(cancelButton);
		panel.add(loginButton);

		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (credentials(userText.getText(), passwordText.getText())) {
					JOptionPane.showMessageDialog(panel, "Hello " + userText.getText() + "Welcome to Java Swing",
							"Login Mesasge", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(panel, "Wrong Credentials", "Login Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {

		JFrame f = new JFrame("Login Form");

		JPanel p = new JPanel(new GridLayout(3, 2, 15, 15));

		addcomptopanel(p);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setSize(300, 150);
		f.getContentPane().add(p);
		f.setVisible(true);

	}

}
