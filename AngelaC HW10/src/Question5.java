import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Question5 extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.black);
	
		int x = 0;
		int y = height;
		for (int t = 0; t < 800; t = t + 20) {
			g.drawLine(0, t, x, y);
			x = x + 20;
		}

		x = width;
		y = 0;
		for (int k = 0; k < 800; k = k + 20) {
			g.drawLine(k, 0, x, y);
			y = y + 20;
		}
	
		x = 0;
		y = 0;
		for (int z = 800; z > 0; z = z - 20) {
			g.drawLine(z, 0, x, y);
			y = y + 20;
		}

		x = width;
		y = height;
		for (int o = 0; o < 800; o = o + 20) {
			g.drawLine(width, o, x, y);
			x = x - 20;
		}
	}

	public static void main(String[] args) {
		Question5 canvas = new Question5();
		JFrame frame = new JFrame("Basic Lines");
		
		frame.add(canvas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setVisible(true);
	}
}