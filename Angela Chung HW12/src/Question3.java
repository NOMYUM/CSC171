import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Question3 extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	public JPanel panel;
	public JButton button;
	public JButton off;
	int count = 1;

	public Question3() {

		panel = new JPanel();
		button = new JButton("BUTTON");
		add(button);
		off = new JButton("OFF");
		add(off);

		JLabel Begin = new JLabel("THE BEGINNING");
		add(Begin);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(arg0);
				Begin.setText(Integer.toString((count++)));
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

		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Question3 app = new Question3();
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}