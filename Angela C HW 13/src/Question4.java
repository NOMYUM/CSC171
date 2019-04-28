import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Question4 extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	Random rage = new Random();
	
	Timer time = new Timer(5000, this);
	int input;
	
	public Question4() {
		time.start();
		JPanel panel = new JPanel();
		add(panel);
		JLabel label= new JLabel("ENTER NUMBER OF LINES");
		add(label);
		JTextField field = new JTextField(10);
		add(field);
		
		panel.add(field);
		field.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input = Integer.parseInt(field.getText());
			}
		});
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int t=0; t< input; t++) {
			int x = rage.nextInt(getWidth()) + 0;
			int y = rage.nextInt(getHeight()) + 0;
			int z = rage.nextInt(getWidth()) + 0;
			int w = rage.nextInt(getHeight()) + 0; 
			g.drawLine (x,y,z,w);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
	}

	public static void main(String[] args) {
		Question4 canvas = new Question4();
		JFrame frame = new JFrame();
		frame.add(canvas);
		Dimension dim = new Dimension(500, 500);
		frame.getContentPane().setPreferredSize(dim);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}