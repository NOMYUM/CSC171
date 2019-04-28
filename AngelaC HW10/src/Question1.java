/*Name: Angela Chung
 * Net ID: achung13 
 * Assignment: 1
 * lab section: MW 2 00 - 3 15 pm 
 * I did not copy code from anyone on this assignment
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Question1 extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		
		g.setColor(Color.RED);
		g.drawLine(0, 0, width, 0);
		g.drawLine(0, 0, 0, height);
		g.drawLine(0, height-1, width, height-1);
		g.drawLine(width-1, 0, width-1, height);
		g.setColor(Color.BLUE);
		g.drawLine(width/2, 0, width/2, height);
		g.drawLine(0, height/2, width, height/2);
		g.setColor(Color.GREEN);
		g.drawLine(0, 0, width, height);
		g.drawLine(0, height, width, 0);
	}
	
	public static void main(String[] args) {
		Question1 canvas = new Question1();
		JFrame frame = new JFrame("Basic Lines");
		
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}
