import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Question4 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	public JPanel panel;
	public JButton button;
	public JButton off;
	public JLabel label;
	int count = 1;
	public JTextField field;

	public Question4() {

		panel = new JPanel();
		button = new JButton("BUTTON");
		add(button);
		off = new JButton("OFF");
		add(off);
		field = new JTextField(10);
		label = new JLabel("TYPE THEN PRESS ENTER");
		add(label);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(arg0);
				label.setText(Integer.toString((count++)));
			}
		});

		off.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (off.getText() == "OFF") {
					off.setText("ON");
				} else if (off.getText() == "ON") {
					off.setText("OFF");
				}
			}
		});
		
		panel.add(field);
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = field.getText();
				label.setText(input);
			}
		});
		
		panel.add(label);
		add(panel);
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Question4 app = new Question4();
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}