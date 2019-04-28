import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Question2 extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	Timer time = new Timer(10, this);
	int x = 0;
	int y = 0;
	int RecSize = 10;

	public Question2() {
		time.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fillRect(x, y, RecSize, RecSize);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		x++;
		y++;
		repaint();

		if (y + RecSize == getWidth()) {
			time.stop();
			x = 0;
			y = 0;
			time.start();
		}
	}
	
	public static void main(String[] args) {
		Question2 canvas= new Question2();
		JFrame frame= new JFrame();
		frame.add(canvas);
		Dimension dim = new Dimension(500, 500);
		frame.getContentPane().setPreferredSize(dim);;
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
}
