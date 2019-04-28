/* Name: Angela Chung
 * NetID: 30612068
 * Assignment Number: 12
 * Lab section day/time: MW 2:00-3:15PM
 */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Question1 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	public JPanel panel;
	public JButton button;

	public Question1() {
		panel = new JPanel();
		button = new JButton("BUTTON");
		add(button);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(arg0);
			}
		});
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Question1 app = new Question1();
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
