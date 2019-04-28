import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Question6 extends JFrame implements ChangeListener, ItemListener {
	private static final long serialVersionUID = 1L;

	public JPanel panel;
	public JButton button;
	public JButton off;
	public JLabel label;
	int count = 1;
	public JTextField field;
	public JSlider slider;
	public JLabel label2;
	public JCheckBox check1;
	public JCheckBox check2;
	public JLabel labely;
	public JLabel labeln;

	public Question6() {

		panel = new JPanel();
		button = new JButton("BUTTON");
		add(button);
		off = new JButton("OFF");
		add(off);
		field = new JTextField(10);
		label = new JLabel("TYPE THEN PRESS ENTER");
		add(label);
		slider = new JSlider();
		add(slider);
		label2 = new JLabel();
		add(label2);
		check1 = new JCheckBox();
		add(check1);
		labely = new JLabel("NOT CHECKED");
		add(labely);
		check2 = new JCheckBox();
		add(check2);
		labeln = new JLabel("NOT CHECKED");
		add(labeln);

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

		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				label2.setText(String.valueOf(slider.getValue()));
			}
		});

		check1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (check1.isSelected()) {
					labely.setText("CHECKED");
				} else {labely.setText("NOT CHECKED");
				}
			}

		});

		check2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (check2.isSelected()) {
					labeln.setText("CHECKED");
				} else { labeln.setText("NOT CHECKED");
				}
			}
		});
		
		setLayout(new FlowLayout());
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Question6 app = new Question6();
		app.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void stateChanged(ChangeEvent e) {
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
	}
}