import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Question3 extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	Timer time = new Timer(1, this);
	

	double theta = 0;
	
	public Question3() {
	
		time.start();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int centerx= getWidth();
		int centery= getHeight();
		int r = 100;
		
		double x = r * Math.cos(theta);
		double y = r * Math.sin(theta);
		int RecSize = 10;
	
		g.fillRect(centerx / 2 + (int)x,centery/2+ (int)y, RecSize, RecSize);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		theta = theta - 0.001;
		repaint();

		if (theta < -2*Math.PI) {
			time.stop();
		}
	}
	
	public static void main(String[] args) {
		Question3 canvas= new Question3();
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
